package oops.SOLID.lsp.stack.before;

import java.util.ArrayList;

public class StackCorrect {
    // encapsulte the  arrayList and provide only the stack operations
    // now the StackCorrect class does not expose any methods of ArrayList, so it adheres to the Liskov Substitution Principle. 
    private ArrayList<Integer> stackList = new ArrayList<>();

    public void push(Integer a) {
        stackList.add(a);
    }

    public void pop() {
        if (!stackList.isEmpty()) {
            stackList.remove(stackList.size() - 1);
        }
    }

    public Integer top() {
        if (!stackList.isEmpty()) {
            return stackList.get(stackList.size() - 1);
        }
        return null; // or throw an exception
    }

    public static void main(String[] args) {
		StackCorrect st = new StackCorrect();
		st.push(1);
		st.push(2);
		System.out.println(st.top());
		st.pop();
		System.out.println(st.top());
		st.clear();  // error 
		System.out.println(st.top());
	}

}
