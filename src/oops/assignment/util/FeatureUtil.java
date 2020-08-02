package oops.assignment.util;

import oops.assignment.MyException;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FeatureUtil {
  public static boolean isAllowed(String conditionalExpression, Map<String, Object> user)
      throws MyException {

    Map<String, String> userAttrib = UserUtil.transform(user);
    return evaluateCondition(conditionalExpression, userAttrib);
  }

  private static boolean evaluateCondition(String conditionalExpression, Map<String, String> user)
      throws MyException {
    conditionalExpression = conditionalExpression.toUpperCase();
    String allowedOps = "AND|OR";
    Pattern pattern =
        Pattern.compile(
            "\\b(?!" + allowedOps + "|[0-9]|[\\w-]\\b)(?=[^\"]*(\"[^\"]*\"[^\"]*)*$)[\\w-]+\\b");

    Matcher m = pattern.matcher(conditionalExpression);
    Set<String> operands = new HashSet<>();
    while (m.find()) {
      // if user map dont have required attrib return
      if (!user.containsKey(m.group())) throw new MyException("User attribute missing");
      operands.add(m.group());
      try {
        Integer.parseInt(user.get(m.group()));
        conditionalExpression = conditionalExpression.replace(m.group(), user.get(m.group()));

      } catch (NumberFormatException ne) {
        conditionalExpression =
            conditionalExpression.replace(m.group(), "\"" + user.get(m.group()) + "\"");
      }
    }
    System.out.println(conditionalExpression);
    return EvaluateString.evaluate(conditionalExpression);
  }
}
