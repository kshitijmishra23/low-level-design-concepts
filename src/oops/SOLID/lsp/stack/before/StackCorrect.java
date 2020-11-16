package oops.SOLID.lsp.stack.before;

import java.util.EmptyStackException;
import java.util.Vector;

public class StackCorrect<E> extends AbstractStack<E> {
    Vector<E> m_stack;

    StackCorrect() {
        m_stack = new Vector<>();
    }

    @Override
    public void push(E item) {
        m_stack.add(item);
    }

    @Override
    public void pop() {
        if(m_stack.size() == 0)
            throw new EmptyStackException();
        m_stack.removeElementAt(m_stack.size() - 1);
    }

    @Override
    public E top() {
        if(m_stack.size() == 0)
            throw new EmptyStackException();
        return m_stack.lastElement();
    }
}
