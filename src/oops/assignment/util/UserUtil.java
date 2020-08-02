package oops.assignment.util;

import oops.assignment.MyException;

import java.util.HashMap;
import java.util.Map;

public class UserUtil {

  public static Map<String, String> transform(Map<String, Object> user) throws MyException {
    Map<String, String> userAttrib = new HashMap<>();

    // flatten the nested map and store all attrib in a single map with depth=1
    for (Map.Entry<String, Object> u : user.entrySet()) {
      if (u.getValue().getClass() == HashMap.class) {

        // recursive call till there is a nested map
        userAttrib.putAll(transform((Map<String, Object>) u.getValue()));
      } else if (isClassAllowed(u.getValue().getClass())) {
        userAttrib.put(u.getKey().toUpperCase(), String.valueOf(u.getValue()).toUpperCase());
      } else {
        throw new MyException("Object Type not supported");
      }
    }
    return userAttrib;
  }

  private static boolean isClassAllowed(Class<?> clazz) {
    return clazz.equals(Boolean.class) || clazz.equals(Integer.class) || clazz.equals(String.class);
  }
}
