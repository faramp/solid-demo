package com.btpn.chip9.example3;

public class CreditCard implements PaymentCard{
    
    @Override
    public void transaction(double amount) {
        System.out.println("Payment using Credit Card with amount: " + amount);
    }
}
