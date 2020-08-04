package com.scaler.tokenizer.identifier;

import com.scaler.tokenizer.entity.TokenType;

public interface TokenIdentifier {
    TokenType getTokenType(String tokenValue);

}
