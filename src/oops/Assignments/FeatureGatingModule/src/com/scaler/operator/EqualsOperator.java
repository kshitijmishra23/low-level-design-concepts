package com.scaler.operator;

public class EqualsOperator extends Operator {

    @Override
    public Object operate(Operand operand1, Operand operand2) {
        if(operand1.compareTo(operand2) == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public OperatorPrecedence getOpPrecedence() {
        return OperatorPrecedence.GREATER_EQUAL;
    }
}
