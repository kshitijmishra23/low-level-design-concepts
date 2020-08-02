package com.scaler.tokenizer.identifier;

import com.scaler.operator.OperatorManager;
import com.scaler.tokenizer.entity.TokenType;

public class OperatorIdentifier implements TokenIdentifier {

    private static OperatorIdentifier operatorIdentifierInstance;
    private static Object mutex = new Object();

    private OperatorIdentifier() {

    }

    public static TokenIdentifier getInstance() {
        if(operatorIdentifierInstance == null) {
            synchronized (mutex) {
                if(operatorIdentifierInstance == null) {
                    operatorIdentifierInstance = new OperatorIdentifier();
                }
            }
        }
        return operatorIdentifierInstance;
    }

    @Override
    public TokenType getTokenType(String tokenValue) {

        OperatorManager operatorManagerInstance = OperatorManager.getInstance();
         if(operatorManagerInstance.isOperator(tokenValue)) {
             return TokenType.OPERATOR;
         }
        return TokenType.INVALID;


    }

}
