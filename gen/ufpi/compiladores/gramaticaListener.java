// Generated from C:/projetos/analise-lexica-sintatica/src/main/java/ufpi/compiladores/GramaticaSimp.g4 by ANTLR 4.13.1
package ufpi.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaParser}.
 */
public interface GramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(GramaticaParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(GramaticaParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandosDel}.
	 * @param ctx the parse tree
	 */
	void enterComandosDel(GramaticaParser.ComandosDelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandosDel}.
	 * @param ctx the parse tree
	 */
	void exitComandosDel(GramaticaParser.ComandosDelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#declaracaoVariaveis}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariaveis(GramaticaParser.DeclaracaoVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#declaracaoVariaveis}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariaveis(GramaticaParser.DeclaracaoVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandoRepeat}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeat(GramaticaParser.ComandoRepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandoRepeat}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeat(GramaticaParser.ComandoRepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoVariavel(GramaticaParser.AtribuicaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoVariavel(GramaticaParser.AtribuicaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandoPrint}.
	 * @param ctx the parse tree
	 */
	void enterComandoPrint(GramaticaParser.ComandoPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandoPrint}.
	 * @param ctx the parse tree
	 */
	void exitComandoPrint(GramaticaParser.ComandoPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandoRead}.
	 * @param ctx the parse tree
	 */
	void enterComandoRead(GramaticaParser.ComandoReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandoRead}.
	 * @param ctx the parse tree
	 */
	void exitComandoRead(GramaticaParser.ComandoReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#comandoIf}.
	 * @param ctx the parse tree
	 */
	void enterComandoIf(GramaticaParser.ComandoIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#comandoIf}.
	 * @param ctx the parse tree
	 */
	void exitComandoIf(GramaticaParser.ComandoIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaArgumentosPrint}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentosPrint(GramaticaParser.ListaArgumentosPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaArgumentosPrint}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentosPrint(GramaticaParser.ListaArgumentosPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#argumentoPrint}.
	 * @param ctx the parse tree
	 */
	void enterArgumentoPrint(GramaticaParser.ArgumentoPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#argumentoPrint}.
	 * @param ctx the parse tree
	 */
	void exitArgumentoPrint(GramaticaParser.ArgumentoPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#listaArgumentosRead}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentosRead(GramaticaParser.ListaArgumentosReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#listaArgumentosRead}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentosRead(GramaticaParser.ListaArgumentosReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(GramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(GramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#termoAri}.
	 * @param ctx the parse tree
	 */
	void enterTermoAri(GramaticaParser.TermoAriContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#termoAri}.
	 * @param ctx the parse tree
	 */
	void exitTermoAri(GramaticaParser.TermoAriContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fatorAri}.
	 * @param ctx the parse tree
	 */
	void enterFatorAri(GramaticaParser.FatorAriContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fatorAri}.
	 * @param ctx the parse tree
	 */
	void exitFatorAri(GramaticaParser.FatorAriContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#expressaoBooleana}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoBooleana(GramaticaParser.ExpressaoBooleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#expressaoBooleana}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoBooleana(GramaticaParser.ExpressaoBooleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#termoBool}.
	 * @param ctx the parse tree
	 */
	void enterTermoBool(GramaticaParser.TermoBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#termoBool}.
	 * @param ctx the parse tree
	 */
	void exitTermoBool(GramaticaParser.TermoBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#fatorBool}.
	 * @param ctx the parse tree
	 */
	void enterFatorBool(GramaticaParser.FatorBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#fatorBool}.
	 * @param ctx the parse tree
	 */
	void exitFatorBool(GramaticaParser.FatorBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#relacional}.
	 * @param ctx the parse tree
	 */
	void enterRelacional(GramaticaParser.RelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#relacional}.
	 * @param ctx the parse tree
	 */
	void exitRelacional(GramaticaParser.RelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(GramaticaParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(GramaticaParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#negacao}.
	 * @param ctx the parse tree
	 */
	void enterNegacao(GramaticaParser.NegacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#negacao}.
	 * @param ctx the parse tree
	 */
	void exitNegacao(GramaticaParser.NegacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#conversaoExplicita}.
	 * @param ctx the parse tree
	 */
	void enterConversaoExplicita(GramaticaParser.ConversaoExplicitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#conversaoExplicita}.
	 * @param ctx the parse tree
	 */
	void exitConversaoExplicita(GramaticaParser.ConversaoExplicitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaParser#variavelValor}.
	 * @param ctx the parse tree
	 */
	void enterVariavelValor(GramaticaParser.VariavelValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaParser#variavelValor}.
	 * @param ctx the parse tree
	 */
	void exitVariavelValor(GramaticaParser.VariavelValorContext ctx);
}