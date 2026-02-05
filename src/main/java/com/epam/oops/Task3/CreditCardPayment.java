package com.epam.oops.Task3;

public class CreditCardPayment extends PaymentMethod {

    private String cardNumber;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public boolean validatePaymentDetails() throws InvalidPaymentDetailsException {
        if (!cardNumber.matches("\\d{16}")) {
            throw new InvalidPaymentDetailsException("Invalid card number");
        }

        if (!cvv.matches("\\d{3}")) {
            throw new InvalidPaymentDetailsException("Invalid CVV");
        }

        // Very basic expiry validation
        if (!expiryDate.matches("\\d{2}/\\d{2}")) {
            throw new InvalidPaymentDetailsException("Invalid expiry date format");
        }

        return true;
    }

    @Override
    public void processPayment(double amount)
            throws InsufficientFundsException, InvalidPaymentDetailsException {

        validatePaymentDetails();

        if (amount > 50000) { // Simulated limit
            throw new InsufficientFundsException("Credit limit exceeded");
        }

        paymentStatus = "SUCCESS";
        System.out.println("Credit Card payment processed: ₹" + amount);
    }
}


