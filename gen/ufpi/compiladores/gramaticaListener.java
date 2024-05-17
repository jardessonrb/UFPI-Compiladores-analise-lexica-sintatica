// Generated from C:/projetos/analise-lexica-sintatica/src/main/java/ufpi/compiladores/gramatica.g4 by ANTLR 4.13.1
package ufpi.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracaoVariaveis}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariaveis(gramaticaParser.DeclaracaoVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracaoVariaveis}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariaveis(gramaticaParser.DeclaracaoVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(gramaticaParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(gramaticaParser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoVariavel(gramaticaParser.AtribuicaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoVariavel(gramaticaParser.AtribuicaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(gramaticaParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(gramaticaParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(gramaticaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(gramaticaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoPrint}.
	 * @param ctx the parse tree
	 */
	void enterComandoPrint(gramaticaParser.ComandoPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoPrint}.
	 * @param ctx the parse tree
	 */
	void exitComandoPrint(gramaticaParser.ComandoPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#comandoRead}.
	 * @param ctx the parse tree
	 */
	void enterComandoRead(gramaticaParser.ComandoReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#comandoRead}.
	 * @param ctx the parse tree
	 */
	void exitComandoRead(gramaticaParser.ComandoReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaArgumentosPrint}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentosPrint(gramaticaParser.ListaArgumentosPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaArgumentosPrint}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentosPrint(gramaticaParser.ListaArgumentosPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#listaArgumentosRead}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentosRead(gramaticaParser.ListaArgumentosReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#listaArgumentosRead}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentosRead(gramaticaParser.ListaArgumentosReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(gramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(gramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(gramaticaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(gramaticaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(gramaticaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(gramaticaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#primeiroTermo}.
	 * @param ctx the parse tree
	 */
	void enterPrimeiroTermo(gramaticaParser.PrimeiroTermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#primeiroTermo}.
	 * @param ctx the parse tree
	 */
	void exitPrimeiroTermo(gramaticaParser.PrimeiroTermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#expressaoBooleana}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoBooleana(gramaticaParser.ExpressaoBooleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#expressaoBooleana}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoBooleana(gramaticaParser.ExpressaoBooleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#termoBool}.
	 * @param ctx the parse tree
	 */
	void enterTermoBool(gramaticaParser.TermoBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#termoBool}.
	 * @param ctx the parse tree
	 */
	void exitTermoBool(gramaticaParser.TermoBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#fatorBool}.
	 * @param ctx the parse tree
	 */
	void enterFatorBool(gramaticaParser.FatorBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#fatorBool}.
	 * @param ctx the parse tree
	 */
	void exitFatorBool(gramaticaParser.FatorBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#relacional}.
	 * @param ctx the parse tree
	 */
	void enterRelacional(gramaticaParser.RelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#relacional}.
	 * @param ctx the parse tree
	 */
	void exitRelacional(gramaticaParser.RelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(gramaticaParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(gramaticaParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#negacao}.
	 * @param ctx the parse tree
	 */
	void enterNegacao(gramaticaParser.NegacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#negacao}.
	 * @param ctx the parse tree
	 */
	void exitNegacao(gramaticaParser.NegacaoContext ctx);
}