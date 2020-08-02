package oops.assignment.util;

import java.util.Stack;

public class EvaluateString {
  public static boolean evaluate(String expression) {
    // evaluate infix conditionExpression
    return false;
  }

  public static boolean checkPrecedance(String op1, String op2) {
    if (op2 == "(" || op2 == ")") return false;
    if (op1 == "AND" && op2 == "OR") return false;
    else return true;
  }

  public static boolean applyOp(String op, String b, String a) {
    switch (op) {
      case ">":
        return Integer.valueOf(a) > Integer.valueOf(b);
      case ">=":
        return Integer.valueOf(a) >= Integer.valueOf(b);
      case "<":
        return Integer.valueOf(a) < Integer.valueOf(b);
      case "<=":
        return Integer.valueOf(a) <= Integer.valueOf(b);
      case "==":
        return Integer.valueOf(a) == Integer.valueOf(b);
      case "!=":
        return Integer.valueOf(a) != Integer.valueOf(b);
      default:
        throw new UnsupportedOperationException("Cannot divide by zero");
    }
  }
}
