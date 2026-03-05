package com.epam.coreJava.task5;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SumNumbersWithLogger {

    private static final Logger logger = LogManager.getLogger(SumNumbersWithLogger.class);

    public static void main(String[] args) {

        logger.info("Program started");

        String input = "aa11b33";

        int sum = sumNumbers(input);

        logger.info("Sum of numbers: " + sum);

        logger.error("Example error log (for demonstration)");
    }

    public static int sumNumbers(String str) {

        int sum = 0;
        String number = "";

        for (char c : str.toCharArray()) {

            if (Character.isDigit(c)) {
                number += c;
            } else {
                if (!number.isEmpty()) {
                    sum += Integer.parseInt(number);
                    number = "";
                }
            }
        }

        if (!number.isEmpty()) {
            sum += Integer.parseInt(number);
        }

        return sum;
    }
}