package oops.SOLID.DependencyInversionPrinciple.before.payments;

import java.util.List;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.notification.EmailSender;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeFileRepository;

public class PaymentProcessor {

    private EmployeeFileRepository employeeFileRepository;

    public PaymentProcessor(EmployeeFileRepository employeeFileRepository) {
        this.employeeFileRepository = employeeFileRepository;
    }
    
    public int sendPayments(){
    	
        List<Employee> employees = employeeFileRepository.findAll();
        int totalPayments = 0;

        for(Employee employee : employees){
            totalPayments += employee.getMonthlyIncome();
            EmailSender.notify(employee);
        }

        return totalPayments;
    }
}
