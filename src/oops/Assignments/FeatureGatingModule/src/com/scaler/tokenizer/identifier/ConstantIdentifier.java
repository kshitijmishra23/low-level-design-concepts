package com.scaler.tokenizer.identifier;

import com.scaler.tokenizer.entity.TokenType;

public class ConstantIdentifier implements TokenIdentifier {
    private static ConstantIdentifier constantIdentifierInstance;
    private static Object mutex = new Object();

    private ConstantIdentifier() {

    }

    public static TokenIdentifier getInstance() {
        if(constantIdentifierInstance == null) {
            synchronized (mutex) {
                if(constantIdentifierInstance == null) {
                    constantIdentifierInstance = new ConstantIdentifier();
                }
            }
        }
        return constantIdentifierInstance;
    }

    @Override
    public TokenType getTokenType(String tokenValue) {
        try {
            Integer.parseInt(tokenValue);
            return TokenType.CONSTANT_INTEGER;
        } catch (NumberFormatException nfe) {
            if(tokenValue.startsWith("\"") && tokenValue.endsWith("\"")){
                return TokenType.CONSTANT_STRING;
            }
        }
        return TokenType.INVALID;
    }

}
