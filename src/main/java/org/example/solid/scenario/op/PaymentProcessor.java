package org.example.solid.scenario.op;

public class PaymentProcessor {

    public void processPayment(String type) {
        if (type.equals("credit"))
            System.out.println("Processing credit card");
        else if (type.equals("paypal")) {
            System.out.println("Processing PayPal");
        } else if (type.equals("crypto")) {
            System.out.println("Processing crypto");
        }
    }
}
