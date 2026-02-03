package com.epam.Task3;

public class PayPalPayment extends PaymentMethod {

    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public boolean validatePaymentDetails() throws InvalidPaymentDetailsException {
        if (!email.matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
            throw new InvalidPaymentDetailsException("Invalid email format");
        }

        if (password == null || password.length() < 6) {
            throw new InvalidPaymentDetailsException("Invalid PayPal password");
        }

        return true;
    }

    @Override
    public void processPayment(double amount)
            throws InsufficientFundsException, InvalidPaymentDetailsException {

        validatePaymentDetails();

        if (amount > 20000) {
            throw new InsufficientFundsException("PayPal balance insufficient");
        }

        paymentStatus = "SUCCESS";
        System.out.println("PayPal payment processed: ₹" + amount);
    }
}


