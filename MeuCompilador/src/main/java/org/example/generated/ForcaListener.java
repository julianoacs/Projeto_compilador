// Generated from C:/GitHub/Projeto_compilador/MeuCompilador/src/main/antlr/Forca.g4 by ANTLR 4.13.2
package org.example.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ForcaParser}.
 */
public interface ForcaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ForcaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(ForcaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(ForcaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(ForcaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(ForcaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(ForcaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(ForcaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(ForcaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(ForcaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void enterBloco(ForcaParser.BlocoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#bloco}.
	 * @param ctx the parse tree
	 */
	void exitBloco(ForcaParser.BlocoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#seCmd}.
	 * @param ctx the parse tree
	 */
	void enterSeCmd(ForcaParser.SeCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#seCmd}.
	 * @param ctx the parse tree
	 */
	void exitSeCmd(ForcaParser.SeCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#enquantoCmd}.
	 * @param ctx the parse tree
	 */
	void enterEnquantoCmd(ForcaParser.EnquantoCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#enquantoCmd}.
	 * @param ctx the parse tree
	 */
	void exitEnquantoCmd(ForcaParser.EnquantoCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#repitaCmd}.
	 * @param ctx the parse tree
	 */
	void enterRepitaCmd(ForcaParser.RepitaCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#repitaCmd}.
	 * @param ctx the parse tree
	 */
	void exitRepitaCmd(ForcaParser.RepitaCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#ioCmd}.
	 * @param ctx the parse tree
	 */
	void enterIoCmd(ForcaParser.IoCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#ioCmd}.
	 * @param ctx the parse tree
	 */
	void exitIoCmd(ForcaParser.IoCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#listaArgs}.
	 * @param ctx the parse tree
	 */
	void enterListaArgs(ForcaParser.ListaArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#listaArgs}.
	 * @param ctx the parse tree
	 */
	void exitListaArgs(ForcaParser.ListaArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(ForcaParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(ForcaParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(ForcaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(ForcaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#exprOu}.
	 * @param ctx the parse tree
	 */
	void enterExprOu(ForcaParser.ExprOuContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#exprOu}.
	 * @param ctx the parse tree
	 */
	void exitExprOu(ForcaParser.ExprOuContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#exprE}.
	 * @param ctx the parse tree
	 */
	void enterExprE(ForcaParser.ExprEContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#exprE}.
	 * @param ctx the parse tree
	 */
	void exitExprE(ForcaParser.ExprEContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#exprIgual}.
	 * @param ctx the parse tree
	 */
	void enterExprIgual(ForcaParser.ExprIgualContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#exprIgual}.
	 * @param ctx the parse tree
	 */
	void exitExprIgual(ForcaParser.ExprIgualContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#exprRel}.
	 * @param ctx the parse tree
	 */
	void enterExprRel(ForcaParser.ExprRelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#exprRel}.
	 * @param ctx the parse tree
	 */
	void exitExprRel(ForcaParser.ExprRelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#exprAdd}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(ForcaParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#exprAdd}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(ForcaParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#exprMul}.
	 * @param ctx the parse tree
	 */
	void enterExprMul(ForcaParser.ExprMulContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#exprMul}.
	 * @param ctx the parse tree
	 */
	void exitExprMul(ForcaParser.ExprMulContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#exprUn}.
	 * @param ctx the parse tree
	 */
	void enterExprUn(ForcaParser.ExprUnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#exprUn}.
	 * @param ctx the parse tree
	 */
	void exitExprUn(ForcaParser.ExprUnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#prim}.
	 * @param ctx the parse tree
	 */
	void enterPrim(ForcaParser.PrimContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#prim}.
	 * @param ctx the parse tree
	 */
	void exitPrim(ForcaParser.PrimContext ctx);
	/**
	 * Enter a parse tree produced by {@link ForcaParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ForcaParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ForcaParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ForcaParser.LiteralContext ctx);
}