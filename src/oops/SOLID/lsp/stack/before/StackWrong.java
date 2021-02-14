package oops.SOLID.lsp.stack.before;

import java.util.ArrayList;
import java.io.IOException;

public class StackWrong {
	ArrayList<Integer> st = new ArrayList<Integer>();
	private int topPointer = -1;

	public void push(Integer a) {
		st.add(a);
		topPointer++;
	}
	public void pop() {
		if( topPointer >= 0 ){
			st.remove(topPointer);
			topPointer--;
			return ;
		}
		else{
			System.out.println("stack is empty, cannot pop");
			return;
		}
	}
	public Integer top() {
			if( topPointer >= 0 )
			{
				return st.get(topPointer);
			}
			else
			{
				System.out.println("cannot return top because stack is empty");
				return -1;
			}
	}
	public static void main(String[] args) {
		StackWrong st = new StackWrong();
		st.push(1);
		st.push(2);
		System.out.println(st.top());
		st.pop();
		System.out.println(st.top());
		st.pop();
		System.out.println(st.top());
		st.pop();
	}
}
