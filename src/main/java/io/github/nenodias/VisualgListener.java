// Generated from .\Visualg.g4 by ANTLR 4.9.2
package io.github.nenodias;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VisualgParser}.
 */
public interface VisualgListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VisualgParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(VisualgParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(VisualgParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(VisualgParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(VisualgParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(VisualgParser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(VisualgParser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(VisualgParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(VisualgParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(VisualgParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(VisualgParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(VisualgParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(VisualgParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(VisualgParser.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(VisualgParser.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(VisualgParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(VisualgParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void enterConstantChr(VisualgParser.ConstantChrContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void exitConstantChr(VisualgParser.ConstantChrContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(VisualgParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(VisualgParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(VisualgParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(VisualgParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(VisualgParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(VisualgParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedReal(VisualgParser.UnsignedRealContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#unsignedReal}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedReal(VisualgParser.UnsignedRealContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(VisualgParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(VisualgParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#bool_}.
	 * @param ctx the parse tree
	 */
	void enterBool_(VisualgParser.Bool_Context ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#bool_}.
	 * @param ctx the parse tree
	 */
	void exitBool_(VisualgParser.Bool_Context ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(VisualgParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(VisualgParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionPart(VisualgParser.TypeDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionPart(VisualgParser.TypeDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(VisualgParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(VisualgParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(VisualgParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(VisualgParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void enterProcedureType(VisualgParser.ProcedureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void exitProcedureType(VisualgParser.ProcedureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(VisualgParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(VisualgParser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(VisualgParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(VisualgParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(VisualgParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(VisualgParser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeType(VisualgParser.SubrangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeType(VisualgParser.SubrangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(VisualgParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(VisualgParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(VisualgParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(VisualgParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void enterUnpackedStructuredType(VisualgParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void exitUnpackedStructuredType(VisualgParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void enterStringtype(VisualgParser.StringtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void exitStringtype(VisualgParser.StringtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(VisualgParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(VisualgParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(VisualgParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(VisualgParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(VisualgParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(VisualgParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(VisualgParser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(VisualgParser.ComponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(VisualgParser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(VisualgParser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(VisualgParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(VisualgParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void enterFixedPart(VisualgParser.FixedPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void exitFixedPart(VisualgParser.FixedPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void enterRecordSection(VisualgParser.RecordSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void exitRecordSection(VisualgParser.RecordSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#variantPart}.
	 * @param ctx the parse tree
	 */
	void enterVariantPart(VisualgParser.VariantPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#variantPart}.
	 * @param ctx the parse tree
	 */
	void exitVariantPart(VisualgParser.VariantPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(VisualgParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(VisualgParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(VisualgParser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(VisualgParser.VariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(VisualgParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(VisualgParser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(VisualgParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(VisualgParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(VisualgParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(VisualgParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrFunctionDeclaration(VisualgParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrFunctionDeclaration(VisualgParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(VisualgParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(VisualgParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(VisualgParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(VisualgParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(VisualgParser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(VisualgParser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(VisualgParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(VisualgParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(VisualgParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(VisualgParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(VisualgParser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(VisualgParser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(VisualgParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(VisualgParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(VisualgParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(VisualgParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VisualgParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VisualgParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(VisualgParser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(VisualgParser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(VisualgParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(VisualgParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(VisualgParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(VisualgParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(VisualgParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(VisualgParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(VisualgParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(VisualgParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(VisualgParser.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(VisualgParser.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(VisualgParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(VisualgParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveoperator(VisualgParser.AdditiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveoperator(VisualgParser.AdditiveoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(VisualgParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(VisualgParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeoperator(VisualgParser.MultiplicativeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeoperator(VisualgParser.MultiplicativeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(VisualgParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(VisualgParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(VisualgParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(VisualgParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(VisualgParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(VisualgParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(VisualgParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(VisualgParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(VisualgParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(VisualgParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#set_}.
	 * @param ctx the parse tree
	 */
	void enterSet_(VisualgParser.Set_Context ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#set_}.
	 * @param ctx the parse tree
	 */
	void exitSet_(VisualgParser.Set_Context ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(VisualgParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(VisualgParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(VisualgParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(VisualgParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(VisualgParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(VisualgParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(VisualgParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(VisualgParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void enterParameterwidth(VisualgParser.ParameterwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void exitParameterwidth(VisualgParser.ParameterwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(VisualgParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(VisualgParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#empty_}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_(VisualgParser.Empty_Context ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#empty_}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_(VisualgParser.Empty_Context ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(VisualgParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(VisualgParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(VisualgParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(VisualgParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(VisualgParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(VisualgParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(VisualgParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(VisualgParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(VisualgParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(VisualgParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(VisualgParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(VisualgParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void enterCaseListElement(VisualgParser.CaseListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#caseListElement}.
	 * @param ctx the parse tree
	 */
	void exitCaseListElement(VisualgParser.CaseListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(VisualgParser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(VisualgParser.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(VisualgParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(VisualgParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(VisualgParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(VisualgParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(VisualgParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(VisualgParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(VisualgParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(VisualgParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(VisualgParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(VisualgParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(VisualgParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(VisualgParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualgParser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void enterRecordVariableList(VisualgParser.RecordVariableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualgParser#recordVariableList}.
	 * @param ctx the parse tree
	 */
	void exitRecordVariableList(VisualgParser.RecordVariableListContext ctx);
}