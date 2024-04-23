// Generated from MontPy.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MontPyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MontPyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MontPyParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MontPyParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(MontPyParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(MontPyParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(MontPyParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(MontPyParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(MontPyParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#powerExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowerExpression(MontPyParser.PowerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(MontPyParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(MontPyParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MontPyParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MontPyParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#list_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_type(MontPyParser.List_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(MontPyParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#list_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_function_call(MontPyParser.List_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(MontPyParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(MontPyParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(MontPyParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(MontPyParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(MontPyParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MontPyParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MontPyParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(MontPyParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(MontPyParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_expression(MontPyParser.Range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(MontPyParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MontPyParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(MontPyParser.Function_callContext ctx);
}