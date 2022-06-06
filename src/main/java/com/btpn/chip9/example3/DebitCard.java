package com.btpn.chip9.example3;

public class DebitCard implements PaymentCard{
    
    @Override
    public void transaction(double amount) {
        System.out.println("Payment using Debit Card with amount: "+amount);
    }
}
