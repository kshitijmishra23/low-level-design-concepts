package oops.SOLID.singleResponsibilityPrinciple.before;
import java.nio.file.Path;

public class FileDataBase implements DatabaseContract{
    Employee employee =this;
    public static void save(Path path,StringBuilder sb){
        try {
            Files.write(path, sb.toString().getBytes());
            System.out.println("Saved employee " + employee.toString());
        } catch (IOException e){
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }

}