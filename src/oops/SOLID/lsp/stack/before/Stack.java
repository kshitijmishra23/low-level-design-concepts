package oops.SOLID.lsp.stack.before;

import java.util.ArrayList;
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
public class Stack {

	private int topPointer = 0;	// size of list
	List<Integer> backingList = new ArrayList<>();
	
	public void push(Integer a) {
		backingList.add(a);
		topPointer++;
	}	
	public void pop() throws StackEmptyException {

		try {
			backingList.remove(topPointer - 1);
		} catch (IndexOutOfBoundsException ex) {
			throw new StackEmptyException(ex);
		}
		topPointer--;
	}
	public Integer top() throws StackEmptyException {
		try {
			return backingList.get(topPointer - 1);
		} catch (IndexOutOfBoundsException ex) {
			throw new StackEmptyException(ex);
		}
	}

	public void clear() {
		backingList.clear();
		topPointer = 0;
	}
	
	public static void main(String[] args) throws StackEmptyException {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		System.out.println(st.top());
		st.pop();
		System.out.println(st.top());
		st.clear();
		System.out.println(st.top());
	}
}
