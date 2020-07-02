package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    public List<Employee> findAll(){
        EmployeeDao.findAll();
    }

    public void save(Employee employee){
        try {
            Path path = Paths.get(employee.getFullName()
                    .replace(" ","_") + ".rec");
            Files.write(path, employee.serialize().getBytes());

            System.out.println("Saved employee " + employee);
        } catch (IOException e){
            System.out.println("ERROR: Could not save employee. " + e);
        }
    }

}