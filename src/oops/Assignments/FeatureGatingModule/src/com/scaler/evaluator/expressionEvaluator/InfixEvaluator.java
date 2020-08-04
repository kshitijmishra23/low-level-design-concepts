package com.scaler.evaluator.expressionEvaluator;

import com.scaler.evaluator.expressionEvaluator.strategies.InfixToPostfixStrategy;
import com.scaler.evaluator.expressionEvaluator.strategies.PostfixEvaluationStrategy;
import com.scaler.tokenizer.entity.Token;

import java.util.List;

public class InfixEvaluator extends ExpressionEvaluator {

    @Override
    public int evaluateExpression(List<Token> tokenList) {
        // can be injected
        InfixToPostfixStrategy conversionStrategy = new InfixToPostfixStrategy();
        List<Token> postfixTokenList = conversionStrategy.convertInfixToPostfix(tokenList);

        PostfixEvaluationStrategy strategy = new PostfixEvaluationStrategy();
        int res = strategy.evaluate(postfixTokenList);
        return res;
    }
}
