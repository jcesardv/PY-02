package org.example.solid.solution.op;

public class Main {

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        processor.processPayment(new CreditCardPayment());
        processor.processPayment(new PayPalPayment());
        processor.processPayment(new CryptoPayment());
    }
}

class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.process();
    }
}

class CreditCardPayment implements PaymentMethod {
    @Override public void process() {
        System.out.println("Processing credit card");
    }
}

class PayPalPayment implements PaymentMethod {
    @Override public void process() {
        System.out.println("Processing PayPal");
    }
}

class CryptoPayment implements PaymentMethod {
    @Override public void process() {
        System.out.println("Processing Crypto");
    }
}