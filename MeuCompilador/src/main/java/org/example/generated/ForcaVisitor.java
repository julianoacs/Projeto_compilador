// Generated from C:/GitHub/Projeto_compilador/MeuCompilador/src/main/antlr/Forca.g4 by ANTLR 4.13.2
package org.example.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ForcaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ForcaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ForcaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ForcaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(ForcaParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(ForcaParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(ForcaParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#bloco}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloco(ForcaParser.BlocoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#seCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeCmd(ForcaParser.SeCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#enquantoCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquantoCmd(ForcaParser.EnquantoCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#repitaCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepitaCmd(ForcaParser.RepitaCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#ioCmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIoCmd(ForcaParser.IoCmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#listaArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgs(ForcaParser.ListaArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(ForcaParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(ForcaParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#exprOu}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOu(ForcaParser.ExprOuContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#exprE}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprE(ForcaParser.ExprEContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#exprIgual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIgual(ForcaParser.ExprIgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#exprRel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRel(ForcaParser.ExprRelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#exprAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(ForcaParser.ExprAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#exprMul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMul(ForcaParser.ExprMulContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#exprUn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUn(ForcaParser.ExprUnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#prim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrim(ForcaParser.PrimContext ctx);
	/**
	 * Visit a parse tree produced by {@link ForcaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ForcaParser.LiteralContext ctx);
}