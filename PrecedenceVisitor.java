import gen.MontPyBaseVisitor;
import gen.MontPyLexer;
import gen.MontPyParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

public class PrecedenceVisitor extends MontPyBaseVisitor<Void> {

    @Override
    public Void visitVariable_declaration(MontPyParser.Variable_declarationContext ctx) {
        String type = ctx.type().getText();
        String variable = ctx.ID().getText();
        System.out.println("Expressão a ser analisada:");
        System.out.println(type + " " + variable + " = " + ctx.expression().getText());

        System.out.println("Expressão com precedência:");
        System.out.println(type + " " + variable + " = " + formatExpression(ctx.expression()));
        return null;
    }

    private String formatExpression(ParseTree node) {
        if (node == null) {
            return "";
        }

        if (node.getChildCount() == 0) {
            return node.getText(); // No children, just text
        }

        // Handle children nodes, assuming binary expressions
        if (node.getChildCount() == 3) { // typical binary expression: left op right
            ParseTree leftNode = node.getChild(0);
            ParseTree opNode = node.getChild(1);
            ParseTree rightNode = node.getChild(2);

            if (leftNode != null && opNode != null && rightNode != null) {
                String left = formatExpression(leftNode);
                String op = opNode.getText();
                String right = formatExpression(rightNode);

                // Handle operator-specific formatting
                switch (op) {
                    case "+":
                    case "-":
                        return left + " " + op + " (" + right + ")";
                    case "*":
                    case "/":
                        return "(" + left + " " + op + " " + right + ")";
                    default:
                        return left + " " + op + " " + right;
                }
            }
        }

        // Fallback to recursively handling all children
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < node.getChildCount(); i++) {
            if (i > 0) result.append(" ");
            result.append(formatExpression(node.getChild(i)));
        }
        return result.toString();
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println("Usage: java SimplifiedPrecedenceVisitor <path to test file>");
            return;
        }

        String inputFile = args[0];
        InputStream is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);
        MontPyLexer lexer = new MontPyLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MontPyParser parser = new MontPyParser(tokens);
        ParseTree tree = parser.program();

        SimplifiedPrecedenceVisitor visitor = new SimplifiedPrecedenceVisitor();
        visitor.visit(tree);
    }
}
