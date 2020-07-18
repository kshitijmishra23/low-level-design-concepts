package oops.SOLID.DependencyInversionPrinciple.before.payments;

import java.util.List;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.notification.EmailSender;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeFileRepository;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeRepository;
import oops.SOLID.DependencyInversionPrinciple.before.serielizer.EmployeeFileSerializer;
import oops.SOLID.DependencyInversionPrinciple.before.serielizer.EmployeeSerializer;

public class PaymentProcessor {

    EmployeeRepository employeeRepository;

    public PaymentProcessor(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public int sendPayments(){
    	
        List<Employee> employees = employeeRepository.findAll();
        int totalPayments = 0;

        for(Employee employee : employees){
            totalPayments += employee.getMonthlyIncome();
            EmailSender.notify(employee);
        }

        return totalPayments;
    }
}
