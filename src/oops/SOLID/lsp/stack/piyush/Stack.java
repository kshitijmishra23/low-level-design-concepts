package oops.SOLID.lsp.stack.piyush;

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
public class Stack {
  ArrayList<Integer> list;
  private int top;

  public Stack() {
    list = new ArrayList<Integer>();
    top = 0;
  }

  public void push(Integer a) {
    list.add(top, a);
    top++;
  }

  public Integer pop() throws Exception {
    if (top > 0) {
      top--;
      return list.remove(top);
    } else {
      throw new Exception("Invalid operation");
    }
  }

  public Integer top() throws Exception {
    if (top > 0) {
      return list.get(top - 1);
    } else {
      throw new Exception("Invalid operation");
    }
  }

  public void print() {
    int temp = top - 1;
    while (temp >= 0) System.out.println(list.get(temp--));
  }

  public static void main(String[] args) throws Exception {
    Stack st = new Stack();
    st.push(1);
    st.push(2);
    System.out.println(st.top());
    st.pop();
    System.out.println(st.top());
    st.push(3);
    System.out.println(st.top());
    st.print();
  }
}
