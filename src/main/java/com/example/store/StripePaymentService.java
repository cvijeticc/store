package com.example.store;

import org.springframework.stereotype.Component;

//@Component
public class StripePaymentService implements PaymentService {
    @Override
    public void processPayment(double amount){
        System.out.println("STRIPE");
        System.out.println("Amount: "+ amount );

    }
}
