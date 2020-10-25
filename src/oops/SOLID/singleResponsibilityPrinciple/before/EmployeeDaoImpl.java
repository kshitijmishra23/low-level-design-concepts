package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EmployeeDaoImpl implements EmployeeDao {

    private Serializer serializer;
    private String details;

    public EmployeeDaoImpl(Serializer serializer) {
        this.serializer = serializer;
    }

    public void save(Employee employee)
    {
        try{
            details = serializer.serialize(employee);
            Path path = Paths.get(employee.getFullName()
                    .replace(" ","_") + ".rec");
            Files.write(path, details.getBytes());
        }
        catch (IOException e)
        {
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }
}
