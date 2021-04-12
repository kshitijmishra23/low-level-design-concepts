package oops.SOLID.lsp.stack.before;

public interface IStack<T> {
     void push(T i);
     void pop();
     T top();
     void clear();
}
