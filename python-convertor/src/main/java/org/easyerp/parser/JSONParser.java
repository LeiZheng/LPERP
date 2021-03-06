package org.easyerp.parser;
// Generated from JSON.g4 by ANTLR 4.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JSONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, LONGSTRING=12, STRING=13, NUMBER=14, WS=15;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'True'", "'False'", "'{'", "'null'", "','", "'['", 
		"':'", "'false'", "'}'", "'true'", "LONGSTRING", "STRING", "NUMBER", "WS"
	};
	public static final int
		RULE_json = 0, RULE_object = 1, RULE_pair = 2, RULE_array = 3, RULE_value = 4;
	public static final String[] ruleNames = {
		"json", "object", "pair", "array", "value"
	};

	@Override
	public String getGrammarFileName() { return "JSON.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JSONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class JsonContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitJson(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		try {
			setState(12);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(10); object();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(11); array();
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

	public static class ObjectContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_object);
		int _la;
		try {
			setState(26);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14); match(T__7);
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING) {
					{
					{
					setState(15); pair();
					setState(16); match(T__5);
					}
					}
					setState(22);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(23); match(T__1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24); match(T__7);
				setState(25); match(T__1);
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

	public static class PairContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(STRING);
			setState(29); match(T__3);
			setState(30); value();
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

	public static class ArrayContext extends ParserRuleContext {
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array);
		int _la;
		try {
			int _alt;
			setState(47);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); match(T__4);
				setState(38);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(33); value();
						setState(34); match(T__5);
						}
						} 
					}
					setState(40);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(42);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__8) | (1L << T__7) | (1L << T__6) | (1L << T__4) | (1L << T__2) | (1L << T__0) | (1L << LONGSTRING) | (1L << STRING) | (1L << NUMBER))) != 0)) {
					{
					setState(41); value();
					}
				}

				setState(44); match(T__10);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45); match(T__4);
				setState(46); match(T__10);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode LONGSTRING() { return getToken(JSONParser.LONGSTRING, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(JSONParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(JSONParser.STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JSONListener ) ((JSONListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(59);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); match(STRING);
				}
				break;
			case LONGSTRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(50); match(LONGSTRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(51); match(NUMBER);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(52); object();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(53); array();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 6);
				{
				setState(54); match(T__0);
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 7);
				{
				setState(55); match(T__9);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 8);
				{
				setState(56); match(T__2);
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 9);
				{
				setState(57); match(T__8);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 10);
				{
				setState(58); match(T__6);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21@\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\3\3\3\3\3\3\3\3\7\3\25\n"+
		"\3\f\3\16\3\30\13\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\7\5\'\n\5\f\5\16\5*\13\5\3\5\5\5-\n\5\3\5\3\5\3\5\5\5\62\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6>\n\6\3\6\2\2\7\2\4\6\b\n\2\2"+
		"I\2\16\3\2\2\2\4\34\3\2\2\2\6\36\3\2\2\2\b\61\3\2\2\2\n=\3\2\2\2\f\17"+
		"\5\4\3\2\r\17\5\b\5\2\16\f\3\2\2\2\16\r\3\2\2\2\17\3\3\2\2\2\20\26\7\6"+
		"\2\2\21\22\5\6\4\2\22\23\7\b\2\2\23\25\3\2\2\2\24\21\3\2\2\2\25\30\3\2"+
		"\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\35\7\f"+
		"\2\2\32\33\7\6\2\2\33\35\7\f\2\2\34\20\3\2\2\2\34\32\3\2\2\2\35\5\3\2"+
		"\2\2\36\37\7\17\2\2\37 \7\n\2\2 !\5\n\6\2!\7\3\2\2\2\"(\7\t\2\2#$\5\n"+
		"\6\2$%\7\b\2\2%\'\3\2\2\2&#\3\2\2\2\'*\3\2\2\2(&\3\2\2\2()\3\2\2\2),\3"+
		"\2\2\2*(\3\2\2\2+-\5\n\6\2,+\3\2\2\2,-\3\2\2\2-.\3\2\2\2.\62\7\3\2\2/"+
		"\60\7\t\2\2\60\62\7\3\2\2\61\"\3\2\2\2\61/\3\2\2\2\62\t\3\2\2\2\63>\7"+
		"\17\2\2\64>\7\16\2\2\65>\7\20\2\2\66>\5\4\3\2\67>\5\b\5\28>\7\r\2\29>"+
		"\7\4\2\2:>\7\13\2\2;>\7\5\2\2<>\7\7\2\2=\63\3\2\2\2=\64\3\2\2\2=\65\3"+
		"\2\2\2=\66\3\2\2\2=\67\3\2\2\2=8\3\2\2\2=9\3\2\2\2=:\3\2\2\2=;\3\2\2\2"+
		"=<\3\2\2\2>\13\3\2\2\2\t\16\26\34(,\61=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}