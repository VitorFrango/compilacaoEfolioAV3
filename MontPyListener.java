// Generated from MontPy.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MontPyParser}.
 */
public interface MontPyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MontPyParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MontPyParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MontPyParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(MontPyParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(MontPyParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(MontPyParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(MontPyParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(MontPyParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(MontPyParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(MontPyParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(MontPyParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(MontPyParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(MontPyParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(MontPyParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#powerExpression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(MontPyParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(MontPyParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(MontPyParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(MontPyParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(MontPyParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MontPyParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MontPyParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MontPyParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MontPyParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#list_type}.
	 * @param ctx the parse tree
	 */
	void enterList_type(MontPyParser.List_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#list_type}.
	 * @param ctx the parse tree
	 */
	void exitList_type(MontPyParser.List_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(MontPyParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(MontPyParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#list_function_call}.
	 * @param ctx the parse tree
	 */
	void enterList_function_call(MontPyParser.List_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#list_function_call}.
	 * @param ctx the parse tree
	 */
	void exitList_function_call(MontPyParser.List_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(MontPyParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(MontPyParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(MontPyParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(MontPyParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(MontPyParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(MontPyParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MontPyParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MontPyParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(MontPyParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(MontPyParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MontPyParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MontPyParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MontPyParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MontPyParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(MontPyParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(MontPyParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(MontPyParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(MontPyParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#range_expression}.
	 * @param ctx the parse tree
	 */
	void enterRange_expression(MontPyParser.Range_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#range_expression}.
	 * @param ctx the parse tree
	 */
	void exitRange_expression(MontPyParser.Range_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(MontPyParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(MontPyParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MontPyParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(MontPyParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MontPyParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(MontPyParser.Function_callContext ctx);
}