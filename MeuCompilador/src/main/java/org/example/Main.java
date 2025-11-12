package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.generated.ForcaLexer;
import org.example.generated.ForcaParser;
import org.example.interpreter.ForcaInterpreter;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String source = Files.readString(Path.of("src/main/resources/exemplo.forca"));
        CharStream cs = CharStreams.fromString(source);
        ForcaLexer lexer = new ForcaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ForcaParser parser = new ForcaParser(tokens);
        ParseTree tree = parser.programa();
        new ForcaInterpreter().visit(tree);
    }
}
