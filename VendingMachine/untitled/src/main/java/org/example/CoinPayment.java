package org.example;

public class CoinPayment implements PaymentStrategy{
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Payment through coin");
        return true;
    }
}
