package oops.SOLID.DependencyInversionPrinciple.before.main;

import oops.SOLID.DependencyInversionPrinciple.before.payments.PaymentProcessor;

public class PayEmployeesMain {

    /*
    Will take a couple of seconds to execute due to the
    sending of mails.
     */

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        int totalPayments = paymentProcessor.sendPayments();
        System.out.println("Total payments " + totalPayments);
    }
}
