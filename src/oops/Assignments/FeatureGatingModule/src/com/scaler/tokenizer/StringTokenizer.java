package com.scaler.tokenizer;

import com.scaler.tokenizer.entity.Token;
import com.scaler.tokenizer.entity.TokenType;
import com.scaler.tokenizer.identifier.manager.TokenIdentifierManager;
import com.scaler.tokenizer.tokencache.TokenCache;


import java.util.ArrayList;
import java.util.List;

public class StringTokenizer extends Tokenizer{

    private TokenIdentifierManager tokenIdentifierManager;
    private static StringTokenizer stringTokenizer;
    private static Object mutex = new Object();


    private StringTokenizer() {
        tokenIdentifierManager = TokenIdentifierManager.getInstance();
        tokenCache = TokenCache.getInstance();
    }

    public static StringTokenizer getInstance() {
        if(stringTokenizer == null) {
            synchronized (mutex) {
                if(stringTokenizer == null) {
                    stringTokenizer = new StringTokenizer();
                }
            }
        }
        return stringTokenizer;
    }


    @Override
    public List<Token> tokenize(Object object) {
        List<Token> tokens = new ArrayList<>();

        if( object instanceof String) {
            TokenType type;
            String input = (String) object;
            String[] tokenStrings = input.split("\\s+");

            for(String tokenValue : tokenStrings) {
                type = tokenCache.getTokenTypeFromCache(tokenValue);

                if( type == TokenType.INVALID) {
                    type = tokenIdentifierManager.getTokenType(tokenValue);

                    if(type != TokenType.INVALID &&
                       type != TokenType.CONSTANT_INTEGER &&
                       type != TokenType.CONSTANT_STRING) {
                        tokenCache.addTokenToCache(tokenValue,type);
                    }
                }
                tokens.add(new Token(type,tokenValue));
            }
        }

        return tokens;
    }
}
