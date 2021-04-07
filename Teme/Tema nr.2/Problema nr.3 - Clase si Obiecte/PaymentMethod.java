package com.company;

public class PaymentMethod {
    private String type;
    public PaymentMethod()
    {
        this.type = "Card";
    }
    public PaymentMethod(String metoda)
    {
        this.type = metoda;
    }
    public String getPaymentMethod()
    {
        return type;
    }
    public String toString() {
        return getPaymentMethod();
    }
}