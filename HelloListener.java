// Generated from Hello.txt by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(HelloParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(HelloParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#declaraVariavel}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraVariavel(HelloParser.DeclaraVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#declaraVariavel}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraVariavel(HelloParser.DeclaraVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#operacaoComparacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoComparacao(HelloParser.OperacaoComparacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#operacaoComparacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoComparacao(HelloParser.OperacaoComparacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#operacaoCT}.
	 * @param ctx the parse tree
	 */
	void enterOperacaoCT(HelloParser.OperacaoCTContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#operacaoCT}.
	 * @param ctx the parse tree
	 */
	void exitOperacaoCT(HelloParser.OperacaoCTContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#nfor}.
	 * @param ctx the parse tree
	 */
	void enterNfor(HelloParser.NforContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#nfor}.
	 * @param ctx the parse tree
	 */
	void exitNfor(HelloParser.NforContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#nelse}.
	 * @param ctx the parse tree
	 */
	void enterNelse(HelloParser.NelseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#nelse}.
	 * @param ctx the parse tree
	 */
	void exitNelse(HelloParser.NelseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#nif}.
	 * @param ctx the parse tree
	 */
	void enterNif(HelloParser.NifContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#nif}.
	 * @param ctx the parse tree
	 */
	void exitNif(HelloParser.NifContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#natribuicao}.
	 * @param ctx the parse tree
	 */
	void enterNatribuicao(HelloParser.NatribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#natribuicao}.
	 * @param ctx the parse tree
	 */
	void exitNatribuicao(HelloParser.NatribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#nwhile}.
	 * @param ctx the parse tree
	 */
	void enterNwhile(HelloParser.NwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#nwhile}.
	 * @param ctx the parse tree
	 */
	void exitNwhile(HelloParser.NwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HelloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HelloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(HelloParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(HelloParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(HelloParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(HelloParser.TermContext ctx);
}