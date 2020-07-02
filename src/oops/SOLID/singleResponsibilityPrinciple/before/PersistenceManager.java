package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersistenceManager {

  public static void persist(String key, String value) throws IOException {
    Path path = Paths.get(key
        .replace(" ", "_") + ".rec");
    Files.write(path, value.getBytes());
  }
}
