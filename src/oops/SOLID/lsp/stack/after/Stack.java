package oops.SOLID.lsp.stack.after;

import java.util.ArrayList;

public class Stack {

	private ArrayList<Integer> list;
	private int topPointer;
	
	public Stack() {
		list = new ArrayList<Integer>();
		topPointer = 0;
	}
	public void push(int val) {
		list.add(topPointer, val);
		topPointer++;
	}
	public void pop() throws StackEmptyException {
		if(topPointer > 0) {
			topPointer--;
			list.remove(topPointer);
		}else {
			throw new StackEmptyException("Can not pop as the stack is already empty!");
		}
	}
	public int top() throws StackEmptyException {
		if(topPointer > 0) {
			return list.get(topPointer-1);
		}else {
			throw new StackEmptyException("Stack is empty!");
		}
	}
	
	public static void main(String[] args) throws Exception {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		System.out.println(st.top());
		st.pop();
		st.pop();
		System.out.println(st.top());
	}
	
}
