package oops.SOLID.lsp.stack.before;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
/*
 * Stack is-a list with push() pop() methods.
 * So can we create a stack by extending an ArrayList class?
 * 
 * No! This implementation violates the Liskov Substitution Principle.
 * Which states that 
 * "Objects in a program should be replaceable with instances of their subtypes
 * without altering the correctness of that program."
 * 
 * In this case ArrayList has multiple methods which stack is not supposed to have (ex clear(), get(i) etc)
 * so objects of ArrayList are not fully replaceable by the objects of stack.   
 * 
 */
public class StackWrong<T> implements StackBehavior<T> {
	private int topPointer = 0;
	
	private List<T> stack;
	
	public StackWrong() {
		stack = new ArrayList<T>();
	}
	
	public void push(T a) {
		stack.add(topPointer, a);
		topPointer++;
	}	
	public void pop() {
		if(topPointer == 0) {
			throw new EmptyStackException();
		}
		stack.remove(topPointer-1);
		topPointer--;
	}
	
	public T top() {
		if(topPointer == 0) {
			throw new EmptyStackException();
		}
		return stack.get(topPointer-1);
	}
	
	public static void main(String[] args) {
		StackWrong<Integer> st = new StackWrong<>();
		st.push(1);
		st.push(2);
		System.out.println(st.top());
		st.pop();
		System.out.println(st.top());
//		st.clear(); // not supported 
		System.out.println(st.top());
	}
}
