package com.epam.Task3;

public class Transaction {

    private String paymentType;
    private double amount;
    private String status;

    public Transaction(String paymentType, double amount, String status) {
        this.paymentType = paymentType;
        this.amount = amount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "paymentType='" + paymentType + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
