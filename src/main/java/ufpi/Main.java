package ufpi;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import ufpi.compiladores.parser.GramaticaSimpLexer;
import ufpi.compiladores.parser.GramaticaSimpParser;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        String nomeArquivo = "simples.txt";
        InputStream input = Main.class.getClassLoader().getResourceAsStream(nomeArquivo);
        CharStream inputStream = CharStreams.fromStream(input);
        GramaticaSimpLexer lexer = new GramaticaSimpLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GramaticaSimpParser parser = new GramaticaSimpParser(tokens);

        parser.programa();
    }
}