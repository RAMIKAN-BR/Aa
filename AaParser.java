// AaParser.java
import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AaParser extends Parser {
    static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
        new PredictionContextCache();
    public static final int T__0=1;
    public static final int RULE_start = 0;

    private static String[] makeRuleNames() {
        return new String[] {
            "start"
        };
    }
    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[] {
            null, "'a'"
        };
    }
    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[] {
        };
    }
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();

    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return null;
    }

    @Override
    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }

    @Override
    public String getGrammarFileName() { return "Aa.g4"; }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override
    public String getSerializedATN() { return _serializedATN; }

    @Override
    public ATN getATN() { return _ATN; }

    public AaParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
    }

    public static final String _serializedATN =
        "\u0003\u0001\u0001\u0006\u0002\u0000\u0007\u0000\u0001\u0000\u0001\u0000"+
        "\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0004\u0000"+
        "\u0002\u0001\u0000\u0000\u0000\u0002\u0003\u0005\u0001\u0000\u0000\u0003"+
        "\u0004\u0006\u0000\uffff\uffff\u0000\u0004\u0001\u0001\u0000\u0000\u0000"+
        "\u0000";
    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public static class StartContext extends ParserRuleContext {
        public StartContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_start; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof AaListener ) ((AaListener)listener).enterStart(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof AaListener ) ((AaListener)listener).exitStart(this);
        }
    }

    public final StartContext start() throws RecognitionException {
        StartContext _localctx = new StartContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_start);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(2);
                match(T__0);
                System.out.print("A");
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
}