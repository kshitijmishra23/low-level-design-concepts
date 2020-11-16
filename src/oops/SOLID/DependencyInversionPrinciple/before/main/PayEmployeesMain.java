package oops.SOLID.DependencyInversionPrinciple.before.main;

import oops.SOLID.DependencyInversionPrinciple.before.payments.PaymentProcessor;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeFileRepository;
import oops.SOLID.DependencyInversionPrinciple.before.serielizer.EmployeeFileSerializer;

public class PayEmployeesMain {

    public static void main(String[] args) {
        EmployeeFileRepository employeeFileRepository = new EmployeeFileRepository(new EmployeeFileSerializer());
        PaymentProcessor paymentProcessor = new PaymentProcessor(employeeFileRepository);

        int totalPayments = paymentProcessor.sendPayments();
        System.out.println("Total payments " + totalPayments);
    }
}
