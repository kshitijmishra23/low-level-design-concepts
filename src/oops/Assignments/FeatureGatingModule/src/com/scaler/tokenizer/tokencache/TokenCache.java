package com.scaler.tokenizer.tokencache;

import com.scaler.tokenizer.entity.TokenType;

import java.util.HashMap;
import java.util.Map;

public class TokenCache {

    private static TokenCache tokenCache;
    private static Object mutex = new Object();
    private static Map<String,TokenType> tokenCacheMap;

    private TokenCache() {
        tokenCacheMap = new HashMap<>();
    }

    public static TokenCache getInstance() {
        if(tokenCache == null) {
            synchronized (mutex) {
                if(tokenCache == null) {
                    tokenCache = new TokenCache();
                }
            }
        }
        return tokenCache;
    }

    public void addTokenToCache(String tokenValue, TokenType type) {
        tokenCacheMap.put(tokenValue,type);
    }

    public TokenType getTokenTypeFromCache(String tokenValue) {
        if(tokenCacheMap.containsKey(tokenValue)) {
            return tokenCacheMap.get(tokenValue);
        }

        return TokenType.INVALID;
    }
}
