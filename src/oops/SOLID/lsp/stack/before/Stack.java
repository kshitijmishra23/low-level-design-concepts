package oops.SOLID.lsp.stack.before;

import java.util.ArrayList;

public class Stack {

	private ArrayList<Integer> data;

	private int topPointer = 0;

	public Stack() {
		data = new ArrayList<Integer>();
		topPointer = 0;
	}

	public void push(Integer a) {
		this.data.add(topPointer, a);
		topPointer++;
	}

	public void pop() {
		this.data.remove(topPointer - 1);
		topPointer--;
	}

	public Integer top() {
		return this.data.get(topPointer - 1);
	}

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		System.out.println(st.top());
		st.pop();
		System.out.println(st.top());
		/*
		 * st.clear(); System.out.println(st.top());
		 */
	}
}