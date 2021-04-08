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
public class StackWrong{
	private int topPointer;
	private List<Integer> arrLi;

	public StackWrong(){
		this.arrLi = new ArrayList<>();
		this.topPointer = 0;
	}

	public void push(Integer a) {
		arrLi.add(a);
		topPointer++;
	}	
	public void pop() throws NullPointerException{
		if(topPointer == 0) throw new NullPointerException("No elements in stack");
		arrLi.remove(topPointer-1);
		topPointer--;
	}
	public Integer top() {
		if(topPointer == 0) throw new NullPointerException("No elements in stack");
		return arrLi.get(topPointer-1);
	}
	public void clear(){
		arrLi.clear();
		topPointer = 0;
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
