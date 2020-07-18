package oops.SOLID.lsp.stack.before;

import java.util.ArrayList;
import java.util.List;
/**
 * Stack has-a list with push() pop() methods.
 * This stack uses an ArrayList as a backing store and 
 * uses it to support stack operations.  
 */
public class Stack {
	
	private List<Integer> backingStore = new ArrayList<>();
	
	private int topPointer = 0;
	
	public void push(Integer a) {
		backingStore.add(topPointer, a);
		topPointer++;
	}	
	public void pop() {
		backingStore.remove(topPointer-1);
		topPointer--;
	}
	public Integer top() {
		return backingStore.get(topPointer-1);
	}
	
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(1);
		st.push(2);
		System.out.println(st.top());
		st.pop();
		System.out.println(st.top());
	}
}
