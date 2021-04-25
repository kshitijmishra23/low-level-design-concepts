package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        public  void save(ISavable savable){
            try {
                Path path = Paths.get(savable.getFileName());
                Files.write(path, savable.getSavableData().getBytes());

                System.out.println("Saved employee " + employee.toString());
            } catch (IOException e){
                System.out.println("ERROR: Could not save employee. " + e);
            }
        }

        // Save all
        for (Employee e : employees){
            save(e);
        }
    }
}