package oops.assignment;

import oops.assignment.util.FeatureUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;

public class FeatureGatingDemo {
  public static void main(String[] args) {
    Map<String, Object> user = new HashMap<>();
    Map<String, Object> address = new HashMap<>();
    address.put("city", "noida");
    address.put("state", "UP");
    address.put("pincode", "204102");
    user.put("gender", "Male");
    user.put("age", 50);
    user.put("past_order_amount", 500);
    user.put("address", address);
    try {
      boolean result =
          FeatureUtil.isAllowed(
              "(age > 25 AND gender == \"Male\") OR (past_order_amount > 10000 AND pincode == 204102)",
              user);
      System.out.println("result = " + result);
    } catch (MyException e) {
      e.printStackTrace();
    }
  }
}
