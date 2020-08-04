package com.scaler.tokenizer.identifier.manager;

import com.scaler.tokenizer.entity.Token;
import com.scaler.tokenizer.entity.TokenType;
import com.scaler.tokenizer.identifier.ConstantIdentifier;
import com.scaler.tokenizer.identifier.OperatorIdentifier;
import com.scaler.tokenizer.identifier.TokenIdentifier;

import java.util.ArrayList;
import java.util.List;

public class TokenIdentifierManager {
    List<TokenIdentifier> tokenIdentifierList;
    private static TokenIdentifierManager tokenIdentifierManagerInstance;
    private static Object mutex = new Object();

    private TokenIdentifierManager() {
        tokenIdentifierList = new ArrayList<>();
        tokenIdentifierList.add(OperatorIdentifier.getInstance());
        tokenIdentifierList.add(ConstantIdentifier.getInstance());
    }

    public static TokenIdentifierManager getInstance() {
        if(tokenIdentifierManagerInstance == null) {
            synchronized (mutex) {
                if(tokenIdentifierManagerInstance == null) {
                    tokenIdentifierManagerInstance = new TokenIdentifierManager();
                }
            }
        }
        return tokenIdentifierManagerInstance;
    }

    public TokenType getTokenType(String tokenValue) {
        TokenType tokenType;
        for(TokenIdentifier tokenIdentifier : tokenIdentifierList) {
            tokenType = tokenIdentifier.getTokenType(tokenValue);
            if(tokenType != TokenType.INVALID) {
                return tokenType;
            }
        }
        return TokenType.VARIABLE;
    }
}
