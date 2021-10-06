package io.github.nenodias;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.log4j.BasicConfigurator;

public class Main {

    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        final CharStream codePointCharStream = CharStreams.fromFileName("C:\\workspace\\hello.alg");
        final VisualgBaseListener listener = new VisualgBaseListener();
        final VisualgLexer lexer = new VisualgLexer(codePointCharStream);
        final VisualgParser parser = new VisualgParser(new CommonTokenStream(lexer));
        parser.addParseListener(listener);
        final ParseTreeWalker walker = new ParseTreeWalker();
        final ParseTree tree = parser.compilationUnit();

        walker.walk(listener, tree);

        System.out.println(tree.getText());
    }
}
