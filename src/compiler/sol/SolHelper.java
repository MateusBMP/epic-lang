package compiler.sol;

import compiler.sol.antlr.SolLexer;
import compiler.sol.antlr.SolParser;
import java.io.InputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class SolHelper {

    public static SolParser getParser(InputStream is) throws Exception {
        CharStream input = CharStreams.fromStream(is);
        SolLexer lexer = new SolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SolParser parser = new SolParser(tokens);
        return parser;
    }

    public static ParseTree getParseTree(SolParser parser) throws Exception {
        CheckSemantic checkSemantic = new CheckSemantic();
        parser.addParseListener(checkSemantic);
        ParseTree tree = parser.sol();
        return tree;
    }

    public static ParseTree getParseTree(InputStream is) throws Exception {
        SolParser parser = getParser(is);
        CheckSemantic checkSemantic = new CheckSemantic();
        parser.addParseListener(checkSemantic);
        ParseTree tree = parser.sol();
        return tree;
    }
}