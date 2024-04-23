import org.antlr.v4.runtime.*;

public class MontPyLexerTest {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Uso: java MontPyLexerTest <caminho_para_arquivo>");
            System.exit(1);
        }

        String filePath = args[0];

        try {
            CharStream input = CharStreams.fromFileName(filePath);
            MontPyLexer lexer = new MontPyLexer(input);

            Token token;
            do {
                token = lexer.nextToken();
                String tokenName = MontPyLexer.VOCABULARY.getDisplayName(token.getType());
                String tokenText = token.getText();

                if (token.getType() == Token.EOF) {
                    break;
                }

                if (token.getType() == MontPyLexer.ERROR) {
                    System.err.printf("Erro: Token inesperado '%s'\n", tokenText);
                    throw new RuntimeException("Token inesperado encontrado");
                }

                System.out.printf("Token: %s, Texto: \"%s\"\n", tokenName, tokenText);

                if (token.getType() == MontPyLexer.STRING) {
                    System.out.printf("String encontrada: \"%s\"\n", tokenText);
                }
                else if (token.getType() == MontPyLexer.DIGIT) {
                    System.out.printf("Número encontrado: %s\n", tokenText);
                }

            } while (token.getType() != Token.EOF);
        } catch (Exception e) {
            System.err.println("Erro ao analisar o arquivo: " + e.getMessage());
            System.exit(1);
        }
    }
}