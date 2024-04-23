import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MontPyParserTest {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Usage: java MontPyParserTest <path_to_file>");
            System.exit(1);
        }

        String filePath = args[0];

        try {
            CharStream input = CharStreams.fromFileName(filePath);
            MontPyLexer lexer = new MontPyLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MontPyParser parser = new MontPyParser(tokens);

            ParseTree tree = parser.program(); // Assuming 'program' is the initial rule

            ParseTreeWalker walker = new ParseTreeWalker();
            SimpleExpressionListener listener = new SimpleExpressionListener();
            walker.walk(listener, tree); // Walk the parse tree and apply the listener

        } catch (Exception e) {
            System.err.println("Error parsing file: " + e.getMessage());
            System.exit(1);
        }
    }
}
