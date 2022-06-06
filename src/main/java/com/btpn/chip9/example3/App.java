package com.btpn.chip9.example3;

public class App {
    
    public static void main(String[] args) {
        // DebitCard debitCard = new DebitCard();
        CreditCard creditCard = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(creditCard);
        shoppingMall.payment("Jeans", 200000);
    }
}
