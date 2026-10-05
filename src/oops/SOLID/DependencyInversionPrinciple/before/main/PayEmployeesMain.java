package oops.SOLID.DependencyInversionPrinciple.before.main;

import oops.SOLID.DependencyInversionPrinciple.before.notification.EmailSender;
import oops.SOLID.DependencyInversionPrinciple.before.payments.PaymentProcessor;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeFileRepository;
import oops.SOLID.DependencyInversionPrinciple.before.serielizer.EmployeeFileSerializer;

public class PayEmployeesMain {

    public static void main(String[] args) {
        EmployeeFileSerializer serializer = new EmployeeFileSerializer();
        EmployeeFileRepository employeeRepository = new EmployeeFileRepository(serializer);
        EmailSender emailSender = new EmailSender();

        PaymentProcessor paymentProcessor = new PaymentProcessor(employeeRepository, emailSender);
        int totalPayments = paymentProcessor.sendPayments();
        System.out.println("Total payments " + totalPayments);
    }
}
