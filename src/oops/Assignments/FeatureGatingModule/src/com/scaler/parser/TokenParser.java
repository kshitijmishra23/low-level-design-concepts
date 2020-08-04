package com.scaler.parser;

import com.scaler.attribute.AttributeType;
import com.scaler.attribute.ObjectAttribute;
import com.scaler.tokenizer.entity.Token;
import com.scaler.tokenizer.entity.TokenType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TokenParser {

    public List<Token> parse(List<Token> tokenList, Map<String,Object> infoMap) {
        List<Token> parsedTokenList = new ArrayList<>();

        for(Token token: tokenList) {
            if(token.getType() == TokenType.VARIABLE) {
                String tokenValue = token.getTokenValue();
                if(infoMap.containsKey(tokenValue)) {
                    ObjectAttribute objectAttribute = (ObjectAttribute) infoMap.get(tokenValue);
                    token.setTokenValue(objectAttribute.getObjectAttributeValue());
                    token.setType(getTokenType(objectAttribute.getObjectAttributeType()));
                }
            }
            parsedTokenList.add(token);
        }
        return parsedTokenList;
    }

    private TokenType getTokenType(AttributeType attributeType) {
        TokenType tokenType = TokenType.VARIABLE;
        switch (attributeType) {
            case STRING:
                tokenType = TokenType.CONSTANT_STRING;
                break;
            case INTEGER:
                tokenType = TokenType.CONSTANT_INTEGER;
                break;

        }
        return tokenType;
    }
}
