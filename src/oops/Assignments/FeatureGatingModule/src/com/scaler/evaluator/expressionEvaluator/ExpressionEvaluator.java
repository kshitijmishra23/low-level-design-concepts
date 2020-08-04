package com.scaler.evaluator.expressionEvaluator;

import com.scaler.tokenizer.entity.Token;

import java.util.List;

public abstract class ExpressionEvaluator {
    public abstract int evaluateExpression(List<Token> tokenList);
}
