package oops.designPatterns.adapter.employees;

public class AdapterEmployeeCSV implements Employee{
    private EmployeeCSV employee;
    public AdapterEmployeeCSV(EmployeeCSV e){
        this.employee = e
    }
    public String getId(){
        return this.employee.getId();
    }
	public String getFirstName(){
        return this.employee.getFirstname();
    }
	public String getLastName(){
        return this.employee.getLastname();
    }
	public String getEmail(){
        return this.employee.getEmailAddress();
    }
}