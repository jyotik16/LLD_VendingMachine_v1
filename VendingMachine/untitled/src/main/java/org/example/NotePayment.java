package org.example;

public class NotePayment implements PaymentStrategy{
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Payment through note");
        return true;
    }
}
