package oops.SOLID.singleResponsibilityPrinciple.before;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DBConnection {
    public static Path getPath(String pathStartWith){
        return Paths.get(pathStartWith
        .replace(" ","_") + ".rec");
    }
}
