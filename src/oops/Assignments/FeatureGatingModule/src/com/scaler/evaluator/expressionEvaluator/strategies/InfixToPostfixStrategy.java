package com.scaler.evaluator.expressionEvaluator.strategies;

import com.scaler.operator.Operator;
import com.scaler.operator.OperatorFactory;
import com.scaler.operator.OperatorPrecedence;
import com.scaler.tokenizer.entity.Token;
import com.scaler.tokenizer.entity.TokenType;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InfixToPostfixStrategy {

    public List<Token> convertInfixToPostfix(List<Token> tokenList) {
        List<Token> postfixTokenList = new ArrayList<>();

        Stack<Token> stack = new Stack<>();
        for(Token token : tokenList) {

            if(token.getType() == TokenType.OPERATOR) {

                Operator currentOperator = OperatorFactory.getOperator(token.getTokenValue());
                OperatorPrecedence currentOpPrecendece = currentOperator.getOpPrecedence();

                while(!stack.empty()) {
                    Token lastOpToken = stack.peek();
                    Operator lastOperator = OperatorFactory.getOperator(lastOpToken.getTokenValue());
                    OperatorPrecedence lastOpPrecendece = lastOperator.getOpPrecedence();

                    if(lastOpPrecendece.getValue() >= currentOpPrecendece.getValue()) {
                        postfixTokenList.add(stack.pop());
                    } else {
                        break;
                    }
                }
                stack.push(token);
            } else {
                postfixTokenList.add(token);
            }

        }

        while(!stack.empty()) {
            postfixTokenList.add(stack.pop());
        }
        return postfixTokenList;
    }
}
