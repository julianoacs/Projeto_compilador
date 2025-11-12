package org.example.interpreter;

public class Value {
    public enum Kind { INTEGER, REAL, TEXT }
    public final Kind kind;
    public final long intVal;
    public final double realVal;
    public final String textVal;

    private Value(Kind k, long i, double r, String t) {
        this.kind = k; this.intVal = i; this.realVal = r; this.textVal = t;
    }

    public static Value ofInteger(long v) { return new Value(Kind.INTEGER, v, v, Long.toString(v)); }
    public static Value ofReal(double v) { return new Value(Kind.REAL, 0L, v, Double.toString(v)); }
    public static Value ofText(String s) { return new Value(Kind.TEXT, 0L, 0.0, s); }

    public Object toPrimitive() {
        return switch(kind) {
            case INTEGER -> intVal;
            case REAL -> realVal;
            case TEXT -> textVal;
        };
    }

    public static Value coerceAssign(Value target, Object r) {
        if (target.kind == Kind.TEXT) return ofText(toStringFor(r));
        if (target.kind == Kind.REAL) {
            if (r instanceof Double) return ofReal((Double) r);
            if (r instanceof Integer) return ofReal(((Integer) r).doubleValue());
            if (r instanceof Long) return ofReal(((Long) r).doubleValue());
            return ofReal(Double.parseDouble(toStringFor(r)));
        }
        if (r instanceof Integer) return ofInteger(((Integer) r).longValue());
        if (r instanceof Long) return ofInteger((Long) r);
        if (r instanceof Double) return ofInteger(((Double) r).longValue());
        return ofInteger(Long.parseLong(toStringFor(r)));
    }

    public static Value parseFor(Value old, String line) {
        return switch(old.kind) {
            case INTEGER -> ofInteger(Long.parseLong(line.trim()));
            case REAL -> ofReal(Double.parseDouble(line.trim()));
            case TEXT -> ofText(line);
        };
    }

    public static String toStringFor(Object r) {
        if (r == null) return "null";
        if (r instanceof Double) {
            double d = (Double) r;
            if (d == Math.rint(d)) return String.valueOf((long)d);
            return String.valueOf(d);
        }
        return r.toString();
    }

    public static boolean toBoolean(Object r) {
        if (r == null) return false;
        if (r instanceof Boolean) return (Boolean) r;
        if (r instanceof Number) return ((Number) r).doubleValue() != 0.0;
        if (r instanceof String) return !((String) r).isEmpty();
        return true;
    }

    public static boolean isTrue(Object cond) { return toBoolean(cond); }

    public static Object applyArithmetic(Object a, String op, Object b) {
        double x = ((Number) toNumber(a)).doubleValue();
        double y = ((Number) toNumber(b)).doubleValue();
        return switch(op) {
            case "+" -> (x + y == Math.rint(x + y)) ? (long)Math.rint(x+y) : (x+y);
            case "-" -> (x - y == Math.rint(x - y)) ? (long)Math.rint(x-y) : (x-y);
            case "*" -> (x * y == Math.rint(x * y)) ? (long)Math.rint(x*y) : (x*y);
            case "/" -> (x / y == Math.rint(x / y)) ? (long)Math.rint(x/y) : (x/y);
            case "%" -> (long)( (long)x % (long)y );
            default -> 0;
        };
    }

    public static Number toNumber(Object o) {
        if (o instanceof Integer) return (Integer)o;
        if (o instanceof Long) return (Long)o;
        if (o instanceof Double) return (Double)o;
        if (o instanceof String) {
            if (((String)o).contains(".")) return Double.parseDouble((String)o);
            return Long.parseLong((String)o);
        }
        throw new RuntimeException("Não é um número: " + o);
    }

    public static Object applyUnary(String op, Object val) {
        if (op.equals("+")) return val;
        if (op.equals("-")) {
            if (val instanceof Double) return -((Double)val);
            if (val instanceof Integer) return -((Integer)val);
            if (val instanceof Long) return -((Long)val);
            return -toNumber(val).doubleValue();
        }
        if (op.equals("!")) return !toBoolean(val);
        return val;
    }

    public static Object applyRelational(Object l, String op, Object r) {
        double x = toNumber(l).doubleValue();
        double y = toNumber(r).doubleValue();
        return switch(op) {
            case "<" -> x < y;
            case "<=" -> x <= y;
            case ">" -> x > y;
            case ">=" -> x >= y;
            default -> false;
        };
    }

    public static Object applyEquality(Object l, String op, Object r) {
        boolean eq = l == null ? r == null : l.equals(r);
        return op.equals("==") ? eq : !eq;
    }
}
