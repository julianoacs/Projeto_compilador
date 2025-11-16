package com.seuprojeto.tests;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.example.generated.ForcaLexer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class LexerTest {

    @Test
    public void testTokensBasic() {
        String input = "programa inicio a = 10;\nfim";
        CharStream cs = CharStreams.fromString(input);
        ForcaLexer lexer = new ForcaLexer(cs);

        List<String> tokenNames = new ArrayList<>();
        Token t;
        while ((t = lexer.nextToken()).getType() != Token.EOF) {
            String name = ForcaLexer.VOCABULARY.getSymbolicName(t.getType());
            if (name == null) name = ForcaLexer.VOCABULARY.getDisplayName(t.getType());
            tokenNames.add(name + ":" + t.getText());
        }

        // Exemplo de asserções: ajuste conforme seus nomes de tokens na gramática
        // Verifica se contém ASSIGN ou ID etc — troque por nomes reais
        assertTrue(tokenNames.stream().anyMatch(s -> s.startsWith("ID:programa")));
        assertTrue(tokenNames.stream().anyMatch(s -> s.startsWith("ID:inicio")));
        assertTrue(tokenNames.stream().anyMatch(s -> s.startsWith("ID:fim")));
        assertTrue(tokenNames.stream().anyMatch(s -> s.contains("10")));
    }
}
