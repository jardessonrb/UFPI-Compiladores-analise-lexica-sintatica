// Generated from C:/projetos/analise-lexica-sintatica/src/main/java/ufpi/compiladores/gramatica.g4 by ANTLR 4.13.1
package ufpi.compiladores;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, NUMBER=13, OPERADOR=14, NOT=15, AND=16, OR=17, 
		Tipos=18, Op1=19, Op2=20, Op3=21, NomeVariavel=22, String=23, ComandoAtribuicao=24, 
		INT=25, FLOAT=26, Valor=27, ESCAPES=28;
	public static final int
		RULE_programa = 0, RULE_declaracaoVariaveis = 1, RULE_comandoRepeticao = 2, 
		RULE_atribuicaoVariavel = 3, RULE_comandos = 4, RULE_comando = 5, RULE_comandoPrint = 6, 
		RULE_comandoRead = 7, RULE_listaArgumentosPrint = 8, RULE_listaArgumentosRead = 9, 
		RULE_expressaoAritmetica = 10, RULE_termo = 11, RULE_fator = 12, RULE_primeiroTermo = 13, 
		RULE_expressaoBooleana = 14, RULE_termoBool = 15, RULE_fatorBool = 16, 
		RULE_relacional = 17, RULE_relacao = 18, RULE_negacao = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracaoVariaveis", "comandoRepeticao", "atribuicaoVariavel", 
			"comandos", "comando", "comandoPrint", "comandoRead", "listaArgumentosPrint", 
			"listaArgumentosRead", "expressaoAritmetica", "termo", "fator", "primeiroTermo", 
			"expressaoBooleana", "termoBool", "fatorBool", "relacional", "relacao", 
			"negacao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'begin'", "'end.'", "'var'", "','", "':'", "'repeat'", "'until'", 
			"'('", "')'", "';'", "'print'", "'read'", null, null, "'!'", "'and'", 
			"'or'", null, null, null, "'^'", null, null, "':='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NUMBER", "OPERADOR", "NOT", "AND", "OR", "Tipos", "Op1", "Op2", 
			"Op3", "NomeVariavel", "String", "ComandoAtribuicao", "INT", "FLOAT", 
			"Valor", "ESCAPES"
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
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			comandos();
			setState(42);
			match(T__1);
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
		public List<TerminalNode> NomeVariavel() { return getTokens(gramaticaParser.NomeVariavel); }
		public TerminalNode NomeVariavel(int i) {
			return getToken(gramaticaParser.NomeVariavel, i);
		}
		public TerminalNode Tipos() { return getToken(gramaticaParser.Tipos, 0); }
		public DeclaracaoVariaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoVariaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeclaracaoVariaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeclaracaoVariaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDeclaracaoVariaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoVariaveisContext declaracaoVariaveis() throws RecognitionException {
		DeclaracaoVariaveisContext _localctx = new DeclaracaoVariaveisContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracaoVariaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__2);
			setState(45);
			match(NomeVariavel);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(46);
				match(T__3);
				setState(47);
				match(NomeVariavel);
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(T__4);
			setState(54);
			match(Tipos);
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
	public static class ComandoRepeticaoContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ExpressaoBooleanaContext expressaoBooleana() {
			return getRuleContext(ExpressaoBooleanaContext.class,0);
		}
		public TerminalNode NomeVariavel() { return getToken(gramaticaParser.NomeVariavel, 0); }
		public ComandoRepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRepeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComandoRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComandoRepeticao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitComandoRepeticao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoRepeticaoContext comandoRepeticao() throws RecognitionException {
		ComandoRepeticaoContext _localctx = new ComandoRepeticaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comandoRepeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__5);
			setState(57);
			comandos();
			setState(58);
			match(T__6);
			setState(59);
			match(T__7);
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case NUMBER:
			case NOT:
				{
				setState(60);
				expressaoBooleana();
				}
				break;
			case NomeVariavel:
				{
				setState(61);
				match(NomeVariavel);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(64);
			match(T__8);
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
		public List<TerminalNode> NomeVariavel() { return getTokens(gramaticaParser.NomeVariavel); }
		public TerminalNode NomeVariavel(int i) {
			return getToken(gramaticaParser.NomeVariavel, i);
		}
		public TerminalNode ComandoAtribuicao() { return getToken(gramaticaParser.ComandoAtribuicao, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode INT() { return getToken(gramaticaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(gramaticaParser.FLOAT, 0); }
		public AtribuicaoVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicaoVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterAtribuicaoVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitAtribuicaoVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitAtribuicaoVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoVariavelContext atribuicaoVariavel() throws RecognitionException {
		AtribuicaoVariavelContext _localctx = new AtribuicaoVariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atribuicaoVariavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(NomeVariavel);
			setState(67);
			match(ComandoAtribuicao);
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NomeVariavel:
			case INT:
			case FLOAT:
				{
				setState(68);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 104857600L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__7:
			case NUMBER:
				{
				setState(69);
				expressaoAritmetica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandosContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			comando();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(73);
				match(T__9);
				setState(74);
				comando();
				}
				}
				setState(79);
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
	public static class ComandoContext extends ParserRuleContext {
		public List<DeclaracaoVariaveisContext> declaracaoVariaveis() {
			return getRuleContexts(DeclaracaoVariaveisContext.class);
		}
		public DeclaracaoVariaveisContext declaracaoVariaveis(int i) {
			return getRuleContext(DeclaracaoVariaveisContext.class,i);
		}
		public List<ComandoRepeticaoContext> comandoRepeticao() {
			return getRuleContexts(ComandoRepeticaoContext.class);
		}
		public ComandoRepeticaoContext comandoRepeticao(int i) {
			return getRuleContext(ComandoRepeticaoContext.class,i);
		}
		public List<AtribuicaoVariavelContext> atribuicaoVariavel() {
			return getRuleContexts(AtribuicaoVariavelContext.class);
		}
		public AtribuicaoVariavelContext atribuicaoVariavel(int i) {
			return getRuleContext(AtribuicaoVariavelContext.class,i);
		}
		public List<ComandoPrintContext> comandoPrint() {
			return getRuleContexts(ComandoPrintContext.class);
		}
		public ComandoPrintContext comandoPrint(int i) {
			return getRuleContext(ComandoPrintContext.class,i);
		}
		public List<ComandoReadContext> comandoRead() {
			return getRuleContexts(ComandoReadContext.class);
		}
		public ComandoReadContext comandoRead(int i) {
			return getRuleContext(ComandoReadContext.class,i);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4200520L) != 0)) {
				{
				setState(85);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
					{
					setState(80);
					declaracaoVariaveis();
					}
					break;
				case T__5:
					{
					setState(81);
					comandoRepeticao();
					}
					break;
				case NomeVariavel:
					{
					setState(82);
					atribuicaoVariavel();
					}
					break;
				case T__10:
					{
					setState(83);
					comandoPrint();
					}
					break;
				case T__11:
					{
					setState(84);
					comandoRead();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(89);
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
	public static class ComandoPrintContext extends ParserRuleContext {
		public ListaArgumentosPrintContext listaArgumentosPrint() {
			return getRuleContext(ListaArgumentosPrintContext.class,0);
		}
		public ComandoPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComandoPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComandoPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitComandoPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoPrintContext comandoPrint() throws RecognitionException {
		ComandoPrintContext _localctx = new ComandoPrintContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comandoPrint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__10);
			setState(91);
			match(T__7);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NomeVariavel || _la==String) {
				{
				setState(92);
				listaArgumentosPrint();
				}
			}

			setState(95);
			match(T__8);
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
		public ListaArgumentosReadContext listaArgumentosRead() {
			return getRuleContext(ListaArgumentosReadContext.class,0);
		}
		public ComandoReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterComandoRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitComandoRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitComandoRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoReadContext comandoRead() throws RecognitionException {
		ComandoReadContext _localctx = new ComandoReadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comandoRead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__11);
			setState(98);
			match(T__7);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NomeVariavel) {
				{
				setState(99);
				listaArgumentosRead();
				}
			}

			setState(102);
			match(T__8);
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
		public List<TerminalNode> String() { return getTokens(gramaticaParser.String); }
		public TerminalNode String(int i) {
			return getToken(gramaticaParser.String, i);
		}
		public List<TerminalNode> NomeVariavel() { return getTokens(gramaticaParser.NomeVariavel); }
		public TerminalNode NomeVariavel(int i) {
			return getToken(gramaticaParser.NomeVariavel, i);
		}
		public ListaArgumentosPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgumentosPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaArgumentosPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaArgumentosPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaArgumentosPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaArgumentosPrintContext listaArgumentosPrint() throws RecognitionException {
		ListaArgumentosPrintContext _localctx = new ListaArgumentosPrintContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaArgumentosPrint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==NomeVariavel || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(105);
				match(T__3);
				setState(106);
				_la = _input.LA(1);
				if ( !(_la==NomeVariavel || _la==String) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(111);
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
	public static class ListaArgumentosReadContext extends ParserRuleContext {
		public List<TerminalNode> NomeVariavel() { return getTokens(gramaticaParser.NomeVariavel); }
		public TerminalNode NomeVariavel(int i) {
			return getToken(gramaticaParser.NomeVariavel, i);
		}
		public ListaArgumentosReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgumentosRead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterListaArgumentosRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitListaArgumentosRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitListaArgumentosRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaArgumentosReadContext listaArgumentosRead() throws RecognitionException {
		ListaArgumentosReadContext _localctx = new ListaArgumentosReadContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listaArgumentosRead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(NomeVariavel);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(113);
				match(T__3);
				setState(114);
				match(NomeVariavel);
				}
				}
				setState(119);
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
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> Op1() { return getTokens(gramaticaParser.Op1); }
		public TerminalNode Op1(int i) {
			return getToken(gramaticaParser.Op1, i);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpressaoAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpressaoAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expressaoAritmetica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			termo();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Op1) {
				{
				{
				setState(121);
				match(Op1);
				setState(122);
				termo();
				}
				}
				setState(127);
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
	public static class TermoContext extends ParserRuleContext {
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> Op2() { return getTokens(gramaticaParser.Op2); }
		public TerminalNode Op2(int i) {
			return getToken(gramaticaParser.Op2, i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			fator();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Op2) {
				{
				{
				setState(129);
				match(Op2);
				setState(130);
				fator();
				}
				}
				setState(135);
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
	public static class FatorContext extends ParserRuleContext {
		public List<PrimeiroTermoContext> primeiroTermo() {
			return getRuleContexts(PrimeiroTermoContext.class);
		}
		public PrimeiroTermoContext primeiroTermo(int i) {
			return getRuleContext(PrimeiroTermoContext.class,i);
		}
		public List<TerminalNode> Op3() { return getTokens(gramaticaParser.Op3); }
		public TerminalNode Op3(int i) {
			return getToken(gramaticaParser.Op3, i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			primeiroTermo();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Op3) {
				{
				{
				setState(137);
				match(Op3);
				setState(138);
				primeiroTermo();
				}
				}
				setState(143);
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
	public static class PrimeiroTermoContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(gramaticaParser.NUMBER, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public PrimeiroTermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primeiroTermo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrimeiroTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrimeiroTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPrimeiroTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimeiroTermoContext primeiroTermo() throws RecognitionException {
		PrimeiroTermoContext _localctx = new PrimeiroTermoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primeiroTermo);
		try {
			setState(149);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(NUMBER);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__7);
				setState(146);
				expressaoAritmetica();
				setState(147);
				match(T__8);
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
		public List<TerminalNode> AND() { return getTokens(gramaticaParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(gramaticaParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(gramaticaParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(gramaticaParser.OR, i);
		}
		public ExpressaoBooleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoBooleana; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterExpressaoBooleana(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitExpressaoBooleana(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitExpressaoBooleana(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoBooleanaContext expressaoBooleana() throws RecognitionException {
		ExpressaoBooleanaContext _localctx = new ExpressaoBooleanaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressaoBooleana);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			termoBool();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(152);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(153);
				termoBool();
				}
				}
				setState(158);
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
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterTermoBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitTermoBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitTermoBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoBoolContext termoBool() throws RecognitionException {
		TermoBoolContext _localctx = new TermoBoolContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_termoBool);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				fatorBool();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
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
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterFatorBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitFatorBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitFatorBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorBoolContext fatorBool() throws RecognitionException {
		FatorBoolContext _localctx = new FatorBoolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fatorBool);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				relacional();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
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
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacionalContext relacional() throws RecognitionException {
		RelacionalContext _localctx = new RelacionalContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_relacional);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				relacao();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(T__7);
				setState(169);
				expressaoBooleana();
				setState(170);
				match(T__8);
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
	public static class RelacaoContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(gramaticaParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(gramaticaParser.NUMBER, i);
		}
		public TerminalNode OPERADOR() { return getToken(gramaticaParser.OPERADOR, 0); }
		public RelacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterRelacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitRelacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitRelacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelacaoContext relacao() throws RecognitionException {
		RelacaoContext _localctx = new RelacaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(NUMBER);
			{
			setState(175);
			match(OPERADOR);
			setState(176);
			match(NUMBER);
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
		public TerminalNode NOT() { return getToken(gramaticaParser.NOT, 0); }
		public FatorBoolContext fatorBool() {
			return getRuleContext(FatorBoolContext.class,0);
		}
		public NegacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNegacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNegacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitNegacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegacaoContext negacao() throws RecognitionException {
		NegacaoContext _localctx = new NegacaoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_negacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(NOT);
			setState(179);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001c\u00b6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00011\b"+
		"\u0001\n\u0001\f\u00014\t\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002?\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003G\b\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004L\b\u0004\n\u0004\f\u0004O\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005V\b\u0005\n\u0005"+
		"\f\u0005Y\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006^\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"e\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\bl\b\b"+
		"\n\b\f\bo\t\b\u0001\t\u0001\t\u0001\t\u0005\tt\b\t\n\t\f\tw\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0005\n|\b\n\n\n\f\n\u007f\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u0084\b\u000b\n\u000b\f\u000b\u0087\t\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u008c\b\f\n\f\f\f\u008f\t\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u0096\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u009b\b\u000e\n\u000e\f\u000e\u009e\t\u000e\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00a2\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00a6\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00ad\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&\u0000\u0003\u0002\u0000\u0016\u0016\u0019\u001a\u0001\u0000"+
		"\u0016\u0017\u0001\u0000\u0010\u0011\u00b6\u0000(\u0001\u0000\u0000\u0000"+
		"\u0002,\u0001\u0000\u0000\u0000\u00048\u0001\u0000\u0000\u0000\u0006B"+
		"\u0001\u0000\u0000\u0000\bH\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000"+
		"\u0000\fZ\u0001\u0000\u0000\u0000\u000ea\u0001\u0000\u0000\u0000\u0010"+
		"h\u0001\u0000\u0000\u0000\u0012p\u0001\u0000\u0000\u0000\u0014x\u0001"+
		"\u0000\u0000\u0000\u0016\u0080\u0001\u0000\u0000\u0000\u0018\u0088\u0001"+
		"\u0000\u0000\u0000\u001a\u0095\u0001\u0000\u0000\u0000\u001c\u0097\u0001"+
		"\u0000\u0000\u0000\u001e\u00a1\u0001\u0000\u0000\u0000 \u00a5\u0001\u0000"+
		"\u0000\u0000\"\u00ac\u0001\u0000\u0000\u0000$\u00ae\u0001\u0000\u0000"+
		"\u0000&\u00b2\u0001\u0000\u0000\u0000()\u0005\u0001\u0000\u0000)*\u0003"+
		"\b\u0004\u0000*+\u0005\u0002\u0000\u0000+\u0001\u0001\u0000\u0000\u0000"+
		",-\u0005\u0003\u0000\u0000-2\u0005\u0016\u0000\u0000./\u0005\u0004\u0000"+
		"\u0000/1\u0005\u0016\u0000\u00000.\u0001\u0000\u0000\u000014\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u000035\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u000056\u0005\u0005\u0000\u0000"+
		"67\u0005\u0012\u0000\u00007\u0003\u0001\u0000\u0000\u000089\u0005\u0006"+
		"\u0000\u00009:\u0003\b\u0004\u0000:;\u0005\u0007\u0000\u0000;>\u0005\b"+
		"\u0000\u0000<?\u0003\u001c\u000e\u0000=?\u0005\u0016\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000"+
		"@A\u0005\t\u0000\u0000A\u0005\u0001\u0000\u0000\u0000BC\u0005\u0016\u0000"+
		"\u0000CF\u0005\u0018\u0000\u0000DG\u0007\u0000\u0000\u0000EG\u0003\u0014"+
		"\n\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\u0007\u0001"+
		"\u0000\u0000\u0000HM\u0003\n\u0005\u0000IJ\u0005\n\u0000\u0000JL\u0003"+
		"\n\u0005\u0000KI\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000N\t\u0001\u0000\u0000\u0000"+
		"OM\u0001\u0000\u0000\u0000PV\u0003\u0002\u0001\u0000QV\u0003\u0004\u0002"+
		"\u0000RV\u0003\u0006\u0003\u0000SV\u0003\f\u0006\u0000TV\u0003\u000e\u0007"+
		"\u0000UP\u0001\u0000\u0000\u0000UQ\u0001\u0000\u0000\u0000UR\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"X\u000b\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\u000b"+
		"\u0000\u0000[]\u0005\b\u0000\u0000\\^\u0003\u0010\b\u0000]\\\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0005"+
		"\t\u0000\u0000`\r\u0001\u0000\u0000\u0000ab\u0005\f\u0000\u0000bd\u0005"+
		"\b\u0000\u0000ce\u0003\u0012\t\u0000dc\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005\t\u0000\u0000g\u000f"+
		"\u0001\u0000\u0000\u0000hm\u0007\u0001\u0000\u0000ij\u0005\u0004\u0000"+
		"\u0000jl\u0007\u0001\u0000\u0000ki\u0001\u0000\u0000\u0000lo\u0001\u0000"+
		"\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000n\u0011"+
		"\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pu\u0005\u0016\u0000"+
		"\u0000qr\u0005\u0004\u0000\u0000rt\u0005\u0016\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001"+
		"\u0000\u0000\u0000v\u0013\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000x}\u0003\u0016\u000b\u0000yz\u0005\u0013\u0000\u0000z|\u0003\u0016"+
		"\u000b\u0000{y\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0015\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0085\u0003\u0018\f"+
		"\u0000\u0081\u0082\u0005\u0014\u0000\u0000\u0082\u0084\u0003\u0018\f\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000"+
		"\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0017\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000"+
		"\u0088\u008d\u0003\u001a\r\u0000\u0089\u008a\u0005\u0015\u0000\u0000\u008a"+
		"\u008c\u0003\u001a\r\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008f"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u0019\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u0090\u0096\u0005\r\u0000\u0000\u0091\u0092\u0005"+
		"\b\u0000\u0000\u0092\u0093\u0003\u0014\n\u0000\u0093\u0094\u0005\t\u0000"+
		"\u0000\u0094\u0096\u0001\u0000\u0000\u0000\u0095\u0090\u0001\u0000\u0000"+
		"\u0000\u0095\u0091\u0001\u0000\u0000\u0000\u0096\u001b\u0001\u0000\u0000"+
		"\u0000\u0097\u009c\u0003\u001e\u000f\u0000\u0098\u0099\u0007\u0002\u0000"+
		"\u0000\u0099\u009b\u0003\u001e\u000f\u0000\u009a\u0098\u0001\u0000\u0000"+
		"\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u001d\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a2\u0003 \u0010\u0000"+
		"\u00a0\u00a2\u0003&\u0013\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u001f\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a6\u0003\"\u0011\u0000\u00a4\u00a6\u0003&\u0013\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6!\u0001"+
		"\u0000\u0000\u0000\u00a7\u00ad\u0003$\u0012\u0000\u00a8\u00a9\u0005\b"+
		"\u0000\u0000\u00a9\u00aa\u0003\u001c\u000e\u0000\u00aa\u00ab\u0005\t\u0000"+
		"\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000\u00ac\u00a7\u0001\u0000\u0000"+
		"\u0000\u00ac\u00a8\u0001\u0000\u0000\u0000\u00ad#\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0005\r\u0000\u0000\u00af\u00b0\u0005\u000e\u0000\u0000\u00b0"+
		"\u00b1\u0005\r\u0000\u0000\u00b1%\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0005\u000f\u0000\u0000\u00b3\u00b4\u0003 \u0010\u0000\u00b4\'\u0001"+
		"\u0000\u0000\u0000\u00122>FMUW]dmu}\u0085\u008d\u0095\u009c\u00a1\u00a5"+
		"\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}