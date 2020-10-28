package oops.SOLID.lsp.stack.before;

import java.util.ArrayList;
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
public class StackWrong<Type>{
	
	private int topPointer;
	// using the composition type instead of inheriting the properties
	private ArrayList<Type> data;
	
	public StackWrong(){
		topPointer = 0;
		this.data = new ArrayList<>();
	}
	
	public void push(Type a) {
		data.add(topPointer, a);
		topPointer++;
	}	
	public void pop() {
		data.remove(this.topPointer-1);
		this.topPointer--;
	}
	
	public Type top() throws Exception {
		
		if(topPointer-1 < 0)
			throw new Exception();
		return data.get(topPointer-1);
	}
	
	public static void main(String[] args) {
		StackWrong<Integer> st = new StackWrong<Integer>();
		try{
			st.push(1);
			st.push(2);
			System.out.println(st.top());
			st.pop();
			System.out.println(st.top());
			//Not applicable
			//st.clear();
			st.pop();
			System.out.println(st.top());
		}catch(Exception e){
			System.out.print("Tried to access the data that is not available ");
		}
	}
}
