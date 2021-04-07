package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    public List<Employee> findAll(){

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        return Arrays.asList(anna, billy, steve, magda);
    }

    public void save(String key, String serializedEmployee){
        Path path = Paths.get(key + ".rec");
        try {
            Files.write(path, serializedEmployee.getBytes());
            System.out.println("Saved " + serializedEmployee);
        } catch (IOException e) {
            System.out.println("Error in saving " + e.getMessage());
        }
    }

    public void saveAll(List<Employee> employees) {
        for (Employee e : employees){
            save(e.generateKey(), e.serialize());
        }
    }
}