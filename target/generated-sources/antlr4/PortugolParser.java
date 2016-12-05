// Generated from Portugol.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PortugolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__39=1, T__38=2, T__37=3, T__36=4, T__35=5, T__34=6, T__33=7, T__32=8, 
		T__31=9, T__30=10, T__29=11, T__28=12, T__27=13, T__26=14, T__25=15, T__24=16, 
		T__23=17, T__22=18, T__21=19, T__20=20, T__19=21, T__18=22, T__17=23, 
		T__16=24, T__15=25, T__14=26, T__13=27, T__12=28, T__11=29, T__10=30, 
		T__9=31, T__8=32, T__7=33, T__6=34, T__5=35, T__4=36, T__3=37, T__2=38, 
		T__1=39, T__0=40, ID=41, NUM=42, STRING=43, WS=44;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'IMPRIMA'", "'!='", "'ENTAO'", "'SAIR'", "'LEIA'", 
		"'REPITA'", "';'", "'REAL'", "'='", "'<='", "'&'", "'('", "'*'", "'FACA'", 
		"','", "'FIM'", "'RETORNE'", "'PASSO'", "'.'", "'STRING'", "'SE'", "'PROG'", 
		"'ATE'", "'FUNCAO'", "':'", "'>='", "'PARA'", "'=='", "'<'", "'|'", "'>'", 
		"'ENQUANTO'", "'INTEIRO'", "'!'", "')'", "'+'", "'SENAO'", "'-'", "'BOOLEANO'", 
		"ID", "NUM", "STRING", "WS"
	};
	public static final int
		RULE_programa = 0, RULE_decVars = 1, RULE_decParams = 2, RULE_tipo = 3, 
		RULE_listaIDs = 4, RULE_decFunc = 5, RULE_comandos = 6, RULE_chamadaFunc = 7, 
		RULE_seEntao = 8, RULE_senao = 9, RULE_para = 10, RULE_enquanto = 11, 
		RULE_repita = 12, RULE_atribuicao = 13, RULE_leitura = 14, RULE_sair = 15, 
		RULE_impressao = 16, RULE_expr = 17, RULE_term1 = 18, RULE_term2 = 19, 
		RULE_term3 = 20, RULE_term4 = 21, RULE_term5 = 22, RULE_term6 = 23, RULE_fator = 24, 
		RULE_op_n7 = 25, RULE_op_n6 = 26, RULE_op_n5 = 27, RULE_op_n4 = 28, RULE_op_n3 = 29, 
		RULE_op_n2 = 30, RULE_op_n1 = 31, RULE_listaExprs = 32, RULE_retorno = 33;
	public static final String[] ruleNames = {
		"programa", "decVars", "decParams", "tipo", "listaIDs", "decFunc", "comandos", 
		"chamadaFunc", "seEntao", "senao", "para", "enquanto", "repita", "atribuicao", 
		"leitura", "sair", "impressao", "expr", "term1", "term2", "term3", "term4", 
		"term5", "term6", "fator", "op_n7", "op_n6", "op_n5", "op_n4", "op_n3", 
		"op_n2", "op_n1", "listaExprs", "retorno"
	};

	@Override
	public String getGrammarFileName() { return "Portugol.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PortugolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public DecVarsContext decVars(int i) {
			return getRuleContext(DecVarsContext.class,i);
		}
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<DecVarsContext> decVars() {
			return getRuleContexts(DecVarsContext.class);
		}
		public DecFuncContext decFunc(int i) {
			return getRuleContext(DecFuncContext.class,i);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<DecFuncContext> decFunc() {
			return getRuleContexts(DecFuncContext.class);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(T__17);
			setState(69); match(ID);
			setState(70); match(T__32);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__19) | (1L << T__6) | (1L << T__0))) != 0)) {
				{
				{
				setState(71); decVars();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(77); decFunc();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(83); comandos();
				}
				}
				setState(86); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0) );
			setState(88); match(T__23);
			setState(89); match(T__20);
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

	public static class DecVarsContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ListaIDsContext listaIDs() {
			return getRuleContext(ListaIDsContext.class,0);
		}
		public DecVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDecVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDecVars(this);
		}
	}

	public final DecVarsContext decVars() throws RecognitionException {
		DecVarsContext _localctx = new DecVarsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decVars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); tipo();
			setState(92); listaIDs();
			setState(93); match(T__32);
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

	public static class DecParamsContext extends ParserRuleContext {
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public ListaIDsContext listaIDs(int i) {
			return getRuleContext(ListaIDsContext.class,i);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<ListaIDsContext> listaIDs() {
			return getRuleContexts(ListaIDsContext.class);
		}
		public DecParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDecParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDecParams(this);
		}
	}

	public final DecParamsContext decParams() throws RecognitionException {
		DecParamsContext _localctx = new DecParamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); tipo();
			setState(96); listaIDs();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__32) {
				{
				{
				setState(97); match(T__32);
				setState(98); tipo();
				setState(99); listaIDs();
				}
				}
				setState(105);
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__19) | (1L << T__6) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ListaIDsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PortugolParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PortugolParser.ID, i);
		}
		public ListaIDsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaIDs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterListaIDs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitListaIDs(this);
		}
	}

	public final ListaIDsContext listaIDs() throws RecognitionException {
		ListaIDsContext _localctx = new ListaIDsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaIDs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(ID);
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(109); match(T__24);
				setState(110); match(ID);
				}
				}
				setState(115);
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

	public static class DecFuncContext extends ParserRuleContext {
		public DecParamsContext decParams() {
			return getRuleContext(DecParamsContext.class,0);
		}
		public DecVarsContext decVars(int i) {
			return getRuleContext(DecVarsContext.class,i);
		}
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<DecVarsContext> decVars() {
			return getRuleContexts(DecVarsContext.class);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public DecFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterDecFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitDecFunc(this);
		}
	}

	public final DecFuncContext decFunc() throws RecognitionException {
		DecFuncContext _localctx = new DecFuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_decFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(T__15);
			setState(117); match(ID);
			setState(118); match(T__27);
			setState(120);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__19) | (1L << T__6) | (1L << T__0))) != 0)) {
				{
				setState(119); decParams();
				}
			}

			setState(122); match(T__4);
			setState(125);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(123); match(T__14);
				setState(124); tipo();
				}
			}

			setState(127); match(T__32);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__19) | (1L << T__6) | (1L << T__0))) != 0)) {
				{
				{
				setState(128); decVars();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(134); comandos();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140); match(T__23);
			setState(141); match(T__32);
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

	public static class ComandosContext extends ParserRuleContext {
		public ChamadaFuncContext chamadaFunc() {
			return getRuleContext(ChamadaFuncContext.class,0);
		}
		public RepitaContext repita() {
			return getRuleContext(RepitaContext.class,0);
		}
		public ParaContext para() {
			return getRuleContext(ParaContext.class,0);
		}
		public LeituraContext leitura() {
			return getRuleContext(LeituraContext.class,0);
		}
		public SairContext sair() {
			return getRuleContext(SairContext.class,0);
		}
		public SeEntaoContext seEntao() {
			return getRuleContext(SeEntaoContext.class,0);
		}
		public EnquantoContext enquanto() {
			return getRuleContext(EnquantoContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ImpressaoContext impressao() {
			return getRuleContext(ImpressaoContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comandos);
		try {
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); atribuicao();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); leitura();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145); impressao();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146); seEntao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147); para();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148); enquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149); repita();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(150); sair();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(151); retorno();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(152); chamadaFunc();
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

	public static class ChamadaFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public ListaExprsContext listaExprs() {
			return getRuleContext(ListaExprsContext.class,0);
		}
		public ChamadaFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamadaFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterChamadaFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitChamadaFunc(this);
		}
	}

	public final ChamadaFuncContext chamadaFunc() throws RecognitionException {
		ChamadaFuncContext _localctx = new ChamadaFuncContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_chamadaFunc);
		try {
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155); match(ID);
				setState(156); match(T__27);
				setState(157); listaExprs();
				setState(158); match(T__4);
				setState(159); match(T__32);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161); match(ID);
				setState(162); match(T__27);
				setState(163); listaExprs();
				setState(164); match(T__4);
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

	public static class SeEntaoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public SenaoContext senao() {
			return getRuleContext(SenaoContext.class,0);
		}
		public SeEntaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seEntao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterSeEntao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitSeEntao(this);
		}
	}

	public final SeEntaoContext seEntao() throws RecognitionException {
		SeEntaoContext _localctx = new SeEntaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_seEntao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(T__18);
			setState(169); match(T__27);
			setState(170); expr(0);
			setState(171); match(T__4);
			setState(172); match(T__36);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(173); comandos();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(179); senao();
				}
			}

			setState(182); match(T__23);
			setState(183); match(T__32);
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

	public static class SenaoContext extends ParserRuleContext {
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public SenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitSenao(this);
		}
	}

	public final SenaoContext senao() throws RecognitionException {
		SenaoContext _localctx = new SenaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_senao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(T__2);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(186); comandos();
				}
				}
				setState(191);
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

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitPara(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_para);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); match(T__12);
			setState(193); match(ID);
			setState(194); match(T__30);
			setState(195); expr(0);
			setState(196); match(T__16);
			setState(197); expr(0);
			setState(200);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(198); match(T__21);
				setState(199); expr(0);
				}
			}

			setState(202); match(T__25);
			setState(206);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(203); comandos();
				}
				}
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(209); match(T__23);
			setState(210); match(T__32);
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

	public static class EnquantoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public EnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitEnquanto(this);
		}
	}

	public final EnquantoContext enquanto() throws RecognitionException {
		EnquantoContext _localctx = new EnquantoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(T__7);
			setState(213); match(T__27);
			setState(214); expr(0);
			setState(215); match(T__4);
			setState(216); match(T__25);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(217); comandos();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223); match(T__23);
			setState(224); match(T__32);
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

	public static class RepitaContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ComandosContext comandos(int i) {
			return getRuleContext(ComandosContext.class,i);
		}
		public List<ComandosContext> comandos() {
			return getRuleContexts(ComandosContext.class);
		}
		public RepitaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterRepita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitRepita(this);
		}
	}

	public final RepitaContext repita() throws RecognitionException {
		RepitaContext _localctx = new RepitaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_repita);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226); match(T__33);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__38) | (1L << T__35) | (1L << T__34) | (1L << T__33) | (1L << T__22) | (1L << T__18) | (1L << T__12) | (1L << T__7) | (1L << ID))) != 0)) {
				{
				{
				setState(227); comandos();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(233); match(T__16);
			setState(234); match(T__27);
			setState(235); expr(0);
			setState(236); match(T__4);
			setState(237); match(T__32);
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

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(ID);
			setState(240); match(T__30);
			setState(241); expr(0);
			setState(242); match(T__32);
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

	public static class LeituraContext extends ParserRuleContext {
		public ListaIDsContext listaIDs() {
			return getRuleContext(ListaIDsContext.class,0);
		}
		public LeituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterLeitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitLeitura(this);
		}
	}

	public final LeituraContext leitura() throws RecognitionException {
		LeituraContext _localctx = new LeituraContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_leitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(T__34);
			setState(245); match(T__27);
			setState(246); listaIDs();
			setState(247); match(T__4);
			setState(248); match(T__32);
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

	public static class SairContext extends ParserRuleContext {
		public SairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterSair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitSair(this);
		}
	}

	public final SairContext sair() throws RecognitionException {
		SairContext _localctx = new SairContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(T__35);
			setState(251); match(T__32);
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

	public static class ImpressaoContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PortugolParser.STRING, 0); }
		public ImpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterImpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitImpressao(this);
		}
	}

	public final ImpressaoContext impressao() throws RecognitionException {
		ImpressaoContext _localctx = new ImpressaoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_impressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); match(T__38);
			setState(254); match(T__27);
			setState(255); match(STRING);
			setState(256); match(T__4);
			setState(257); match(T__32);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Op_n7Context op_n7() {
			return getRuleContext(Op_n7Context.class,0);
		}
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitExpr(this);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(260); term1(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(262);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(263); op_n7();
					setState(264); term1(0);
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class Term1Context extends ParserRuleContext {
		public Term2Context term2() {
			return getRuleContext(Term2Context.class,0);
		}
		public Op_n6Context op_n6() {
			return getRuleContext(Op_n6Context.class,0);
		}
		public Term1Context term1() {
			return getRuleContext(Term1Context.class,0);
		}
		public Term1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTerm1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTerm1(this);
		}
	}

	public final Term1Context term1() throws RecognitionException {
		return term1(0);
	}

	private Term1Context term1(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term1Context _localctx = new Term1Context(_ctx, _parentState);
		Term1Context _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_term1, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(272); term2(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term1Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term1);
					setState(274);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(275); op_n6();
					setState(276); term2(0);
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class Term2Context extends ParserRuleContext {
		public Term2Context term2() {
			return getRuleContext(Term2Context.class,0);
		}
		public Op_n5Context op_n5() {
			return getRuleContext(Op_n5Context.class,0);
		}
		public Term3Context term3() {
			return getRuleContext(Term3Context.class,0);
		}
		public Term2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTerm2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTerm2(this);
		}
	}

	public final Term2Context term2() throws RecognitionException {
		return term2(0);
	}

	private Term2Context term2(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term2Context _localctx = new Term2Context(_ctx, _parentState);
		Term2Context _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_term2, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(284); term3(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term2Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term2);
					setState(286);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(287); op_n5();
					setState(288); term3(0);
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class Term3Context extends ParserRuleContext {
		public Op_n4Context op_n4() {
			return getRuleContext(Op_n4Context.class,0);
		}
		public Term4Context term4() {
			return getRuleContext(Term4Context.class,0);
		}
		public Term3Context term3() {
			return getRuleContext(Term3Context.class,0);
		}
		public Term3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTerm3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTerm3(this);
		}
	}

	public final Term3Context term3() throws RecognitionException {
		return term3(0);
	}

	private Term3Context term3(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term3Context _localctx = new Term3Context(_ctx, _parentState);
		Term3Context _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_term3, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(296); term4(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(304);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term3Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term3);
					setState(298);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(299); op_n4();
					setState(300); term4(0);
					}
					} 
				}
				setState(306);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class Term4Context extends ParserRuleContext {
		public Op_n3Context op_n3() {
			return getRuleContext(Op_n3Context.class,0);
		}
		public Term4Context term4() {
			return getRuleContext(Term4Context.class,0);
		}
		public Term5Context term5() {
			return getRuleContext(Term5Context.class,0);
		}
		public Term4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTerm4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTerm4(this);
		}
	}

	public final Term4Context term4() throws RecognitionException {
		return term4(0);
	}

	private Term4Context term4(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term4Context _localctx = new Term4Context(_ctx, _parentState);
		Term4Context _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_term4, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308); term5(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term4Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term4);
					setState(310);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(311); op_n3();
					setState(312); term5(0);
					}
					} 
				}
				setState(318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Term5Context extends ParserRuleContext {
		public Op_n2Context op_n2() {
			return getRuleContext(Op_n2Context.class,0);
		}
		public Term6Context term6() {
			return getRuleContext(Term6Context.class,0);
		}
		public Term5Context term5() {
			return getRuleContext(Term5Context.class,0);
		}
		public Term5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTerm5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTerm5(this);
		}
	}

	public final Term5Context term5() throws RecognitionException {
		return term5(0);
	}

	private Term5Context term5(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term5Context _localctx = new Term5Context(_ctx, _parentState);
		Term5Context _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_term5, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(320); term6(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term5Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term5);
					setState(322);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(323); op_n2();
					setState(324); term6(0);
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	public static class Term6Context extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Op_n1Context op_n1() {
			return getRuleContext(Op_n1Context.class,0);
		}
		public Term6Context term6() {
			return getRuleContext(Term6Context.class,0);
		}
		public Term6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterTerm6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitTerm6(this);
		}
	}

	public final Term6Context term6() throws RecognitionException {
		return term6(0);
	}

	private Term6Context term6(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Term6Context _localctx = new Term6Context(_ctx, _parentState);
		Term6Context _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_term6, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(332); fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(340);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Term6Context(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term6);
					setState(334);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(335); op_n1();
					setState(336); fator();
					}
					} 
				}
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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

	public static class FatorContext extends ParserRuleContext {
		public ChamadaFuncContext chamadaFunc() {
			return getRuleContext(ChamadaFuncContext.class,0);
		}
		public TerminalNode ID() { return getToken(PortugolParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUM() { return getToken(PortugolParser.NUM, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fator);
		try {
			setState(350);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343); match(T__27);
				setState(344); expr(0);
				setState(345); match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347); match(NUM);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348); match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(349); chamadaFunc();
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

	public static class Op_n7Context extends ParserRuleContext {
		public Op_n7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_n7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOp_n7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOp_n7(this);
		}
	}

	public final Op_n7Context op_n7() throws RecognitionException {
		Op_n7Context _localctx = new Op_n7Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_op_n7);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352); match(T__9);
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

	public static class Op_n6Context extends ParserRuleContext {
		public Op_n6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_n6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOp_n6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOp_n6(this);
		}
	}

	public final Op_n6Context op_n6() throws RecognitionException {
		Op_n6Context _localctx = new Op_n6Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_op_n6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); match(T__28);
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

	public static class Op_n5Context extends ParserRuleContext {
		public Op_n5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_n5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOp_n5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOp_n5(this);
		}
	}

	public final Op_n5Context op_n5() throws RecognitionException {
		Op_n5Context _localctx = new Op_n5Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_op_n5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__13) | (1L << T__10) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Op_n4Context extends ParserRuleContext {
		public Op_n4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_n4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOp_n4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOp_n4(this);
		}
	}

	public final Op_n4Context op_n4() throws RecognitionException {
		Op_n4Context _localctx = new Op_n4Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_op_n4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(_la==T__37 || _la==T__11) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Op_n3Context extends ParserRuleContext {
		public Op_n3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_n3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOp_n3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOp_n3(this);
		}
	}

	public final Op_n3Context op_n3() throws RecognitionException {
		Op_n3Context _localctx = new Op_n3Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_op_n3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_la = _input.LA(1);
			if ( !(_la==T__3 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Op_n2Context extends ParserRuleContext {
		public Op_n2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_n2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOp_n2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOp_n2(this);
		}
	}

	public final Op_n2Context op_n2() throws RecognitionException {
		Op_n2Context _localctx = new Op_n2Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_op_n2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__26) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Op_n1Context extends ParserRuleContext {
		public Op_n1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_n1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterOp_n1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitOp_n1(this);
		}
	}

	public final Op_n1Context op_n1() throws RecognitionException {
		Op_n1Context _localctx = new Op_n1Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_op_n1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364); match(T__5);
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

	public static class ListaExprsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListaExprsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaExprs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterListaExprs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitListaExprs(this);
		}
	}

	public final ListaExprsContext listaExprs() throws RecognitionException {
		ListaExprsContext _localctx = new ListaExprsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listaExprs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366); expr(0);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__24) {
				{
				{
				setState(367); match(T__24);
				setState(368); expr(0);
				}
				}
				setState(373);
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

	public static class RetornoContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PortugolListener ) ((PortugolListener)listener).exitRetorno(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_retorno);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(T__22);
			setState(375); expr(0);
			setState(376); match(T__32);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(377); match(T__22);
					setState(378); expr(0);
					setState(379); match(T__32);
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17: return expr_sempred((ExprContext)_localctx, predIndex);
		case 18: return term1_sempred((Term1Context)_localctx, predIndex);
		case 19: return term2_sempred((Term2Context)_localctx, predIndex);
		case 20: return term3_sempred((Term3Context)_localctx, predIndex);
		case 21: return term4_sempred((Term4Context)_localctx, predIndex);
		case 22: return term5_sempred((Term5Context)_localctx, predIndex);
		case 23: return term6_sempred((Term6Context)_localctx, predIndex);
		}
		return true;
	}
	private boolean term2_sempred(Term2Context _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term3_sempred(Term3Context _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term1_sempred(Term1Context _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term6_sempred(Term6Context _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term4_sempred(Term4Context _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term5_sempred(Term5Context _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0185\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\7\2K\n\2\f\2\16\2N\13\2\3\2\7\2Q\n\2"+
		"\f\2\16\2T\13\2\3\2\6\2W\n\2\r\2\16\2X\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4h\n\4\f\4\16\4k\13\4\3\5\3\5\3\6\3\6\3\6\7\6r"+
		"\n\6\f\6\16\6u\13\6\3\7\3\7\3\7\3\7\5\7{\n\7\3\7\3\7\3\7\5\7\u0080\n\7"+
		"\3\7\3\7\7\7\u0084\n\7\f\7\16\7\u0087\13\7\3\7\7\7\u008a\n\7\f\7\16\7"+
		"\u008d\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u009c"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a9\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u00b1\n\n\f\n\16\n\u00b4\13\n\3\n\5\n\u00b7\n\n\3"+
		"\n\3\n\3\n\3\13\3\13\7\13\u00be\n\13\f\13\16\13\u00c1\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cb\n\f\3\f\3\f\7\f\u00cf\n\f\f\f\16\f\u00d2"+
		"\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00dd\n\r\f\r\16\r\u00e0"+
		"\13\r\3\r\3\r\3\r\3\16\3\16\7\16\u00e7\n\16\f\16\16\16\u00ea\13\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\7\23\u010d\n\23\f\23\16\23\u0110\13\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u0119\n\24\f\24\16\24\u011c\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u0125\n\25\f\25\16\25\u0128\13\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0131\n\26\f\26\16\26\u0134\13"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u013d\n\27\f\27\16\27\u0140"+
		"\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0149\n\30\f\30\16\30\u014c"+
		"\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0155\n\31\f\31\16\31\u0158"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0161\n\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\7\"\u0174"+
		"\n\"\f\"\16\"\u0177\13\"\3#\3#\3#\3#\3#\3#\3#\7#\u0180\n#\f#\16#\u0183"+
		"\13#\3#\2\t$&(*,.\60$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@BD\2\7\6\2\13\13\27\27$$**\6\2\r\r\35\35  \"\"\4\2\5"+
		"\5\37\37\4\2\'\'))\4\2\3\3\20\20\u0188\2F\3\2\2\2\4]\3\2\2\2\6a\3\2\2"+
		"\2\bl\3\2\2\2\nn\3\2\2\2\fv\3\2\2\2\16\u009b\3\2\2\2\20\u00a8\3\2\2\2"+
		"\22\u00aa\3\2\2\2\24\u00bb\3\2\2\2\26\u00c2\3\2\2\2\30\u00d6\3\2\2\2\32"+
		"\u00e4\3\2\2\2\34\u00f1\3\2\2\2\36\u00f6\3\2\2\2 \u00fc\3\2\2\2\"\u00ff"+
		"\3\2\2\2$\u0105\3\2\2\2&\u0111\3\2\2\2(\u011d\3\2\2\2*\u0129\3\2\2\2,"+
		"\u0135\3\2\2\2.\u0141\3\2\2\2\60\u014d\3\2\2\2\62\u0160\3\2\2\2\64\u0162"+
		"\3\2\2\2\66\u0164\3\2\2\28\u0166\3\2\2\2:\u0168\3\2\2\2<\u016a\3\2\2\2"+
		">\u016c\3\2\2\2@\u016e\3\2\2\2B\u0170\3\2\2\2D\u0178\3\2\2\2FG\7\31\2"+
		"\2GH\7+\2\2HL\7\n\2\2IK\5\4\3\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2"+
		"\2MR\3\2\2\2NL\3\2\2\2OQ\5\f\7\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2"+
		"\2SV\3\2\2\2TR\3\2\2\2UW\5\16\b\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2YZ\3\2\2\2Z[\7\23\2\2[\\\7\26\2\2\\\3\3\2\2\2]^\5\b\5\2^_\5\n\6\2"+
		"_`\7\n\2\2`\5\3\2\2\2ab\5\b\5\2bi\5\n\6\2cd\7\n\2\2de\5\b\5\2ef\5\n\6"+
		"\2fh\3\2\2\2gc\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\7\3\2\2\2ki\3\2"+
		"\2\2lm\t\2\2\2m\t\3\2\2\2ns\7+\2\2op\7\22\2\2pr\7+\2\2qo\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2t\13\3\2\2\2us\3\2\2\2vw\7\33\2\2wx\7+\2\2xz\7"+
		"\17\2\2y{\5\6\4\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|\177\7&\2\2}~\7\34\2\2"+
		"~\u0080\5\b\5\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0085\7\n\2\2\u0082\u0084\5\4\3\2\u0083\u0082\3\2\2\2\u0084\u0087\3\2"+
		"\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008b\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0088\u008a\5\16\b\2\u0089\u0088\3\2\2\2\u008a\u008d\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u008b\3\2\2\2\u008e\u008f\7\23\2\2\u008f\u0090\7\n\2\2\u0090\r\3\2\2"+
		"\2\u0091\u009c\5\34\17\2\u0092\u009c\5\36\20\2\u0093\u009c\5\"\22\2\u0094"+
		"\u009c\5\22\n\2\u0095\u009c\5\26\f\2\u0096\u009c\5\30\r\2\u0097\u009c"+
		"\5\32\16\2\u0098\u009c\5 \21\2\u0099\u009c\5D#\2\u009a\u009c\5\20\t\2"+
		"\u009b\u0091\3\2\2\2\u009b\u0092\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u0094"+
		"\3\2\2\2\u009b\u0095\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009b"+
		"\u0098\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\17\3\2\2"+
		"\2\u009d\u009e\7+\2\2\u009e\u009f\7\17\2\2\u009f\u00a0\5B\"\2\u00a0\u00a1"+
		"\7&\2\2\u00a1\u00a2\7\n\2\2\u00a2\u00a9\3\2\2\2\u00a3\u00a4\7+\2\2\u00a4"+
		"\u00a5\7\17\2\2\u00a5\u00a6\5B\"\2\u00a6\u00a7\7&\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u009d\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9\21\3\2\2\2\u00aa\u00ab"+
		"\7\30\2\2\u00ab\u00ac\7\17\2\2\u00ac\u00ad\5$\23\2\u00ad\u00ae\7&\2\2"+
		"\u00ae\u00b2\7\6\2\2\u00af\u00b1\5\16\b\2\u00b0\u00af\3\2\2\2\u00b1\u00b4"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b7\5\24\13\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3"+
		"\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\23\2\2\u00b9\u00ba\7\n\2\2\u00ba"+
		"\23\3\2\2\2\u00bb\u00bf\7(\2\2\u00bc\u00be\5\16\b\2\u00bd\u00bc\3\2\2"+
		"\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\25"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7\36\2\2\u00c3\u00c4\7+\2\2\u00c4"+
		"\u00c5\7\f\2\2\u00c5\u00c6\5$\23\2\u00c6\u00c7\7\32\2\2\u00c7\u00ca\5"+
		"$\23\2\u00c8\u00c9\7\25\2\2\u00c9\u00cb\5$\23\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d0\7\21\2\2\u00cd\u00cf\5"+
		"\16\b\2\u00ce\u00cd\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\23"+
		"\2\2\u00d4\u00d5\7\n\2\2\u00d5\27\3\2\2\2\u00d6\u00d7\7#\2\2\u00d7\u00d8"+
		"\7\17\2\2\u00d8\u00d9\5$\23\2\u00d9\u00da\7&\2\2\u00da\u00de\7\21\2\2"+
		"\u00db\u00dd\5\16\b\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1"+
		"\u00e2\7\23\2\2\u00e2\u00e3\7\n\2\2\u00e3\31\3\2\2\2\u00e4\u00e8\7\t\2"+
		"\2\u00e5\u00e7\5\16\b\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00eb\u00ec\7\32\2\2\u00ec\u00ed\7\17\2\2\u00ed\u00ee\5$\23\2\u00ee"+
		"\u00ef\7&\2\2\u00ef\u00f0\7\n\2\2\u00f0\33\3\2\2\2\u00f1\u00f2\7+\2\2"+
		"\u00f2\u00f3\7\f\2\2\u00f3\u00f4\5$\23\2\u00f4\u00f5\7\n\2\2\u00f5\35"+
		"\3\2\2\2\u00f6\u00f7\7\b\2\2\u00f7\u00f8\7\17\2\2\u00f8\u00f9\5\n\6\2"+
		"\u00f9\u00fa\7&\2\2\u00fa\u00fb\7\n\2\2\u00fb\37\3\2\2\2\u00fc\u00fd\7"+
		"\7\2\2\u00fd\u00fe\7\n\2\2\u00fe!\3\2\2\2\u00ff\u0100\7\4\2\2\u0100\u0101"+
		"\7\17\2\2\u0101\u0102\7-\2\2\u0102\u0103\7&\2\2\u0103\u0104\7\n\2\2\u0104"+
		"#\3\2\2\2\u0105\u0106\b\23\1\2\u0106\u0107\5&\24\2\u0107\u010e\3\2\2\2"+
		"\u0108\u0109\f\4\2\2\u0109\u010a\5\64\33\2\u010a\u010b\5&\24\2\u010b\u010d"+
		"\3\2\2\2\u010c\u0108\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f%\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112\b\24\1\2"+
		"\u0112\u0113\5(\25\2\u0113\u011a\3\2\2\2\u0114\u0115\f\4\2\2\u0115\u0116"+
		"\5\66\34\2\u0116\u0117\5(\25\2\u0117\u0119\3\2\2\2\u0118\u0114\3\2\2\2"+
		"\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\'\3"+
		"\2\2\2\u011c\u011a\3\2\2\2\u011d\u011e\b\25\1\2\u011e\u011f\5*\26\2\u011f"+
		"\u0126\3\2\2\2\u0120\u0121\f\4\2\2\u0121\u0122\58\35\2\u0122\u0123\5*"+
		"\26\2\u0123\u0125\3\2\2\2\u0124\u0120\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127)\3\2\2\2\u0128\u0126\3\2\2\2"+
		"\u0129\u012a\b\26\1\2\u012a\u012b\5,\27\2\u012b\u0132\3\2\2\2\u012c\u012d"+
		"\f\4\2\2\u012d\u012e\5:\36\2\u012e\u012f\5,\27\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012c\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133+\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\b\27\1\2\u0136\u0137"+
		"\5.\30\2\u0137\u013e\3\2\2\2\u0138\u0139\f\4\2\2\u0139\u013a\5<\37\2\u013a"+
		"\u013b\5.\30\2\u013b\u013d\3\2\2\2\u013c\u0138\3\2\2\2\u013d\u0140\3\2"+
		"\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f-\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0141\u0142\b\30\1\2\u0142\u0143\5\60\31\2\u0143\u014a\3\2\2"+
		"\2\u0144\u0145\f\4\2\2\u0145\u0146\5> \2\u0146\u0147\5\60\31\2\u0147\u0149"+
		"\3\2\2\2\u0148\u0144\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b/\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\b\31\1\2"+
		"\u014e\u014f\5\62\32\2\u014f\u0156\3\2\2\2\u0150\u0151\f\4\2\2\u0151\u0152"+
		"\5@!\2\u0152\u0153\5\62\32\2\u0153\u0155\3\2\2\2\u0154\u0150\3\2\2\2\u0155"+
		"\u0158\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\61\3\2\2"+
		"\2\u0158\u0156\3\2\2\2\u0159\u015a\7\17\2\2\u015a\u015b\5$\23\2\u015b"+
		"\u015c\7&\2\2\u015c\u0161\3\2\2\2\u015d\u0161\7,\2\2\u015e\u0161\7+\2"+
		"\2\u015f\u0161\5\20\t\2\u0160\u0159\3\2\2\2\u0160\u015d\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161\63\3\2\2\2\u0162\u0163\7!\2\2"+
		"\u0163\65\3\2\2\2\u0164\u0165\7\16\2\2\u0165\67\3\2\2\2\u0166\u0167\t"+
		"\3\2\2\u01679\3\2\2\2\u0168\u0169\t\4\2\2\u0169;\3\2\2\2\u016a\u016b\t"+
		"\5\2\2\u016b=\3\2\2\2\u016c\u016d\t\6\2\2\u016d?\3\2\2\2\u016e\u016f\7"+
		"%\2\2\u016fA\3\2\2\2\u0170\u0175\5$\23\2\u0171\u0172\7\22\2\2\u0172\u0174"+
		"\5$\23\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176C\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\7\24\2\2"+
		"\u0179\u017a\5$\23\2\u017a\u0181\7\n\2\2\u017b\u017c\7\24\2\2\u017c\u017d"+
		"\5$\23\2\u017d\u017e\7\n\2\2\u017e\u0180\3\2\2\2\u017f\u017b\3\2\2\2\u0180"+
		"\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182E\3\2\2\2"+
		"\u0183\u0181\3\2\2\2\36LRXisz\177\u0085\u008b\u009b\u00a8\u00b2\u00b6"+
		"\u00bf\u00ca\u00d0\u00de\u00e8\u010e\u011a\u0126\u0132\u013e\u014a\u0156"+
		"\u0160\u0175\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}