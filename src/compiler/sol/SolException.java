package compiler.sol;

import java.util.Stack;

public class SolException extends RuntimeException {
    Stack<VisitorContext> stacktrace = null;

    public SolException(String message, Stack<VisitorContext> stacktrace) {
        super(message);
        this.stacktrace = stacktrace;
    }

    @SuppressWarnings("unchecked")
    public Stack<VisitorContext> stacktrace() {
        return (Stack<VisitorContext>) this.stacktrace.clone();
    }
}