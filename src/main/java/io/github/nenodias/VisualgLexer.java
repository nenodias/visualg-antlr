// Generated from .\Visualg.g4 by ANTLR 4.9.2
package io.github.nenodias;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VisualgLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, ARRAY=2, BEGIN=3, BOOLEAN=4, CASE=5, CHR=6, CHAR=7, CONST=8, DIV=9, 
		DO=10, ELSE=11, END=12, FOR=13, FUNCTION=14, IF=15, IN=16, INTEGER=17, 
		MOD=18, NIL=19, NOT=20, OF=21, OR=22, PROCEDURE=23, PROGRAM=24, REAL=25, 
		RECORD=26, REPEAT=27, THEN=28, TO=29, TYPE=30, UNTIL=31, VAR=32, WHILE=33, 
		PLUS=34, MINUS=35, STAR=36, SLASH=37, ASSIGN=38, SEMI=39, COMMA=40, COLON=41, 
		EQUAL=42, NOT_EQUAL=43, LT=44, LE=45, GE=46, GT=47, LPAREN=48, RPAREN=49, 
		LBRACK=50, LBRACK2=51, RBRACK=52, RBRACK2=53, DOT=54, DOTDOT=55, STRING=56, 
		TRUE=57, FALSE=58, WS=59, COMMENT_1=60, COMMENT_2=61, IDENT=62, STRING_LITERAL=63, 
		NUM_INT=64, NUM_REAL=65;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", 
			"O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "AND", "ARRAY", 
			"BEGIN", "BOOLEAN", "CASE", "CHR", "CHAR", "CONST", "DIV", "DO", "ELSE", 
			"END", "FOR", "FUNCTION", "IF", "IN", "INTEGER", "MOD", "NIL", "NOT", 
			"OF", "OR", "PROCEDURE", "PROGRAM", "REAL", "RECORD", "REPEAT", "THEN", 
			"TO", "TYPE", "UNTIL", "VAR", "WHILE", "PLUS", "MINUS", "STAR", "SLASH", 
			"ASSIGN", "SEMI", "COMMA", "COLON", "EQUAL", "NOT_EQUAL", "LT", "LE", 
			"GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LBRACK2", "RBRACK", "RBRACK2", 
			"DOT", "DOTDOT", "STRING", "TRUE", "FALSE", "WS", "COMMENT_1", "COMMENT_2", 
			"IDENT", "STRING_LITERAL", "NUM_INT", "NUM_REAL", "EXPONENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'+'", "'-'", 
			"'*'", "'/'", null, "';'", "','", "':'", "'='", "'<>'", "'<'", "'<='", 
			"'>='", "'>'", "'('", "')'", "'['", "'(.'", "']'", "'.)'", "'.'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "ARRAY", "BEGIN", "BOOLEAN", "CASE", "CHR", "CHAR", "CONST", 
			"DIV", "DO", "ELSE", "END", "FOR", "FUNCTION", "IF", "IN", "INTEGER", 
			"MOD", "NIL", "NOT", "OF", "OR", "PROCEDURE", "PROGRAM", "REAL", "RECORD", 
			"REPEAT", "THEN", "TO", "TYPE", "UNTIL", "VAR", "WHILE", "PLUS", "MINUS", 
			"STAR", "SLASH", "ASSIGN", "SEMI", "COMMA", "COLON", "EQUAL", "NOT_EQUAL", 
			"LT", "LE", "GE", "GT", "LPAREN", "RPAREN", "LBRACK", "LBRACK2", "RBRACK", 
			"RBRACK2", "DOT", "DOTDOT", "STRING", "TRUE", "FALSE", "WS", "COMMENT_1", 
			"COMMENT_2", "IDENT", "STRING_LITERAL", "NUM_INT", "NUM_REAL"
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


	public VisualgLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Visualg.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u0253\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3"+
		"/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3"+
		"<\3<\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3A\5A\u01c3\nA\3B\3B\3"+
		"C\3C\3D\3D\3E\3E\3F\3F\3F\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3K\3K\3L\3L\3"+
		"M\3M\3N\3N\3N\3O\3O\3P\3P\3P\3Q\3Q\3R\3R\3R\3S\3S\3S\3S\3S\3S\3T\3T\3"+
		"T\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3U\3V\3V\3V\3V\3W\3W\3W\3W\7"+
		"W\u020c\nW\fW\16W\u020f\13W\3W\3W\3W\3W\3W\3X\3X\7X\u0218\nX\fX\16X\u021b"+
		"\13X\3X\3X\3X\3X\3Y\3Y\7Y\u0223\nY\fY\16Y\u0226\13Y\3Z\3Z\3Z\3Z\7Z\u022c"+
		"\nZ\fZ\16Z\u022f\13Z\3Z\3Z\3[\6[\u0234\n[\r[\16[\u0235\3\\\6\\\u0239\n"+
		"\\\r\\\16\\\u023a\3\\\3\\\6\\\u023f\n\\\r\\\16\\\u0240\3\\\5\\\u0244\n"+
		"\\\5\\\u0246\n\\\3\\\5\\\u0249\n\\\3]\3]\5]\u024d\n]\3]\6]\u0250\n]\r"+
		"]\16]\u0251\4\u020d\u0219\2^\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\2\25"+
		"\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67"+
		"\39\4;\5=\6?\7A\bC\tE\nG\13I\fK\rM\16O\17Q\20S\21U\22W\23Y\24[\25]\26"+
		"_\27a\30c\31e\32g\33i\34k\35m\36o\37q s!u\"w#y${%}&\177\'\u0081(\u0083"+
		")\u0085*\u0087+\u0089,\u008b-\u008d.\u008f/\u0091\60\u0093\61\u0095\62"+
		"\u0097\63\u0099\64\u009b\65\u009d\66\u009f\67\u00a18\u00a39\u00a5:\u00a7"+
		";\u00a9<\u00ab=\u00ad>\u00af?\u00b1@\u00b3A\u00b5B\u00b7C\u00b9\2\3\2"+
		"!\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2"+
		"KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4"+
		"\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\"+
		"||\5\2\13\f\17\17\"\"\4\2C\\c|\6\2\62;C\\aac|\3\2))\4\2--//\2\u0245\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2"+
		"\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5"+
		"\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2"+
		"\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7"+
		"\3\2\2\2\3\u00bb\3\2\2\2\5\u00bd\3\2\2\2\7\u00bf\3\2\2\2\t\u00c1\3\2\2"+
		"\2\13\u00c3\3\2\2\2\r\u00c5\3\2\2\2\17\u00c7\3\2\2\2\21\u00c9\3\2\2\2"+
		"\23\u00cb\3\2\2\2\25\u00cd\3\2\2\2\27\u00cf\3\2\2\2\31\u00d1\3\2\2\2\33"+
		"\u00d3\3\2\2\2\35\u00d5\3\2\2\2\37\u00d7\3\2\2\2!\u00d9\3\2\2\2#\u00db"+
		"\3\2\2\2%\u00dd\3\2\2\2\'\u00df\3\2\2\2)\u00e1\3\2\2\2+\u00e3\3\2\2\2"+
		"-\u00e5\3\2\2\2/\u00e7\3\2\2\2\61\u00e9\3\2\2\2\63\u00eb\3\2\2\2\65\u00ed"+
		"\3\2\2\2\67\u00ef\3\2\2\29\u00f1\3\2\2\2;\u00f7\3\2\2\2=\u00fe\3\2\2\2"+
		"?\u0105\3\2\2\2A\u010a\3\2\2\2C\u010e\3\2\2\2E\u0118\3\2\2\2G\u0122\3"+
		"\2\2\2I\u0126\3\2\2\2K\u012b\3\2\2\2M\u0131\3\2\2\2O\u0135\3\2\2\2Q\u013a"+
		"\3\2\2\2S\u0141\3\2\2\2U\u0144\3\2\2\2W\u014d\3\2\2\2Y\u0155\3\2\2\2["+
		"\u015c\3\2\2\2]\u0161\3\2\2\2_\u0165\3\2\2\2a\u0168\3\2\2\2c\u016b\3\2"+
		"\2\2e\u0178\3\2\2\2g\u0181\3\2\2\2i\u0186\3\2\2\2k\u018f\3\2\2\2m\u0196"+
		"\3\2\2\2o\u019c\3\2\2\2q\u01a0\3\2\2\2s\u01a5\3\2\2\2u\u01a9\3\2\2\2w"+
		"\u01ad\3\2\2\2y\u01b6\3\2\2\2{\u01b8\3\2\2\2}\u01ba\3\2\2\2\177\u01bc"+
		"\3\2\2\2\u0081\u01c2\3\2\2\2\u0083\u01c4\3\2\2\2\u0085\u01c6\3\2\2\2\u0087"+
		"\u01c8\3\2\2\2\u0089\u01ca\3\2\2\2\u008b\u01cc\3\2\2\2\u008d\u01cf\3\2"+
		"\2\2\u008f\u01d1\3\2\2\2\u0091\u01d4\3\2\2\2\u0093\u01d7\3\2\2\2\u0095"+
		"\u01d9\3\2\2\2\u0097\u01db\3\2\2\2\u0099\u01dd\3\2\2\2\u009b\u01df\3\2"+
		"\2\2\u009d\u01e2\3\2\2\2\u009f\u01e4\3\2\2\2\u00a1\u01e7\3\2\2\2\u00a3"+
		"\u01e9\3\2\2\2\u00a5\u01ec\3\2\2\2\u00a7\u01f2\3\2\2\2\u00a9\u01fd\3\2"+
		"\2\2\u00ab\u0203\3\2\2\2\u00ad\u0207\3\2\2\2\u00af\u0215\3\2\2\2\u00b1"+
		"\u0220\3\2\2\2\u00b3\u0227\3\2\2\2\u00b5\u0233\3\2\2\2\u00b7\u0238\3\2"+
		"\2\2\u00b9\u024a\3\2\2\2\u00bb\u00bc\t\2\2\2\u00bc\4\3\2\2\2\u00bd\u00be"+
		"\t\3\2\2\u00be\6\3\2\2\2\u00bf\u00c0\t\4\2\2\u00c0\b\3\2\2\2\u00c1\u00c2"+
		"\t\5\2\2\u00c2\n\3\2\2\2\u00c3\u00c4\t\6\2\2\u00c4\f\3\2\2\2\u00c5\u00c6"+
		"\t\7\2\2\u00c6\16\3\2\2\2\u00c7\u00c8\t\b\2\2\u00c8\20\3\2\2\2\u00c9\u00ca"+
		"\t\t\2\2\u00ca\22\3\2\2\2\u00cb\u00cc\t\n\2\2\u00cc\24\3\2\2\2\u00cd\u00ce"+
		"\t\13\2\2\u00ce\26\3\2\2\2\u00cf\u00d0\t\f\2\2\u00d0\30\3\2\2\2\u00d1"+
		"\u00d2\t\r\2\2\u00d2\32\3\2\2\2\u00d3\u00d4\t\16\2\2\u00d4\34\3\2\2\2"+
		"\u00d5\u00d6\t\17\2\2\u00d6\36\3\2\2\2\u00d7\u00d8\t\20\2\2\u00d8 \3\2"+
		"\2\2\u00d9\u00da\t\21\2\2\u00da\"\3\2\2\2\u00db\u00dc\t\22\2\2\u00dc$"+
		"\3\2\2\2\u00dd\u00de\t\23\2\2\u00de&\3\2\2\2\u00df\u00e0\t\24\2\2\u00e0"+
		"(\3\2\2\2\u00e1\u00e2\t\25\2\2\u00e2*\3\2\2\2\u00e3\u00e4\t\26\2\2\u00e4"+
		",\3\2\2\2\u00e5\u00e6\t\27\2\2\u00e6.\3\2\2\2\u00e7\u00e8\t\30\2\2\u00e8"+
		"\60\3\2\2\2\u00e9\u00ea\t\31\2\2\u00ea\62\3\2\2\2\u00eb\u00ec\t\32\2\2"+
		"\u00ec\64\3\2\2\2\u00ed\u00ee\t\33\2\2\u00ee\66\3\2\2\2\u00ef\u00f0\5"+
		"\13\6\2\u00f08\3\2\2\2\u00f1\u00f2\5-\27\2\u00f2\u00f3\5\13\6\2\u00f3"+
		"\u00f4\5)\25\2\u00f4\u00f5\5\37\20\2\u00f5\u00f6\5%\23\2\u00f6:\3\2\2"+
		"\2\u00f7\u00f8\5\23\n\2\u00f8\u00f9\5\35\17\2\u00f9\u00fa\5\23\n\2\u00fa"+
		"\u00fb\5\7\4\2\u00fb\u00fc\5\23\n\2\u00fc\u00fd\5\37\20\2\u00fd<\3\2\2"+
		"\2\u00fe\u00ff\5\31\r\2\u00ff\u0100\5\37\20\2\u0100\u0101\5\17\b\2\u0101"+
		"\u0102\5\23\n\2\u0102\u0103\5\7\4\2\u0103\u0104\5\37\20\2\u0104>\3\2\2"+
		"\2\u0105\u0106\5\7\4\2\u0106\u0107\5\3\2\2\u0107\u0108\5\'\24\2\u0108"+
		"\u0109\5\37\20\2\u0109@\3\2\2\2\u010a\u010b\5\7\4\2\u010b\u010c\5\21\t"+
		"\2\u010c\u010d\5%\23\2\u010dB\3\2\2\2\u010e\u010f\5\7\4\2\u010f\u0110"+
		"\5\3\2\2\u0110\u0111\5%\23\2\u0111\u0112\5\3\2\2\u0112\u0113\5\7\4\2\u0113"+
		"\u0114\5)\25\2\u0114\u0115\5\13\6\2\u0115\u0116\5%\23\2\u0116\u0117\5"+
		"\13\6\2\u0117D\3\2\2\2\u0118\u0119\5\7\4\2\u0119\u011a\5\37\20\2\u011a"+
		"\u011b\5\35\17\2\u011b\u011c\5\'\24\2\u011c\u011d\5)\25\2\u011d\u011e"+
		"\5\3\2\2\u011e\u011f\5\35\17\2\u011f\u0120\5)\25\2\u0120\u0121\5\13\6"+
		"\2\u0121F\3\2\2\2\u0122\u0123\5\t\5\2\u0123\u0124\5\23\n\2\u0124\u0125"+
		"\5-\27\2\u0125H\3\2\2\2\u0126\u0127\5\r\7\2\u0127\u0128\5\3\2\2\u0128"+
		"\u0129\5\7\4\2\u0129\u012a\5\3\2\2\u012aJ\3\2\2\2\u012b\u012c\5\'\24\2"+
		"\u012c\u012d\5\13\6\2\u012d\u012e\5\35\17\2\u012e\u012f\5\3\2\2\u012f"+
		"\u0130\5\37\20\2\u0130L\3\2\2\2\u0131\u0132\5\r\7\2\u0132\u0133\5\23\n"+
		"\2\u0133\u0134\5\33\16\2\u0134N\3\2\2\2\u0135\u0136\5!\21\2\u0136\u0137"+
		"\5\3\2\2\u0137\u0138\5%\23\2\u0138\u0139\5\3\2\2\u0139P\3\2\2\2\u013a"+
		"\u013b\5\r\7\2\u013b\u013c\5+\26\2\u013c\u013d\5\35\17\2\u013d\u013e\5"+
		"\7\4\2\u013e\u013f\5\3\2\2\u013f\u0140\5\37\20\2\u0140R\3\2\2\2\u0141"+
		"\u0142\5\'\24\2\u0142\u0143\5\13\6\2\u0143T\3\2\2\2\u0144\u0145\5!\21"+
		"\2\u0145\u0146\5\13\6\2\u0146\u0147\5%\23\2\u0147\u0148\5)\25\2\u0148"+
		"\u0149\5\13\6\2\u0149\u014a\5\35\17\2\u014a\u014b\5\7\4\2\u014b\u014c"+
		"\5\13\6\2\u014cV\3\2\2\2\u014d\u014e\5\23\n\2\u014e\u014f\5\35\17\2\u014f"+
		"\u0150\5)\25\2\u0150\u0151\5\13\6\2\u0151\u0152\5\23\n\2\u0152\u0153\5"+
		"%\23\2\u0153\u0154\5\37\20\2\u0154X\3\2\2\2\u0155\u0156\5\33\16\2\u0156"+
		"\u0157\5\37\20\2\u0157\u0158\5\t\5\2\u0158\u0159\5+\26\2\u0159\u015a\5"+
		"\31\r\2\u015a\u015b\5\37\20\2\u015bZ\3\2\2\2\u015c\u015d\5\35\17\2\u015d"+
		"\u015e\5+\26\2\u015e\u015f\5\31\r\2\u015f\u0160\5\37\20\2\u0160\\\3\2"+
		"\2\2\u0161\u0162\5\35\17\2\u0162\u0163\5\3\2\2\u0163\u0164\5\37\20\2\u0164"+
		"^\3\2\2\2\u0165\u0166\5\t\5\2\u0166\u0167\5\13\6\2\u0167`\3\2\2\2\u0168"+
		"\u0169\5\37\20\2\u0169\u016a\5+\26\2\u016ab\3\2\2\2\u016b\u016c\5!\21"+
		"\2\u016c\u016d\5%\23\2\u016d\u016e\5\37\20\2\u016e\u016f\5\7\4\2\u016f"+
		"\u0170\5\13\6\2\u0170\u0171\5\t\5\2\u0171\u0172\5\23\n\2\u0172\u0173\5"+
		"\33\16\2\u0173\u0174\5\13\6\2\u0174\u0175\5\35\17\2\u0175\u0176\5)\25"+
		"\2\u0176\u0177\5\37\20\2\u0177d\3\2\2\2\u0178\u0179\5!\21\2\u0179\u017a"+
		"\5%\23\2\u017a\u017b\5\37\20\2\u017b\u017c\5\17\b\2\u017c\u017d\5%\23"+
		"\2\u017d\u017e\5\3\2\2\u017e\u017f\5\33\16\2\u017f\u0180\5\3\2\2\u0180"+
		"f\3\2\2\2\u0181\u0182\5%\23\2\u0182\u0183\5\13\6\2\u0183\u0184\5\3\2\2"+
		"\u0184\u0185\5\31\r\2\u0185h\3\2\2\2\u0186\u0187\5%\23\2\u0187\u0188\5"+
		"\13\6\2\u0188\u0189\5\17\b\2\u0189\u018a\5\23\n\2\u018a\u018b\5\'\24\2"+
		"\u018b\u018c\5)\25\2\u018c\u018d\5%\23\2\u018d\u018e\5\37\20\2\u018ej"+
		"\3\2\2\2\u018f\u0190\5%\23\2\u0190\u0191\5\13\6\2\u0191\u0192\5!\21\2"+
		"\u0192\u0193\5\23\n\2\u0193\u0194\5)\25\2\u0194\u0195\5\3\2\2\u0195l\3"+
		"\2\2\2\u0196\u0197\5\13\6\2\u0197\u0198\5\35\17\2\u0198\u0199\5)\25\2"+
		"\u0199\u019a\5\3\2\2\u019a\u019b\5\37\20\2\u019bn\3\2\2\2\u019c\u019d"+
		"\5\3\2\2\u019d\u019e\5)\25\2\u019e\u019f\5\13\6\2\u019fp\3\2\2\2\u01a0"+
		"\u01a1\5)\25\2\u01a1\u01a2\5\23\n\2\u01a2\u01a3\5!\21\2\u01a3\u01a4\5"+
		"\37\20\2\u01a4r\3\2\2\2\u01a5\u01a6\5\3\2\2\u01a6\u01a7\5)\25\2\u01a7"+
		"\u01a8\5\13\6\2\u01a8t\3\2\2\2\u01a9\u01aa\5-\27\2\u01aa\u01ab\5\3\2\2"+
		"\u01ab\u01ac\5%\23\2\u01acv\3\2\2\2\u01ad\u01ae\5\13\6\2\u01ae\u01af\5"+
		"\35\17\2\u01af\u01b0\5#\22\2\u01b0\u01b1\5+\26\2\u01b1\u01b2\5\3\2\2\u01b2"+
		"\u01b3\5\35\17\2\u01b3\u01b4\5)\25\2\u01b4\u01b5\5\37\20\2\u01b5x\3\2"+
		"\2\2\u01b6\u01b7\7-\2\2\u01b7z\3\2\2\2\u01b8\u01b9\7/\2\2\u01b9|\3\2\2"+
		"\2\u01ba\u01bb\7,\2\2\u01bb~\3\2\2\2\u01bc\u01bd\7\61\2\2\u01bd\u0080"+
		"\3\2\2\2\u01be\u01bf\7<\2\2\u01bf\u01c3\7?\2\2\u01c0\u01c1\7>\2\2\u01c1"+
		"\u01c3\7/\2\2\u01c2\u01be\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u0082\3\2"+
		"\2\2\u01c4\u01c5\7=\2\2\u01c5\u0084\3\2\2\2\u01c6\u01c7\7.\2\2\u01c7\u0086"+
		"\3\2\2\2\u01c8\u01c9\7<\2\2\u01c9\u0088\3\2\2\2\u01ca\u01cb\7?\2\2\u01cb"+
		"\u008a\3\2\2\2\u01cc\u01cd\7>\2\2\u01cd\u01ce\7@\2\2\u01ce\u008c\3\2\2"+
		"\2\u01cf\u01d0\7>\2\2\u01d0\u008e\3\2\2\2\u01d1\u01d2\7>\2\2\u01d2\u01d3"+
		"\7?\2\2\u01d3\u0090\3\2\2\2\u01d4\u01d5\7@\2\2\u01d5\u01d6\7?\2\2\u01d6"+
		"\u0092\3\2\2\2\u01d7\u01d8\7@\2\2\u01d8\u0094\3\2\2\2\u01d9\u01da\7*\2"+
		"\2\u01da\u0096\3\2\2\2\u01db\u01dc\7+\2\2\u01dc\u0098\3\2\2\2\u01dd\u01de"+
		"\7]\2\2\u01de\u009a\3\2\2\2\u01df\u01e0\7*\2\2\u01e0\u01e1\7\60\2\2\u01e1"+
		"\u009c\3\2\2\2\u01e2\u01e3\7_\2\2\u01e3\u009e\3\2\2\2\u01e4\u01e5\7\60"+
		"\2\2\u01e5\u01e6\7+\2\2\u01e6\u00a0\3\2\2\2\u01e7\u01e8\7\60\2\2\u01e8"+
		"\u00a2\3\2\2\2\u01e9\u01ea\7\60\2\2\u01ea\u01eb\7\60\2\2\u01eb\u00a4\3"+
		"\2\2\2\u01ec\u01ed\5)\25\2\u01ed\u01ee\5\13\6\2\u01ee\u01ef\5\61\31\2"+
		"\u01ef\u01f0\5)\25\2\u01f0\u01f1\5\37\20\2\u01f1\u00a6\3\2\2\2\u01f2\u01f3"+
		"\5-\27\2\u01f3\u01f4\5\13\6\2\u01f4\u01f5\5%\23\2\u01f5\u01f6\5\t\5\2"+
		"\u01f6\u01f7\5\3\2\2\u01f7\u01f8\5\t\5\2\u01f8\u01f9\5\13\6\2\u01f9\u01fa"+
		"\5\23\n\2\u01fa\u01fb\5%\23\2\u01fb\u01fc\5\37\20\2\u01fc\u00a8\3\2\2"+
		"\2\u01fd\u01fe\5\r\7\2\u01fe\u01ff\5\3\2\2\u01ff\u0200\5\31\r\2\u0200"+
		"\u0201\5\'\24\2\u0201\u0202\5\37\20\2\u0202\u00aa\3\2\2\2\u0203\u0204"+
		"\t\34\2\2\u0204\u0205\3\2\2\2\u0205\u0206\bV\2\2\u0206\u00ac\3\2\2\2\u0207"+
		"\u0208\7*\2\2\u0208\u0209\7,\2\2\u0209\u020d\3\2\2\2\u020a\u020c\13\2"+
		"\2\2\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020e\3\2\2\2\u020d"+
		"\u020b\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0211\7,"+
		"\2\2\u0211\u0212\7+\2\2\u0212\u0213\3\2\2\2\u0213\u0214\bW\2\2\u0214\u00ae"+
		"\3\2\2\2\u0215\u0219\7}\2\2\u0216\u0218\13\2\2\2\u0217\u0216\3\2\2\2\u0218"+
		"\u021b\3\2\2\2\u0219\u021a\3\2\2\2\u0219\u0217\3\2\2\2\u021a\u021c\3\2"+
		"\2\2\u021b\u0219\3\2\2\2\u021c\u021d\7\177\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u021f\bX\2\2\u021f\u00b0\3\2\2\2\u0220\u0224\t\35\2\2\u0221\u0223\t\36"+
		"\2\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u00b2\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u022d\7)"+
		"\2\2\u0228\u0229\7)\2\2\u0229\u022c\7)\2\2\u022a\u022c\n\37\2\2\u022b"+
		"\u0228\3\2\2\2\u022b\u022a\3\2\2\2\u022c\u022f\3\2\2\2\u022d\u022b\3\2"+
		"\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u022d\3\2\2\2\u0230"+
		"\u0231\7)\2\2\u0231\u00b4\3\2\2\2\u0232\u0234\4\62;\2\u0233\u0232\3\2"+
		"\2\2\u0234\u0235\3\2\2\2\u0235\u0233\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\u00b6\3\2\2\2\u0237\u0239\4\62;\2\u0238\u0237\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0248\3\2\2\2\u023c"+
		"\u023e\7\60\2\2\u023d\u023f\4\62;\2\u023e\u023d\3\2\2\2\u023f\u0240\3"+
		"\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242"+
		"\u0244\5\u00b9]\2\u0243\u0242\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246"+
		"\3\2\2\2\u0245\u023c\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0249\3\2\2\2\u0247"+
		"\u0249\5\u00b9]\2\u0248\u0245\3\2\2\2\u0248\u0247\3\2\2\2\u0249\u00b8"+
		"\3\2\2\2\u024a\u024c\7g\2\2\u024b\u024d\t \2\2\u024c\u024b\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024d\u024f\3\2\2\2\u024e\u0250\4\62;\2\u024f\u024e\3\2"+
		"\2\2\u0250\u0251\3\2\2\2\u0251\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u00ba\3\2\2\2\21\2\u01c2\u020d\u0219\u0224\u022b\u022d\u0235\u023a\u0240"+
		"\u0243\u0245\u0248\u024c\u0251\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}