import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

import oops.SOLID.singleResponsibilityPrinciple.before.Employee;

public class FileSaverUtil {
    static void save(StringBuilder sb, Employee employee) {
        try {

            Path path = Paths.get(employee.getFullName().replace(" ", "_") + ".rec");
            Files.write(path, sb.toString().getBytes());
        } catch (IOException e) {
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }
}
