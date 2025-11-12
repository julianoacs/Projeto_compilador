package org.example.interpreter;

import org.example.generated.ForcaBaseVisitor;
import org.example.generated.ForcaParser;

import java.util.*;

/**
 * Interpretador/Visitor para a gramática ForcaLang.
 * Coloque este arquivo em src/main/java/org/example/ForcaInterpreter.java
 */
public class ForcaInterpreter extends ForcaBaseVisitor<Object> {

    private final Map<String, Object> memory = new HashMap<>();      // armazena valores
    private final Map<String, String> types = new HashMap<>();       // armazena tipo: "inteiro","real","texto"
    private final Scanner scanner = new Scanner(System.in);

    // controle de fluxo com exceções internas
    private static class BreakException extends RuntimeException {}
    private static class ContinueException extends RuntimeException {}

    @Override
    public Object visitPrograma(ForcaParser.ProgramaContext ctx) {
        // visita cada declaração/comando
        for (var child : ctx.children) {
            // alguns filhos podem ser tokens; verificamos instância
            if (child instanceof ForcaParser.DeclaracaoContext) {
                visit(child);
            } else if (child instanceof ForcaParser.ComandoContext) {
                visit(child);
            }
        }
        return null;
    }

    @Override
    public Object visitDeclaracao(ForcaParser.DeclaracaoContext ctx) {
        String id = ctx.ID().getText();
        String tipo = ctx.tipo().getText(); // 'inteiro' | 'real' | 'texto'
        types.put(id, tipo);
        Object value = null;
        if (ctx.expressao() != null) {
            value = visit(ctx.expressao());
            value = coerceToType(value, tipo);
        } else {
            // inicializa valor padrão
            switch (tipo) {
                case "inteiro": value = 0; break;
                case "real": value = 0.0; break;
                case "texto": value = ""; break;
                default: value = null;
            }
        }
        memory.put(id, value);
        return null;
    }

    @Override
    public Object visitAtribuicao(ForcaParser.AtribuicaoContext ctx) {
        String id = ctx.ID().getText();
        if (!types.containsKey(id)) {
            throw new RuntimeException("Variável não declarada: " + id);
        }
        Object val = visit(ctx.expressao());
        String tipo = types.get(id);
        val = coerceToType(val, tipo);
        memory.put(id, val);
        return null;
    }

    @Override
    public Object visitSeCmd(ForcaParser.SeCmdContext ctx) {
        Object cond = visit(ctx.expressao());
        boolean teste = truthValue(cond);
        if (teste) {
            visit(ctx.bloco(0));
        } else if (ctx.SENAO() != null) {
            visit(ctx.bloco(1));
        }
        return null;
    }

    @Override
    public Object visitEnquantoCmd(ForcaParser.EnquantoCmdContext ctx) {
        while (true) {
            Object cond = visit(ctx.expressao());
            if (!truthValue(cond)) break;
            try {
                visit(ctx.bloco());
            } catch (BreakException be) {
                break;
            } catch (ContinueException ce) {
                // vai para próxima iteração
            }
        }
        return null;
    }

    @Override
    public Object visitRepitaCmd(ForcaParser.RepitaCmdContext ctx) {
        // repita { bloco } ate (expressao) ;
        do {
            try {
                visit(ctx.bloco());
            } catch (BreakException be) {
                break;
            } catch (ContinueException ce) {
                // ignora: continua para condição
            }
            Object cond = visit(ctx.expressao());
            if (truthValue(cond)) break;
        } while (true);
        return null;
    }

    @Override
    public Object visitBloco(ForcaParser.BlocoContext ctx) {
        for (var comando : ctx.comando()) {
            try {
                visit(comando);
            } catch (BreakException be) {
                throw be;
            } catch (ContinueException ce) {
                throw ce;
            }
        }
        return null;
    }

    @Override
    public Object visitIoCmd(ForcaParser.IoCmdContext ctx) {
        if (ctx.LEIA() != null) {
            String id = ctx.ID().getText();
            if (!types.containsKey(id)) {
                throw new RuntimeException("Variável não declarada: " + id);
            }
            String tipo = types.get(id);
            String linha = scanner.nextLine();
            Object val;
            switch (tipo) {
                case "inteiro":
                    try {
                        val = Integer.parseInt(linha.trim());
                    } catch (Exception ex) {
                        throw new RuntimeException("Entrada inválida para inteiro: " + linha);
                    }
                    break;
                case "real":
                    try {
                        // aceita vírgula? a gramática usa ponto; aqui assumimos ponto
                        val = Double.parseDouble(linha.trim());
                    } catch (Exception ex) {
                        throw new RuntimeException("Entrada inválida para real: " + linha);
                    }
                    break;
                case "texto":
                default:
                    val = linha;
                    break;
            }
            memory.put(id, val);
        } else if (ctx.ESCREVA() != null) {
            if (ctx.listaArgs() != null) {
                var args = ctx.listaArgs().expressao();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < args.size(); ++i) {
                    Object v = visit(args.get(i));
                    sb.append(stringOf(v));
                }
                // imprime sem adicionar nova linha automaticamente (comportamento similar ao printf sem \n)
                System.out.print(sb.toString());
            } else {
                System.out.print("");
            }
        }
        return null;
    }

    @Override
    public Object visitComando(ForcaParser.ComandoContext ctx) {
        // lidar com 'pare' e 'continue' simples
        if (ctx.PARE() != null) {
            throw new BreakException();
        } else if (ctx.CONTINUE() != null) {
            throw new ContinueException();
        } else {
            return super.visitComando(ctx);
        }
    }

    // EXPRESSÕES: seguindo a gramática (exprOu, exprE, exprIgual, exprRel, exprAdd, exprMul, exprUn, prim)
    @Override
    public Object visitExprOu(ForcaParser.ExprOuContext ctx) {
        Object left = visit(ctx.exprE(0));
        if (ctx.exprE().size() == 1) return left;
        boolean res = truthValue(left);
        for (int i = 1; i < ctx.exprE().size(); ++i) {
            if (res) return true; // short-circuit
            Object r = visit(ctx.exprE(i));
            res = truthValue(r) || res;
        }
        return res;
    }

    @Override
    public Object visitExprE(ForcaParser.ExprEContext ctx) {
        Object left = visit(ctx.exprIgual(0));
        if (ctx.exprIgual().size() == 1) return left;
        boolean res = truthValue(left);
        for (int i = 1; i < ctx.exprIgual().size(); ++i) {
            if (!res) return false; // short-circuit
            Object r = visit(ctx.exprIgual(i));
            res = truthValue(r) && res;
        }
        return res;
    }

    @Override
    public Object visitExprIgual(ForcaParser.ExprIgualContext ctx) {
        Object left = visit(ctx.exprRel(0));
        if (ctx.exprRel().size() == 1) return left;
        // tem comparações == ou !=... avaliamos da esquerda para direita
        Object cur = left;
        for (int i = 1; i < ctx.exprRel().size(); ++i) {
            String op = ctx.getChild(2*i - 1).getText(); // '==' ou '!='
            Object right = visit(ctx.exprRel(i));
            boolean eq = equalsValue(cur, right);
            cur = op.equals("==") ? eq : !eq;
            // manter cur como boolean para próximas comparações
            // se houver encadeamento, usamos o booleano atual como 'cur'
        }
        return cur;
    }

    @Override
    public Object visitExprRel(ForcaParser.ExprRelContext ctx) {
        Object left = visit(ctx.exprAdd(0));
        if (ctx.exprAdd().size() == 1) return left;
        Object cur = left;
        for (int i = 1; i < ctx.exprAdd().size(); ++i) {
            String op = ctx.getChild(2*i - 1).getText(); // < <= > >=
            Object right = visit(ctx.exprAdd(i));
            boolean result;
            if (cur instanceof Number && right instanceof Number) {
                double l = ((Number) cur).doubleValue();
                double r = ((Number) right).doubleValue();
                switch (op) {
                    case "<": result = l < r; break;
                    case "<=": result = l <= r; break;
                    case ">": result = l > r; break;
                    case ">=": result = l >= r; break;
                    default: result = false;
                }
            } else if (cur instanceof String && right instanceof String) {
                int cmp = ((String)cur).compareTo((String)right);
                switch (op) {
                    case "<": result = cmp < 0; break;
                    case "<=": result = cmp <= 0; break;
                    case ">": result = cmp > 0; break;
                    case ">=": result = cmp >= 0; break;
                    default: result = false;
                }
            } else {
                throw new RuntimeException("Operação relacional inválida entre tipos: " + cur + " e " + right);
            }
            cur = result;
        }
        return cur;
    }

    @Override
    public Object visitExprAdd(ForcaParser.ExprAddContext ctx) {
        Object val = visit(ctx.exprMul(0));
        for (int i = 1; i < ctx.exprMul().size(); ++i) {
            String op = ctx.getChild(2*i - 1).getText();
            Object right = visit(ctx.exprMul(i));
            if (op.equals("+")) {
                // concatenação se string envolvida
                if (val instanceof String || right instanceof String) {
                    val = stringOf(val) + stringOf(right);
                } else if (val instanceof Number && right instanceof Number) {
                    // promoção: se algum for Double, usar Double
                    if (isRealNumber(val) || isRealNumber(right)) {
                        val = toDouble(val) + toDouble(right);
                    } else {
                        val = toInt(val) + toInt(right);
                    }
                } else {
                    throw new RuntimeException("Operador + inválido para tipos: " + val + " e " + right);
                }
            } else if (op.equals("-")) {
                if (val instanceof Number && right instanceof Number) {
                    if (isRealNumber(val) || isRealNumber(right)) {
                        val = toDouble(val) - toDouble(right);
                    } else {
                        val = toInt(val) - toInt(right);
                    }
                } else {
                    throw new RuntimeException("Operador - inválido para tipos: " + val + " e " + right);
                }
            }
        }
        return val;
    }

    @Override
    public Object visitExprMul(ForcaParser.ExprMulContext ctx) {
        Object val = visit(ctx.exprUn(0));
        for (int i = 1; i < ctx.exprUn().size(); ++i) {
            String op = ctx.getChild(2*i - 1).getText();
            Object right = visit(ctx.exprUn(i));
            if (!(val instanceof Number) || !(right instanceof Number)) {
                throw new RuntimeException("Operador " + op + " requer operandos numéricos.");
            }
            if (op.equals("*")) {
                if (isRealNumber(val) || isRealNumber(right)) {
                    val = toDouble(val) * toDouble(right);
                } else {
                    val = toInt(val) * toInt(right);
                }
            } else if (op.equals("/")) {
                val = toDouble(val) / toDouble(right);
            } else if (op.equals("%")) {
                if (isRealNumber(val) || isRealNumber(right)) {
                    val = toDouble(val) % toDouble(right);
                } else {
                    val = toInt(val) % toInt(right);
                }
            }
        }
        return val;
    }

    @Override
    public Object visitExprUn(ForcaParser.ExprUnContext ctx) {
        if (ctx.prim() != null && ctx.getChildCount() == 1) {
            return visit(ctx.prim());
        } else {
            String op = ctx.getChild(0).getText();
            Object val = visit(ctx.exprUn());
            if (op.equals("+")) {
                return val;
            } else if (op.equals("-")) {
                if (!(val instanceof Number)) throw new RuntimeException("Unário - exige número");
                if (isRealNumber(val)) return -toDouble(val);
                else return -toInt(val);
            } else if (op.equals("!")) {
                return !truthValue(val);
            }
        }
        return null;
    }

    @Override
    public Object visitPrim(ForcaParser.PrimContext ctx) {
        if (ctx.expressao() != null) {
            return visit(ctx.expressao());
        } else if (ctx.literal() != null) {
            return visit(ctx.literal());
        } else if (ctx.ID() != null) {
            String id = ctx.ID().getText();
            if (!memory.containsKey(id)) throw new RuntimeException("Variável não declarada: " + id);
            return memory.get(id);
        }
        return null;
    }

    @Override
    public Object visitLiteral(ForcaParser.LiteralContext ctx) {
        if (ctx.INT() != null) {
            return Integer.parseInt(ctx.INT().getText());
        } else if (ctx.REAL() != null) {
            return Double.parseDouble(ctx.REAL().getText());
        } else if (ctx.TEXTO() != null) {
            String raw = ctx.TEXTO().getText();
            // remove aspas e trata escapes simples
            String inner = raw.substring(1, raw.length()-1).replace("\\n", "\n").replace("\\\"", "\"").replace("\\\\", "\\");
            return inner;
        }
        return null;
    }

    // --- Helpers ---

    private boolean truthValue(Object o) {
        if (o == null) return false;
        if (o instanceof Boolean) return (Boolean)o;
        if (o instanceof Number) return ((Number)o).doubleValue() != 0.0;
        if (o instanceof String) return !((String)o).isEmpty();
        return false;
    }

    private String stringOf(Object o) {
        return o == null ? "null" : o.toString();
    }

    private boolean equalsValue(Object a, Object b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        if (a instanceof Number && b instanceof Number) {
            return Double.compare(((Number)a).doubleValue(), ((Number)b).doubleValue()) == 0;
        }
        return a.equals(b);
    }

    private boolean isRealNumber(Object o) {
        return o instanceof Double || o instanceof Float;
    }

    private int toInt(Object o) {
        return ((Number)o).intValue();
    }

    private double toDouble(Object o) {
        return ((Number)o).doubleValue();
    }

    private Object coerceToType(Object val, String tipo) {
        if (tipo.equals("texto")) {
            return stringOf(val);
        } else if (tipo.equals("inteiro")) {
            if (val instanceof Number) return ((Number)val).intValue();
            if (val instanceof String) {
                try { return Integer.parseInt((String)val); } catch (Exception e) { throw new RuntimeException("Não foi possível converter para inteiro: " + val); }
            }
            throw new RuntimeException("Conversão inválida para inteiro: " + val);
        } else if (tipo.equals("real")) {
            if (val instanceof Number) return ((Number)val).doubleValue();
            if (val instanceof String) {
                try { return Double.parseDouble((String)val); } catch (Exception e) { throw new RuntimeException("Não foi possível converter para real: " + val); }
            }
            throw new RuntimeException("Conversão inválida para real: " + val);
        }
        return val;
    }
}
