// Generated from C:/projetos/analise-lexica-sintatica/src/main/java/ufpi/compiladores/GramaticaSimp.g4 by ANTLR 4.13.1
package ufpi.compiladores.parser;

    import java.util.*;
    import ufpi.compiladores.backend.TabelaSimbolo;
    import ufpi.compiladores.backend.ListaAtribuicao;
    import ufpi.compiladores.backend.Variavel;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaSimpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaSimpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaticaSimpParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(GramaticaSimpParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#comandosDel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandosDel(GramaticaSimpParser.ComandosDelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#declaracaoVariaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariaveis(GramaticaSimpParser.DeclaracaoVariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#comandoRepeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRepeat(GramaticaSimpParser.ComandoRepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicaoVariavel(GramaticaSimpParser.AtribuicaoVariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#comandoPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoPrint(GramaticaSimpParser.ComandoPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#comandoRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRead(GramaticaSimpParser.ComandoReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#comandoIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoIf(GramaticaSimpParser.ComandoIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#listaArgumentosPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgumentosPrint(GramaticaSimpParser.ListaArgumentosPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#argumentoPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentoPrint(GramaticaSimpParser.ArgumentoPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#listaArgumentosRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgumentosRead(GramaticaSimpParser.ListaArgumentosReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmetica(GramaticaSimpParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#termoAri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoAri(GramaticaSimpParser.TermoAriContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#fatorAri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorAri(GramaticaSimpParser.FatorAriContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#expressaoBooleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoBooleana(GramaticaSimpParser.ExpressaoBooleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#termoBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoBool(GramaticaSimpParser.TermoBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#fatorBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorBool(GramaticaSimpParser.FatorBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacional(GramaticaSimpParser.RelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#relacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacao(GramaticaSimpParser.RelacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#negacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacao(GramaticaSimpParser.NegacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#conversaoExplicita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversaoExplicita(GramaticaSimpParser.ConversaoExplicitaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSimpParser#variavelValor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelValor(GramaticaSimpParser.VariavelValorContext ctx);
}