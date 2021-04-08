package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.List;

public class EmployeeList {
    private static EmployeeList instance;
    private static List<Employee> employeeList;
    private EmployeeList(){

    }

    public static EmployeeList getInstance(){
        if(instance == null){
            synchronized (EmployeeList.class){
                if(instance == null) instance = new EmployeeList();
            }
        }
        return instance;
    }

    public List<Employee> getEmployeeList(){
        return employeeList;
    }
}
