package com.scaler.tokenizer;

import com.scaler.tokenizer.entity.Token;
import com.scaler.tokenizer.tokencache.TokenCache;

import java.util.List;

public abstract class Tokenizer {
    TokenCache tokenCache;

    public abstract List<Token> tokenize(Object object);

}
