import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import gen.MontPyLexer;
import gen.MontPyParser;

import java.io.FileInputStream;
import java.io.InputStream;

public class TestMontPy {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length > 0) inputFile = args[0];

        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }

        CharStream input = CharStreams.fromStream(is);
        MontPyLexer lexer = new MontPyLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MontPyParser parser = new MontPyParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.println("Syntax Error: line " + line + ":" + charPositionInLine + " at " +
                                   offendingSymbol + ": " + msg);
            }
        });

        ParseTree tree = parser.program(); // Parses the input
        System.out.println(tree.toStringTree(parser)); // Print the parse tree
        TypeCheckVisitor visitor = new TypeCheckVisitor();
        visitor.visit(tree); // Execute the visitor for type checking
        System.out.println("Visitor has finished execution.");
    }
}
