package com.btpn.chip9.dip;

public class ShoppingMall {
    
    PaymentCard paymentCard;

    public ShoppingMall(PaymentCard paymentCard) {
        this.paymentCard = paymentCard;
    }

    public void payment(Object product, double amount) {
        System.out.println("Pay product: " + product);
        this.paymentCard.transaction(amount);
    }
}
