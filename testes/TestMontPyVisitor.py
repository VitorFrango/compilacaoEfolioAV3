from MontPyParser import MontPyParser
from MontPyVisitor import MontPyBaseVisitor

class TestMontPyVisitor(MontPyBaseVisitor):
    def visitExpression(self, ctx:MontPyParser.ExpressionContext):
        # Verifica se a expressão é um binário lógico ou matemático e faz verificações de tipo
        if hasattr(ctx, 'logicalExpression'):
            return self.visitLogicalExpression(ctx.logicalExpression())
        return self.visitChildren(ctx)

    def visitAdditiveExpression(self, ctx:MontPyParser.AdditiveExpressionContext):
        # Suponha que você queira verificar se a adição é entre tipos compatíveis
        left = self.visit(ctx.left)
        right = self.visit(ctx.right)
        if isinstance(left, str) or isinstance(right, str):
            raise TypeError(f"Invalid types for addition at {ctx.start.line}:{ctx.start.column}")
        return left + right

    def visitFunction_call(self, ctx:MontPyParser.Function_callContext):
        # Verificar se o número de argumentos é adequado para a função chamada
        func_name = ctx.ID().getText()
        expected_args = self.function_arg_count.get(func_name, 0)
        provided_args = len(ctx.expression())
        if provided_args != expected_args:
            raise ValueError(f"Function {func_name} expects {expected_args} arguments but got {provided_args} at line {ctx.start.line}")
        return self.visitChildren(ctx)
