package com.example.store;

import org.springframework.stereotype.Component;

@Component
public class PayPalPaymentService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal");
        System.out.println("Amount " + amount);
    }
}
