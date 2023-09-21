package compiler.sol;

import compiler.sol.antlr.SolBaseVisitor;
import compiler.sol.antlr.SolParser;
import java.io.InputStream;
import java.util.EmptyStackException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings("CheckReturnValue")
public class EvalVisitor extends SolBaseVisitor {}
