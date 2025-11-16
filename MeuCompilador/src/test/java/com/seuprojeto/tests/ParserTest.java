package com.seuprojeto.tests;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.example.generated.ForcaLexer;
import org.example.generated.ForcaParser;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class ParserTest {

    // ErrorListener para capturar erros sintáticos durante o parse
    static class CollectingErrorListener extends BaseErrorListener {
        final List<String> errors = new ArrayList<>();
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line, int charPositionInLine,
                                String msg, RecognitionException e) {
            errors.add("line " + line + ":" + charPositionInLine + " - " + msg);
        }
    }

    @Test
    public void parseValidExample() {
        String input = "programa inicio a = 5; fim";
        CharStream cs = CharStreams.fromString(input);
        ForcaLexer lexer = new ForcaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ForcaParser parser = new ForcaParser(tokens);

        CollectingErrorListener listener = new CollectingErrorListener();
        parser.removeErrorListeners(); // remove console
        parser.addErrorListener(listener);

        // supondo que a regra raiz se chama 'programa' (mude para sua regra)
        ParseTree tree = parser.programa();

        assertTrue(listener.errors.isEmpty(), "Erros sintáticos: " + listener.errors);
        assertNotNull(tree);
    }

    @Test
    public void parseInvalidExampleProducesError() {
        String bad = "programa inicio a = ; fim"; // falta valor
        CharStream cs = CharStreams.fromString(bad);
        ForcaLexer lexer = new ForcaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ForcaParser parser = new ForcaParser(tokens);

        CollectingErrorListener listener = new CollectingErrorListener();
        parser.removeErrorListeners();
        parser.addErrorListener(listener);

        parser.programa();
        assertFalse(listener.errors.isEmpty(), "Esperava erro sintático");
    }
}
