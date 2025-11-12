// Generated from C:/GitHub/Projeto_compilador/MeuCompilador/src/main/antlr/Forca.g4 by ANTLR 4.13.2
package org.example.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ForcaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, VAR=21, SE=22, SENAO=23, ENQUANTO=24, REPITA=25, 
		ATE=26, LEIA=27, ESCREVA=28, PARE=29, CONTINUE=30, TIPO_INTEIRO=31, TIPO_REAL=32, 
		TIPO_TEXTO=33, OU=34, E=35, ID=36, REAL=37, INT=38, TEXTO=39, ESPACO=40, 
		COMLIN=41, COMBLO=42;
	public static final int
		RULE_programa = 0, RULE_declaracao = 1, RULE_tipo = 2, RULE_comando = 3, 
		RULE_bloco = 4, RULE_seCmd = 5, RULE_enquantoCmd = 6, RULE_repitaCmd = 7, 
		RULE_ioCmd = 8, RULE_listaArgs = 9, RULE_atribuicao = 10, RULE_expressao = 11, 
		RULE_exprOu = 12, RULE_exprE = 13, RULE_exprIgual = 14, RULE_exprRel = 15, 
		RULE_exprAdd = 16, RULE_exprMul = 17, RULE_exprUn = 18, RULE_prim = 19, 
		RULE_literal = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracao", "tipo", "comando", "bloco", "seCmd", "enquantoCmd", 
			"repitaCmd", "ioCmd", "listaArgs", "atribuicao", "expressao", "exprOu", 
			"exprE", "exprIgual", "exprRel", "exprAdd", "exprMul", "exprUn", "prim", 
			"literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "';'", "'{'", "'}'", "'('", "')'", "','", "'=='", 
			"'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'!'", "'var'", "'se'", "'senao'", "'enquanto'", "'repita'", "'ate'", 
			"'leia'", "'escreva'", "'pare'", "'continue'", "'inteiro'", "'real'", 
			"'texto'", "'ou'", "'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "VAR", "SE", "SENAO", 
			"ENQUANTO", "REPITA", "ATE", "LEIA", "ESCREVA", "PARE", "CONTINUE", "TIPO_INTEIRO", 
			"TIPO_REAL", "TIPO_TEXTO", "OU", "E", "ID", "REAL", "INT", "TEXTO", "ESPACO", 
			"COMLIN", "COMBLO"
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
	public String getGrammarFileName() { return "Forca.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ForcaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ForcaParser.EOF, 0); }
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70789365776L) != 0)) {
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(42);
					declaracao();
					}
					break;
				case T__3:
				case SE:
				case ENQUANTO:
				case REPITA:
				case LEIA:
				case ESCREVA:
				case PARE:
				case CONTINUE:
				case ID:
					{
					setState(43);
					comando();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(EOF);
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
	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ForcaParser.VAR, 0); }
		public TerminalNode ID() { return getToken(ForcaParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(VAR);
			setState(52);
			match(ID);
			setState(53);
			match(T__0);
			setState(54);
			tipo();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(55);
				match(T__1);
				setState(56);
				expressao();
				}
			}

			setState(59);
			match(T__2);
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
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode TIPO_INTEIRO() { return getToken(ForcaParser.TIPO_INTEIRO, 0); }
		public TerminalNode TIPO_REAL() { return getToken(ForcaParser.TIPO_REAL, 0); }
		public TerminalNode TIPO_TEXTO() { return getToken(ForcaParser.TIPO_TEXTO, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0)) ) {
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
	public static class ComandoContext extends ParserRuleContext {
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public SeCmdContext seCmd() {
			return getRuleContext(SeCmdContext.class,0);
		}
		public EnquantoCmdContext enquantoCmd() {
			return getRuleContext(EnquantoCmdContext.class,0);
		}
		public RepitaCmdContext repitaCmd() {
			return getRuleContext(RepitaCmdContext.class,0);
		}
		public IoCmdContext ioCmd() {
			return getRuleContext(IoCmdContext.class,0);
		}
		public TerminalNode PARE() { return getToken(ForcaParser.PARE, 0); }
		public TerminalNode CONTINUE() { return getToken(ForcaParser.CONTINUE, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitComando(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitComando(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comando);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				atribuicao();
				setState(64);
				match(T__2);
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				seCmd();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				enquantoCmd();
				}
				break;
			case REPITA:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				repitaCmd();
				}
				break;
			case LEIA:
			case ESCREVA:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				ioCmd();
				setState(70);
				match(T__2);
				}
				break;
			case PARE:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				match(PARE);
				setState(73);
				match(T__2);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 7);
				{
				setState(74);
				match(CONTINUE);
				setState(75);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 8);
				{
				setState(76);
				bloco();
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
	public static class BlocoContext extends ParserRuleContext {
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitBloco(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitBloco(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__3);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 70787268624L) != 0)) {
				{
				{
				setState(80);
				comando();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
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
	public static class SeCmdContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(ForcaParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode SENAO() { return getToken(ForcaParser.SENAO, 0); }
		public SeCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterSeCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitSeCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitSeCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeCmdContext seCmd() throws RecognitionException {
		SeCmdContext _localctx = new SeCmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_seCmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(SE);
			setState(89);
			match(T__5);
			setState(90);
			expressao();
			setState(91);
			match(T__6);
			setState(92);
			bloco();
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(93);
				match(SENAO);
				setState(94);
				bloco();
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnquantoCmdContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(ForcaParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public EnquantoCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enquantoCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterEnquantoCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitEnquantoCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitEnquantoCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnquantoCmdContext enquantoCmd() throws RecognitionException {
		EnquantoCmdContext _localctx = new EnquantoCmdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_enquantoCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(ENQUANTO);
			setState(98);
			match(T__5);
			setState(99);
			expressao();
			setState(100);
			match(T__6);
			setState(101);
			bloco();
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
	public static class RepitaCmdContext extends ParserRuleContext {
		public TerminalNode REPITA() { return getToken(ForcaParser.REPITA, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode ATE() { return getToken(ForcaParser.ATE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RepitaCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repitaCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterRepitaCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitRepitaCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitRepitaCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepitaCmdContext repitaCmd() throws RecognitionException {
		RepitaCmdContext _localctx = new RepitaCmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_repitaCmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(REPITA);
			setState(104);
			bloco();
			setState(105);
			match(ATE);
			setState(106);
			match(T__5);
			setState(107);
			expressao();
			setState(108);
			match(T__6);
			setState(109);
			match(T__2);
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
	public static class IoCmdContext extends ParserRuleContext {
		public TerminalNode LEIA() { return getToken(ForcaParser.LEIA, 0); }
		public TerminalNode ID() { return getToken(ForcaParser.ID, 0); }
		public TerminalNode ESCREVA() { return getToken(ForcaParser.ESCREVA, 0); }
		public ListaArgsContext listaArgs() {
			return getRuleContext(ListaArgsContext.class,0);
		}
		public IoCmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ioCmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterIoCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitIoCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitIoCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IoCmdContext ioCmd() throws RecognitionException {
		IoCmdContext _localctx = new IoCmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ioCmd);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(LEIA);
				setState(112);
				match(T__5);
				setState(113);
				match(ID);
				setState(114);
				match(T__6);
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(ESCREVA);
				setState(116);
				match(T__5);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030793297984L) != 0)) {
					{
					setState(117);
					listaArgs();
					}
				}

				setState(120);
				match(T__6);
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
	public static class ListaArgsContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public ListaArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterListaArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitListaArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitListaArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaArgsContext listaArgs() throws RecognitionException {
		ListaArgsContext _localctx = new ListaArgsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listaArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			expressao();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(124);
				match(T__7);
				setState(125);
				expressao();
				}
				}
				setState(130);
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
	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ForcaParser.ID, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(ID);
			setState(132);
			match(T__1);
			setState(133);
			expressao();
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
	public static class ExpressaoContext extends ParserRuleContext {
		public ExprOuContext exprOu() {
			return getRuleContext(ExprOuContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			exprOu();
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
	public static class ExprOuContext extends ParserRuleContext {
		public List<ExprEContext> exprE() {
			return getRuleContexts(ExprEContext.class);
		}
		public ExprEContext exprE(int i) {
			return getRuleContext(ExprEContext.class,i);
		}
		public List<TerminalNode> OU() { return getTokens(ForcaParser.OU); }
		public TerminalNode OU(int i) {
			return getToken(ForcaParser.OU, i);
		}
		public ExprOuContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprOu; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterExprOu(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitExprOu(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitExprOu(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprOuContext exprOu() throws RecognitionException {
		ExprOuContext _localctx = new ExprOuContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprOu);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			exprE();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(138);
				match(OU);
				setState(139);
				exprE();
				}
				}
				setState(144);
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
	public static class ExprEContext extends ParserRuleContext {
		public List<ExprIgualContext> exprIgual() {
			return getRuleContexts(ExprIgualContext.class);
		}
		public ExprIgualContext exprIgual(int i) {
			return getRuleContext(ExprIgualContext.class,i);
		}
		public List<TerminalNode> E() { return getTokens(ForcaParser.E); }
		public TerminalNode E(int i) {
			return getToken(ForcaParser.E, i);
		}
		public ExprEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterExprE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitExprE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitExprE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprEContext exprE() throws RecognitionException {
		ExprEContext _localctx = new ExprEContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprE);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			exprIgual();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(146);
				match(E);
				setState(147);
				exprIgual();
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
	public static class ExprIgualContext extends ParserRuleContext {
		public List<ExprRelContext> exprRel() {
			return getRuleContexts(ExprRelContext.class);
		}
		public ExprRelContext exprRel(int i) {
			return getRuleContext(ExprRelContext.class,i);
		}
		public ExprIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprIgual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterExprIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitExprIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitExprIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprIgualContext exprIgual() throws RecognitionException {
		ExprIgualContext _localctx = new ExprIgualContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprIgual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			exprRel();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8 || _la==T__9) {
				{
				{
				setState(154);
				_la = _input.LA(1);
				if ( !(_la==T__8 || _la==T__9) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(155);
				exprRel();
				}
				}
				setState(160);
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
	public static class ExprRelContext extends ParserRuleContext {
		public List<ExprAddContext> exprAdd() {
			return getRuleContexts(ExprAddContext.class);
		}
		public ExprAddContext exprAdd(int i) {
			return getRuleContext(ExprAddContext.class,i);
		}
		public ExprRelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterExprRel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitExprRel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitExprRel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprRelContext exprRel() throws RecognitionException {
		ExprRelContext _localctx = new ExprRelContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprRel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			exprAdd();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) {
				{
				{
				setState(162);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(163);
				exprAdd();
				}
				}
				setState(168);
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
	public static class ExprAddContext extends ParserRuleContext {
		public List<ExprMulContext> exprMul() {
			return getRuleContexts(ExprMulContext.class);
		}
		public ExprMulContext exprMul(int i) {
			return getRuleContext(ExprMulContext.class,i);
		}
		public ExprAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterExprAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitExprAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitExprAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAddContext exprAdd() throws RecognitionException {
		ExprAddContext _localctx = new ExprAddContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprAdd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			exprMul();
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__15) {
				{
				{
				setState(170);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(171);
				exprMul();
				}
				}
				setState(176);
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
	public static class ExprMulContext extends ParserRuleContext {
		public List<ExprUnContext> exprUn() {
			return getRuleContexts(ExprUnContext.class);
		}
		public ExprUnContext exprUn(int i) {
			return getRuleContext(ExprUnContext.class,i);
		}
		public ExprMulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterExprMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitExprMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitExprMul(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprMulContext exprMul() throws RecognitionException {
		ExprMulContext _localctx = new ExprMulContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exprMul);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			exprUn();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) {
				{
				{
				setState(178);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 917504L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(179);
				exprUn();
				}
				}
				setState(184);
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
	public static class ExprUnContext extends ParserRuleContext {
		public ExprUnContext exprUn() {
			return getRuleContext(ExprUnContext.class,0);
		}
		public PrimContext prim() {
			return getRuleContext(PrimContext.class,0);
		}
		public ExprUnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprUn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterExprUn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitExprUn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitExprUn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprUnContext exprUn() throws RecognitionException {
		ExprUnContext _localctx = new ExprUnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_exprUn);
		int _la;
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__15:
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1146880L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(186);
				exprUn();
				}
				break;
			case T__5:
			case ID:
			case REAL:
			case INT:
			case TEXTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				prim();
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
	public static class PrimContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode ID() { return getToken(ForcaParser.ID, 0); }
		public PrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitPrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitPrim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimContext prim() throws RecognitionException {
		PrimContext _localctx = new PrimContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_prim);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(T__5);
				setState(191);
				expressao();
				setState(192);
				match(T__6);
				}
				break;
			case REAL:
			case INT:
			case TEXTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				literal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(ID);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ForcaParser.INT, 0); }
		public TerminalNode REAL() { return getToken(ForcaParser.REAL, 0); }
		public TerminalNode TEXTO() { return getToken(ForcaParser.TEXTO, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ForcaListener ) ((ForcaListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ForcaVisitor ) return ((ForcaVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 962072674304L) != 0)) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001*\u00c9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0005\u0000-\b\u0000\n\u0000\f\u00000\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001:\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003N\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0005\u0004R\b\u0004\n\u0004\f\u0004U\t\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005`\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bw\b\b\u0001\b\u0003"+
		"\bz\b\b\u0001\t\u0001\t\u0001\t\u0005\t\u007f\b\t\n\t\f\t\u0082\t\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u008d\b\f\n\f\f\f\u0090\t\f\u0001\r\u0001\r\u0001\r\u0005\r"+
		"\u0095\b\r\n\r\f\r\u0098\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u009d\b\u000e\n\u000e\f\u000e\u00a0\t\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u00a5\b\u000f\n\u000f\f\u000f\u00a8\t\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00ad\b\u0010\n\u0010\f\u0010"+
		"\u00b0\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00b5\b"+
		"\u0011\n\u0011\f\u0011\u00b8\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00bd\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u00c5\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0000\u0000\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0007\u0001\u0000"+
		"\u001f!\u0001\u0000\t\n\u0001\u0000\u000b\u000e\u0001\u0000\u000f\u0010"+
		"\u0001\u0000\u0011\u0013\u0002\u0000\u000f\u0010\u0014\u0014\u0001\u0000"+
		"%\'\u00cb\u0000.\u0001\u0000\u0000\u0000\u00023\u0001\u0000\u0000\u0000"+
		"\u0004=\u0001\u0000\u0000\u0000\u0006M\u0001\u0000\u0000\u0000\bO\u0001"+
		"\u0000\u0000\u0000\nX\u0001\u0000\u0000\u0000\fa\u0001\u0000\u0000\u0000"+
		"\u000eg\u0001\u0000\u0000\u0000\u0010y\u0001\u0000\u0000\u0000\u0012{"+
		"\u0001\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016\u0087"+
		"\u0001\u0000\u0000\u0000\u0018\u0089\u0001\u0000\u0000\u0000\u001a\u0091"+
		"\u0001\u0000\u0000\u0000\u001c\u0099\u0001\u0000\u0000\u0000\u001e\u00a1"+
		"\u0001\u0000\u0000\u0000 \u00a9\u0001\u0000\u0000\u0000\"\u00b1\u0001"+
		"\u0000\u0000\u0000$\u00bc\u0001\u0000\u0000\u0000&\u00c4\u0001\u0000\u0000"+
		"\u0000(\u00c6\u0001\u0000\u0000\u0000*-\u0003\u0002\u0001\u0000+-\u0003"+
		"\u0006\u0003\u0000,*\u0001\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000"+
		"-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000012\u0005\u0000"+
		"\u0000\u00012\u0001\u0001\u0000\u0000\u000034\u0005\u0015\u0000\u0000"+
		"45\u0005$\u0000\u000056\u0005\u0001\u0000\u000069\u0003\u0004\u0002\u0000"+
		"78\u0005\u0002\u0000\u00008:\u0003\u0016\u000b\u000097\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0005\u0003"+
		"\u0000\u0000<\u0003\u0001\u0000\u0000\u0000=>\u0007\u0000\u0000\u0000"+
		">\u0005\u0001\u0000\u0000\u0000?@\u0003\u0014\n\u0000@A\u0005\u0003\u0000"+
		"\u0000AN\u0001\u0000\u0000\u0000BN\u0003\n\u0005\u0000CN\u0003\f\u0006"+
		"\u0000DN\u0003\u000e\u0007\u0000EF\u0003\u0010\b\u0000FG\u0005\u0003\u0000"+
		"\u0000GN\u0001\u0000\u0000\u0000HI\u0005\u001d\u0000\u0000IN\u0005\u0003"+
		"\u0000\u0000JK\u0005\u001e\u0000\u0000KN\u0005\u0003\u0000\u0000LN\u0003"+
		"\b\u0004\u0000M?\u0001\u0000\u0000\u0000MB\u0001\u0000\u0000\u0000MC\u0001"+
		"\u0000\u0000\u0000MD\u0001\u0000\u0000\u0000ME\u0001\u0000\u0000\u0000"+
		"MH\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000"+
		"\u0000N\u0007\u0001\u0000\u0000\u0000OS\u0005\u0004\u0000\u0000PR\u0003"+
		"\u0006\u0003\u0000QP\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000"+
		"SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TV\u0001\u0000\u0000"+
		"\u0000US\u0001\u0000\u0000\u0000VW\u0005\u0005\u0000\u0000W\t\u0001\u0000"+
		"\u0000\u0000XY\u0005\u0016\u0000\u0000YZ\u0005\u0006\u0000\u0000Z[\u0003"+
		"\u0016\u000b\u0000[\\\u0005\u0007\u0000\u0000\\_\u0003\b\u0004\u0000]"+
		"^\u0005\u0017\u0000\u0000^`\u0003\b\u0004\u0000_]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`\u000b\u0001\u0000\u0000\u0000ab\u0005\u0018"+
		"\u0000\u0000bc\u0005\u0006\u0000\u0000cd\u0003\u0016\u000b\u0000de\u0005"+
		"\u0007\u0000\u0000ef\u0003\b\u0004\u0000f\r\u0001\u0000\u0000\u0000gh"+
		"\u0005\u0019\u0000\u0000hi\u0003\b\u0004\u0000ij\u0005\u001a\u0000\u0000"+
		"jk\u0005\u0006\u0000\u0000kl\u0003\u0016\u000b\u0000lm\u0005\u0007\u0000"+
		"\u0000mn\u0005\u0003\u0000\u0000n\u000f\u0001\u0000\u0000\u0000op\u0005"+
		"\u001b\u0000\u0000pq\u0005\u0006\u0000\u0000qr\u0005$\u0000\u0000rz\u0005"+
		"\u0007\u0000\u0000st\u0005\u001c\u0000\u0000tv\u0005\u0006\u0000\u0000"+
		"uw\u0003\u0012\t\u0000vu\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000xz\u0005\u0007\u0000\u0000yo\u0001\u0000\u0000"+
		"\u0000ys\u0001\u0000\u0000\u0000z\u0011\u0001\u0000\u0000\u0000{\u0080"+
		"\u0003\u0016\u000b\u0000|}\u0005\b\u0000\u0000}\u007f\u0003\u0016\u000b"+
		"\u0000~|\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0013"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005$\u0000\u0000\u0084\u0085\u0005\u0002\u0000\u0000\u0085\u0086\u0003"+
		"\u0016\u000b\u0000\u0086\u0015\u0001\u0000\u0000\u0000\u0087\u0088\u0003"+
		"\u0018\f\u0000\u0088\u0017\u0001\u0000\u0000\u0000\u0089\u008e\u0003\u001a"+
		"\r\u0000\u008a\u008b\u0005\"\u0000\u0000\u008b\u008d\u0003\u001a\r\u0000"+
		"\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000"+
		"\u008f\u0019\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0091\u0096\u0003\u001c\u000e\u0000\u0092\u0093\u0005#\u0000\u0000\u0093"+
		"\u0095\u0003\u001c\u000e\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095"+
		"\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096"+
		"\u0097\u0001\u0000\u0000\u0000\u0097\u001b\u0001\u0000\u0000\u0000\u0098"+
		"\u0096\u0001\u0000\u0000\u0000\u0099\u009e\u0003\u001e\u000f\u0000\u009a"+
		"\u009b\u0007\u0001\u0000\u0000\u009b\u009d\u0003\u001e\u000f\u0000\u009c"+
		"\u009a\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000\u0000\u009e"+
		"\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u001d\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a6\u0003 \u0010\u0000\u00a2\u00a3\u0007\u0002\u0000\u0000\u00a3\u00a5"+
		"\u0003 \u0010\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u001f\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ae\u0003\"\u0011\u0000\u00aa\u00ab\u0007\u0003"+
		"\u0000\u0000\u00ab\u00ad\u0003\"\u0011\u0000\u00ac\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af!\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b6\u0003$\u0012\u0000\u00b2"+
		"\u00b3\u0007\u0004\u0000\u0000\u00b3\u00b5\u0003$\u0012\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7#\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0007"+
		"\u0005\u0000\u0000\u00ba\u00bd\u0003$\u0012\u0000\u00bb\u00bd\u0003&\u0013"+
		"\u0000\u00bc\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd%\u0001\u0000\u0000\u0000\u00be\u00bf\u0005\u0006\u0000\u0000"+
		"\u00bf\u00c0\u0003\u0016\u000b\u0000\u00c0\u00c1\u0005\u0007\u0000\u0000"+
		"\u00c1\u00c5\u0001\u0000\u0000\u0000\u00c2\u00c5\u0003(\u0014\u0000\u00c3"+
		"\u00c5\u0005$\u0000\u0000\u00c4\u00be\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5\'\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0007\u0006\u0000\u0000\u00c7)\u0001\u0000"+
		"\u0000\u0000\u0011,.9MS_vy\u0080\u008e\u0096\u009e\u00a6\u00ae\u00b6\u00bc"+
		"\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}