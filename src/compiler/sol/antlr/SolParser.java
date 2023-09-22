// Generated from ./src/compiler/sol/Sol.g4 by ANTLR 4.13.0
package compiler.sol.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SolParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, LOOP=2, NAVEGADOR=3, VEZES=4, TEMPO=5, STRING=6, WS=7;
	public static final int
		RULE_sol = 0, RULE_sequencia = 1, RULE_fasesEpic = 2, RULE_explore = 3, 
		RULE_present = 4, RULE_interact = 5, RULE_critique = 6, RULE_navegar = 7, 
		RULE_visualizarPdf = 8, RULE_visualizarVideo = 9, RULE_videoconferencia = 10, 
		RULE_whatsappWeb = 11, RULE_email = 12, RULE_browser = 13, RULE_linkPdf = 14, 
		RULE_linkVideo = 15, RULE_linkVideoconferencia = 16, RULE_linkWhatsappWeb = 17, 
		RULE_linkEmail = 18, RULE_url = 19, RULE_vezes = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"sol", "sequencia", "fasesEpic", "explore", "present", "interact", "critique", 
			"navegar", "visualizarPdf", "visualizarVideo", "videoconferencia", "whatsappWeb", 
			"email", "browser", "linkPdf", "linkVideo", "linkVideoconferencia", "linkWhatsappWeb", 
			"linkEmail", "url", "vezes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'loop'", "'navegador'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "LOOP", "NAVEGADOR", "VEZES", "TEMPO", "STRING", "WS"
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
	public String getGrammarFileName() { return "Sol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SolParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SolContext extends ParserRuleContext {
		public TerminalNode LOOP() { return getToken(SolParser.LOOP, 0); }
		public VezesContext vezes() {
			return getRuleContext(VezesContext.class,0);
		}
		public SequenciaContext sequencia() {
			return getRuleContext(SequenciaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SolParser.EOF, 0); }
		public SolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterSol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitSol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitSol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SolContext sol() throws RecognitionException {
		SolContext _localctx = new SolContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(LOOP);
			setState(43);
			vezes();
			setState(44);
			sequencia();
			setState(45);
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
	public static class SequenciaContext extends ParserRuleContext {
		public List<ExploreContext> explore() {
			return getRuleContexts(ExploreContext.class);
		}
		public ExploreContext explore(int i) {
			return getRuleContext(ExploreContext.class,i);
		}
		public PresentContext present() {
			return getRuleContext(PresentContext.class,0);
		}
		public FasesEpicContext fasesEpic() {
			return getRuleContext(FasesEpicContext.class,0);
		}
		public SequenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterSequencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitSequencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitSequencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenciaContext sequencia() throws RecognitionException {
		SequenciaContext _localctx = new SequenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sequencia);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(47);
					explore();
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAVEGADOR );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				present();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				fasesEpic();
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
	public static class FasesEpicContext extends ParserRuleContext {
		public PresentContext present() {
			return getRuleContext(PresentContext.class,0);
		}
		public InteractContext interact() {
			return getRuleContext(InteractContext.class,0);
		}
		public CritiqueContext critique() {
			return getRuleContext(CritiqueContext.class,0);
		}
		public List<ExploreContext> explore() {
			return getRuleContexts(ExploreContext.class);
		}
		public ExploreContext explore(int i) {
			return getRuleContext(ExploreContext.class,i);
		}
		public FasesEpicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fasesEpic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterFasesEpic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitFasesEpic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitFasesEpic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FasesEpicContext fasesEpic() throws RecognitionException {
		FasesEpicContext _localctx = new FasesEpicContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fasesEpic);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(56);
					explore();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(59); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(61);
			present();
			setState(62);
			interact();
			setState(63);
			critique();
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
	public static class ExploreContext extends ParserRuleContext {
		public NavegarContext navegar() {
			return getRuleContext(NavegarContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SolParser.SEMICOLON, 0); }
		public ExploreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterExplore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitExplore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitExplore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExploreContext explore() throws RecognitionException {
		ExploreContext _localctx = new ExploreContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_explore);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			navegar();
			setState(66);
			match(SEMICOLON);
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
	public static class PresentContext extends ParserRuleContext {
		public VisualizarPdfContext visualizarPdf() {
			return getRuleContext(VisualizarPdfContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SolParser.SEMICOLON, 0); }
		public VisualizarVideoContext visualizarVideo() {
			return getRuleContext(VisualizarVideoContext.class,0);
		}
		public VideoconferenciaContext videoconferencia() {
			return getRuleContext(VideoconferenciaContext.class,0);
		}
		public PresentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_present; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterPresent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitPresent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitPresent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PresentContext present() throws RecognitionException {
		PresentContext _localctx = new PresentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_present);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				visualizarPdf();
				setState(69);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				visualizarVideo();
				setState(72);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				videoconferencia();
				setState(75);
				match(SEMICOLON);
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
	public static class InteractContext extends ParserRuleContext {
		public WhatsappWebContext whatsappWeb() {
			return getRuleContext(WhatsappWebContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SolParser.SEMICOLON, 0); }
		public EmailContext email() {
			return getRuleContext(EmailContext.class,0);
		}
		public VideoconferenciaContext videoconferencia() {
			return getRuleContext(VideoconferenciaContext.class,0);
		}
		public InteractContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterInteract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitInteract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitInteract(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InteractContext interact() throws RecognitionException {
		InteractContext _localctx = new InteractContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_interact);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				whatsappWeb();
				setState(80);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				email();
				setState(83);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				videoconferencia();
				setState(86);
				match(SEMICOLON);
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
	public static class CritiqueContext extends ParserRuleContext {
		public WhatsappWebContext whatsappWeb() {
			return getRuleContext(WhatsappWebContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SolParser.SEMICOLON, 0); }
		public EmailContext email() {
			return getRuleContext(EmailContext.class,0);
		}
		public VideoconferenciaContext videoconferencia() {
			return getRuleContext(VideoconferenciaContext.class,0);
		}
		public CritiqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_critique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterCritique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitCritique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitCritique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CritiqueContext critique() throws RecognitionException {
		CritiqueContext _localctx = new CritiqueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_critique);
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				whatsappWeb();
				setState(91);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				email();
				setState(94);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				videoconferencia();
				setState(97);
				match(SEMICOLON);
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
	public static class NavegarContext extends ParserRuleContext {
		public BrowserContext browser() {
			return getRuleContext(BrowserContext.class,0);
		}
		public TerminalNode TEMPO() { return getToken(SolParser.TEMPO, 0); }
		public NavegarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navegar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterNavegar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitNavegar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitNavegar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NavegarContext navegar() throws RecognitionException {
		NavegarContext _localctx = new NavegarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_navegar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			browser();
			setState(102);
			match(TEMPO);
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
	public static class VisualizarPdfContext extends ParserRuleContext {
		public BrowserContext browser() {
			return getRuleContext(BrowserContext.class,0);
		}
		public LinkPdfContext linkPdf() {
			return getRuleContext(LinkPdfContext.class,0);
		}
		public TerminalNode TEMPO() { return getToken(SolParser.TEMPO, 0); }
		public VisualizarPdfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visualizarPdf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterVisualizarPdf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitVisualizarPdf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitVisualizarPdf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisualizarPdfContext visualizarPdf() throws RecognitionException {
		VisualizarPdfContext _localctx = new VisualizarPdfContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_visualizarPdf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			browser();
			setState(105);
			linkPdf();
			setState(106);
			match(TEMPO);
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
	public static class VisualizarVideoContext extends ParserRuleContext {
		public BrowserContext browser() {
			return getRuleContext(BrowserContext.class,0);
		}
		public LinkVideoContext linkVideo() {
			return getRuleContext(LinkVideoContext.class,0);
		}
		public TerminalNode TEMPO() { return getToken(SolParser.TEMPO, 0); }
		public VisualizarVideoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_visualizarVideo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterVisualizarVideo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitVisualizarVideo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitVisualizarVideo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VisualizarVideoContext visualizarVideo() throws RecognitionException {
		VisualizarVideoContext _localctx = new VisualizarVideoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_visualizarVideo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			browser();
			setState(109);
			linkVideo();
			setState(110);
			match(TEMPO);
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
	public static class VideoconferenciaContext extends ParserRuleContext {
		public BrowserContext browser() {
			return getRuleContext(BrowserContext.class,0);
		}
		public LinkVideoconferenciaContext linkVideoconferencia() {
			return getRuleContext(LinkVideoconferenciaContext.class,0);
		}
		public TerminalNode TEMPO() { return getToken(SolParser.TEMPO, 0); }
		public VideoconferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_videoconferencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterVideoconferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitVideoconferencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitVideoconferencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VideoconferenciaContext videoconferencia() throws RecognitionException {
		VideoconferenciaContext _localctx = new VideoconferenciaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_videoconferencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			browser();
			setState(113);
			linkVideoconferencia();
			setState(114);
			match(TEMPO);
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
	public static class WhatsappWebContext extends ParserRuleContext {
		public BrowserContext browser() {
			return getRuleContext(BrowserContext.class,0);
		}
		public LinkWhatsappWebContext linkWhatsappWeb() {
			return getRuleContext(LinkWhatsappWebContext.class,0);
		}
		public TerminalNode TEMPO() { return getToken(SolParser.TEMPO, 0); }
		public WhatsappWebContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whatsappWeb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterWhatsappWeb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitWhatsappWeb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitWhatsappWeb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhatsappWebContext whatsappWeb() throws RecognitionException {
		WhatsappWebContext _localctx = new WhatsappWebContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_whatsappWeb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			browser();
			setState(117);
			linkWhatsappWeb();
			setState(118);
			match(TEMPO);
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
	public static class EmailContext extends ParserRuleContext {
		public BrowserContext browser() {
			return getRuleContext(BrowserContext.class,0);
		}
		public LinkEmailContext linkEmail() {
			return getRuleContext(LinkEmailContext.class,0);
		}
		public TerminalNode TEMPO() { return getToken(SolParser.TEMPO, 0); }
		public EmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_email; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmailContext email() throws RecognitionException {
		EmailContext _localctx = new EmailContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_email);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			browser();
			setState(121);
			linkEmail();
			setState(122);
			match(TEMPO);
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
	public static class BrowserContext extends ParserRuleContext {
		public TerminalNode NAVEGADOR() { return getToken(SolParser.NAVEGADOR, 0); }
		public BrowserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_browser; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterBrowser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitBrowser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitBrowser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrowserContext browser() throws RecognitionException {
		BrowserContext _localctx = new BrowserContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_browser);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(NAVEGADOR);
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
	public static class LinkPdfContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public LinkPdfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkPdf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterLinkPdf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitLinkPdf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitLinkPdf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkPdfContext linkPdf() throws RecognitionException {
		LinkPdfContext _localctx = new LinkPdfContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_linkPdf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			url();
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
	public static class LinkVideoContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public LinkVideoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkVideo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterLinkVideo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitLinkVideo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitLinkVideo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkVideoContext linkVideo() throws RecognitionException {
		LinkVideoContext _localctx = new LinkVideoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_linkVideo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			url();
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
	public static class LinkVideoconferenciaContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public LinkVideoconferenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkVideoconferencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterLinkVideoconferencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitLinkVideoconferencia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitLinkVideoconferencia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkVideoconferenciaContext linkVideoconferencia() throws RecognitionException {
		LinkVideoconferenciaContext _localctx = new LinkVideoconferenciaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_linkVideoconferencia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			url();
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
	public static class LinkWhatsappWebContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public LinkWhatsappWebContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkWhatsappWeb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterLinkWhatsappWeb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitLinkWhatsappWeb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitLinkWhatsappWeb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkWhatsappWebContext linkWhatsappWeb() throws RecognitionException {
		LinkWhatsappWebContext _localctx = new LinkWhatsappWebContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_linkWhatsappWeb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			url();
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
	public static class LinkEmailContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public LinkEmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkEmail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterLinkEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitLinkEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitLinkEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkEmailContext linkEmail() throws RecognitionException {
		LinkEmailContext _localctx = new LinkEmailContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_linkEmail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			url();
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
	public static class UrlContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SolParser.STRING, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(STRING);
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
	public static class VezesContext extends ParserRuleContext {
		public TerminalNode VEZES() { return getToken(SolParser.VEZES, 0); }
		public VezesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vezes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).enterVezes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SolListener ) ((SolListener)listener).exitVezes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SolVisitor ) return ((SolVisitor<? extends T>)visitor).visitVezes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VezesContext vezes() throws RecognitionException {
		VezesContext _localctx = new VezesContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_vezes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(VEZES);
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
		"\u0004\u0001\u0007\u008d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u00011\b"+
		"\u0001\u000b\u0001\f\u00012\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001"+
		"\u0001\u0002\u0004\u0002:\b\u0002\u000b\u0002\f\u0002;\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005Y\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006d\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0000\u0000\u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0000\u0081\u0000*\u0001"+
		"\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000"+
		"\u0000\u0006A\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\nX\u0001"+
		"\u0000\u0000\u0000\fc\u0001\u0000\u0000\u0000\u000ee\u0001\u0000\u0000"+
		"\u0000\u0010h\u0001\u0000\u0000\u0000\u0012l\u0001\u0000\u0000\u0000\u0014"+
		"p\u0001\u0000\u0000\u0000\u0016t\u0001\u0000\u0000\u0000\u0018x\u0001"+
		"\u0000\u0000\u0000\u001a|\u0001\u0000\u0000\u0000\u001c~\u0001\u0000\u0000"+
		"\u0000\u001e\u0080\u0001\u0000\u0000\u0000 \u0082\u0001\u0000\u0000\u0000"+
		"\"\u0084\u0001\u0000\u0000\u0000$\u0086\u0001\u0000\u0000\u0000&\u0088"+
		"\u0001\u0000\u0000\u0000(\u008a\u0001\u0000\u0000\u0000*+\u0005\u0002"+
		"\u0000\u0000+,\u0003(\u0014\u0000,-\u0003\u0002\u0001\u0000-.\u0005\u0000"+
		"\u0000\u0001.\u0001\u0001\u0000\u0000\u0000/1\u0003\u0006\u0003\u0000"+
		"0/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000037\u0001\u0000\u0000\u000047\u0003\b\u0004"+
		"\u000057\u0003\u0004\u0002\u000060\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u000065\u0001\u0000\u0000\u00007\u0003\u0001\u0000\u0000\u0000"+
		"8:\u0003\u0006\u0003\u000098\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000"+
		"\u0000\u0000=>\u0003\b\u0004\u0000>?\u0003\n\u0005\u0000?@\u0003\f\u0006"+
		"\u0000@\u0005\u0001\u0000\u0000\u0000AB\u0003\u000e\u0007\u0000BC\u0005"+
		"\u0001\u0000\u0000C\u0007\u0001\u0000\u0000\u0000DE\u0003\u0010\b\u0000"+
		"EF\u0005\u0001\u0000\u0000FN\u0001\u0000\u0000\u0000GH\u0003\u0012\t\u0000"+
		"HI\u0005\u0001\u0000\u0000IN\u0001\u0000\u0000\u0000JK\u0003\u0014\n\u0000"+
		"KL\u0005\u0001\u0000\u0000LN\u0001\u0000\u0000\u0000MD\u0001\u0000\u0000"+
		"\u0000MG\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000N\t\u0001\u0000"+
		"\u0000\u0000OP\u0003\u0016\u000b\u0000PQ\u0005\u0001\u0000\u0000QY\u0001"+
		"\u0000\u0000\u0000RS\u0003\u0018\f\u0000ST\u0005\u0001\u0000\u0000TY\u0001"+
		"\u0000\u0000\u0000UV\u0003\u0014\n\u0000VW\u0005\u0001\u0000\u0000WY\u0001"+
		"\u0000\u0000\u0000XO\u0001\u0000\u0000\u0000XR\u0001\u0000\u0000\u0000"+
		"XU\u0001\u0000\u0000\u0000Y\u000b\u0001\u0000\u0000\u0000Z[\u0003\u0016"+
		"\u000b\u0000[\\\u0005\u0001\u0000\u0000\\d\u0001\u0000\u0000\u0000]^\u0003"+
		"\u0018\f\u0000^_\u0005\u0001\u0000\u0000_d\u0001\u0000\u0000\u0000`a\u0003"+
		"\u0014\n\u0000ab\u0005\u0001\u0000\u0000bd\u0001\u0000\u0000\u0000cZ\u0001"+
		"\u0000\u0000\u0000c]\u0001\u0000\u0000\u0000c`\u0001\u0000\u0000\u0000"+
		"d\r\u0001\u0000\u0000\u0000ef\u0003\u001a\r\u0000fg\u0005\u0005\u0000"+
		"\u0000g\u000f\u0001\u0000\u0000\u0000hi\u0003\u001a\r\u0000ij\u0003\u001c"+
		"\u000e\u0000jk\u0005\u0005\u0000\u0000k\u0011\u0001\u0000\u0000\u0000"+
		"lm\u0003\u001a\r\u0000mn\u0003\u001e\u000f\u0000no\u0005\u0005\u0000\u0000"+
		"o\u0013\u0001\u0000\u0000\u0000pq\u0003\u001a\r\u0000qr\u0003 \u0010\u0000"+
		"rs\u0005\u0005\u0000\u0000s\u0015\u0001\u0000\u0000\u0000tu\u0003\u001a"+
		"\r\u0000uv\u0003\"\u0011\u0000vw\u0005\u0005\u0000\u0000w\u0017\u0001"+
		"\u0000\u0000\u0000xy\u0003\u001a\r\u0000yz\u0003$\u0012\u0000z{\u0005"+
		"\u0005\u0000\u0000{\u0019\u0001\u0000\u0000\u0000|}\u0005\u0003\u0000"+
		"\u0000}\u001b\u0001\u0000\u0000\u0000~\u007f\u0003&\u0013\u0000\u007f"+
		"\u001d\u0001\u0000\u0000\u0000\u0080\u0081\u0003&\u0013\u0000\u0081\u001f"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0003&\u0013\u0000\u0083!\u0001\u0000"+
		"\u0000\u0000\u0084\u0085\u0003&\u0013\u0000\u0085#\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0003&\u0013\u0000\u0087%\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0005\u0006\u0000\u0000\u0089\'\u0001\u0000\u0000\u0000\u008a\u008b\u0005"+
		"\u0004\u0000\u0000\u008b)\u0001\u0000\u0000\u0000\u000626;MXc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}