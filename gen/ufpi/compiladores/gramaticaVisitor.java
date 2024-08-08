// Generated from C:/projetos/analise-lexica-sintatica/src/main/java/ufpi/compiladores/GramaticaSimp.g4 by ANTLR 4.13.1
package ufpi.compiladores;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(GramaticaParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comandosDel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandosDel(GramaticaParser.ComandosDelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comando}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComando(GramaticaParser.ComandoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#declaracaoVariaveis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoVariaveis(GramaticaParser.DeclaracaoVariaveisContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comandoRepeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRepeat(GramaticaParser.ComandoRepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#atribuicaoVariavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicaoVariavel(GramaticaParser.AtribuicaoVariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comandoPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoPrint(GramaticaParser.ComandoPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comandoRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoRead(GramaticaParser.ComandoReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comandoIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandoIf(GramaticaParser.ComandoIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listaArgumentosPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgumentosPrint(GramaticaParser.ListaArgumentosPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#argumentoPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentoPrint(GramaticaParser.ArgumentoPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#listaArgumentosRead}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgumentosRead(GramaticaParser.ListaArgumentosReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmetica(GramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#termoAri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoAri(GramaticaParser.TermoAriContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#fatorAri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorAri(GramaticaParser.FatorAriContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expressaoBooleana}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoBooleana(GramaticaParser.ExpressaoBooleanaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#termoBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermoBool(GramaticaParser.TermoBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#fatorBool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFatorBool(GramaticaParser.FatorBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacional(GramaticaParser.RelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#relacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelacao(GramaticaParser.RelacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#negacao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegacao(GramaticaParser.NegacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#conversaoExplicita}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversaoExplicita(GramaticaParser.ConversaoExplicitaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#variavelValor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavelValor(GramaticaParser.VariavelValorContext ctx);
}