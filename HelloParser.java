// Generated from Hello.txt by ANTLR 4.5
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, SEQ_ESCAPE=20, OP_LOGICO=21, COMENTARIO=22, OP_RELACIONAL=23, 
		OP_ATRIBUICAO=24, OP_BOOLEAN=25, SEPARADORES=26, PALAVRA_RESERVADA=27, 
		NUMERO=28, ID=29, WS=30, ADDOP=31, MULTOP=32;
	public static final int
		RULE_r = 0, RULE_declaraVariavel = 1, RULE_operacaoComparacao = 2, RULE_operacaoCT = 3, 
		RULE_nfor = 4, RULE_nelse = 5, RULE_nif = 6, RULE_natribuicao = 7, RULE_nwhile = 8, 
		RULE_statement = 9, RULE_mainClass = 10, RULE_expr = 11, RULE_term = 12;
	public static final String[] ruleNames = {
		"r", "declaraVariavel", "operacaoComparacao", "operacaoCT", "nfor", "nelse", 
		"nif", "natribuicao", "nwhile", "statement", "mainClass", "expr", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'hello'", "';'", "'for'", "'('", "')'", "'{'", "'}'", "'else { }'", 
		"'if'", "'while'", "'public'", "'class'", "'static'", "'void'", "'main'", 
		"'String'", "'['", "']'", "'args'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "SEQ_ESCAPE", "OP_LOGICO", 
		"COMENTARIO", "OP_RELACIONAL", "OP_ATRIBUICAO", "OP_BOOLEAN", "SEPARADORES", 
		"PALAVRA_RESERVADA", "NUMERO", "ID", "WS", "ADDOP", "MULTOP"
	};
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
	public String getGrammarFileName() { return "Hello.txt"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitR(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			match(ID);
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

	public static class DeclaraVariavelContext extends ParserRuleContext {
		public TerminalNode PALAVRA_RESERVADA() { return getToken(HelloParser.PALAVRA_RESERVADA, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode OP_ATRIBUICAO() { return getToken(HelloParser.OP_ATRIBUICAO, 0); }
		public TerminalNode NUMERO() { return getToken(HelloParser.NUMERO, 0); }
		public DeclaraVariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraVariavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterDeclaraVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitDeclaraVariavel(this);
		}
	}

	public final DeclaraVariavelContext declaraVariavel() throws RecognitionException {
		DeclaraVariavelContext _localctx = new DeclaraVariavelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaraVariavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(PALAVRA_RESERVADA);
			setState(30);
			match(ID);
			setState(31);
			match(OP_ATRIBUICAO);
			setState(32);
			match(NUMERO);
			setState(33);
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

	public static class OperacaoComparacaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode OP_RELACIONAL() { return getToken(HelloParser.OP_RELACIONAL, 0); }
		public TerminalNode NUMERO() { return getToken(HelloParser.NUMERO, 0); }
		public OperacaoComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoComparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOperacaoComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOperacaoComparacao(this);
		}
	}

	public final OperacaoComparacaoContext operacaoComparacao() throws RecognitionException {
		OperacaoComparacaoContext _localctx = new OperacaoComparacaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_operacaoComparacao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(ID);
			setState(36);
			match(OP_RELACIONAL);
			setState(37);
			match(NUMERO);
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

	public static class OperacaoCTContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode OP_ATRIBUICAO() { return getToken(HelloParser.OP_ATRIBUICAO, 0); }
		public OperacaoCTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacaoCT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterOperacaoCT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitOperacaoCT(this);
		}
	}

	public final OperacaoCTContext operacaoCT() throws RecognitionException {
		OperacaoCTContext _localctx = new OperacaoCTContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operacaoCT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(ID);
			setState(40);
			match(OP_ATRIBUICAO);
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

	public static class NforContext extends ParserRuleContext {
		public DeclaraVariavelContext declaraVariavel() {
			return getRuleContext(DeclaraVariavelContext.class,0);
		}
		public OperacaoComparacaoContext operacaoComparacao() {
			return getRuleContext(OperacaoComparacaoContext.class,0);
		}
		public OperacaoCTContext operacaoCT() {
			return getRuleContext(OperacaoCTContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public NforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nfor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNfor(this);
		}
	}

	public final NforContext nfor() throws RecognitionException {
		NforContext _localctx = new NforContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nfor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__2);
			setState(43);
			match(T__3);
			setState(44);
			declaraVariavel();
			setState(45);
			operacaoComparacao();
			setState(46);
			match(T__1);
			setState(47);
			operacaoCT();
			setState(48);
			match(T__4);
			setState(49);
			match(T__5);
			setState(50);
			statement();
			setState(51);
			match(T__6);
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

	public static class NelseContext extends ParserRuleContext {
		public NelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nelse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNelse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNelse(this);
		}
	}

	public final NelseContext nelse() throws RecognitionException {
		NelseContext _localctx = new NelseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__7);
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

	public static class NifContext extends ParserRuleContext {
		public OperacaoComparacaoContext operacaoComparacao() {
			return getRuleContext(OperacaoComparacaoContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public NelseContext nelse() {
			return getRuleContext(NelseContext.class,0);
		}
		public NifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNif(this);
		}
	}

	public final NifContext nif() throws RecognitionException {
		NifContext _localctx = new NifContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__8);
			setState(56);
			match(T__3);
			setState(57);
			operacaoComparacao();
			setState(58);
			match(T__4);
			setState(59);
			match(T__5);
			setState(60);
			statement();
			setState(61);
			match(T__6);
			setState(63);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(62);
				nelse();
				}
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

	public static class NatribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode OP_ATRIBUICAO() { return getToken(HelloParser.OP_ATRIBUICAO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NatribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_natribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNatribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNatribuicao(this);
		}
	}

	public final NatribuicaoContext natribuicao() throws RecognitionException {
		NatribuicaoContext _localctx = new NatribuicaoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_natribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(ID);
			setState(66);
			match(OP_ATRIBUICAO);
			setState(67);
			expr(0);
			setState(68);
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

	public static class NwhileContext extends ParserRuleContext {
		public OperacaoComparacaoContext operacaoComparacao() {
			return getRuleContext(OperacaoComparacaoContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public NwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterNwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitNwhile(this);
		}
	}

	public final NwhileContext nwhile() throws RecognitionException {
		NwhileContext _localctx = new NwhileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__9);
			setState(71);
			match(T__3);
			setState(72);
			operacaoComparacao();
			setState(73);
			match(T__4);
			setState(74);
			match(T__5);
			setState(75);
			statement();
			setState(76);
			match(T__6);
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

	public static class StatementContext extends ParserRuleContext {
		public List<NifContext> nif() {
			return getRuleContexts(NifContext.class);
		}
		public NifContext nif(int i) {
			return getRuleContext(NifContext.class,i);
		}
		public List<NforContext> nfor() {
			return getRuleContexts(NforContext.class);
		}
		public NforContext nfor(int i) {
			return getRuleContext(NforContext.class,i);
		}
		public List<NatribuicaoContext> natribuicao() {
			return getRuleContexts(NatribuicaoContext.class);
		}
		public NatribuicaoContext natribuicao(int i) {
			return getRuleContext(NatribuicaoContext.class,i);
		}
		public List<DeclaraVariavelContext> declaraVariavel() {
			return getRuleContexts(DeclaraVariavelContext.class);
		}
		public DeclaraVariavelContext declaraVariavel(int i) {
			return getRuleContext(DeclaraVariavelContext.class,i);
		}
		public List<NwhileContext> nwhile() {
			return getRuleContexts(NwhileContext.class);
		}
		public NwhileContext nwhile(int i) {
			return getRuleContext(NwhileContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__8) | (1L << T__9) | (1L << PALAVRA_RESERVADA) | (1L << ID))) != 0)) {
				{
				setState(83);
				switch (_input.LA(1)) {
				case T__8:
					{
					setState(78);
					nif();
					}
					break;
				case T__2:
					{
					setState(79);
					nfor();
					}
					break;
				case ID:
					{
					setState(80);
					natribuicao();
					}
					break;
				case PALAVRA_RESERVADA:
					{
					setState(81);
					declaraVariavel();
					}
					break;
				case T__9:
					{
					setState(82);
					nwhile();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(87);
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

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitMainClass(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__10);
			setState(89);
			match(T__11);
			setState(90);
			match(ID);
			setState(91);
			match(T__5);
			setState(92);
			match(T__10);
			setState(93);
			match(T__12);
			setState(94);
			match(T__13);
			setState(95);
			match(T__14);
			setState(96);
			match(T__3);
			setState(97);
			match(T__15);
			setState(98);
			match(T__16);
			setState(99);
			match(T__17);
			setState(100);
			match(T__18);
			setState(101);
			match(T__4);
			setState(102);
			match(T__5);
			setState(103);
			statement();
			setState(104);
			match(T__6);
			setState(105);
			match(T__6);
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

	public static class ExprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ADDOP() { return getToken(HelloParser.ADDOP, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(108);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(110);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(111);
					match(ADDOP);
					setState(112);
					term(0);
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(HelloParser.NUMERO, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MULTOP() { return getToken(HelloParser.MULTOP, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HelloListener ) ((HelloListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(119);
			match(NUMERO);
			}
			_ctx.stop = _input.LT(-1);
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(121);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(122);
					match(MULTOP);
					setState(123);
					match(NUMERO);
					}
					} 
				}
				setState(128);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 12:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u0084\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bB\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13V\n\13\f\13"+
		"\16\13Y\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\rt\n\r\f\r\16\rw\13\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\7\16\177\n\16\f\16\16\16\u0082\13\16\3\16"+
		"\2\4\30\32\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2~\2\34\3\2\2\2\4\37"+
		"\3\2\2\2\6%\3\2\2\2\b)\3\2\2\2\n,\3\2\2\2\f\67\3\2\2\2\169\3\2\2\2\20"+
		"C\3\2\2\2\22H\3\2\2\2\24W\3\2\2\2\26Z\3\2\2\2\30m\3\2\2\2\32x\3\2\2\2"+
		"\34\35\7\3\2\2\35\36\7\37\2\2\36\3\3\2\2\2\37 \7\35\2\2 !\7\37\2\2!\""+
		"\7\32\2\2\"#\7\36\2\2#$\7\4\2\2$\5\3\2\2\2%&\7\37\2\2&\'\7\31\2\2\'(\7"+
		"\36\2\2(\7\3\2\2\2)*\7\37\2\2*+\7\32\2\2+\t\3\2\2\2,-\7\5\2\2-.\7\6\2"+
		"\2./\5\4\3\2/\60\5\6\4\2\60\61\7\4\2\2\61\62\5\b\5\2\62\63\7\7\2\2\63"+
		"\64\7\b\2\2\64\65\5\24\13\2\65\66\7\t\2\2\66\13\3\2\2\2\678\7\n\2\28\r"+
		"\3\2\2\29:\7\13\2\2:;\7\6\2\2;<\5\6\4\2<=\7\7\2\2=>\7\b\2\2>?\5\24\13"+
		"\2?A\7\t\2\2@B\5\f\7\2A@\3\2\2\2AB\3\2\2\2B\17\3\2\2\2CD\7\37\2\2DE\7"+
		"\32\2\2EF\5\30\r\2FG\7\4\2\2G\21\3\2\2\2HI\7\f\2\2IJ\7\6\2\2JK\5\6\4\2"+
		"KL\7\7\2\2LM\7\b\2\2MN\5\24\13\2NO\7\t\2\2O\23\3\2\2\2PV\5\16\b\2QV\5"+
		"\n\6\2RV\5\20\t\2SV\5\4\3\2TV\5\22\n\2UP\3\2\2\2UQ\3\2\2\2UR\3\2\2\2U"+
		"S\3\2\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2\2\2X\25\3\2\2\2YW\3\2\2"+
		"\2Z[\7\r\2\2[\\\7\16\2\2\\]\7\37\2\2]^\7\b\2\2^_\7\r\2\2_`\7\17\2\2`a"+
		"\7\20\2\2ab\7\21\2\2bc\7\6\2\2cd\7\22\2\2de\7\23\2\2ef\7\24\2\2fg\7\25"+
		"\2\2gh\7\7\2\2hi\7\b\2\2ij\5\24\13\2jk\7\t\2\2kl\7\t\2\2l\27\3\2\2\2m"+
		"n\b\r\1\2no\5\32\16\2ou\3\2\2\2pq\f\4\2\2qr\7!\2\2rt\5\32\16\2sp\3\2\2"+
		"\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\31\3\2\2\2wu\3\2\2\2xy\b\16\1\2yz\7"+
		"\36\2\2z\u0080\3\2\2\2{|\f\4\2\2|}\7\"\2\2}\177\7\36\2\2~{\3\2\2\2\177"+
		"\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\33\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\7AUWu\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}