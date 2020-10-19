package oops.SOLID.lsp.stack.before;

public abstract class AbstractStack<E> {
    public abstract void push(E item);
    public abstract void pop();
    public abstract E top();
}
