package oops.SOLID.lsp.stack.before;

public class StackMain {
    public static void main(String[] args) {
        StackCorrect<Integer> st = new StackCorrect<>();
        st.push(1);
        st.push(2);
        System.out.println(st.top());
        st.pop();
        System.out.println(st.top());
    }
}
