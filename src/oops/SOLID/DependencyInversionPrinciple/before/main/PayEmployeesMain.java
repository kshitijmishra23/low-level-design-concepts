package oops.SOLID.DependencyInversionPrinciple.before.main;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.notification.EmployeeEmailNotifier;
import oops.SOLID.DependencyInversionPrinciple.before.notification.Notifier;
import oops.SOLID.DependencyInversionPrinciple.before.payments.EmployeePaymentProcessor;
import oops.SOLID.DependencyInversionPrinciple.before.payments.PaymentProcessor;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeFileRepository;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.Repository;
import oops.SOLID.DependencyInversionPrinciple.before.serializer.EmployeeFileSerializer;
import oops.SOLID.DependencyInversionPrinciple.before.serializer.Serializer;

public class PayEmployeesMain {

    public static void main(String[] args) {
    	Serializer<Employee> serializer = new EmployeeFileSerializer();
    	Notifier<Employee> notifier = new EmployeeEmailNotifier();
    	Repository<Employee> employeeRepository = new EmployeeFileRepository(serializer);
        PaymentProcessor paymentProcessor = new EmployeePaymentProcessor(employeeRepository, notifier);
        int totalPayments = paymentProcessor.sendPayments();
        System.out.println("Total payments " + totalPayments);
    }
}
