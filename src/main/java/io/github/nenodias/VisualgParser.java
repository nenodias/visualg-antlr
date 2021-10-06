// Generated from .\Visualg.g4 by ANTLR 4.9.2
package io.github.nenodias;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VisualgParser extends Parser {
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
	public static final int
		RULE_compilationUnit = 0, RULE_program = 1, RULE_programHeading = 2, RULE_identifier = 3, 
		RULE_block = 4, RULE_label = 5, RULE_constantDefinitionPart = 6, RULE_constantDefinition = 7, 
		RULE_constantChr = 8, RULE_constant = 9, RULE_unsignedNumber = 10, RULE_unsignedInteger = 11, 
		RULE_unsignedReal = 12, RULE_sign = 13, RULE_bool_ = 14, RULE_string = 15, 
		RULE_typeDefinitionPart = 16, RULE_typeDefinition = 17, RULE_functionType = 18, 
		RULE_procedureType = 19, RULE_type_ = 20, RULE_simpleType = 21, RULE_scalarType = 22, 
		RULE_subrangeType = 23, RULE_typeIdentifier = 24, RULE_structuredType = 25, 
		RULE_unpackedStructuredType = 26, RULE_stringtype = 27, RULE_arrayType = 28, 
		RULE_typeList = 29, RULE_indexType = 30, RULE_componentType = 31, RULE_recordType = 32, 
		RULE_fieldList = 33, RULE_fixedPart = 34, RULE_recordSection = 35, RULE_variantPart = 36, 
		RULE_tag = 37, RULE_variant = 38, RULE_variableDeclarationPart = 39, RULE_variableDeclaration = 40, 
		RULE_procedureAndFunctionDeclarationPart = 41, RULE_procedureOrFunctionDeclaration = 42, 
		RULE_procedureDeclaration = 43, RULE_formalParameterList = 44, RULE_formalParameterSection = 45, 
		RULE_parameterGroup = 46, RULE_identifierList = 47, RULE_constList = 48, 
		RULE_functionDeclaration = 49, RULE_resultType = 50, RULE_statement = 51, 
		RULE_unlabelledStatement = 52, RULE_simpleStatement = 53, RULE_assignmentStatement = 54, 
		RULE_variable = 55, RULE_expression = 56, RULE_relationaloperator = 57, 
		RULE_simpleExpression = 58, RULE_additiveoperator = 59, RULE_term = 60, 
		RULE_multiplicativeoperator = 61, RULE_signedFactor = 62, RULE_factor = 63, 
		RULE_unsignedConstant = 64, RULE_functionDesignator = 65, RULE_parameterList = 66, 
		RULE_set_ = 67, RULE_elementList = 68, RULE_element = 69, RULE_procedureStatement = 70, 
		RULE_actualParameter = 71, RULE_parameterwidth = 72, RULE_emptyStatement = 73, 
		RULE_empty_ = 74, RULE_structuredStatement = 75, RULE_compoundStatement = 76, 
		RULE_statements = 77, RULE_conditionalStatement = 78, RULE_ifStatement = 79, 
		RULE_caseStatement = 80, RULE_caseListElement = 81, RULE_repetetiveStatement = 82, 
		RULE_whileStatement = 83, RULE_repeatStatement = 84, RULE_forStatement = 85, 
		RULE_forList = 86, RULE_initialValue = 87, RULE_finalValue = 88, RULE_recordVariableList = 89;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "program", "programHeading", "identifier", "block", 
			"label", "constantDefinitionPart", "constantDefinition", "constantChr", 
			"constant", "unsignedNumber", "unsignedInteger", "unsignedReal", "sign", 
			"bool_", "string", "typeDefinitionPart", "typeDefinition", "functionType", 
			"procedureType", "type_", "simpleType", "scalarType", "subrangeType", 
			"typeIdentifier", "structuredType", "unpackedStructuredType", "stringtype", 
			"arrayType", "typeList", "indexType", "componentType", "recordType", 
			"fieldList", "fixedPart", "recordSection", "variantPart", "tag", "variant", 
			"variableDeclarationPart", "variableDeclaration", "procedureAndFunctionDeclarationPart", 
			"procedureOrFunctionDeclaration", "procedureDeclaration", "formalParameterList", 
			"formalParameterSection", "parameterGroup", "identifierList", "constList", 
			"functionDeclaration", "resultType", "statement", "unlabelledStatement", 
			"simpleStatement", "assignmentStatement", "variable", "expression", "relationaloperator", 
			"simpleExpression", "additiveoperator", "term", "multiplicativeoperator", 
			"signedFactor", "factor", "unsignedConstant", "functionDesignator", "parameterList", 
			"set_", "elementList", "element", "procedureStatement", "actualParameter", 
			"parameterwidth", "emptyStatement", "empty_", "structuredStatement", 
			"compoundStatement", "statements", "conditionalStatement", "ifStatement", 
			"caseStatement", "caseListElement", "repetetiveStatement", "whileStatement", 
			"repeatStatement", "forStatement", "forList", "initialValue", "finalValue", 
			"recordVariableList"
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

	@Override
	public String getGrammarFileName() { return "Visualg.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VisualgParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VisualgParser.EOF, 0); }
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BEGIN) | (1L << CONST) | (1L << FUNCTION) | (1L << PROCEDURE) | (1L << PROGRAM) | (1L << TYPE) | (1L << VAR))) != 0)) {
				{
				{
				setState(180);
				program();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
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

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DOT() { return getToken(VisualgParser.DOT, 0); }
		public ProgramHeadingContext programHeading() {
			return getRuleContext(ProgramHeadingContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PROGRAM) {
				{
				setState(188);
				programHeading();
				}
			}

			setState(191);
			block();
			setState(192);
			match(DOT);
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

	public static class ProgramHeadingContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(VisualgParser.PROGRAM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VisualgParser.SEMI, 0); }
		public TerminalNode LPAREN() { return getToken(VisualgParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VisualgParser.RPAREN, 0); }
		public ProgramHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterProgramHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitProgramHeading(this);
		}
	}

	public final ProgramHeadingContext programHeading() throws RecognitionException {
		ProgramHeadingContext _localctx = new ProgramHeadingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_programHeading);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(PROGRAM);
			setState(195);
			identifier();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(196);
				match(LPAREN);
				setState(197);
				identifierList();
				setState(198);
				match(RPAREN);
				}
			}

			setState(202);
			match(SEMI);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(VisualgParser.IDENT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(IDENT);
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

	public static class BlockContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public List<ConstantDefinitionPartContext> constantDefinitionPart() {
			return getRuleContexts(ConstantDefinitionPartContext.class);
		}
		public ConstantDefinitionPartContext constantDefinitionPart(int i) {
			return getRuleContext(ConstantDefinitionPartContext.class,i);
		}
		public List<TypeDefinitionPartContext> typeDefinitionPart() {
			return getRuleContexts(TypeDefinitionPartContext.class);
		}
		public TypeDefinitionPartContext typeDefinitionPart(int i) {
			return getRuleContext(TypeDefinitionPartContext.class,i);
		}
		public List<VariableDeclarationPartContext> variableDeclarationPart() {
			return getRuleContexts(VariableDeclarationPartContext.class);
		}
		public VariableDeclarationPartContext variableDeclarationPart(int i) {
			return getRuleContext(VariableDeclarationPartContext.class,i);
		}
		public List<ProcedureAndFunctionDeclarationPartContext> procedureAndFunctionDeclarationPart() {
			return getRuleContexts(ProcedureAndFunctionDeclarationPartContext.class);
		}
		public ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart(int i) {
			return getRuleContext(ProcedureAndFunctionDeclarationPartContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONST) | (1L << FUNCTION) | (1L << PROCEDURE) | (1L << TYPE) | (1L << VAR))) != 0)) {
				{
				setState(210);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CONST:
					{
					setState(206);
					constantDefinitionPart();
					}
					break;
				case TYPE:
					{
					setState(207);
					typeDefinitionPart();
					}
					break;
				case VAR:
					{
					setState(208);
					variableDeclarationPart();
					}
					break;
				case FUNCTION:
				case PROCEDURE:
					{
					setState(209);
					procedureAndFunctionDeclarationPart();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			compoundStatement();
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

	public static class LabelContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitLabel(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			unsignedInteger();
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

	public static class ConstantDefinitionPartContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(VisualgParser.CONST, 0); }
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(VisualgParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VisualgParser.SEMI, i);
		}
		public ConstantDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterConstantDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitConstantDefinitionPart(this);
		}
	}

	public final ConstantDefinitionPartContext constantDefinitionPart() throws RecognitionException {
		ConstantDefinitionPartContext _localctx = new ConstantDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constantDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(CONST);
			setState(223); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(220);
				constantDefinition();
				setState(221);
				match(SEMI);
				}
				}
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class ConstantDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(VisualgParser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterConstantDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitConstantDefinition(this);
		}
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constantDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			identifier();
			setState(228);
			match(EQUAL);
			setState(229);
			constant();
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

	public static class ConstantChrContext extends ParserRuleContext {
		public TerminalNode CHR() { return getToken(VisualgParser.CHR, 0); }
		public TerminalNode LPAREN() { return getToken(VisualgParser.LPAREN, 0); }
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VisualgParser.RPAREN, 0); }
		public ConstantChrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantChr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterConstantChr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitConstantChr(this);
		}
	}

	public final ConstantChrContext constantChr() throws RecognitionException {
		ConstantChrContext _localctx = new ConstantChrContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constantChr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(CHR);
			setState(232);
			match(LPAREN);
			setState(233);
			unsignedInteger();
			setState(234);
			match(RPAREN);
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

	public static class ConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constant);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				unsignedNumber();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				sign();
				setState(238);
				unsignedNumber();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				identifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				sign();
				setState(242);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
				string();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(245);
				constantChr();
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

	public static class UnsignedNumberContext extends ParserRuleContext {
		public UnsignedIntegerContext unsignedInteger() {
			return getRuleContext(UnsignedIntegerContext.class,0);
		}
		public UnsignedRealContext unsignedReal() {
			return getRuleContext(UnsignedRealContext.class,0);
		}
		public UnsignedNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterUnsignedNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitUnsignedNumber(this);
		}
	}

	public final UnsignedNumberContext unsignedNumber() throws RecognitionException {
		UnsignedNumberContext _localctx = new UnsignedNumberContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unsignedNumber);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				unsignedInteger();
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				unsignedReal();
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

	public static class UnsignedIntegerContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(VisualgParser.NUM_INT, 0); }
		public UnsignedIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterUnsignedInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitUnsignedInteger(this);
		}
	}

	public final UnsignedIntegerContext unsignedInteger() throws RecognitionException {
		UnsignedIntegerContext _localctx = new UnsignedIntegerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_unsignedInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(NUM_INT);
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

	public static class UnsignedRealContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(VisualgParser.NUM_REAL, 0); }
		public UnsignedRealContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedReal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterUnsignedReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitUnsignedReal(this);
		}
	}

	public final UnsignedRealContext unsignedReal() throws RecognitionException {
		UnsignedRealContext _localctx = new UnsignedRealContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_unsignedReal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(NUM_REAL);
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(VisualgParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VisualgParser.MINUS, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitSign(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class Bool_Context extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(VisualgParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(VisualgParser.FALSE, 0); }
		public Bool_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterBool_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitBool_(this);
		}
	}

	public final Bool_Context bool_() throws RecognitionException {
		Bool_Context _localctx = new Bool_Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_bool_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class StringContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(VisualgParser.STRING_LITERAL, 0); }
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitString(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(STRING_LITERAL);
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

	public static class TypeDefinitionPartContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(VisualgParser.TYPE, 0); }
		public List<TypeDefinitionContext> typeDefinition() {
			return getRuleContexts(TypeDefinitionContext.class);
		}
		public TypeDefinitionContext typeDefinition(int i) {
			return getRuleContext(TypeDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(VisualgParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VisualgParser.SEMI, i);
		}
		public TypeDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinitionPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterTypeDefinitionPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitTypeDefinitionPart(this);
		}
	}

	public final TypeDefinitionPartContext typeDefinitionPart() throws RecognitionException {
		TypeDefinitionPartContext _localctx = new TypeDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(TYPE);
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(263);
				typeDefinition();
				setState(264);
				match(SEMI);
				}
				}
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	public static class TypeDefinitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(VisualgParser.EQUAL, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public ProcedureTypeContext procedureType() {
			return getRuleContext(ProcedureTypeContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitTypeDefinition(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			identifier();
			setState(271);
			match(EQUAL);
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
			case BOOLEAN:
			case CHR:
			case CHAR:
			case INTEGER:
			case REAL:
			case RECORD:
			case PLUS:
			case MINUS:
			case LPAREN:
			case STRING:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				{
				setState(272);
				type_();
				}
				break;
			case FUNCTION:
				{
				setState(273);
				functionType();
				}
				break;
			case PROCEDURE:
				{
				setState(274);
				procedureType();
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(VisualgParser.FUNCTION, 0); }
		public TerminalNode COLON() { return getToken(VisualgParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(FUNCTION);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(278);
				formalParameterList();
				}
			}

			setState(281);
			match(COLON);
			setState(282);
			resultType();
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

	public static class ProcedureTypeContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(VisualgParser.PROCEDURE, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterProcedureType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitProcedureType(this);
		}
	}

	public final ProcedureTypeContext procedureType() throws RecognitionException {
		ProcedureTypeContext _localctx = new ProcedureTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_procedureType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(PROCEDURE);
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(285);
				formalParameterList();
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

	public static class Type_Context extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public StructuredTypeContext structuredType() {
			return getRuleContext(StructuredTypeContext.class,0);
		}
		public Type_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterType_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitType_(this);
		}
	}

	public final Type_Context type_() throws RecognitionException {
		Type_Context _localctx = new Type_Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_type_);
		try {
			setState(290);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case CHR:
			case CHAR:
			case INTEGER:
			case REAL:
			case PLUS:
			case MINUS:
			case LPAREN:
			case STRING:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				simpleType();
				}
				break;
			case ARRAY:
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				structuredType();
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

	public static class SimpleTypeContext extends ParserRuleContext {
		public ScalarTypeContext scalarType() {
			return getRuleContext(ScalarTypeContext.class,0);
		}
		public SubrangeTypeContext subrangeType() {
			return getRuleContext(SubrangeTypeContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public StringtypeContext stringtype() {
			return getRuleContext(StringtypeContext.class,0);
		}
		public SimpleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterSimpleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitSimpleType(this);
		}
	}

	public final SimpleTypeContext simpleType() throws RecognitionException {
		SimpleTypeContext _localctx = new SimpleTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_simpleType);
		try {
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292);
				scalarType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(293);
				subrangeType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				typeIdentifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(295);
				stringtype();
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

	public static class ScalarTypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VisualgParser.LPAREN, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VisualgParser.RPAREN, 0); }
		public ScalarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterScalarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitScalarType(this);
		}
	}

	public final ScalarTypeContext scalarType() throws RecognitionException {
		ScalarTypeContext _localctx = new ScalarTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_scalarType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(LPAREN);
			setState(299);
			identifierList();
			setState(300);
			match(RPAREN);
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

	public static class SubrangeTypeContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(VisualgParser.DOTDOT, 0); }
		public SubrangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subrangeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterSubrangeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitSubrangeType(this);
		}
	}

	public final SubrangeTypeContext subrangeType() throws RecognitionException {
		SubrangeTypeContext _localctx = new SubrangeTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_subrangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			constant();
			setState(303);
			match(DOTDOT);
			setState(304);
			constant();
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

	public static class TypeIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(VisualgParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(VisualgParser.BOOLEAN, 0); }
		public TerminalNode INTEGER() { return getToken(VisualgParser.INTEGER, 0); }
		public TerminalNode REAL() { return getToken(VisualgParser.REAL, 0); }
		public TerminalNode STRING() { return getToken(VisualgParser.STRING, 0); }
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitTypeIdentifier(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_typeIdentifier);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				identifier();
				}
				break;
			case BOOLEAN:
			case CHAR:
			case INTEGER:
			case REAL:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << CHAR) | (1L << INTEGER) | (1L << REAL) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class StructuredTypeContext extends ParserRuleContext {
		public UnpackedStructuredTypeContext unpackedStructuredType() {
			return getRuleContext(UnpackedStructuredTypeContext.class,0);
		}
		public StructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitStructuredType(this);
		}
	}

	public final StructuredTypeContext structuredType() throws RecognitionException {
		StructuredTypeContext _localctx = new StructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_structuredType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			unpackedStructuredType();
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

	public static class UnpackedStructuredTypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public RecordTypeContext recordType() {
			return getRuleContext(RecordTypeContext.class,0);
		}
		public UnpackedStructuredTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unpackedStructuredType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterUnpackedStructuredType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitUnpackedStructuredType(this);
		}
	}

	public final UnpackedStructuredTypeContext unpackedStructuredType() throws RecognitionException {
		UnpackedStructuredTypeContext _localctx = new UnpackedStructuredTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unpackedStructuredType);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				arrayType();
				}
				break;
			case RECORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				recordType();
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

	public static class StringtypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VisualgParser.STRING, 0); }
		public TerminalNode LBRACK() { return getToken(VisualgParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(VisualgParser.RBRACK, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public StringtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterStringtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitStringtype(this);
		}
	}

	public final StringtypeContext stringtype() throws RecognitionException {
		StringtypeContext _localctx = new StringtypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_stringtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(STRING);
			setState(317);
			match(LBRACK);
			setState(320);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(318);
				identifier();
				}
				break;
			case NUM_INT:
			case NUM_REAL:
				{
				setState(319);
				unsignedNumber();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(322);
			match(RBRACK);
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

	public static class ArrayTypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(VisualgParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(VisualgParser.LBRACK, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(VisualgParser.RBRACK, 0); }
		public TerminalNode OF() { return getToken(VisualgParser.OF, 0); }
		public ComponentTypeContext componentType() {
			return getRuleContext(ComponentTypeContext.class,0);
		}
		public TerminalNode LBRACK2() { return getToken(VisualgParser.LBRACK2, 0); }
		public TerminalNode RBRACK2() { return getToken(VisualgParser.RBRACK2, 0); }
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_arrayType);
		try {
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(324);
				match(ARRAY);
				setState(325);
				match(LBRACK);
				setState(326);
				typeList();
				setState(327);
				match(RBRACK);
				setState(328);
				match(OF);
				setState(329);
				componentType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				match(ARRAY);
				setState(332);
				match(LBRACK2);
				setState(333);
				typeList();
				setState(334);
				match(RBRACK2);
				setState(335);
				match(OF);
				setState(336);
				componentType();
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

	public static class TypeListContext extends ParserRuleContext {
		public List<IndexTypeContext> indexType() {
			return getRuleContexts(IndexTypeContext.class);
		}
		public IndexTypeContext indexType(int i) {
			return getRuleContext(IndexTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VisualgParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VisualgParser.COMMA, i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			indexType();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(341);
				match(COMMA);
				setState(342);
				indexType();
				}
				}
				setState(347);
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

	public static class IndexTypeContext extends ParserRuleContext {
		public SimpleTypeContext simpleType() {
			return getRuleContext(SimpleTypeContext.class,0);
		}
		public IndexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterIndexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitIndexType(this);
		}
	}

	public final IndexTypeContext indexType() throws RecognitionException {
		IndexTypeContext _localctx = new IndexTypeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_indexType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			simpleType();
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

	public static class ComponentTypeContext extends ParserRuleContext {
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public ComponentTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterComponentType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitComponentType(this);
		}
	}

	public final ComponentTypeContext componentType() throws RecognitionException {
		ComponentTypeContext _localctx = new ComponentTypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_componentType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			type_();
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

	public static class RecordTypeContext extends ParserRuleContext {
		public TerminalNode RECORD() { return getToken(VisualgParser.RECORD, 0); }
		public TerminalNode END() { return getToken(VisualgParser.END, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public RecordTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterRecordType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitRecordType(this);
		}
	}

	public final RecordTypeContext recordType() throws RecognitionException {
		RecordTypeContext _localctx = new RecordTypeContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_recordType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(RECORD);
			setState(354);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CASE || _la==IDENT) {
				{
				setState(353);
				fieldList();
				}
			}

			setState(356);
			match(END);
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

	public static class FieldListContext extends ParserRuleContext {
		public FixedPartContext fixedPart() {
			return getRuleContext(FixedPartContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VisualgParser.SEMI, 0); }
		public VariantPartContext variantPart() {
			return getRuleContext(VariantPartContext.class,0);
		}
		public FieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitFieldList(this);
		}
	}

	public final FieldListContext fieldList() throws RecognitionException {
		FieldListContext _localctx = new FieldListContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_fieldList);
		int _la;
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				fixedPart();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(359);
					match(SEMI);
					setState(360);
					variantPart();
					}
				}

				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				variantPart();
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

	public static class FixedPartContext extends ParserRuleContext {
		public List<RecordSectionContext> recordSection() {
			return getRuleContexts(RecordSectionContext.class);
		}
		public RecordSectionContext recordSection(int i) {
			return getRuleContext(RecordSectionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(VisualgParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VisualgParser.SEMI, i);
		}
		public FixedPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterFixedPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitFixedPart(this);
		}
	}

	public final FixedPartContext fixedPart() throws RecognitionException {
		FixedPartContext _localctx = new FixedPartContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fixedPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			recordSection();
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(367);
					match(SEMI);
					setState(368);
					recordSection();
					}
					} 
				}
				setState(373);
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
			exitRule();
		}
		return _localctx;
	}

	public static class RecordSectionContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VisualgParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public RecordSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterRecordSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitRecordSection(this);
		}
	}

	public final RecordSectionContext recordSection() throws RecognitionException {
		RecordSectionContext _localctx = new RecordSectionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_recordSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			identifierList();
			setState(375);
			match(COLON);
			setState(376);
			type_();
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

	public static class VariantPartContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(VisualgParser.CASE, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public TerminalNode OF() { return getToken(VisualgParser.OF, 0); }
		public List<VariantContext> variant() {
			return getRuleContexts(VariantContext.class);
		}
		public VariantContext variant(int i) {
			return getRuleContext(VariantContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(VisualgParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VisualgParser.SEMI, i);
		}
		public VariantPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variantPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterVariantPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitVariantPart(this);
		}
	}

	public final VariantPartContext variantPart() throws RecognitionException {
		VariantPartContext _localctx = new VariantPartContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variantPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(CASE);
			setState(379);
			tag();
			setState(380);
			match(OF);
			setState(381);
			variant();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(382);
				match(SEMI);
				setState(383);
				variant();
				}
				}
				setState(388);
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

	public static class TagContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VisualgParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitTag(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tag);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				identifier();
				setState(390);
				match(COLON);
				setState(391);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				typeIdentifier();
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

	public static class VariantContext extends ParserRuleContext {
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VisualgParser.COLON, 0); }
		public TerminalNode LPAREN() { return getToken(VisualgParser.LPAREN, 0); }
		public FieldListContext fieldList() {
			return getRuleContext(FieldListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VisualgParser.RPAREN, 0); }
		public VariantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterVariant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitVariant(this);
		}
	}

	public final VariantContext variant() throws RecognitionException {
		VariantContext _localctx = new VariantContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			constList();
			setState(397);
			match(COLON);
			setState(398);
			match(LPAREN);
			setState(399);
			fieldList();
			setState(400);
			match(RPAREN);
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

	public static class VariableDeclarationPartContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(VisualgParser.VAR, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(VisualgParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VisualgParser.SEMI, i);
		}
		public VariableDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterVariableDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitVariableDeclarationPart(this);
		}
	}

	public final VariableDeclarationPartContext variableDeclarationPart() throws RecognitionException {
		VariableDeclarationPartContext _localctx = new VariableDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_variableDeclarationPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(VAR);
			setState(403);
			variableDeclaration();
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(404);
					match(SEMI);
					setState(405);
					variableDeclaration();
					}
					} 
				}
				setState(410);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(411);
			match(SEMI);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VisualgParser.COLON, 0); }
		public Type_Context type_() {
			return getRuleContext(Type_Context.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			identifierList();
			setState(414);
			match(COLON);
			setState(415);
			type_();
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

	public static class ProcedureAndFunctionDeclarationPartContext extends ParserRuleContext {
		public ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() {
			return getRuleContext(ProcedureOrFunctionDeclarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VisualgParser.SEMI, 0); }
		public ProcedureAndFunctionDeclarationPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAndFunctionDeclarationPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterProcedureAndFunctionDeclarationPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitProcedureAndFunctionDeclarationPart(this);
		}
	}

	public final ProcedureAndFunctionDeclarationPartContext procedureAndFunctionDeclarationPart() throws RecognitionException {
		ProcedureAndFunctionDeclarationPartContext _localctx = new ProcedureAndFunctionDeclarationPartContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_procedureAndFunctionDeclarationPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			procedureOrFunctionDeclaration();
			setState(418);
			match(SEMI);
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

	public static class ProcedureOrFunctionDeclarationContext extends ParserRuleContext {
		public ProcedureDeclarationContext procedureDeclaration() {
			return getRuleContext(ProcedureDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ProcedureOrFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureOrFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterProcedureOrFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitProcedureOrFunctionDeclaration(this);
		}
	}

	public final ProcedureOrFunctionDeclarationContext procedureOrFunctionDeclaration() throws RecognitionException {
		ProcedureOrFunctionDeclarationContext _localctx = new ProcedureOrFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_procedureOrFunctionDeclaration);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROCEDURE:
				enterOuterAlt(_localctx, 1);
				{
				setState(420);
				procedureDeclaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				functionDeclaration();
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

	public static class ProcedureDeclarationContext extends ParserRuleContext {
		public TerminalNode PROCEDURE() { return getToken(VisualgParser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VisualgParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public ProcedureDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterProcedureDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitProcedureDeclaration(this);
		}
	}

	public final ProcedureDeclarationContext procedureDeclaration() throws RecognitionException {
		ProcedureDeclarationContext _localctx = new ProcedureDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_procedureDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(PROCEDURE);
			setState(425);
			identifier();
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(426);
				formalParameterList();
				}
			}

			setState(429);
			match(SEMI);
			setState(430);
			block();
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VisualgParser.LPAREN, 0); }
		public List<FormalParameterSectionContext> formalParameterSection() {
			return getRuleContexts(FormalParameterSectionContext.class);
		}
		public FormalParameterSectionContext formalParameterSection(int i) {
			return getRuleContext(FormalParameterSectionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VisualgParser.RPAREN, 0); }
		public List<TerminalNode> SEMI() { return getTokens(VisualgParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VisualgParser.SEMI, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(LPAREN);
			setState(433);
			formalParameterSection();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(434);
				match(SEMI);
				setState(435);
				formalParameterSection();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(RPAREN);
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

	public static class FormalParameterSectionContext extends ParserRuleContext {
		public ParameterGroupContext parameterGroup() {
			return getRuleContext(ParameterGroupContext.class,0);
		}
		public TerminalNode VAR() { return getToken(VisualgParser.VAR, 0); }
		public TerminalNode FUNCTION() { return getToken(VisualgParser.FUNCTION, 0); }
		public TerminalNode PROCEDURE() { return getToken(VisualgParser.PROCEDURE, 0); }
		public FormalParameterSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterFormalParameterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitFormalParameterSection(this);
		}
	}

	public final FormalParameterSectionContext formalParameterSection() throws RecognitionException {
		FormalParameterSectionContext _localctx = new FormalParameterSectionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_formalParameterSection);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(443);
				parameterGroup();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				match(VAR);
				setState(445);
				parameterGroup();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				match(FUNCTION);
				setState(447);
				parameterGroup();
				}
				break;
			case PROCEDURE:
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				match(PROCEDURE);
				setState(449);
				parameterGroup();
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

	public static class ParameterGroupContext extends ParserRuleContext {
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VisualgParser.COLON, 0); }
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ParameterGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterParameterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitParameterGroup(this);
		}
	}

	public final ParameterGroupContext parameterGroup() throws RecognitionException {
		ParameterGroupContext _localctx = new ParameterGroupContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parameterGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			identifierList();
			setState(453);
			match(COLON);
			setState(454);
			typeIdentifier();
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

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VisualgParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VisualgParser.COMMA, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			identifier();
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(457);
				match(COMMA);
				setState(458);
				identifier();
				}
				}
				setState(463);
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

	public static class ConstListContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VisualgParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VisualgParser.COMMA, i);
		}
		public ConstListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterConstList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitConstList(this);
		}
	}

	public final ConstListContext constList() throws RecognitionException {
		ConstListContext _localctx = new ConstListContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_constList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			constant();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(465);
				match(COMMA);
				setState(466);
				constant();
				}
				}
				setState(471);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(VisualgParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VisualgParser.COLON, 0); }
		public ResultTypeContext resultType() {
			return getRuleContext(ResultTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VisualgParser.SEMI, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			match(FUNCTION);
			setState(473);
			identifier();
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(474);
				formalParameterList();
				}
			}

			setState(477);
			match(COLON);
			setState(478);
			resultType();
			setState(479);
			match(SEMI);
			setState(480);
			block();
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

	public static class ResultTypeContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ResultTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resultType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterResultType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitResultType(this);
		}
	}

	public final ResultTypeContext resultType() throws RecognitionException {
		ResultTypeContext _localctx = new ResultTypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_resultType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			typeIdentifier();
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
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VisualgParser.COLON, 0); }
		public UnlabelledStatementContext unlabelledStatement() {
			return getRuleContext(UnlabelledStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_statement);
		try {
			setState(489);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				label();
				setState(485);
				match(COLON);
				setState(486);
				unlabelledStatement();
				}
				break;
			case BEGIN:
			case CASE:
			case ELSE:
			case END:
			case FOR:
			case IF:
			case REPEAT:
			case UNTIL:
			case WHILE:
			case SEMI:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				unlabelledStatement();
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

	public static class UnlabelledStatementContext extends ParserRuleContext {
		public SimpleStatementContext simpleStatement() {
			return getRuleContext(SimpleStatementContext.class,0);
		}
		public StructuredStatementContext structuredStatement() {
			return getRuleContext(StructuredStatementContext.class,0);
		}
		public UnlabelledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlabelledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterUnlabelledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitUnlabelledStatement(this);
		}
	}

	public final UnlabelledStatementContext unlabelledStatement() throws RecognitionException {
		UnlabelledStatementContext _localctx = new UnlabelledStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_unlabelledStatement);
		try {
			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELSE:
			case END:
			case UNTIL:
			case SEMI:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				simpleStatement();
				}
				break;
			case BEGIN:
			case CASE:
			case FOR:
			case IF:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				structuredStatement();
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

	public static class SimpleStatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public ProcedureStatementContext procedureStatement() {
			return getRuleContext(ProcedureStatementContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public SimpleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterSimpleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitSimpleStatement(this);
		}
	}

	public final SimpleStatementContext simpleStatement() throws RecognitionException {
		SimpleStatementContext _localctx = new SimpleStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_simpleStatement);
		try {
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(496);
				procedureStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(497);
				emptyStatement();
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(VisualgParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			variable();
			setState(501);
			match(ASSIGN);
			setState(502);
			expression();
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

	public static class VariableContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(VisualgParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(VisualgParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(VisualgParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(VisualgParser.RBRACK, i);
		}
		public List<TerminalNode> LBRACK2() { return getTokens(VisualgParser.LBRACK2); }
		public TerminalNode LBRACK2(int i) {
			return getToken(VisualgParser.LBRACK2, i);
		}
		public List<TerminalNode> RBRACK2() { return getTokens(VisualgParser.RBRACK2); }
		public TerminalNode RBRACK2(int i) {
			return getToken(VisualgParser.RBRACK2, i);
		}
		public List<TerminalNode> DOT() { return getTokens(VisualgParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(VisualgParser.DOT, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VisualgParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VisualgParser.COMMA, i);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(504);
			identifier();
			}
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << LBRACK2) | (1L << DOT))) != 0)) {
				{
				setState(529);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(505);
					match(LBRACK);
					setState(506);
					expression();
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(507);
						match(COMMA);
						setState(508);
						expression();
						}
						}
						setState(513);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(514);
					match(RBRACK);
					}
					break;
				case LBRACK2:
					{
					setState(516);
					match(LBRACK2);
					setState(517);
					expression();
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(518);
						match(COMMA);
						setState(519);
						expression();
						}
						}
						setState(524);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(525);
					match(RBRACK2);
					}
					break;
				case DOT:
					{
					setState(527);
					match(DOT);
					setState(528);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(533);
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

	public static class ExpressionContext extends ParserRuleContext {
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public RelationaloperatorContext relationaloperator() {
			return getRuleContext(RelationaloperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			simpleExpression();
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) {
				{
				setState(535);
				relationaloperator();
				setState(536);
				expression();
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

	public static class RelationaloperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(VisualgParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(VisualgParser.NOT_EQUAL, 0); }
		public TerminalNode LT() { return getToken(VisualgParser.LT, 0); }
		public TerminalNode LE() { return getToken(VisualgParser.LE, 0); }
		public TerminalNode GE() { return getToken(VisualgParser.GE, 0); }
		public TerminalNode GT() { return getToken(VisualgParser.GT, 0); }
		public TerminalNode IN() { return getToken(VisualgParser.IN, 0); }
		public RelationaloperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationaloperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterRelationaloperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitRelationaloperator(this);
		}
	}

	public final RelationaloperatorContext relationaloperator() throws RecognitionException {
		RelationaloperatorContext _localctx = new RelationaloperatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_relationaloperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << EQUAL) | (1L << NOT_EQUAL) | (1L << LT) | (1L << LE) | (1L << GE) | (1L << GT))) != 0)) ) {
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AdditiveoperatorContext additiveoperator() {
			return getRuleContext(AdditiveoperatorContext.class,0);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitSimpleExpression(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			term();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) {
				{
				setState(543);
				additiveoperator();
				setState(544);
				simpleExpression();
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

	public static class AdditiveoperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(VisualgParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VisualgParser.MINUS, 0); }
		public TerminalNode OR() { return getToken(VisualgParser.OR, 0); }
		public AdditiveoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterAdditiveoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitAdditiveoperator(this);
		}
	}

	public final AdditiveoperatorContext additiveoperator() throws RecognitionException {
		AdditiveoperatorContext _localctx = new AdditiveoperatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_additiveoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OR) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
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

	public static class TermContext extends ParserRuleContext {
		public SignedFactorContext signedFactor() {
			return getRuleContext(SignedFactorContext.class,0);
		}
		public MultiplicativeoperatorContext multiplicativeoperator() {
			return getRuleContext(MultiplicativeoperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			signedFactor();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << STAR) | (1L << SLASH))) != 0)) {
				{
				setState(551);
				multiplicativeoperator();
				setState(552);
				term();
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

	public static class MultiplicativeoperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(VisualgParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(VisualgParser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(VisualgParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(VisualgParser.MOD, 0); }
		public TerminalNode AND() { return getToken(VisualgParser.AND, 0); }
		public MultiplicativeoperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeoperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterMultiplicativeoperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitMultiplicativeoperator(this);
		}
	}

	public final MultiplicativeoperatorContext multiplicativeoperator() throws RecognitionException {
		MultiplicativeoperatorContext _localctx = new MultiplicativeoperatorContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_multiplicativeoperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << DIV) | (1L << MOD) | (1L << STAR) | (1L << SLASH))) != 0)) ) {
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

	public static class SignedFactorContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(VisualgParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VisualgParser.MINUS, 0); }
		public SignedFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signedFactor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterSignedFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitSignedFactor(this);
		}
	}

	public final SignedFactorContext signedFactor() throws RecognitionException {
		SignedFactorContext _localctx = new SignedFactorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_signedFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(558);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(561);
			factor();
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

	public static class FactorContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VisualgParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VisualgParser.RPAREN, 0); }
		public FunctionDesignatorContext functionDesignator() {
			return getRuleContext(FunctionDesignatorContext.class,0);
		}
		public UnsignedConstantContext unsignedConstant() {
			return getRuleContext(UnsignedConstantContext.class,0);
		}
		public Set_Context set_() {
			return getRuleContext(Set_Context.class,0);
		}
		public TerminalNode NOT() { return getToken(VisualgParser.NOT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Bool_Context bool_() {
			return getRuleContext(Bool_Context.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_factor);
		try {
			setState(574);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(564);
				match(LPAREN);
				setState(565);
				expression();
				setState(566);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(568);
				functionDesignator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(569);
				unsignedConstant();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(570);
				set_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(571);
				match(NOT);
				setState(572);
				factor();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(573);
				bool_();
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

	public static class UnsignedConstantContext extends ParserRuleContext {
		public UnsignedNumberContext unsignedNumber() {
			return getRuleContext(UnsignedNumberContext.class,0);
		}
		public ConstantChrContext constantChr() {
			return getRuleContext(ConstantChrContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode NIL() { return getToken(VisualgParser.NIL, 0); }
		public UnsignedConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsignedConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterUnsignedConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitUnsignedConstant(this);
		}
	}

	public final UnsignedConstantContext unsignedConstant() throws RecognitionException {
		UnsignedConstantContext _localctx = new UnsignedConstantContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_unsignedConstant);
		try {
			setState(580);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				unsignedNumber();
				}
				break;
			case CHR:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				constantChr();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(578);
				string();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(579);
				match(NIL);
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

	public static class FunctionDesignatorContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VisualgParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VisualgParser.RPAREN, 0); }
		public FunctionDesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDesignator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterFunctionDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitFunctionDesignator(this);
		}
	}

	public final FunctionDesignatorContext functionDesignator() throws RecognitionException {
		FunctionDesignatorContext _localctx = new FunctionDesignatorContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_functionDesignator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			identifier();
			setState(583);
			match(LPAREN);
			setState(584);
			parameterList();
			setState(585);
			match(RPAREN);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ActualParameterContext> actualParameter() {
			return getRuleContexts(ActualParameterContext.class);
		}
		public ActualParameterContext actualParameter(int i) {
			return getRuleContext(ActualParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VisualgParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VisualgParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			actualParameter();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(588);
				match(COMMA);
				setState(589);
				actualParameter();
				}
				}
				setState(594);
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

	public static class Set_Context extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(VisualgParser.LBRACK, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(VisualgParser.RBRACK, 0); }
		public TerminalNode LBRACK2() { return getToken(VisualgParser.LBRACK2, 0); }
		public TerminalNode RBRACK2() { return getToken(VisualgParser.RBRACK2, 0); }
		public Set_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterSet_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitSet_(this);
		}
	}

	public final Set_Context set_() throws RecognitionException {
		Set_Context _localctx = new Set_Context(_ctx, getState());
		enterRule(_localctx, 134, RULE_set_);
		try {
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(595);
				match(LBRACK);
				setState(596);
				elementList();
				setState(597);
				match(RBRACK);
				}
				break;
			case LBRACK2:
				enterOuterAlt(_localctx, 2);
				{
				setState(599);
				match(LBRACK2);
				setState(600);
				elementList();
				setState(601);
				match(RBRACK2);
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

	public static class ElementListContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VisualgParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VisualgParser.COMMA, i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitElementList(this);
		}
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_elementList);
		int _la;
		try {
			setState(614);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHR:
			case NIL:
			case NOT:
			case PLUS:
			case MINUS:
			case LPAREN:
			case LBRACK:
			case LBRACK2:
			case TRUE:
			case FALSE:
			case IDENT:
			case STRING_LITERAL:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(605);
				element();
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(606);
					match(COMMA);
					setState(607);
					element();
					}
					}
					setState(612);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RBRACK:
			case RBRACK2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ElementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DOTDOT() { return getToken(VisualgParser.DOTDOT, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			expression();
			setState(619);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOTDOT) {
				{
				setState(617);
				match(DOTDOT);
				setState(618);
				expression();
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

	public static class ProcedureStatementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VisualgParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VisualgParser.RPAREN, 0); }
		public ProcedureStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterProcedureStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitProcedureStatement(this);
		}
	}

	public final ProcedureStatementContext procedureStatement() throws RecognitionException {
		ProcedureStatementContext _localctx = new ProcedureStatementContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_procedureStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			identifier();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(622);
				match(LPAREN);
				setState(623);
				parameterList();
				setState(624);
				match(RPAREN);
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

	public static class ActualParameterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<ParameterwidthContext> parameterwidth() {
			return getRuleContexts(ParameterwidthContext.class);
		}
		public ParameterwidthContext parameterwidth(int i) {
			return getRuleContext(ParameterwidthContext.class,i);
		}
		public ActualParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterActualParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitActualParameter(this);
		}
	}

	public final ActualParameterContext actualParameter() throws RecognitionException {
		ActualParameterContext _localctx = new ActualParameterContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_actualParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			expression();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(629);
				parameterwidth();
				}
				}
				setState(634);
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

	public static class ParameterwidthContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(VisualgParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterwidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterwidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterParameterwidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitParameterwidth(this);
		}
	}

	public final ParameterwidthContext parameterwidth() throws RecognitionException {
		ParameterwidthContext _localctx = new ParameterwidthContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_parameterwidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(COLON);
			setState(636);
			expression();
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class Empty_Context extends ParserRuleContext {
		public Empty_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterEmpty_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitEmpty_(this);
		}
	}

	public final Empty_Context empty_() throws RecognitionException {
		Empty_Context _localctx = new Empty_Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_empty_);
		try {
			enterOuterAlt(_localctx, 1);
			{
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

	public static class StructuredStatementContext extends ParserRuleContext {
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public RepetetiveStatementContext repetetiveStatement() {
			return getRuleContext(RepetetiveStatementContext.class,0);
		}
		public StructuredStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structuredStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterStructuredStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitStructuredStatement(this);
		}
	}

	public final StructuredStatementContext structuredStatement() throws RecognitionException {
		StructuredStatementContext _localctx = new StructuredStatementContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_structuredStatement);
		try {
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				compoundStatement();
				}
				break;
			case CASE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				conditionalStatement();
				}
				break;
			case FOR:
			case REPEAT:
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
				repetetiveStatement();
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

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(VisualgParser.BEGIN, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(VisualgParser.END, 0); }
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitCompoundStatement(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_compoundStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(BEGIN);
			setState(648);
			statements();
			setState(649);
			match(END);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(VisualgParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VisualgParser.SEMI, i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			statement();
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(652);
				match(SEMI);
				setState(653);
				statement();
				}
				}
				setState(658);
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

	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitConditionalStatement(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_conditionalStatement);
		try {
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(659);
				ifStatement();
				}
				break;
			case CASE:
				enterOuterAlt(_localctx, 2);
				{
				setState(660);
				caseStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VisualgParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(VisualgParser.THEN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(VisualgParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			match(IF);
			setState(664);
			expression();
			setState(665);
			match(THEN);
			setState(666);
			statement();
			setState(669);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(667);
				match(ELSE);
				setState(668);
				statement();
				}
				break;
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

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(VisualgParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode OF() { return getToken(VisualgParser.OF, 0); }
		public List<CaseListElementContext> caseListElement() {
			return getRuleContexts(CaseListElementContext.class);
		}
		public CaseListElementContext caseListElement(int i) {
			return getRuleContext(CaseListElementContext.class,i);
		}
		public TerminalNode END() { return getToken(VisualgParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(VisualgParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VisualgParser.SEMI, i);
		}
		public TerminalNode ELSE() { return getToken(VisualgParser.ELSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitCaseStatement(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_caseStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(CASE);
			setState(672);
			expression();
			setState(673);
			match(OF);
			setState(674);
			caseListElement();
			setState(679);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(675);
					match(SEMI);
					setState(676);
					caseListElement();
					}
					} 
				}
				setState(681);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(685);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(682);
				match(SEMI);
				setState(683);
				match(ELSE);
				setState(684);
				statements();
				}
			}

			setState(687);
			match(END);
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

	public static class CaseListElementContext extends ParserRuleContext {
		public ConstListContext constList() {
			return getRuleContext(ConstListContext.class,0);
		}
		public TerminalNode COLON() { return getToken(VisualgParser.COLON, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public CaseListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterCaseListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitCaseListElement(this);
		}
	}

	public final CaseListElementContext caseListElement() throws RecognitionException {
		CaseListElementContext _localctx = new CaseListElementContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_caseListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			constList();
			setState(690);
			match(COLON);
			setState(691);
			statement();
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

	public static class RepetetiveStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatStatementContext repeatStatement() {
			return getRuleContext(RepeatStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public RepetetiveStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repetetiveStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterRepetetiveStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitRepetetiveStatement(this);
		}
	}

	public final RepetetiveStatementContext repetetiveStatement() throws RecognitionException {
		RepetetiveStatementContext _localctx = new RepetetiveStatementContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_repetetiveStatement);
		try {
			setState(696);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(693);
				whileStatement();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				repeatStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				forStatement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(VisualgParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DO() { return getToken(VisualgParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			match(WHILE);
			setState(699);
			expression();
			setState(700);
			match(DO);
			setState(701);
			statement();
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

	public static class RepeatStatementContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(VisualgParser.REPEAT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(VisualgParser.UNTIL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RepeatStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterRepeatStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitRepeatStatement(this);
		}
	}

	public final RepeatStatementContext repeatStatement() throws RecognitionException {
		RepeatStatementContext _localctx = new RepeatStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_repeatStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(703);
			match(REPEAT);
			setState(704);
			statements();
			setState(705);
			match(UNTIL);
			setState(706);
			expression();
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VisualgParser.FOR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(VisualgParser.ASSIGN, 0); }
		public ForListContext forList() {
			return getRuleContext(ForListContext.class,0);
		}
		public TerminalNode DO() { return getToken(VisualgParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitForStatement(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			match(FOR);
			setState(709);
			identifier();
			setState(710);
			match(ASSIGN);
			setState(711);
			forList();
			setState(712);
			match(DO);
			setState(713);
			statement();
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

	public static class ForListContext extends ParserRuleContext {
		public InitialValueContext initialValue() {
			return getRuleContext(InitialValueContext.class,0);
		}
		public FinalValueContext finalValue() {
			return getRuleContext(FinalValueContext.class,0);
		}
		public TerminalNode TO() { return getToken(VisualgParser.TO, 0); }
		public ForListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterForList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitForList(this);
		}
	}

	public final ForListContext forList() throws RecognitionException {
		ForListContext _localctx = new ForListContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_forList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			initialValue();
			{
			setState(716);
			match(TO);
			}
			setState(717);
			finalValue();
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

	public static class InitialValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitialValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterInitialValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitInitialValue(this);
		}
	}

	public final InitialValueContext initialValue() throws RecognitionException {
		InitialValueContext _localctx = new InitialValueContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_initialValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			expression();
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

	public static class FinalValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterFinalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitFinalValue(this);
		}
	}

	public final FinalValueContext finalValue() throws RecognitionException {
		FinalValueContext _localctx = new FinalValueContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_finalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			expression();
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

	public static class RecordVariableListContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VisualgParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VisualgParser.COMMA, i);
		}
		public RecordVariableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordVariableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).enterRecordVariableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VisualgListener ) ((VisualgListener)listener).exitRecordVariableList(this);
		}
	}

	public final RecordVariableListContext recordVariableList() throws RecognitionException {
		RecordVariableListContext _localctx = new RecordVariableListContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_recordVariableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			variable();
			setState(728);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(724);
				match(COMMA);
				setState(725);
				variable();
				}
				}
				setState(730);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3C\u02de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\7\2\u00b8\n\2\f\2\16\2"+
		"\u00bb\13\2\3\2\3\2\3\3\5\3\u00c0\n\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u00cb\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\7\6\u00d5\n\6\f\6\16"+
		"\6\u00d8\13\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\6\b\u00e2\n\b\r\b\16\b\u00e3"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00f9\n\13\3\f\3\f\5\f\u00fd\n\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\6\22\u010d\n\22\r\22"+
		"\16\22\u010e\3\23\3\23\3\23\3\23\3\23\5\23\u0116\n\23\3\24\3\24\5\24\u011a"+
		"\n\24\3\24\3\24\3\24\3\25\3\25\5\25\u0121\n\25\3\26\3\26\5\26\u0125\n"+
		"\26\3\27\3\27\3\27\3\27\5\27\u012b\n\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\5\32\u0137\n\32\3\33\3\33\3\34\3\34\5\34\u013d\n"+
		"\34\3\35\3\35\3\35\3\35\5\35\u0143\n\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0155\n\36\3\37"+
		"\3\37\3\37\7\37\u015a\n\37\f\37\16\37\u015d\13\37\3 \3 \3!\3!\3\"\3\""+
		"\5\"\u0165\n\"\3\"\3\"\3#\3#\3#\5#\u016c\n#\3#\5#\u016f\n#\3$\3$\3$\7"+
		"$\u0174\n$\f$\16$\u0177\13$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\7&\u0183\n&"+
		"\f&\16&\u0186\13&\3\'\3\'\3\'\3\'\3\'\5\'\u018d\n\'\3(\3(\3(\3(\3(\3("+
		"\3)\3)\3)\3)\7)\u0199\n)\f)\16)\u019c\13)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3"+
		",\3,\5,\u01a9\n,\3-\3-\3-\5-\u01ae\n-\3-\3-\3-\3.\3.\3.\3.\7.\u01b7\n"+
		".\f.\16.\u01ba\13.\3.\3.\3/\3/\3/\3/\3/\3/\3/\5/\u01c5\n/\3\60\3\60\3"+
		"\60\3\60\3\61\3\61\3\61\7\61\u01ce\n\61\f\61\16\61\u01d1\13\61\3\62\3"+
		"\62\3\62\7\62\u01d6\n\62\f\62\16\62\u01d9\13\62\3\63\3\63\3\63\5\63\u01de"+
		"\n\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\65\3\65\5\65"+
		"\u01ec\n\65\3\66\3\66\5\66\u01f0\n\66\3\67\3\67\3\67\5\67\u01f5\n\67\3"+
		"8\38\38\38\39\39\39\39\39\79\u0200\n9\f9\169\u0203\139\39\39\39\39\39"+
		"\39\79\u020b\n9\f9\169\u020e\139\39\39\39\39\79\u0214\n9\f9\169\u0217"+
		"\139\3:\3:\3:\3:\5:\u021d\n:\3;\3;\3<\3<\3<\3<\5<\u0225\n<\3=\3=\3>\3"+
		">\3>\3>\5>\u022d\n>\3?\3?\3@\5@\u0232\n@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\3A\5A\u0241\nA\3B\3B\3B\3B\5B\u0247\nB\3C\3C\3C\3C\3C\3D\3D\3"+
		"D\7D\u0251\nD\fD\16D\u0254\13D\3E\3E\3E\3E\3E\3E\3E\3E\5E\u025e\nE\3F"+
		"\3F\3F\7F\u0263\nF\fF\16F\u0266\13F\3F\5F\u0269\nF\3G\3G\3G\5G\u026e\n"+
		"G\3H\3H\3H\3H\3H\5H\u0275\nH\3I\3I\7I\u0279\nI\fI\16I\u027c\13I\3J\3J"+
		"\3J\3K\3K\3L\3L\3M\3M\3M\5M\u0288\nM\3N\3N\3N\3N\3O\3O\3O\7O\u0291\nO"+
		"\fO\16O\u0294\13O\3P\3P\5P\u0298\nP\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u02a0\nQ\3R\3"+
		"R\3R\3R\3R\3R\7R\u02a8\nR\fR\16R\u02ab\13R\3R\3R\3R\5R\u02b0\nR\3R\3R"+
		"\3S\3S\3S\3S\3T\3T\3T\5T\u02bb\nT\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3W\3W"+
		"\3W\3W\3W\3W\3W\3X\3X\3X\3X\3Y\3Y\3Z\3Z\3[\3[\3[\7[\u02d9\n[\f[\16[\u02dc"+
		"\13[\3[\2\2\\\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\2\b\3\2$"+
		"%\3\2;<\7\2\6\6\t\t\23\23\33\33::\4\2\22\22,\61\4\2\30\30$%\6\2\3\3\13"+
		"\13\24\24&\'\2\u02d6\2\u00b9\3\2\2\2\4\u00bf\3\2\2\2\6\u00c4\3\2\2\2\b"+
		"\u00ce\3\2\2\2\n\u00d6\3\2\2\2\f\u00db\3\2\2\2\16\u00dd\3\2\2\2\20\u00e5"+
		"\3\2\2\2\22\u00e9\3\2\2\2\24\u00f8\3\2\2\2\26\u00fc\3\2\2\2\30\u00fe\3"+
		"\2\2\2\32\u0100\3\2\2\2\34\u0102\3\2\2\2\36\u0104\3\2\2\2 \u0106\3\2\2"+
		"\2\"\u0108\3\2\2\2$\u0110\3\2\2\2&\u0117\3\2\2\2(\u011e\3\2\2\2*\u0124"+
		"\3\2\2\2,\u012a\3\2\2\2.\u012c\3\2\2\2\60\u0130\3\2\2\2\62\u0136\3\2\2"+
		"\2\64\u0138\3\2\2\2\66\u013c\3\2\2\28\u013e\3\2\2\2:\u0154\3\2\2\2<\u0156"+
		"\3\2\2\2>\u015e\3\2\2\2@\u0160\3\2\2\2B\u0162\3\2\2\2D\u016e\3\2\2\2F"+
		"\u0170\3\2\2\2H\u0178\3\2\2\2J\u017c\3\2\2\2L\u018c\3\2\2\2N\u018e\3\2"+
		"\2\2P\u0194\3\2\2\2R\u019f\3\2\2\2T\u01a3\3\2\2\2V\u01a8\3\2\2\2X\u01aa"+
		"\3\2\2\2Z\u01b2\3\2\2\2\\\u01c4\3\2\2\2^\u01c6\3\2\2\2`\u01ca\3\2\2\2"+
		"b\u01d2\3\2\2\2d\u01da\3\2\2\2f\u01e4\3\2\2\2h\u01eb\3\2\2\2j\u01ef\3"+
		"\2\2\2l\u01f4\3\2\2\2n\u01f6\3\2\2\2p\u01fa\3\2\2\2r\u0218\3\2\2\2t\u021e"+
		"\3\2\2\2v\u0220\3\2\2\2x\u0226\3\2\2\2z\u0228\3\2\2\2|\u022e\3\2\2\2~"+
		"\u0231\3\2\2\2\u0080\u0240\3\2\2\2\u0082\u0246\3\2\2\2\u0084\u0248\3\2"+
		"\2\2\u0086\u024d\3\2\2\2\u0088\u025d\3\2\2\2\u008a\u0268\3\2\2\2\u008c"+
		"\u026a\3\2\2\2\u008e\u026f\3\2\2\2\u0090\u0276\3\2\2\2\u0092\u027d\3\2"+
		"\2\2\u0094\u0280\3\2\2\2\u0096\u0282\3\2\2\2\u0098\u0287\3\2\2\2\u009a"+
		"\u0289\3\2\2\2\u009c\u028d\3\2\2\2\u009e\u0297\3\2\2\2\u00a0\u0299\3\2"+
		"\2\2\u00a2\u02a1\3\2\2\2\u00a4\u02b3\3\2\2\2\u00a6\u02ba\3\2\2\2\u00a8"+
		"\u02bc\3\2\2\2\u00aa\u02c1\3\2\2\2\u00ac\u02c6\3\2\2\2\u00ae\u02cd\3\2"+
		"\2\2\u00b0\u02d1\3\2\2\2\u00b2\u02d3\3\2\2\2\u00b4\u02d5\3\2\2\2\u00b6"+
		"\u00b8\5\4\3\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\u00bd\7\2\2\3\u00bd\3\3\2\2\2\u00be\u00c0\5\6\4\2\u00bf\u00be\3\2\2\2"+
		"\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\5\n\6\2\u00c2\u00c3"+
		"\78\2\2\u00c3\5\3\2\2\2\u00c4\u00c5\7\32\2\2\u00c5\u00ca\5\b\5\2\u00c6"+
		"\u00c7\7\62\2\2\u00c7\u00c8\5`\61\2\u00c8\u00c9\7\63\2\2\u00c9\u00cb\3"+
		"\2\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\7)\2\2\u00cd\7\3\2\2\2\u00ce\u00cf\7@\2\2\u00cf\t\3\2\2\2\u00d0"+
		"\u00d5\5\16\b\2\u00d1\u00d5\5\"\22\2\u00d2\u00d5\5P)\2\u00d3\u00d5\5T"+
		"+\2\u00d4\u00d0\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2"+
		"\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\5\u009aN\2\u00da"+
		"\13\3\2\2\2\u00db\u00dc\5\30\r\2\u00dc\r\3\2\2\2\u00dd\u00e1\7\n\2\2\u00de"+
		"\u00df\5\20\t\2\u00df\u00e0\7)\2\2\u00e0\u00e2\3\2\2\2\u00e1\u00de\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\17\3\2\2\2\u00e5\u00e6\5\b\5\2\u00e6\u00e7\7,\2\2\u00e7\u00e8\5\24\13"+
		"\2\u00e8\21\3\2\2\2\u00e9\u00ea\7\b\2\2\u00ea\u00eb\7\62\2\2\u00eb\u00ec"+
		"\5\30\r\2\u00ec\u00ed\7\63\2\2\u00ed\23\3\2\2\2\u00ee\u00f9\5\26\f\2\u00ef"+
		"\u00f0\5\34\17\2\u00f0\u00f1\5\26\f\2\u00f1\u00f9\3\2\2\2\u00f2\u00f9"+
		"\5\b\5\2\u00f3\u00f4\5\34\17\2\u00f4\u00f5\5\b\5\2\u00f5\u00f9\3\2\2\2"+
		"\u00f6\u00f9\5 \21\2\u00f7\u00f9\5\22\n\2\u00f8\u00ee\3\2\2\2\u00f8\u00ef"+
		"\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8"+
		"\u00f7\3\2\2\2\u00f9\25\3\2\2\2\u00fa\u00fd\5\30\r\2\u00fb\u00fd\5\32"+
		"\16\2\u00fc\u00fa\3\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\27\3\2\2\2\u00fe\u00ff"+
		"\7B\2\2\u00ff\31\3\2\2\2\u0100\u0101\7C\2\2\u0101\33\3\2\2\2\u0102\u0103"+
		"\t\2\2\2\u0103\35\3\2\2\2\u0104\u0105\t\3\2\2\u0105\37\3\2\2\2\u0106\u0107"+
		"\7A\2\2\u0107!\3\2\2\2\u0108\u010c\7 \2\2\u0109\u010a\5$\23\2\u010a\u010b"+
		"\7)\2\2\u010b\u010d\3\2\2\2\u010c\u0109\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f#\3\2\2\2\u0110\u0111\5\b\5\2"+
		"\u0111\u0115\7,\2\2\u0112\u0116\5*\26\2\u0113\u0116\5&\24\2\u0114\u0116"+
		"\5(\25\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"%\3\2\2\2\u0117\u0119\7\20\2\2\u0118\u011a\5Z.\2\u0119\u0118\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7+\2\2\u011c\u011d\5f\64"+
		"\2\u011d\'\3\2\2\2\u011e\u0120\7\31\2\2\u011f\u0121\5Z.\2\u0120\u011f"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121)\3\2\2\2\u0122\u0125\5,\27\2\u0123"+
		"\u0125\5\64\33\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125+\3\2\2"+
		"\2\u0126\u012b\5.\30\2\u0127\u012b\5\60\31\2\u0128\u012b\5\62\32\2\u0129"+
		"\u012b\58\35\2\u012a\u0126\3\2\2\2\u012a\u0127\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012a\u0129\3\2\2\2\u012b-\3\2\2\2\u012c\u012d\7\62\2\2\u012d\u012e"+
		"\5`\61\2\u012e\u012f\7\63\2\2\u012f/\3\2\2\2\u0130\u0131\5\24\13\2\u0131"+
		"\u0132\79\2\2\u0132\u0133\5\24\13\2\u0133\61\3\2\2\2\u0134\u0137\5\b\5"+
		"\2\u0135\u0137\t\4\2\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2\u0137\63"+
		"\3\2\2\2\u0138\u0139\5\66\34\2\u0139\65\3\2\2\2\u013a\u013d\5:\36\2\u013b"+
		"\u013d\5B\"\2\u013c\u013a\3\2\2\2\u013c\u013b\3\2\2\2\u013d\67\3\2\2\2"+
		"\u013e\u013f\7:\2\2\u013f\u0142\7\64\2\2\u0140\u0143\5\b\5\2\u0141\u0143"+
		"\5\26\f\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2"+
		"\u0144\u0145\7\66\2\2\u01459\3\2\2\2\u0146\u0147\7\4\2\2\u0147\u0148\7"+
		"\64\2\2\u0148\u0149\5<\37\2\u0149\u014a\7\66\2\2\u014a\u014b\7\27\2\2"+
		"\u014b\u014c\5@!\2\u014c\u0155\3\2\2\2\u014d\u014e\7\4\2\2\u014e\u014f"+
		"\7\65\2\2\u014f\u0150\5<\37\2\u0150\u0151\7\67\2\2\u0151\u0152\7\27\2"+
		"\2\u0152\u0153\5@!\2\u0153\u0155\3\2\2\2\u0154\u0146\3\2\2\2\u0154\u014d"+
		"\3\2\2\2\u0155;\3\2\2\2\u0156\u015b\5> \2\u0157\u0158\7*\2\2\u0158\u015a"+
		"\5> \2\u0159\u0157\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b"+
		"\u015c\3\2\2\2\u015c=\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\5,\27\2"+
		"\u015f?\3\2\2\2\u0160\u0161\5*\26\2\u0161A\3\2\2\2\u0162\u0164\7\34\2"+
		"\2\u0163\u0165\5D#\2\u0164\u0163\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u0167\7\16\2\2\u0167C\3\2\2\2\u0168\u016b\5F$\2\u0169\u016a"+
		"\7)\2\2\u016a\u016c\5J&\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u016f\3\2\2\2\u016d\u016f\5J&\2\u016e\u0168\3\2\2\2\u016e\u016d\3\2\2"+
		"\2\u016fE\3\2\2\2\u0170\u0175\5H%\2\u0171\u0172\7)\2\2\u0172\u0174\5H"+
		"%\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175"+
		"\u0176\3\2\2\2\u0176G\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\5`\61\2"+
		"\u0179\u017a\7+\2\2\u017a\u017b\5*\26\2\u017bI\3\2\2\2\u017c\u017d\7\7"+
		"\2\2\u017d\u017e\5L\'\2\u017e\u017f\7\27\2\2\u017f\u0184\5N(\2\u0180\u0181"+
		"\7)\2\2\u0181\u0183\5N(\2\u0182\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184"+
		"\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185K\3\2\2\2\u0186\u0184\3\2\2\2"+
		"\u0187\u0188\5\b\5\2\u0188\u0189\7+\2\2\u0189\u018a\5\62\32\2\u018a\u018d"+
		"\3\2\2\2\u018b\u018d\5\62\32\2\u018c\u0187\3\2\2\2\u018c\u018b\3\2\2\2"+
		"\u018dM\3\2\2\2\u018e\u018f\5b\62\2\u018f\u0190\7+\2\2\u0190\u0191\7\62"+
		"\2\2\u0191\u0192\5D#\2\u0192\u0193\7\63\2\2\u0193O\3\2\2\2\u0194\u0195"+
		"\7\"\2\2\u0195\u019a\5R*\2\u0196\u0197\7)\2\2\u0197\u0199\5R*\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7)\2\2\u019e"+
		"Q\3\2\2\2\u019f\u01a0\5`\61\2\u01a0\u01a1\7+\2\2\u01a1\u01a2\5*\26\2\u01a2"+
		"S\3\2\2\2\u01a3\u01a4\5V,\2\u01a4\u01a5\7)\2\2\u01a5U\3\2\2\2\u01a6\u01a9"+
		"\5X-\2\u01a7\u01a9\5d\63\2\u01a8\u01a6\3\2\2\2\u01a8\u01a7\3\2\2\2\u01a9"+
		"W\3\2\2\2\u01aa\u01ab\7\31\2\2\u01ab\u01ad\5\b\5\2\u01ac\u01ae\5Z.\2\u01ad"+
		"\u01ac\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\7)"+
		"\2\2\u01b0\u01b1\5\n\6\2\u01b1Y\3\2\2\2\u01b2\u01b3\7\62\2\2\u01b3\u01b8"+
		"\5\\/\2\u01b4\u01b5\7)\2\2\u01b5\u01b7\5\\/\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"\u01ba\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\3\2"+
		"\2\2\u01ba\u01b8\3\2\2\2\u01bb\u01bc\7\63\2\2\u01bc[\3\2\2\2\u01bd\u01c5"+
		"\5^\60\2\u01be\u01bf\7\"\2\2\u01bf\u01c5\5^\60\2\u01c0\u01c1\7\20\2\2"+
		"\u01c1\u01c5\5^\60\2\u01c2\u01c3\7\31\2\2\u01c3\u01c5\5^\60\2\u01c4\u01bd"+
		"\3\2\2\2\u01c4\u01be\3\2\2\2\u01c4\u01c0\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5"+
		"]\3\2\2\2\u01c6\u01c7\5`\61\2\u01c7\u01c8\7+\2\2\u01c8\u01c9\5\62\32\2"+
		"\u01c9_\3\2\2\2\u01ca\u01cf\5\b\5\2\u01cb\u01cc\7*\2\2\u01cc\u01ce\5\b"+
		"\5\2\u01cd\u01cb\3\2\2\2\u01ce\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf"+
		"\u01d0\3\2\2\2\u01d0a\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d7\5\24\13"+
		"\2\u01d3\u01d4\7*\2\2\u01d4\u01d6\5\24\13\2\u01d5\u01d3\3\2\2\2\u01d6"+
		"\u01d9\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8c\3\2\2\2"+
		"\u01d9\u01d7\3\2\2\2\u01da\u01db\7\20\2\2\u01db\u01dd\5\b\5\2\u01dc\u01de"+
		"\5Z.\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e0\7+\2\2\u01e0\u01e1\5f\64\2\u01e1\u01e2\7)\2\2\u01e2\u01e3\5\n\6"+
		"\2\u01e3e\3\2\2\2\u01e4\u01e5\5\62\32\2\u01e5g\3\2\2\2\u01e6\u01e7\5\f"+
		"\7\2\u01e7\u01e8\7+\2\2\u01e8\u01e9\5j\66\2\u01e9\u01ec\3\2\2\2\u01ea"+
		"\u01ec\5j\66\2\u01eb\u01e6\3\2\2\2\u01eb\u01ea\3\2\2\2\u01eci\3\2\2\2"+
		"\u01ed\u01f0\5l\67\2\u01ee\u01f0\5\u0098M\2\u01ef\u01ed\3\2\2\2\u01ef"+
		"\u01ee\3\2\2\2\u01f0k\3\2\2\2\u01f1\u01f5\5n8\2\u01f2\u01f5\5\u008eH\2"+
		"\u01f3\u01f5\5\u0094K\2\u01f4\u01f1\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4"+
		"\u01f3\3\2\2\2\u01f5m\3\2\2\2\u01f6\u01f7\5p9\2\u01f7\u01f8\7(\2\2\u01f8"+
		"\u01f9\5r:\2\u01f9o\3\2\2\2\u01fa\u0215\5\b\5\2\u01fb\u01fc\7\64\2\2\u01fc"+
		"\u0201\5r:\2\u01fd\u01fe\7*\2\2\u01fe\u0200\5r:\2\u01ff\u01fd\3\2\2\2"+
		"\u0200\u0203\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204"+
		"\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0205\7\66\2\2\u0205\u0214\3\2\2\2"+
		"\u0206\u0207\7\65\2\2\u0207\u020c\5r:\2\u0208\u0209\7*\2\2\u0209\u020b"+
		"\5r:\2\u020a\u0208\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7\67"+
		"\2\2\u0210\u0214\3\2\2\2\u0211\u0212\78\2\2\u0212\u0214\5\b\5\2\u0213"+
		"\u01fb\3\2\2\2\u0213\u0206\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0217\3\2"+
		"\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216q\3\2\2\2\u0217\u0215"+
		"\3\2\2\2\u0218\u021c\5v<\2\u0219\u021a\5t;\2\u021a\u021b\5r:\2\u021b\u021d"+
		"\3\2\2\2\u021c\u0219\3\2\2\2\u021c\u021d\3\2\2\2\u021ds\3\2\2\2\u021e"+
		"\u021f\t\5\2\2\u021fu\3\2\2\2\u0220\u0224\5z>\2\u0221\u0222\5x=\2\u0222"+
		"\u0223\5v<\2\u0223\u0225\3\2\2\2\u0224\u0221\3\2\2\2\u0224\u0225\3\2\2"+
		"\2\u0225w\3\2\2\2\u0226\u0227\t\6\2\2\u0227y\3\2\2\2\u0228\u022c\5~@\2"+
		"\u0229\u022a\5|?\2\u022a\u022b\5z>\2\u022b\u022d\3\2\2\2\u022c\u0229\3"+
		"\2\2\2\u022c\u022d\3\2\2\2\u022d{\3\2\2\2\u022e\u022f\t\7\2\2\u022f}\3"+
		"\2\2\2\u0230\u0232\t\2\2\2\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232"+
		"\u0233\3\2\2\2\u0233\u0234\5\u0080A\2\u0234\177\3\2\2\2\u0235\u0241\5"+
		"p9\2\u0236\u0237\7\62\2\2\u0237\u0238\5r:\2\u0238\u0239\7\63\2\2\u0239"+
		"\u0241\3\2\2\2\u023a\u0241\5\u0084C\2\u023b\u0241\5\u0082B\2\u023c\u0241"+
		"\5\u0088E\2\u023d\u023e\7\26\2\2\u023e\u0241\5\u0080A\2\u023f\u0241\5"+
		"\36\20\2\u0240\u0235\3\2\2\2\u0240\u0236\3\2\2\2\u0240\u023a\3\2\2\2\u0240"+
		"\u023b\3\2\2\2\u0240\u023c\3\2\2\2\u0240\u023d\3\2\2\2\u0240\u023f\3\2"+
		"\2\2\u0241\u0081\3\2\2\2\u0242\u0247\5\26\f\2\u0243\u0247\5\22\n\2\u0244"+
		"\u0247\5 \21\2\u0245\u0247\7\25\2\2\u0246\u0242\3\2\2\2\u0246\u0243\3"+
		"\2\2\2\u0246\u0244\3\2\2\2\u0246\u0245\3\2\2\2\u0247\u0083\3\2\2\2\u0248"+
		"\u0249\5\b\5\2\u0249\u024a\7\62\2\2\u024a\u024b\5\u0086D\2\u024b\u024c"+
		"\7\63\2\2\u024c\u0085\3\2\2\2\u024d\u0252\5\u0090I\2\u024e\u024f\7*\2"+
		"\2\u024f\u0251\5\u0090I\2\u0250\u024e\3\2\2\2\u0251\u0254\3\2\2\2\u0252"+
		"\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0087\3\2\2\2\u0254\u0252\3\2"+
		"\2\2\u0255\u0256\7\64\2\2\u0256\u0257\5\u008aF\2\u0257\u0258\7\66\2\2"+
		"\u0258\u025e\3\2\2\2\u0259\u025a\7\65\2\2\u025a\u025b\5\u008aF\2\u025b"+
		"\u025c\7\67\2\2\u025c\u025e\3\2\2\2\u025d\u0255\3\2\2\2\u025d\u0259\3"+
		"\2\2\2\u025e\u0089\3\2\2\2\u025f\u0264\5\u008cG\2\u0260\u0261\7*\2\2\u0261"+
		"\u0263\5\u008cG\2\u0262\u0260\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262"+
		"\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0269\3\2\2\2\u0266\u0264\3\2\2\2\u0267"+
		"\u0269\3\2\2\2\u0268\u025f\3\2\2\2\u0268\u0267\3\2\2\2\u0269\u008b\3\2"+
		"\2\2\u026a\u026d\5r:\2\u026b\u026c\79\2\2\u026c\u026e\5r:\2\u026d\u026b"+
		"\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u008d\3\2\2\2\u026f\u0274\5\b\5\2\u0270"+
		"\u0271\7\62\2\2\u0271\u0272\5\u0086D\2\u0272\u0273\7\63\2\2\u0273\u0275"+
		"\3\2\2\2\u0274\u0270\3\2\2\2\u0274\u0275\3\2\2\2\u0275\u008f\3\2\2\2\u0276"+
		"\u027a\5r:\2\u0277\u0279\5\u0092J\2\u0278\u0277\3\2\2\2\u0279\u027c\3"+
		"\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0091\3\2\2\2\u027c"+
		"\u027a\3\2\2\2\u027d\u027e\7+\2\2\u027e\u027f\5r:\2\u027f\u0093\3\2\2"+
		"\2\u0280\u0281\3\2\2\2\u0281\u0095\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0097"+
		"\3\2\2\2\u0284\u0288\5\u009aN\2\u0285\u0288\5\u009eP\2\u0286\u0288\5\u00a6"+
		"T\2\u0287\u0284\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0286\3\2\2\2\u0288"+
		"\u0099\3\2\2\2\u0289\u028a\7\5\2\2\u028a\u028b\5\u009cO\2\u028b\u028c"+
		"\7\16\2\2\u028c\u009b\3\2\2\2\u028d\u0292\5h\65\2\u028e\u028f\7)\2\2\u028f"+
		"\u0291\5h\65\2\u0290\u028e\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2"+
		"\2\2\u0292\u0293\3\2\2\2\u0293\u009d\3\2\2\2\u0294\u0292\3\2\2\2\u0295"+
		"\u0298\5\u00a0Q\2\u0296\u0298\5\u00a2R\2\u0297\u0295\3\2\2\2\u0297\u0296"+
		"\3\2\2\2\u0298\u009f\3\2\2\2\u0299\u029a\7\21\2\2\u029a\u029b\5r:\2\u029b"+
		"\u029c\7\36\2\2\u029c\u029f\5h\65\2\u029d\u029e\7\r\2\2\u029e\u02a0\5"+
		"h\65\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u00a1\3\2\2\2\u02a1"+
		"\u02a2\7\7\2\2\u02a2\u02a3\5r:\2\u02a3\u02a4\7\27\2\2\u02a4\u02a9\5\u00a4"+
		"S\2\u02a5\u02a6\7)\2\2\u02a6\u02a8\5\u00a4S\2\u02a7\u02a5\3\2\2\2\u02a8"+
		"\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02af\3\2"+
		"\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad\7)\2\2\u02ad\u02ae\7\r\2\2\u02ae"+
		"\u02b0\5\u009cO\2\u02af\u02ac\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u02b1"+
		"\3\2\2\2\u02b1\u02b2\7\16\2\2\u02b2\u00a3\3\2\2\2\u02b3\u02b4\5b\62\2"+
		"\u02b4\u02b5\7+\2\2\u02b5\u02b6\5h\65\2\u02b6\u00a5\3\2\2\2\u02b7\u02bb"+
		"\5\u00a8U\2\u02b8\u02bb\5\u00aaV\2\u02b9\u02bb\5\u00acW\2\u02ba\u02b7"+
		"\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bb\u00a7\3\2\2\2\u02bc"+
		"\u02bd\7#\2\2\u02bd\u02be\5r:\2\u02be\u02bf\7\f\2\2\u02bf\u02c0\5h\65"+
		"\2\u02c0\u00a9\3\2\2\2\u02c1\u02c2\7\35\2\2\u02c2\u02c3\5\u009cO\2\u02c3"+
		"\u02c4\7!\2\2\u02c4\u02c5\5r:\2\u02c5\u00ab\3\2\2\2\u02c6\u02c7\7\17\2"+
		"\2\u02c7\u02c8\5\b\5\2\u02c8\u02c9\7(\2\2\u02c9\u02ca\5\u00aeX\2\u02ca"+
		"\u02cb\7\f\2\2\u02cb\u02cc\5h\65\2\u02cc\u00ad\3\2\2\2\u02cd\u02ce\5\u00b0"+
		"Y\2\u02ce\u02cf\7\37\2\2\u02cf\u02d0\5\u00b2Z\2\u02d0\u00af\3\2\2\2\u02d1"+
		"\u02d2\5r:\2\u02d2\u00b1\3\2\2\2\u02d3\u02d4\5r:\2\u02d4\u00b3\3\2\2\2"+
		"\u02d5\u02da\5p9\2\u02d6\u02d7\7*\2\2\u02d7\u02d9\5p9\2\u02d8\u02d6\3"+
		"\2\2\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db"+
		"\u00b5\3\2\2\2\u02dc\u02da\3\2\2\2?\u00b9\u00bf\u00ca\u00d4\u00d6\u00e3"+
		"\u00f8\u00fc\u010e\u0115\u0119\u0120\u0124\u012a\u0136\u013c\u0142\u0154"+
		"\u015b\u0164\u016b\u016e\u0175\u0184\u018c\u019a\u01a8\u01ad\u01b8\u01c4"+
		"\u01cf\u01d7\u01dd\u01eb\u01ef\u01f4\u0201\u020c\u0213\u0215\u021c\u0224"+
		"\u022c\u0231\u0240\u0246\u0252\u025d\u0264\u0268\u026d\u0274\u027a\u0287"+
		"\u0292\u0297\u029f\u02a9\u02af\u02ba\u02da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}