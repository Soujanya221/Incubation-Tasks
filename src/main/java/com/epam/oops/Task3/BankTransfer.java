package com.epam.Task3;

public class BankTransfer extends PaymentMethod {

    private String accountNumber;
    private String bankName;

    public BankTransfer(String accountNumber, String bankName) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    @Override
    public boolean validatePaymentDetails() throws InvalidPaymentDetailsException {

        if (!accountNumber.matches("\\d{10}")) {
            throw new InvalidPaymentDetailsException("Invalid account number");
        }

        if (bankName == null || bankName.trim().isEmpty()) {
            throw new InvalidPaymentDetailsException("Invalid bank name");
        }

        return true;
    }

    @Override
    public void processPayment(double amount)
            throws InsufficientFundsException, InvalidPaymentDetailsException {

        validatePaymentDetails();

        if (amount > 100000) {
            throw new InsufficientFundsException("Bank transfer limit exceeded");
        }

        paymentStatus = "SUCCESS";
        System.out.println("Bank transfer processed: ₹" + amount);
    }
}
