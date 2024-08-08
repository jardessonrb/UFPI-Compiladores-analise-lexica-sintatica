// Generated from C:/projetos/analise-lexica-sintatica/src/main/java/ufpi/compiladores/GramaticaSimp.g4 by ANTLR 4.13.1
package ufpi.compiladores.parser;

    import java.util.*;
    import ufpi.compiladores.backend.TabelaSimbolo;
    import ufpi.compiladores.backend.Variavel;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaSimpParser}.
 */
public interface GramaticaSimpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaSimpParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaSimpParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(GramaticaSimpParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(GramaticaSimpParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#comandosDel}.
	 * @param ctx the parse tree
	 */
	void enterComandosDel(GramaticaSimpParser.ComandosDelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#comandosDel}.
	 * @param ctx the parse tree
	 */
	void exitComandosDel(GramaticaSimpParser.ComandosDelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#declaracaoVariaveis}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoVariaveis(GramaticaSimpParser.DeclaracaoVariaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#declaracaoVariaveis}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoVariaveis(GramaticaSimpParser.DeclaracaoVariaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#comandoRepeat}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeat(GramaticaSimpParser.ComandoRepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#comandoRepeat}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeat(GramaticaSimpParser.ComandoRepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoVariavel(GramaticaSimpParser.AtribuicaoVariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoVariavel(GramaticaSimpParser.AtribuicaoVariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#comandoPrint}.
	 * @param ctx the parse tree
	 */
	void enterComandoPrint(GramaticaSimpParser.ComandoPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#comandoPrint}.
	 * @param ctx the parse tree
	 */
	void exitComandoPrint(GramaticaSimpParser.ComandoPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#comandoRead}.
	 * @param ctx the parse tree
	 */
	void enterComandoRead(GramaticaSimpParser.ComandoReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#comandoRead}.
	 * @param ctx the parse tree
	 */
	void exitComandoRead(GramaticaSimpParser.ComandoReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#comandoIf}.
	 * @param ctx the parse tree
	 */
	void enterComandoIf(GramaticaSimpParser.ComandoIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#comandoIf}.
	 * @param ctx the parse tree
	 */
	void exitComandoIf(GramaticaSimpParser.ComandoIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#listaArgumentosPrint}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentosPrint(GramaticaSimpParser.ListaArgumentosPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#listaArgumentosPrint}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentosPrint(GramaticaSimpParser.ListaArgumentosPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#argumentoPrint}.
	 * @param ctx the parse tree
	 */
	void enterArgumentoPrint(GramaticaSimpParser.ArgumentoPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#argumentoPrint}.
	 * @param ctx the parse tree
	 */
	void exitArgumentoPrint(GramaticaSimpParser.ArgumentoPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#listaArgumentosRead}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentosRead(GramaticaSimpParser.ListaArgumentosReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#listaArgumentosRead}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentosRead(GramaticaSimpParser.ListaArgumentosReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(GramaticaSimpParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(GramaticaSimpParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#termoAri}.
	 * @param ctx the parse tree
	 */
	void enterTermoAri(GramaticaSimpParser.TermoAriContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#termoAri}.
	 * @param ctx the parse tree
	 */
	void exitTermoAri(GramaticaSimpParser.TermoAriContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#fatorAri}.
	 * @param ctx the parse tree
	 */
	void enterFatorAri(GramaticaSimpParser.FatorAriContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#fatorAri}.
	 * @param ctx the parse tree
	 */
	void exitFatorAri(GramaticaSimpParser.FatorAriContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#expressaoBooleana}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoBooleana(GramaticaSimpParser.ExpressaoBooleanaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#expressaoBooleana}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoBooleana(GramaticaSimpParser.ExpressaoBooleanaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#termoBool}.
	 * @param ctx the parse tree
	 */
	void enterTermoBool(GramaticaSimpParser.TermoBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#termoBool}.
	 * @param ctx the parse tree
	 */
	void exitTermoBool(GramaticaSimpParser.TermoBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#fatorBool}.
	 * @param ctx the parse tree
	 */
	void enterFatorBool(GramaticaSimpParser.FatorBoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#fatorBool}.
	 * @param ctx the parse tree
	 */
	void exitFatorBool(GramaticaSimpParser.FatorBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#relacional}.
	 * @param ctx the parse tree
	 */
	void enterRelacional(GramaticaSimpParser.RelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#relacional}.
	 * @param ctx the parse tree
	 */
	void exitRelacional(GramaticaSimpParser.RelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#relacao}.
	 * @param ctx the parse tree
	 */
	void enterRelacao(GramaticaSimpParser.RelacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#relacao}.
	 * @param ctx the parse tree
	 */
	void exitRelacao(GramaticaSimpParser.RelacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#negacao}.
	 * @param ctx the parse tree
	 */
	void enterNegacao(GramaticaSimpParser.NegacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#negacao}.
	 * @param ctx the parse tree
	 */
	void exitNegacao(GramaticaSimpParser.NegacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#conversaoExplicita}.
	 * @param ctx the parse tree
	 */
	void enterConversaoExplicita(GramaticaSimpParser.ConversaoExplicitaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#conversaoExplicita}.
	 * @param ctx the parse tree
	 */
	void exitConversaoExplicita(GramaticaSimpParser.ConversaoExplicitaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSimpParser#variavelValor}.
	 * @param ctx the parse tree
	 */
	void enterVariavelValor(GramaticaSimpParser.VariavelValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSimpParser#variavelValor}.
	 * @param ctx the parse tree
	 */
	void exitVariavelValor(GramaticaSimpParser.VariavelValorContext ctx);
}