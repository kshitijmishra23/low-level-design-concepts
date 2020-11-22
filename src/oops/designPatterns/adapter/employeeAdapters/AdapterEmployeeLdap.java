package oops.designPatterns.adapter.employees;

public class AdapterEmployeeLdap implements Employee{
    private EmployeeCSV employee;
    public AdapterEmployeeCSV(EmployeeLdap e){
        this.employee = e
    }
    public String getId(){
        return this.employee.getCn();
    }
	public String getFirstName(){
        return this.employee.getGivenName();
    }
	public String getLastName(){
        return this.employee.getSurname();
    }
	public String getEmail(){
        return this.employee.getMail();
    }
}