package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository {

    public List<Employee> findAll() {

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        return Arrays.asList(anna, billy, steve, magda);
    }

    public void save(Employee employee) throws IOException {
        String employeeStr = serializeEmployee(employee);
        Path path = Paths.get(employee.getFullName()
                .replace(" ", "_") + ".rec");
        Files.write(path, employeeStr.getBytes());
        System.out.println("Saved employee " + employee.toString());
    }

    private String serializeEmployee(Employee e) {
        StringBuilder sb = new StringBuilder();
        sb.append("### EMPLOYEE RECORD ####");
        sb.append(System.lineSeparator());
        sb.append("NAME: ");
        sb.append(e.getFullName());
        sb.append(System.lineSeparator());
        sb.append("POSITION: ");
        sb.append(getEmployeeTypeOfEmployeeSubClass(e.getClass()));
        sb.append(System.lineSeparator());
        sb.append("EMAIL: ");
        sb.append(e.getEmail());
        sb.append(System.lineSeparator());
        sb.append("MONTHLY WAGE: ");
        sb.append(e.getMonthlyIncome());
        sb.append(System.lineSeparator());
        return sb.toString();
    }

    /**
     * Making the Employee position fancy, as Position appears as a.b.c.ClassName.
     * @param c
     * @return
     */
    private String getEmployeeTypeOfEmployeeSubClass(Class c) {
        return c.getTypeName().substring(c.getTypeName().lastIndexOf(".") + 1);
    }
}