package com.scaler.operator;

public enum OperatorPrecedence {
    AND(0),
    GREATER_EQUAL(1);

    private final int value;
    OperatorPrecedence(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
