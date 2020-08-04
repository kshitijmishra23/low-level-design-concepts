package com.scaler.operator;

public class ANDOperator extends Operator {

    @Override
    public Object operate(Operand operand1, Operand operand2) {
        if(operand1.compareTo(1) == 0 && operand2.compareTo(1) == 0) {
            return 1;
        }
        return 0;
    }

    @Override
    public OperatorPrecedence getOpPrecedence() {
        return OperatorPrecedence.AND;
    }
}
