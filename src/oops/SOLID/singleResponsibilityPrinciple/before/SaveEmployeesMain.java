package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
            this.save(e);
        }
    }

    public  void save(Employee employee){
        try {
            SerializeData serialData=new SerializeData();
            String sb=serialData.getSerializeData(employee);
            CreatePath cp=new getSerializeData();
            Path path = cp.getPath(employee);
            Files.write(path, sb.getBytes());

            System.out.println("Saved employee " + employee.toString());
        } catch (IOException e){
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }
}