// Generated from C:/projetos/analise-lexica-sintatica/src/main/java/ufpi/compiladores/gramatica.g4 by ANTLR 4.13.1
package ufpi.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#declaracaoVariaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariaveis(gramaticaParser.DeclaracaoVariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRepeticao(gramaticaParser.ComandoRepeticaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicaoVariavel(gramaticaParser.AtribuicaoVariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(gramaticaParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(gramaticaParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#comandoPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoPrint(gramaticaParser.ComandoPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#comandoRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRead(gramaticaParser.ComandoReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaArgumentosPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgumentosPrint(gramaticaParser.ListaArgumentosPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#listaArgumentosRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgumentosRead(gramaticaParser.ListaArgumentosReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmetica(gramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(gramaticaParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(gramaticaParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#primeiroTermo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimeiroTermo(gramaticaParser.PrimeiroTermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#expressaoBooleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoBooleana(gramaticaParser.ExpressaoBooleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#termoBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoBool(gramaticaParser.TermoBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#fatorBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorBool(gramaticaParser.FatorBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacional(gramaticaParser.RelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#relacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacao(gramaticaParser.RelacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#negacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacao(gramaticaParser.NegacaoContext ctx);
}