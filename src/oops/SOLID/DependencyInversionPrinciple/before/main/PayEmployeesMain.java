package oops.SOLID.DependencyInversionPrinciple.before.main;

import oops.SOLID.DependencyInversionPrinciple.before.payments.PaymentProcessor;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeFileRepository;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeRepository;
import oops.SOLID.DependencyInversionPrinciple.before.serielizer.EmployeeFileSerializer;

public class PayEmployeesMain {

    public static void main(String[] args) {
        final EmployeeRepository repository = new EmployeeFileRepository(new EmployeeFileSerializer());

        final int totalPayments = new PaymentProcessor(repository).sendPayments();
        System.out.println("Total payments " + totalPayments);
    }
}
