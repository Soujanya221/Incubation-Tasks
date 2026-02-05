package com.epam.oops.Task3;

public class PaymentApp {

    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();

        // Credit Card - Valid
        PaymentMethod ccValid = new CreditCardPayment(
                "4111111111111111", "12/25", "123");
        processor.process(ccValid, 5000);

        // Credit Card - Invalid
        PaymentMethod ccInvalid = new CreditCardPayment(
                "1234567890123456", "01/20", "abc");
        processor.process(ccInvalid, 5000);

        // PayPal - Valid
        PaymentMethod paypalValid = new PayPalPayment(
                "user@example.com", "securePassword123");
        processor.process(paypalValid, 3000);

        // PayPal - Invalid
        PaymentMethod paypalInvalid = new PayPalPayment(
                "invalidEmailFormat", "pass");
        processor.process(paypalInvalid, 3000);

        // Bank Transfer - Valid
        PaymentMethod bankValid = new BankTransfer(
                "1234567890", "Bank of Java");
        processor.process(bankValid, 25000);

        // Bank Transfer - Invalid
        PaymentMethod bankInvalid = new BankTransfer(
                "abc1234567", "");
        processor.process(bankInvalid, 1000);

        // Transaction History
        System.out.println("\n=== Transaction History ===");
        processor.getTransactionHistory()
                .forEach(System.out::println);
    }
}

