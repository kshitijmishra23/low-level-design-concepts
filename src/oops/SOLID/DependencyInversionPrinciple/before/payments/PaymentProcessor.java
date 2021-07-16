package oops.SOLID.DependencyInversionPrinciple.before.payments;

import java.util.List;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.notification.EmailSender;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeFileRepository;
import oops.SOLID.DependencyInversionPrinciple.before.serielizer.EmployeeFileSerializer;

public class PaymentProcessor {
    private EmployeeFileSerializer serializer;

    public PaymentProcessor(EmployeeFileSerializer serializer) {
        this.serializer = serializer;
    }

    public int sendPayments(){
    	
    	EmployeeFileRepository employeeRepository = 
    			new EmployeeFileRepository(serializer);
    	
        List<Employee> employees = employeeRepository.findAll();
        int totalPayments = 0;

        for(Employee employee : employees){
            totalPayments += employee.getMonthlyIncome();
            EmailSender.notify(employee);
        }

        return totalPayments;
    }
}
