// Generated from C:/projetos/analise-lexica-sintatica/src/main/java/ufpi/compiladores/GramaticaSimp.g4 by ANTLR 4.13.1
package ufpi.compiladores.parser;

    import java.util.*;
    import ufpi.compiladores.backend.TabelaSimbolo;
    import ufpi.compiladores.backend.Variavel;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GramaticaSimpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, BEGIN=6, END=7, VAR=8, REPEAT=9, 
		UNTIL=10, IF=11, ELSE=12, THEN=13, ENDIF=14, PRINT=15, READ=16, OPERADOR=17, 
		NOT=18, AND=19, OR=20, Op1=21, Op2=22, TRUE=23, FALSE=24, TIPOS=25, CONVERSAO_EXPLICITO=26, 
		NOME_VARIAVEL=27, CMD_ATRIBUICAO=28, NUMERO=29, CADEIA=30, INT=31, FLOAT=32, 
		COMENTARIOS=33, ESCAPES=34;
	public static final int
		RULE_programa = 0, RULE_comandos = 1, RULE_comandosDel = 2, RULE_declaracaoVariaveis = 3, 
		RULE_comandoRepeat = 4, RULE_atribuicaoVariavel = 5, RULE_comandoPrint = 6, 
		RULE_comandoRead = 7, RULE_comandoIf = 8, RULE_listaArgumentosPrint = 9, 
		RULE_argumentoPrint = 10, RULE_listaArgumentosRead = 11, RULE_expressaoAritmetica = 12, 
		RULE_termoAri = 13, RULE_fatorAri = 14, RULE_expressaoBooleana = 15, RULE_termoBool = 16, 
		RULE_fatorBool = 17, RULE_relacional = 18, RULE_relacao = 19, RULE_negacao = 20, 
		RULE_conversaoExplicita = 21, RULE_variavelValor = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "comandos", "comandosDel", "declaracaoVariaveis", "comandoRepeat", 
			"atribuicaoVariavel", "comandoPrint", "comandoRead", "comandoIf", "listaArgumentosPrint", 
			"argumentoPrint", "listaArgumentosRead", "expressaoAritmetica", "termoAri", 
			"fatorAri", "expressaoBooleana", "termoBool", "fatorBool", "relacional", 
			"relacao", "negacao", "conversaoExplicita", "variavelValor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "','", "':'", "'('", "')'", "'begin'", "'end.'", "'var'", 
			"'repeat'", "'until'", "'if'", "'else'", "'then'", "'endif'", "'print'", 
			"'read'", null, "'!'", "'and'", "'or'", null, null, "'true'", "'false'", 
			null, null, null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "BEGIN", "END", "VAR", "REPEAT", 
			"UNTIL", "IF", "ELSE", "THEN", "ENDIF", "PRINT", "READ", "OPERADOR", 
			"NOT", "AND", "OR", "Op1", "Op2", "TRUE", "FALSE", "TIPOS", "CONVERSAO_EXPLICITO", 
			"NOME_VARIAVEL", "CMD_ATRIBUICAO", "NUMERO", "CADEIA", "INT", "FLOAT", 
			"COMENTARIOS", "ESCAPES"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GramaticaSimp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    TabelaSimbolo tabelaSimbolos = new TabelaSimbolo();

	public GramaticaSimpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(GramaticaSimpParser.BEGIN, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode END() { return getToken(GramaticaSimpParser.END, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(BEGIN);
			setState(47);
			comandos();
			setState(48);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public List<ComandosDelContext> comandosDel() {
			return getRuleContexts(ComandosDelContext.class);
		}
		public ComandosDelContext comandosDel(int i) {
			return getRuleContext(ComandosDelContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			comandosDel();
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(51);
				match(T__0);
				setState(52);
				comandosDel();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosDelContext extends ParserRuleContext {
		public DeclaracaoVariaveisContext declaracaoVariaveis;
		public AtribuicaoVariavelContext atribuicaoVariavel;
		public DeclaracaoVariaveisContext declaracaoVariaveis() {
			return getRuleContext(DeclaracaoVariaveisContext.class,0);
		}
		public AtribuicaoVariavelContext atribuicaoVariavel() {
			return getRuleContext(AtribuicaoVariavelContext.class,0);
		}
		public ComandoPrintContext comandoPrint() {
			return getRuleContext(ComandoPrintContext.class,0);
		}
		public ComandoReadContext comandoRead() {
			return getRuleContext(ComandoReadContext.class,0);
		}
		public ComandoRepeatContext comandoRepeat() {
			return getRuleContext(ComandoRepeatContext.class,0);
		}
		public ComandoIfContext comandoIf() {
			return getRuleContext(ComandoIfContext.class,0);
		}
		public ComandosDelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandosDel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterComandosDel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitComandosDel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitComandosDel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosDelContext comandosDel() throws RecognitionException {
		ComandosDelContext _localctx = new ComandosDelContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comandosDel);
		try {
			setState(68);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				((ComandosDelContext)_localctx).declaracaoVariaveis = declaracaoVariaveis();


				System.out.println("Tipo Declaracao: "+ ((ComandosDelContext)_localctx).declaracaoVariaveis.tipoDeclaracao);
				tabelaSimbolos.printVariaveis();


				}
				break;
			case NOME_VARIAVEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((ComandosDelContext)_localctx).atribuicaoVariavel = atribuicaoVariavel();
				System.out.println("ValorAtribuicao: "+((ComandosDelContext)_localctx).atribuicaoVariavel.valorAtributo);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				comandoPrint();
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				comandoRead();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				comandoRepeat();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				comandoIf();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoVariaveisContext extends ParserRuleContext {
		public String tipoDeclaracao;
		public Token NOME_VARIAVEL;
		public Token TIPOS;
		public TerminalNode VAR() { return getToken(GramaticaSimpParser.VAR, 0); }
		public List<TerminalNode> NOME_VARIAVEL() { return getTokens(GramaticaSimpParser.NOME_VARIAVEL); }
		public TerminalNode NOME_VARIAVEL(int i) {
			return getToken(GramaticaSimpParser.NOME_VARIAVEL, i);
		}
		public TerminalNode TIPOS() { return getToken(GramaticaSimpParser.TIPOS, 0); }
		public DeclaracaoVariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterDeclaracaoVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitDeclaracaoVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitDeclaracaoVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoVariaveisContext declaracaoVariaveis() throws RecognitionException {
		DeclaracaoVariaveisContext _localctx = new DeclaracaoVariaveisContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracaoVariaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((DeclaracaoVariaveisContext)_localctx).tipoDeclaracao =  "";
			setState(71);
			match(VAR);
			setState(72);
			((DeclaracaoVariaveisContext)_localctx).NOME_VARIAVEL = match(NOME_VARIAVEL);

			    tabelaSimbolos.declararVariavel((((DeclaracaoVariaveisContext)_localctx).NOME_VARIAVEL!=null?((DeclaracaoVariaveisContext)_localctx).NOME_VARIAVEL.getText():null), new Variavel((((DeclaracaoVariaveisContext)_localctx).NOME_VARIAVEL!=null?((DeclaracaoVariaveisContext)_localctx).NOME_VARIAVEL.getText():null)));

			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(74);
				match(T__1);
				setState(75);
				((DeclaracaoVariaveisContext)_localctx).NOME_VARIAVEL = match(NOME_VARIAVEL);

				    tabelaSimbolos.declararVariavel((((DeclaracaoVariaveisContext)_localctx).NOME_VARIAVEL!=null?((DeclaracaoVariaveisContext)_localctx).NOME_VARIAVEL.getText():null), new Variavel((((DeclaracaoVariaveisContext)_localctx).NOME_VARIAVEL!=null?((DeclaracaoVariaveisContext)_localctx).NOME_VARIAVEL.getText():null)));

				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(T__2);
			setState(83);
			((DeclaracaoVariaveisContext)_localctx).TIPOS = match(TIPOS);
			tabelaSimbolos.atualizarTipo((((DeclaracaoVariaveisContext)_localctx).TIPOS!=null?((DeclaracaoVariaveisContext)_localctx).TIPOS.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoRepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(GramaticaSimpParser.REPEAT, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(GramaticaSimpParser.UNTIL, 0); }
		public ExpressaoBooleanaContext expressaoBooleana() {
			return getRuleContext(ExpressaoBooleanaContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(GramaticaSimpParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(GramaticaSimpParser.FALSE, 0); }
		public ComandoRepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRepeat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterComandoRepeat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitComandoRepeat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitComandoRepeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoRepeatContext comandoRepeat() throws RecognitionException {
		ComandoRepeatContext _localctx = new ComandoRepeatContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comandoRepeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(REPEAT);
			setState(87);
			comandos();
			setState(88);
			match(UNTIL);
			setState(89);
			match(T__3);
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case NOT:
			case NOME_VARIAVEL:
			case NUMERO:
				{
				setState(90);
				expressaoBooleana();
				}
				break;
			case TRUE:
				{
				setState(91);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(92);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(95);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoVariavelContext extends ParserRuleContext {
		public String valorAtributo;
		public Token NOME_VARIAVEL;
		public Token INT;
		public Token FLOAT;
		public ExpressaoAritmeticaContext expressaoAritmetica;
		public List<TerminalNode> NOME_VARIAVEL() { return getTokens(GramaticaSimpParser.NOME_VARIAVEL); }
		public TerminalNode NOME_VARIAVEL(int i) {
			return getToken(GramaticaSimpParser.NOME_VARIAVEL, i);
		}
		public TerminalNode CMD_ATRIBUICAO() { return getToken(GramaticaSimpParser.CMD_ATRIBUICAO, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode INT() { return getToken(GramaticaSimpParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(GramaticaSimpParser.FLOAT, 0); }
		public AtribuicaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterAtribuicaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitAtribuicaoVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitAtribuicaoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoVariavelContext atribuicaoVariavel() throws RecognitionException {
		AtribuicaoVariavelContext _localctx = new AtribuicaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atribuicaoVariavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AtribuicaoVariavelContext)_localctx).valorAtributo =  "";
			setState(98);
			((AtribuicaoVariavelContext)_localctx).NOME_VARIAVEL = match(NOME_VARIAVEL);
			setState(99);
			match(CMD_ATRIBUICAO);
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(106);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
					{
					setState(100);
					((AtribuicaoVariavelContext)_localctx).INT = match(INT);
					((AtribuicaoVariavelContext)_localctx).valorAtributo =  (((AtribuicaoVariavelContext)_localctx).INT!=null?((AtribuicaoVariavelContext)_localctx).INT.getText():null);
					}
					break;
				case FLOAT:
					{
					setState(102);
					((AtribuicaoVariavelContext)_localctx).FLOAT = match(FLOAT);
					((AtribuicaoVariavelContext)_localctx).valorAtributo =  (((AtribuicaoVariavelContext)_localctx).FLOAT!=null?((AtribuicaoVariavelContext)_localctx).FLOAT.getText():null);
					}
					break;
				case NOME_VARIAVEL:
					{
					setState(104);
					((AtribuicaoVariavelContext)_localctx).NOME_VARIAVEL = match(NOME_VARIAVEL);
					((AtribuicaoVariavelContext)_localctx).valorAtributo =  (((AtribuicaoVariavelContext)_localctx).NOME_VARIAVEL!=null?((AtribuicaoVariavelContext)_localctx).NOME_VARIAVEL.getText():null);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(108);
				((AtribuicaoVariavelContext)_localctx).expressaoAritmetica = expressaoAritmetica();
				((AtribuicaoVariavelContext)_localctx).valorAtributo =  ((AtribuicaoVariavelContext)_localctx).expressaoAritmetica.code;
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoPrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GramaticaSimpParser.PRINT, 0); }
		public ListaArgumentosPrintContext listaArgumentosPrint() {
			return getRuleContext(ListaArgumentosPrintContext.class,0);
		}
		public ComandoPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterComandoPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitComandoPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitComandoPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoPrintContext comandoPrint() throws RecognitionException {
		ComandoPrintContext _localctx = new ComandoPrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comandoPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(PRINT);
			setState(114);
			match(T__3);
			setState(115);
			listaArgumentosPrint();
			setState(116);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(GramaticaSimpParser.READ, 0); }
		public ListaArgumentosReadContext listaArgumentosRead() {
			return getRuleContext(ListaArgumentosReadContext.class,0);
		}
		public ComandoReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterComandoRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitComandoRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitComandoRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoReadContext comandoRead() throws RecognitionException {
		ComandoReadContext _localctx = new ComandoReadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comandoRead);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(READ);
			setState(119);
			match(T__3);
			setState(120);
			listaArgumentosRead();
			setState(121);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoIfContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GramaticaSimpParser.IF, 0); }
		public TerminalNode THEN() { return getToken(GramaticaSimpParser.THEN, 0); }
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public TerminalNode ENDIF() { return getToken(GramaticaSimpParser.ENDIF, 0); }
		public ExpressaoBooleanaContext expressaoBooleana() {
			return getRuleContext(ExpressaoBooleanaContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(GramaticaSimpParser.ELSE, 0); }
		public ComandoIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterComandoIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitComandoIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitComandoIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoIfContext comandoIf() throws RecognitionException {
		ComandoIfContext _localctx = new ComandoIfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_comandoIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(IF);
			setState(124);
			match(T__3);
			{
			setState(125);
			expressaoBooleana();
			}
			setState(126);
			match(T__4);
			setState(127);
			match(THEN);
			setState(128);
			comandos();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(129);
				match(ELSE);
				setState(130);
				comandos();
				}
			}

			setState(133);
			match(ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaArgumentosPrintContext extends ParserRuleContext {
		public List<ArgumentoPrintContext> argumentoPrint() {
			return getRuleContexts(ArgumentoPrintContext.class);
		}
		public ArgumentoPrintContext argumentoPrint(int i) {
			return getRuleContext(ArgumentoPrintContext.class,i);
		}
		public ListaArgumentosPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgumentosPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterListaArgumentosPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitListaArgumentosPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitListaArgumentosPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaArgumentosPrintContext listaArgumentosPrint() throws RecognitionException {
		ListaArgumentosPrintContext _localctx = new ListaArgumentosPrintContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listaArgumentosPrint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			argumentoPrint();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(136);
				match(T__1);
				setState(137);
				argumentoPrint();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentoPrintContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(GramaticaSimpParser.CADEIA, 0); }
		public TerminalNode NOME_VARIAVEL() { return getToken(GramaticaSimpParser.NOME_VARIAVEL, 0); }
		public TerminalNode NUMERO() { return getToken(GramaticaSimpParser.NUMERO, 0); }
		public ArgumentoPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentoPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterArgumentoPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitArgumentoPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitArgumentoPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoPrintContext argumentoPrint() throws RecognitionException {
		ArgumentoPrintContext _localctx = new ArgumentoPrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_argumentoPrint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1744830464L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaArgumentosReadContext extends ParserRuleContext {
		public List<TerminalNode> NOME_VARIAVEL() { return getTokens(GramaticaSimpParser.NOME_VARIAVEL); }
		public TerminalNode NOME_VARIAVEL(int i) {
			return getToken(GramaticaSimpParser.NOME_VARIAVEL, i);
		}
		public ListaArgumentosReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgumentosRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterListaArgumentosRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitListaArgumentosRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitListaArgumentosRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaArgumentosReadContext listaArgumentosRead() throws RecognitionException {
		ListaArgumentosReadContext _localctx = new ListaArgumentosReadContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_listaArgumentosRead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(NOME_VARIAVEL);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(146);
				match(T__1);
				setState(147);
				match(NOME_VARIAVEL);
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public String code;
		public TermoAriContext termoAri;
		public Token Op1;
		public List<TermoAriContext> termoAri() {
			return getRuleContexts(TermoAriContext.class);
		}
		public TermoAriContext termoAri(int i) {
			return getRuleContext(TermoAriContext.class,i);
		}
		public List<TerminalNode> Op1() { return getTokens(GramaticaSimpParser.Op1); }
		public TerminalNode Op1(int i) {
			return getToken(GramaticaSimpParser.Op1, i);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitExpressaoAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitExpressaoAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressaoAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ExpressaoAritmeticaContext)_localctx).code =  "";
			setState(154);
			((ExpressaoAritmeticaContext)_localctx).termoAri = termoAri();
			_localctx.code += ((ExpressaoAritmeticaContext)_localctx).termoAri.termo;
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Op1) {
				{
				{
				setState(156);
				((ExpressaoAritmeticaContext)_localctx).Op1 = match(Op1);
				_localctx.code += (((ExpressaoAritmeticaContext)_localctx).Op1!=null?((ExpressaoAritmeticaContext)_localctx).Op1.getText():null);
				setState(158);
				((ExpressaoAritmeticaContext)_localctx).termoAri = termoAri();

				_localctx.code += (((ExpressaoAritmeticaContext)_localctx).termoAri!=null?_input.getText(((ExpressaoAritmeticaContext)_localctx).termoAri.start,((ExpressaoAritmeticaContext)_localctx).termoAri.stop):null);
				((ExpressaoAritmeticaContext)_localctx).code =  tabelaSimbolos.newTemp()+ " = " + _localctx.code;

				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoAriContext extends ParserRuleContext {
		public String termo;
		public FatorAriContext fatorAri;
		public Token Op2;
		public List<FatorAriContext> fatorAri() {
			return getRuleContexts(FatorAriContext.class);
		}
		public FatorAriContext fatorAri(int i) {
			return getRuleContext(FatorAriContext.class,i);
		}
		public List<TerminalNode> Op2() { return getTokens(GramaticaSimpParser.Op2); }
		public TerminalNode Op2(int i) {
			return getToken(GramaticaSimpParser.Op2, i);
		}
		public TermoAriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterTermoAri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitTermoAri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitTermoAri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoAriContext termoAri() throws RecognitionException {
		TermoAriContext _localctx = new TermoAriContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_termoAri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((TermoAriContext)_localctx).termo =   "";
			setState(167);
			((TermoAriContext)_localctx).fatorAri = fatorAri();
			_localctx.termo += (((TermoAriContext)_localctx).fatorAri!=null?_input.getText(((TermoAriContext)_localctx).fatorAri.start,((TermoAriContext)_localctx).fatorAri.stop):null);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Op2) {
				{
				{
				setState(169);
				((TermoAriContext)_localctx).Op2 = match(Op2);
				_localctx.termo += (((TermoAriContext)_localctx).Op2!=null?((TermoAriContext)_localctx).Op2.getText():null);
				setState(171);
				((TermoAriContext)_localctx).fatorAri = fatorAri();

				_localctx.termo += (((TermoAriContext)_localctx).fatorAri!=null?_input.getText(((TermoAriContext)_localctx).fatorAri.start,((TermoAriContext)_localctx).fatorAri.stop):null);

				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorAriContext extends ParserRuleContext {
		public String code;
		public VariavelValorContext variavelValor;
		public ExpressaoAritmeticaContext expressaoAritmetica;
		public VariavelValorContext variavelValor() {
			return getRuleContext(VariavelValorContext.class,0);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ConversaoExplicitaContext conversaoExplicita() {
			return getRuleContext(ConversaoExplicitaContext.class,0);
		}
		public FatorAriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorAri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterFatorAri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitFatorAri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitFatorAri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorAriContext fatorAri() throws RecognitionException {
		FatorAriContext _localctx = new FatorAriContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fatorAri);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME_VARIAVEL:
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				((FatorAriContext)_localctx).code =  "";
				setState(180);
				((FatorAriContext)_localctx).variavelValor = variavelValor();
				((FatorAriContext)_localctx).code =  ((FatorAriContext)_localctx).variavelValor.valor;
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__3);
				setState(184);
				((FatorAriContext)_localctx).expressaoAritmetica = expressaoAritmetica();
				setState(185);
				match(T__4);

				            _localctx.code += ((FatorAriContext)_localctx).expressaoAritmetica.code;
				        
				}
				break;
			case CONVERSAO_EXPLICITO:
				enterOuterAlt(_localctx, 3);
				{
				setState(188);
				conversaoExplicita();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoBooleanaContext extends ParserRuleContext {
		public List<TermoBoolContext> termoBool() {
			return getRuleContexts(TermoBoolContext.class);
		}
		public TermoBoolContext termoBool(int i) {
			return getRuleContext(TermoBoolContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(GramaticaSimpParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(GramaticaSimpParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(GramaticaSimpParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(GramaticaSimpParser.OR, i);
		}
		public ExpressaoBooleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoBooleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterExpressaoBooleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitExpressaoBooleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitExpressaoBooleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoBooleanaContext expressaoBooleana() throws RecognitionException {
		ExpressaoBooleanaContext _localctx = new ExpressaoBooleanaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressaoBooleana);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			termoBool();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(192);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(193);
				termoBool();
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermoBoolContext extends ParserRuleContext {
		public FatorBoolContext fatorBool() {
			return getRuleContext(FatorBoolContext.class,0);
		}
		public NegacaoContext negacao() {
			return getRuleContext(NegacaoContext.class,0);
		}
		public TermoBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterTermoBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitTermoBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitTermoBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoBoolContext termoBool() throws RecognitionException {
		TermoBoolContext _localctx = new TermoBoolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_termoBool);
		try {
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				fatorBool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				negacao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FatorBoolContext extends ParserRuleContext {
		public RelacionalContext relacional() {
			return getRuleContext(RelacionalContext.class,0);
		}
		public NegacaoContext negacao() {
			return getRuleContext(NegacaoContext.class,0);
		}
		public FatorBoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorBool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterFatorBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitFatorBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitFatorBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorBoolContext fatorBool() throws RecognitionException {
		FatorBoolContext _localctx = new FatorBoolContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fatorBool);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case NOME_VARIAVEL:
			case NUMERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				relacional();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				negacao();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelacionalContext extends ParserRuleContext {
		public RelacaoContext relacao() {
			return getRuleContext(RelacaoContext.class,0);
		}
		public ExpressaoBooleanaContext expressaoBooleana() {
			return getRuleContext(ExpressaoBooleanaContext.class,0);
		}
		public RelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionalContext relacional() throws RecognitionException {
		RelacionalContext _localctx = new RelacionalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relacional);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				relacao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(T__3);
				setState(209);
				expressaoBooleana();
				setState(210);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelacaoContext extends ParserRuleContext {
		public List<VariavelValorContext> variavelValor() {
			return getRuleContexts(VariavelValorContext.class);
		}
		public VariavelValorContext variavelValor(int i) {
			return getRuleContext(VariavelValorContext.class,i);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode OPERADOR() { return getToken(GramaticaSimpParser.OPERADOR, 0); }
		public RelacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterRelacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitRelacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitRelacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacaoContext relacao() throws RecognitionException {
		RelacaoContext _localctx = new RelacaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_relacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME_VARIAVEL:
			case NUMERO:
				{
				setState(214);
				variavelValor();
				}
				break;
			case T__3:
				{
				setState(215);
				match(T__3);
				setState(216);
				expressaoAritmetica();
				setState(217);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(221);
			match(OPERADOR);
			setState(222);
			variavelValor();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegacaoContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(GramaticaSimpParser.NOT, 0); }
		public FatorBoolContext fatorBool() {
			return getRuleContext(FatorBoolContext.class,0);
		}
		public NegacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterNegacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitNegacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitNegacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegacaoContext negacao() throws RecognitionException {
		NegacaoContext _localctx = new NegacaoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_negacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(NOT);
			setState(225);
			fatorBool();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConversaoExplicitaContext extends ParserRuleContext {
		public TerminalNode CONVERSAO_EXPLICITO() { return getToken(GramaticaSimpParser.CONVERSAO_EXPLICITO, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public ConversaoExplicitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conversaoExplicita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterConversaoExplicita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitConversaoExplicita(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitConversaoExplicita(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConversaoExplicitaContext conversaoExplicita() throws RecognitionException {
		ConversaoExplicitaContext _localctx = new ConversaoExplicitaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_conversaoExplicita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(CONVERSAO_EXPLICITO);
			setState(228);
			match(T__3);
			setState(229);
			expressaoAritmetica();
			setState(230);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariavelValorContext extends ParserRuleContext {
		public String valor;
		public Token NOME_VARIAVEL;
		public Token NUMERO;
		public TerminalNode NOME_VARIAVEL() { return getToken(GramaticaSimpParser.NOME_VARIAVEL, 0); }
		public TerminalNode NUMERO() { return getToken(GramaticaSimpParser.NUMERO, 0); }
		public VariavelValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavelValor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).enterVariavelValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSimpListener ) ((GramaticaSimpListener)listener).exitVariavelValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSimpVisitor ) return ((GramaticaSimpVisitor<? extends T>)visitor).visitVariavelValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelValorContext variavelValor() throws RecognitionException {
		VariavelValorContext _localctx = new VariavelValorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variavelValor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOME_VARIAVEL:
				{
				setState(232);
				((VariavelValorContext)_localctx).NOME_VARIAVEL = match(NOME_VARIAVEL);
				((VariavelValorContext)_localctx).valor =  (((VariavelValorContext)_localctx).NOME_VARIAVEL!=null?((VariavelValorContext)_localctx).NOME_VARIAVEL.getText():null);
				}
				break;
			case NUMERO:
				{
				setState(234);
				((VariavelValorContext)_localctx).NUMERO = match(NUMERO);
				((VariavelValorContext)_localctx).valor =  (((VariavelValorContext)_localctx).NUMERO!=null?((VariavelValorContext)_localctx).NUMERO.getText():null);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\"\u00ef\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00016\b\u0001\n\u0001\f\u0001"+
		"9\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"E\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003N\b\u0003\n\u0003\f\u0003Q\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"^\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005k\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"p\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0084\b\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0005\t\u008b\b\t\n\t\f\t\u008e\t\t"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0095"+
		"\b\u000b\n\u000b\f\u000b\u0098\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a2\b\f\n\f\f\f\u00a5\t\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00af"+
		"\b\r\n\r\f\r\u00b2\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00be\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u00c3\b\u000f\n\u000f\f\u000f\u00c6\t\u000f\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00ca\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u00ce\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u00d5\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00dc\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u00ed\b\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000"+
		"\u0002\u0002\u0000\u001b\u001b\u001d\u001e\u0001\u0000\u0013\u0014\u00f0"+
		"\u0000.\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u0004D"+
		"\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000\u0000\bV\u0001\u0000"+
		"\u0000\u0000\na\u0001\u0000\u0000\u0000\fq\u0001\u0000\u0000\u0000\u000e"+
		"v\u0001\u0000\u0000\u0000\u0010{\u0001\u0000\u0000\u0000\u0012\u0087\u0001"+
		"\u0000\u0000\u0000\u0014\u008f\u0001\u0000\u0000\u0000\u0016\u0091\u0001"+
		"\u0000\u0000\u0000\u0018\u0099\u0001\u0000\u0000\u0000\u001a\u00a6\u0001"+
		"\u0000\u0000\u0000\u001c\u00bd\u0001\u0000\u0000\u0000\u001e\u00bf\u0001"+
		"\u0000\u0000\u0000 \u00c9\u0001\u0000\u0000\u0000\"\u00cd\u0001\u0000"+
		"\u0000\u0000$\u00d4\u0001\u0000\u0000\u0000&\u00db\u0001\u0000\u0000\u0000"+
		"(\u00e0\u0001\u0000\u0000\u0000*\u00e3\u0001\u0000\u0000\u0000,\u00ec"+
		"\u0001\u0000\u0000\u0000./\u0005\u0006\u0000\u0000/0\u0003\u0002\u0001"+
		"\u000001\u0005\u0007\u0000\u00001\u0001\u0001\u0000\u0000\u000027\u0003"+
		"\u0004\u0002\u000034\u0005\u0001\u0000\u000046\u0003\u0004\u0002\u0000"+
		"53\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008\u0003\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:;\u0003\u0006\u0003\u0000;<\u0006\u0002\uffff\uffff"+
		"\u0000<E\u0001\u0000\u0000\u0000=>\u0003\n\u0005\u0000>?\u0006\u0002\uffff"+
		"\uffff\u0000?E\u0001\u0000\u0000\u0000@E\u0003\f\u0006\u0000AE\u0003\u000e"+
		"\u0007\u0000BE\u0003\b\u0004\u0000CE\u0003\u0010\b\u0000D:\u0001\u0000"+
		"\u0000\u0000D=\u0001\u0000\u0000\u0000D@\u0001\u0000\u0000\u0000DA\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DC\u0001\u0000\u0000\u0000"+
		"E\u0005\u0001\u0000\u0000\u0000FG\u0006\u0003\uffff\uffff\u0000GH\u0005"+
		"\b\u0000\u0000HI\u0005\u001b\u0000\u0000IO\u0006\u0003\uffff\uffff\u0000"+
		"JK\u0005\u0002\u0000\u0000KL\u0005\u001b\u0000\u0000LN\u0006\u0003\uffff"+
		"\uffff\u0000MJ\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PR\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000RS\u0005\u0003\u0000\u0000ST\u0005\u0019\u0000"+
		"\u0000TU\u0006\u0003\uffff\uffff\u0000U\u0007\u0001\u0000\u0000\u0000"+
		"VW\u0005\t\u0000\u0000WX\u0003\u0002\u0001\u0000XY\u0005\n\u0000\u0000"+
		"Y]\u0005\u0004\u0000\u0000Z^\u0003\u001e\u000f\u0000[^\u0005\u0017\u0000"+
		"\u0000\\^\u0005\u0018\u0000\u0000]Z\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0005"+
		"\u0005\u0000\u0000`\t\u0001\u0000\u0000\u0000ab\u0006\u0005\uffff\uffff"+
		"\u0000bc\u0005\u001b\u0000\u0000co\u0005\u001c\u0000\u0000de\u0005\u001f"+
		"\u0000\u0000ek\u0006\u0005\uffff\uffff\u0000fg\u0005 \u0000\u0000gk\u0006"+
		"\u0005\uffff\uffff\u0000hi\u0005\u001b\u0000\u0000ik\u0006\u0005\uffff"+
		"\uffff\u0000jd\u0001\u0000\u0000\u0000jf\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000kp\u0001\u0000\u0000\u0000lm\u0003\u0018\f\u0000mn\u0006"+
		"\u0005\uffff\uffff\u0000np\u0001\u0000\u0000\u0000oj\u0001\u0000\u0000"+
		"\u0000ol\u0001\u0000\u0000\u0000p\u000b\u0001\u0000\u0000\u0000qr\u0005"+
		"\u000f\u0000\u0000rs\u0005\u0004\u0000\u0000st\u0003\u0012\t\u0000tu\u0005"+
		"\u0005\u0000\u0000u\r\u0001\u0000\u0000\u0000vw\u0005\u0010\u0000\u0000"+
		"wx\u0005\u0004\u0000\u0000xy\u0003\u0016\u000b\u0000yz\u0005\u0005\u0000"+
		"\u0000z\u000f\u0001\u0000\u0000\u0000{|\u0005\u000b\u0000\u0000|}\u0005"+
		"\u0004\u0000\u0000}~\u0003\u001e\u000f\u0000~\u007f\u0005\u0005\u0000"+
		"\u0000\u007f\u0080\u0005\r\u0000\u0000\u0080\u0083\u0003\u0002\u0001\u0000"+
		"\u0081\u0082\u0005\f\u0000\u0000\u0082\u0084\u0003\u0002\u0001\u0000\u0083"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u000e\u0000\u0000\u0086"+
		"\u0011\u0001\u0000\u0000\u0000\u0087\u008c\u0003\u0014\n\u0000\u0088\u0089"+
		"\u0005\u0002\u0000\u0000\u0089\u008b\u0003\u0014\n\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0013\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0007"+
		"\u0000\u0000\u0000\u0090\u0015\u0001\u0000\u0000\u0000\u0091\u0096\u0005"+
		"\u001b\u0000\u0000\u0092\u0093\u0005\u0002\u0000\u0000\u0093\u0095\u0005"+
		"\u001b\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0098\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001"+
		"\u0000\u0000\u0000\u0097\u0017\u0001\u0000\u0000\u0000\u0098\u0096\u0001"+
		"\u0000\u0000\u0000\u0099\u009a\u0006\f\uffff\uffff\u0000\u009a\u009b\u0003"+
		"\u001a\r\u0000\u009b\u00a3\u0006\f\uffff\uffff\u0000\u009c\u009d\u0005"+
		"\u0015\u0000\u0000\u009d\u009e\u0006\f\uffff\uffff\u0000\u009e\u009f\u0003"+
		"\u001a\r\u0000\u009f\u00a0\u0006\f\uffff\uffff\u0000\u00a0\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a1\u009c\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a4\u0019\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0006\r\uffff\uffff\u0000\u00a7\u00a8\u0003"+
		"\u001c\u000e\u0000\u00a8\u00b0\u0006\r\uffff\uffff\u0000\u00a9\u00aa\u0005"+
		"\u0016\u0000\u0000\u00aa\u00ab\u0006\r\uffff\uffff\u0000\u00ab\u00ac\u0003"+
		"\u001c\u000e\u0000\u00ac\u00ad\u0006\r\uffff\uffff\u0000\u00ad\u00af\u0001"+
		"\u0000\u0000\u0000\u00ae\u00a9\u0001\u0000\u0000\u0000\u00af\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b1\u001b\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0006\u000e\uffff\uffff\u0000\u00b4\u00b5"+
		"\u0003,\u0016\u0000\u00b5\u00b6\u0006\u000e\uffff\uffff\u0000\u00b6\u00be"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0004\u0000\u0000\u00b8\u00b9"+
		"\u0003\u0018\f\u0000\u00b9\u00ba\u0005\u0005\u0000\u0000\u00ba\u00bb\u0006"+
		"\u000e\uffff\uffff\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00be"+
		"\u0003*\u0015\u0000\u00bd\u00b3\u0001\u0000\u0000\u0000\u00bd\u00b7\u0001"+
		"\u0000\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u001d\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c4\u0003 \u0010\u0000\u00c0\u00c1\u0007\u0001"+
		"\u0000\u0000\u00c1\u00c3\u0003 \u0010\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u001f\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00ca\u0003\"\u0011\u0000"+
		"\u00c8\u00ca\u0003(\u0014\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca!\u0001\u0000\u0000\u0000\u00cb\u00ce"+
		"\u0003$\u0012\u0000\u00cc\u00ce\u0003(\u0014\u0000\u00cd\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce#\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d5\u0003&\u0013\u0000\u00d0\u00d1\u0005\u0004\u0000\u0000"+
		"\u00d1\u00d2\u0003\u001e\u000f\u0000\u00d2\u00d3\u0005\u0005\u0000\u0000"+
		"\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d0\u0001\u0000\u0000\u0000\u00d5%\u0001\u0000\u0000\u0000\u00d6"+
		"\u00dc\u0003,\u0016\u0000\u00d7\u00d8\u0005\u0004\u0000\u0000\u00d8\u00d9"+
		"\u0003\u0018\f\u0000\u00d9\u00da\u0005\u0005\u0000\u0000\u00da\u00dc\u0001"+
		"\u0000\u0000\u0000\u00db\u00d6\u0001\u0000\u0000\u0000\u00db\u00d7\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de\u0005"+
		"\u0011\u0000\u0000\u00de\u00df\u0003,\u0016\u0000\u00df\'\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0005\u0012\u0000\u0000\u00e1\u00e2\u0003\"\u0011"+
		"\u0000\u00e2)\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\u001a\u0000\u0000"+
		"\u00e4\u00e5\u0005\u0004\u0000\u0000\u00e5\u00e6\u0003\u0018\f\u0000\u00e6"+
		"\u00e7\u0005\u0005\u0000\u0000\u00e7+\u0001\u0000\u0000\u0000\u00e8\u00e9"+
		"\u0005\u001b\u0000\u0000\u00e9\u00ed\u0006\u0016\uffff\uffff\u0000\u00ea"+
		"\u00eb\u0005\u001d\u0000\u0000\u00eb\u00ed\u0006\u0016\uffff\uffff\u0000"+
		"\u00ec\u00e8\u0001\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000"+
		"\u00ed-\u0001\u0000\u0000\u0000\u00127DO]jo\u0083\u008c\u0096\u00a3\u00b0"+
		"\u00bd\u00c4\u00c9\u00cd\u00d4\u00db\u00ec";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}