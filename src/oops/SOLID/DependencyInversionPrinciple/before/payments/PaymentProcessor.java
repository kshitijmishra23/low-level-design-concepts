package oops.SOLID.DependencyInversionPrinciple.before.payments;

import java.util.List;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.notification.EmailSender;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeFileRepository;
import oops.SOLID.DependencyInversionPrinciple.before.serielizer.EmployeeFileSerializer;

public class PaymentProcessor {


    public int sendPayments(){
    	EmployeeFileSerializer serializer =
                new EmployeeFileSerializer();
    	
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
