package com.epam.oops.Task3;

import java.util.ArrayList;
import java.util.List;

public class PaymentProcessor {

    private List<Transaction> transactionHistory = new ArrayList<>();

    public void process(PaymentMethod paymentMethod, double amount) {

        try {
            paymentMethod.processPayment(amount);

            String status = paymentMethod.getPaymentStatus();

            Transaction transaction = new Transaction(
                    paymentMethod.getClass().getSimpleName(),
                    amount,
                    status
            );

            transactionHistory.add(transaction);

            System.out.println("Transaction सफल (SUCCESS): " + transaction);

        } catch (InvalidPaymentDetailsException e) {
            System.err.println("Validation Failed: " + e.getMessage());

        } catch (InsufficientFundsException e) {
            System.err.println("Payment Failed - Insufficient Funds: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("Unexpected Error: " + e.getMessage());
        }
    }

    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
    }
}
