package com.scaler.operator;

public abstract class Operator {
    public abstract Object operate(Operand operand1, Operand operand2);

    public abstract OperatorPrecedence getOpPrecedence();
}
