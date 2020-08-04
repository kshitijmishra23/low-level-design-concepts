package com.scaler;

import com.scaler.attribute.AgeAttribute;
import com.scaler.attribute.GenderAttribute;
import com.scaler.attribute.NameAttribute;
import com.scaler.evaluator.expressionEvaluator.InfixEvaluator;
import com.scaler.evaluator.expressionEvaluator.strategies.InfixToPostfixStrategy;
import com.scaler.evaluator.expressionEvaluator.strategies.PostfixEvaluationStrategy;
import com.scaler.parser.TokenParser;
import com.scaler.tokenizer.Tokenizer;
import com.scaler.tokenizer.entity.Token;
import com.scaler.tokenizer.factory.TokenizerFactory;
import com.scaler.tokenizer.factory.TokenizerType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static Map<String ,Object> createUser() {
        Map<String,Object> userMap = new HashMap<>();
        NameAttribute name = new NameAttribute("Test","User");
        GenderAttribute gender = new GenderAttribute("Male");
        AgeAttribute age = new AgeAttribute(27);
        userMap.put(name.getObjectAttributeSpecifier(), name);
        userMap.put(gender.getObjectAttributeSpecifier(),gender);
        userMap.put(age.getObjectAttributeSpecifier(),age);
        return userMap;
    }

    public static void main(String[] args) {
	// write your code here
        String input = "age > 25 AND gender == \"Male\" AND name == \"TestUser\"";
        Tokenizer tokenizer = TokenizerFactory.getTokenizer(TokenizerType.STRING);
        List<Token> tokenList = tokenizer.tokenize(input);

        Map<String ,Object> userMap = createUser();
        TokenParser parser = new TokenParser();
        tokenList = parser.parse(tokenList, userMap);

        InfixEvaluator evaluator = new InfixEvaluator();
        int res = evaluator.evaluateExpression(tokenList);

        System.out.println(res);

    }
}
