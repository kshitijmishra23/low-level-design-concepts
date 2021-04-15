package oops.SOLID.lsp.stack.before;

public interface StackInterface<T> {
    void push(T a);
    T pop();
    T top();
    void clear();
}
