package com.scaler.operator;

public class Operand<T extends Comparable<T>> implements Comparable<T>{

    T operand;

    public Operand(T op) {
        this.operand = op;
    }

    public T get() {
        return operand;
    }

    @Override
    public int compareTo(T o) {
        T op = get();
        return o.compareTo(op);
    }
}