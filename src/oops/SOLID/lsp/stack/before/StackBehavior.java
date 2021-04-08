package oops.SOLID.lsp.stack.before;

public interface StackBehavior<T> {

	public void push(T a);
	
	public void pop();
	
	public T top();
	
}