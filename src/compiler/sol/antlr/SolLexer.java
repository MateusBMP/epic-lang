// Generated from ./src/compiler/sol/Sol.g4 by ANTLR 4.13.0
package compiler.sol.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SolLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, LOOP=2, NAVEGADOR=3, VEZES=4, TEMPO=5, STRING=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SEMICOLON", "LOOP", "NAVEGADOR", "VEZES", "TEMPO", "STRING", "WS"
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


	public SolLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Sol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0007W\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004J\b\u0004\u0001\u0005"+
		"\u0004\u0005M\b\u0005\u000b\u0005\f\u0005N\u0001\u0006\u0004\u0006R\b"+
		"\u0006\u000b\u0006\f\u0006S\u0001\u0006\u0001\u0006\u0000\u0000\u0007"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u0001\u0000\u0002\t\u0000##%&++.:==?Z__az~~\u0003\u0000\t\n\r\r"+
		"  ]\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0001\u000f\u0001\u0000\u0000\u0000\u0003"+
		"\u0011\u0001\u0000\u0000\u0000\u0005\u0016\u0001\u0000\u0000\u0000\u0007"+
		" \u0001\u0000\u0000\u0000\tI\u0001\u0000\u0000\u0000\u000bL\u0001\u0000"+
		"\u0000\u0000\rQ\u0001\u0000\u0000\u0000\u000f\u0010\u0005;\u0000\u0000"+
		"\u0010\u0002\u0001\u0000\u0000\u0000\u0011\u0012\u0005l\u0000\u0000\u0012"+
		"\u0013\u0005o\u0000\u0000\u0013\u0014\u0005o\u0000\u0000\u0014\u0015\u0005"+
		"p\u0000\u0000\u0015\u0004\u0001\u0000\u0000\u0000\u0016\u0017\u0005n\u0000"+
		"\u0000\u0017\u0018\u0005a\u0000\u0000\u0018\u0019\u0005v\u0000\u0000\u0019"+
		"\u001a\u0005e\u0000\u0000\u001a\u001b\u0005g\u0000\u0000\u001b\u001c\u0005"+
		"a\u0000\u0000\u001c\u001d\u0005d\u0000\u0000\u001d\u001e\u0005o\u0000"+
		"\u0000\u001e\u001f\u0005r\u0000\u0000\u001f\u0006\u0001\u0000\u0000\u0000"+
		" !\u000215\u0000!\b\u0001\u0000\u0000\u0000\"#\u00051\u0000\u0000#$\u0005"+
		"5\u0000\u0000$%\u0005_\u0000\u0000%&\u0005m\u0000\u0000&\'\u0005i\u0000"+
		"\u0000\'J\u0005n\u0000\u0000()\u00052\u0000\u0000)*\u00050\u0000\u0000"+
		"*+\u0005_\u0000\u0000+,\u0005m\u0000\u0000,-\u0005i\u0000\u0000-J\u0005"+
		"n\u0000\u0000./\u00051\u0000\u0000/0\u0005_\u0000\u000001\u0005h\u0000"+
		"\u000012\u0005o\u0000\u000023\u0005r\u0000\u00003J\u0005a\u0000\u0000"+
		"45\u00051\u0000\u000056\u0005_\u0000\u000067\u0005d\u0000\u000078\u0005"+
		"i\u0000\u00008J\u0005a\u0000\u00009:\u00052\u0000\u0000:;\u0005_\u0000"+
		"\u0000;<\u0005d\u0000\u0000<=\u0005i\u0000\u0000=>\u0005a\u0000\u0000"+
		">J\u0005s\u0000\u0000?@\u0005s\u0000\u0000@A\u0005e\u0000\u0000AB\u0005"+
		"m\u0000\u0000BC\u0005_\u0000\u0000CD\u0005l\u0000\u0000DE\u0005i\u0000"+
		"\u0000EF\u0005m\u0000\u0000FG\u0005i\u0000\u0000GH\u0005t\u0000\u0000"+
		"HJ\u0005e\u0000\u0000I\"\u0001\u0000\u0000\u0000I(\u0001\u0000\u0000\u0000"+
		"I.\u0001\u0000\u0000\u0000I4\u0001\u0000\u0000\u0000I9\u0001\u0000\u0000"+
		"\u0000I?\u0001\u0000\u0000\u0000J\n\u0001\u0000\u0000\u0000KM\u0007\u0000"+
		"\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NL\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000O\f\u0001\u0000\u0000\u0000"+
		"PR\u0007\u0001\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000UV\u0006\u0006\u0000\u0000V\u000e\u0001\u0000\u0000\u0000"+
		"\u0004\u0000INS\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}