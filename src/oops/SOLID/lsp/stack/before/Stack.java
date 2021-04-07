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
public class Stack<T>{
    ArrayList<T> st = new ArrayList<>();
    private int topPointer = 0;

    public void push(T a) {
        st.add(a);
        topPointer++;
    }

    public void pop() {
        st.remove(topPointer - 1);
        topPointer--;
    }

    public void clear(){
        st.clear();
        topPointer = 0;
    }

    public T top() {
        return st.get(topPointer - 1);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack();
        st.push(1);
        st.push(2);
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        st.clear();
        System.out.println(st.top());
    }
}
