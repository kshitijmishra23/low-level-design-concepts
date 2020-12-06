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
public class StackWrong implements Stacks {
    private int topPointer = 0;
    private List<Integer> list;

    public StackWrong() {
        list = new ArrayList<>();
    }

    public void push(Integer a) {
        list.add(a);
        topPointer++;
    }

    public void pop() {
        if (topPointer <= 0) throw new EmptyStackException();
        list.remove(topPointer - 1);
        topPointer--;
    }

    public Integer top() {
        if (topPointer <= 0) throw new EmptyStackException();
        return list.get(topPointer - 1);
    }

    public void clear() {
        list = new ArrayList<>();
        topPointer = 0;

    }


    public static void main(String[] args) {
        Stacks st = new StackWrong();
        st.push(1);
        st.push(2);
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
        st.clear();
        System.out.println(st.top());
    }
}
