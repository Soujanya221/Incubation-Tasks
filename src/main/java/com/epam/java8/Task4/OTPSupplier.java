package com.epam.java8.Task4;

import java.util.Random;
import java.util.function.Supplier;

public class OTPSupplier {

    public static void main(String[] args) {

        Supplier<String> otpSupplier = () -> {

            Random random = new Random();
            StringBuilder otp = new StringBuilder();

            for (int i = 0; i < 6; i++) {
                otp.append(random.nextInt(10));
            }

            return otp.toString();
        };

        System.out.println("Generated OTP: " + otpSupplier.get());
    }
}
