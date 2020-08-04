package com.scaler.tokenizer.entity;

public class Token {
    TokenType type;
    String tokenValue;

    public Token(TokenType type,String tokenValue) {
        this.type = type;
        this.tokenValue = tokenValue;
    }

    public TokenType getType() {
        return type;
    }

    public String getTokenValue() {
        return tokenValue;
    }

    public void setType(TokenType type) {
        this.type = type;
    }

    public void setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
    }
}
