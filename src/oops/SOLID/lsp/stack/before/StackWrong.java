package oops.SOLID.lsp.stack.before;

import java.util.ArrayList;

public class StackWrong extends ArrayList<Integer>{
	private int topPointer = 0;
	
	public void push(Integer a) {
		add(topPointer, a);
		topPointer++;
	}	
	public void pop() {
		remove(topPointer-1);
		topPointer--;
	}
	public Integer top() {
		return get(topPointer-1);
	}
	
	public static void main(String[] args) {
		StackWrong st = new StackWrong();
		st.push(1);
		st.push(2);
		System.out.println(st.top());
		st.pop();
		System.out.println(st.top());
		st.clear();
		System.out.println(st.top());
	}
}
