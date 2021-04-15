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
public class StackRight<T> implements StackInterface<T>{
	private int topPointer;
	private List<T> elementData;

	public StackRight() {
		this.topPointer = -1;
		this.elementData = new ArrayList<>();
	}

	@Override
	public void push(T a) {
		topPointer++;
		elementData.add(a);
	}

	public T pop() {
		T popped = null;
		if (topPointer == -1) {
			System.out.println("Stack is Empty");
		} else {
			topPointer--;
			popped = elementData.remove(elementData.size() - 1);
		}
		return popped;
	}

	public T top() {
		T topEle = null;
		if (topPointer == -1) {
			System.out.println("Stack is Empty");
		} else {
			topEle = elementData.get(topPointer);
		}
		return topEle;
	}

	public void clear() {
		this.elementData.clear();
		this.topPointer = -1;
	}
	
	public static void main(String[] args) {
		StackInterface<Integer> st = new StackRight<>();
		st.push(1);
		st.push(2);
		System.out.println(st.top());
		st.pop();
		System.out.println(st.top());
		st.clear();
		System.out.println(st.pop());
	}

}
