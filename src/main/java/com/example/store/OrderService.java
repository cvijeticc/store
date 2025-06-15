package com.example.store;

public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrger(){
        paymentService.processPayment(10);

    }
}
