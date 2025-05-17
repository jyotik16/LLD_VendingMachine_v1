package org.example;

public class CardPayment implements PaymentStrategy{
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Payment through card");
        return true;
    }
}
