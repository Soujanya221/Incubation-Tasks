package com.epam.oops.Task3;

public abstract class PaymentMethod {

    protected String paymentStatus = "NOT_PROCESSED";

    public abstract void processPayment(double amount)
            throws InsufficientFundsException, InvalidPaymentDetailsException;

    public abstract boolean validatePaymentDetails()
            throws InvalidPaymentDetailsException;

    public String getPaymentStatus() {
        return paymentStatus;
    }
}

