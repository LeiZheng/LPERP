package org.easyerp.parser;
// Generated from JSON.g4 by ANTLR 4.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, LONGSTRING=12, STRING=13, NUMBER=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "LONGSTRING", "STRING", "ESC", "UNICODE", "HEX", "COMMENT", 
		"NUMBER", "INT", "EXP", "WS"
	};


	public JSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "JSON.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u00cd\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3"+
		"\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\7\r[\n\r\f\r\16\r^\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\ri\n\r\f\r\16\rl\13\r\3\r\3\r\3\r\5\rq\n\r\3\16\3\16\3\16\7"+
		"\16v\n\16\f\16\16\16y\13\16\3\16\3\16\3\16\3\16\7\16\177\n\16\f\16\16"+
		"\16\u0082\13\16\3\16\5\16\u0085\n\16\3\17\3\17\3\17\5\17\u008a\n\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\7\22\u0096\n\22\f\22"+
		"\16\22\u0099\13\22\3\23\5\23\u009c\n\23\3\23\3\23\3\23\6\23\u00a1\n\23"+
		"\r\23\16\23\u00a2\3\23\5\23\u00a6\n\23\3\23\5\23\u00a9\n\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00af\n\23\3\23\5\23\u00b2\n\23\3\24\3\24\3\24\7\24\u00b7"+
		"\n\24\f\24\16\24\u00ba\13\24\5\24\u00bc\n\24\3\25\3\25\5\25\u00c0\n\25"+
		"\3\25\3\25\3\26\6\26\u00c5\n\26\r\26\16\26\u00c6\3\26\5\26\u00ca\n\26"+
		"\3\26\3\26\2\2\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\2\37\2!\2#\2%\20\'\2)\2+\21\3\2\r\3\2^^\4\2$$^^\4\2))^^\n"+
		"\2$$\61\61^^ddhhppttvv\5\2\62;CHch\4\2\f\f\17\17\3\2\62;\3\2\63;\4\2G"+
		"Ggg\4\2--//\5\2\13\f\17\17\"\"\u00de\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2%\3\2\2"+
		"\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\64\3\2\2\2\t:\3\2\2\2\13<\3\2\2"+
		"\2\rA\3\2\2\2\17C\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25M\3\2\2\2\27O\3\2"+
		"\2\2\31p\3\2\2\2\33\u0084\3\2\2\2\35\u0086\3\2\2\2\37\u008b\3\2\2\2!\u0091"+
		"\3\2\2\2#\u0093\3\2\2\2%\u00b1\3\2\2\2\'\u00bb\3\2\2\2)\u00bd\3\2\2\2"+
		"+\u00c9\3\2\2\2-.\7_\2\2.\4\3\2\2\2/\60\7V\2\2\60\61\7t\2\2\61\62\7w\2"+
		"\2\62\63\7g\2\2\63\6\3\2\2\2\64\65\7H\2\2\65\66\7c\2\2\66\67\7n\2\2\67"+
		"8\7u\2\289\7g\2\29\b\3\2\2\2:;\7}\2\2;\n\3\2\2\2<=\7p\2\2=>\7w\2\2>?\7"+
		"n\2\2?@\7n\2\2@\f\3\2\2\2AB\7.\2\2B\16\3\2\2\2CD\7]\2\2D\20\3\2\2\2EF"+
		"\7<\2\2F\22\3\2\2\2GH\7h\2\2HI\7c\2\2IJ\7n\2\2JK\7u\2\2KL\7g\2\2L\24\3"+
		"\2\2\2MN\7\177\2\2N\26\3\2\2\2OP\7v\2\2PQ\7t\2\2QR\7w\2\2RS\7g\2\2S\30"+
		"\3\2\2\2TU\7$\2\2UV\7$\2\2VW\7$\2\2W\\\3\2\2\2X[\n\2\2\2Y[\7^\2\2ZX\3"+
		"\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2"+
		"_`\7$\2\2`a\7$\2\2aq\7$\2\2bc\7)\2\2cd\7)\2\2de\7)\2\2ej\3\2\2\2fi\n\2"+
		"\2\2gi\7^\2\2hf\3\2\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2"+
		"\2\2lj\3\2\2\2mn\7)\2\2no\7)\2\2oq\7)\2\2pT\3\2\2\2pb\3\2\2\2q\32\3\2"+
		"\2\2rw\7$\2\2sv\5\35\17\2tv\n\3\2\2us\3\2\2\2ut\3\2\2\2vy\3\2\2\2wu\3"+
		"\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z\u0085\7$\2\2{\u0080\7)\2\2|\177"+
		"\5\35\17\2}\177\n\4\2\2~|\3\2\2\2~}\3\2\2\2\177\u0082\3\2\2\2\u0080~\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0085\7)\2\2\u0084r\3\2\2\2\u0084{\3\2\2\2\u0085\34\3\2\2\2\u0086\u0089"+
		"\7^\2\2\u0087\u008a\t\5\2\2\u0088\u008a\5\37\20\2\u0089\u0087\3\2\2\2"+
		"\u0089\u0088\3\2\2\2\u008a\36\3\2\2\2\u008b\u008c\7w\2\2\u008c\u008d\5"+
		"!\21\2\u008d\u008e\5!\21\2\u008e\u008f\5!\21\2\u008f\u0090\5!\21\2\u0090"+
		" \3\2\2\2\u0091\u0092\t\6\2\2\u0092\"\3\2\2\2\u0093\u0097\7%\2\2\u0094"+
		"\u0096\n\7\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098$\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c"+
		"\7/\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\5\'\24\2\u009e\u00a0\7\60\2\2\u009f\u00a1\t\b\2\2\u00a0\u009f\3"+
		"\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4\u00a6\5)\25\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00b2\3\2\2\2\u00a7\u00a9\7/\2\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\5\'\24\2\u00ab\u00ac\5"+
		")\25\2\u00ac\u00b2\3\2\2\2\u00ad\u00af\7/\2\2\u00ae\u00ad\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\5\'\24\2\u00b1\u009b\3"+
		"\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2&\3\2\2\2\u00b3\u00bc"+
		"\7\62\2\2\u00b4\u00b8\t\t\2\2\u00b5\u00b7\t\b\2\2\u00b6\u00b5\3\2\2\2"+
		"\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bc"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00b3\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bc"+
		"(\3\2\2\2\u00bd\u00bf\t\n\2\2\u00be\u00c0\t\13\2\2\u00bf\u00be\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\5\'\24\2\u00c2*\3"+
		"\2\2\2\u00c3\u00c5\t\f\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00ca\5#"+
		"\22\2\u00c9\u00c4\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\b\26\2\2\u00cc,\3\2\2\2\32\2Z\\hjpuw~\u0080\u0084\u0089\u0097\u009b"+
		"\u00a2\u00a5\u00a8\u00ae\u00b1\u00b8\u00bb\u00bf\u00c6\u00c9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}