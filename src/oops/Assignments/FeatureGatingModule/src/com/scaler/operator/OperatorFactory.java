package com.scaler.operator;


public class OperatorFactory {

    public static Operator getOperator(String operatorType) {
        Operator operator = null;
        switch (operatorType) {
            case ">":
                operator = new GreaterThanOperator();
                break;
            case "==":
                operator = new EqualsOperator();
                break;
            case "AND":
                operator = new ANDOperator();
                break;
             default:
                 break;
        }
        return operator;
    }
}
