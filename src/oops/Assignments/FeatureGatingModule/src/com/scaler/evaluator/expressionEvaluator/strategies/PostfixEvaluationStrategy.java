package com.scaler.evaluator.expressionEvaluator.strategies;

import com.scaler.operator.Operand;
import com.scaler.operator.Operator;
import com.scaler.operator.OperatorFactory;
import com.scaler.tokenizer.entity.Token;
import com.scaler.tokenizer.entity.TokenType;

import java.util.List;
import java.util.Stack;

public class PostfixEvaluationStrategy {

    public int evaluate(List<Token> tokenList) {
        //create a stack
        Stack<Token> stack=new Stack<>();


        // Scan all characters one by one
        for(Token token : tokenList)
        {
            if(token.getType() != TokenType.OPERATOR) {
                    stack.push(token);
            }

            else
            {
                Token val1 = stack.pop();
                Token val2 = stack.pop();

                Operator operator = OperatorFactory.getOperator(token.getTokenValue());
                Operand operand1 = null;
                Operand operand2 = null;

                Integer a =0, b= 0;
                boolean isInteger = false;


                if(val1.getType() == TokenType.CONSTANT_INTEGER
                        && val2.getType() == TokenType.CONSTANT_INTEGER) {
                        a = Integer.parseInt(val1.getTokenValue());
                        b = Integer.parseInt(val2.getTokenValue());
                        isInteger = true;
                }

                if(isInteger) {
                    operand1 = new Operand(a);
                    operand2 = new Operand(b);
                } else {
                    operand1 = new Operand(val1.getTokenValue());
                    operand2 = new Operand(val2.getTokenValue());
                }

                Object result = operator.operate(operand2,operand1);

                Token resToken = new Token(TokenType.CONSTANT_INTEGER,result.toString());
                stack.push(resToken);

            }
        }
        return Integer.parseInt(stack.pop().getTokenValue());
    }

}
