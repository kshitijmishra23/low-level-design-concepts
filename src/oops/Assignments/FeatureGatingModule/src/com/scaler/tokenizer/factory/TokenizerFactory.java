package com.scaler.tokenizer.factory;

import com.scaler.tokenizer.StringTokenizer;
import com.scaler.tokenizer.Tokenizer;

public class TokenizerFactory {

    public static Tokenizer getTokenizer(TokenizerType type) {
        Tokenizer tokenizer = null;
        switch (type) {
            case STRING:
                tokenizer = StringTokenizer.getInstance();
                break;
            case INTEGER:
            case INVALID:
                break;
        }
        return tokenizer;
    }
}
