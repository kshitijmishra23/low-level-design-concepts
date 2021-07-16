package oops.SOLID.DependencyInversionPrinciple.before.main;
import oops.SOLID.DependencyInversionPrinciple.before.serielizer.EmployeeFileSerializer;
import oops.SOLID.DependencyInversionPrinciple.before.payments.PaymentProcessor;

public class PayEmployeesMain {

    public static void main(String[] args) {
        EmployeeFileSerializer serializer = new EmployeeFileSerializer();
        PaymentProcessor paymentProcessor = new PaymentProcessor(serializer);
        int totalPayments = paymentProcessor.sendPayments();
        System.out.println("Total payments " + totalPayments);
    }
}
