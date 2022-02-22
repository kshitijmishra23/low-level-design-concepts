package oops.SOLID.lsp.stack.before;

import java.util.ArrayList;

public class Stack<T> {
	private int topPointer;
	private List<T> arr;
	public StackWrong(){
		this.topPointer=0;
		this.arr=new ArrayList<>();
	}
	public void push(T a) {
		arr.add(topPointer, a);
		topPointer++;
	}	
	public void pop() {
		arr.remove(topPointer-1);
		topPointer--;
	}
	public void clear() {
		arr.removeAll(arr);
		topPointer=0;
	}
	public T top() {
		return arr.get(topPointer-1);
	}