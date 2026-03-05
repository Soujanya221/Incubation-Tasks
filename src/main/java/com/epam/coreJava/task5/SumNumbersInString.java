package com.epam.coreJava.task5;

import java.util.Scanner;

public class SumNumbersInString {

    public static int sumNumbers(String str) {

        int sum = 0;
        String num = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                num += ch;
            } else {
                if (!num.equals("")) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }

        // Add last number if string ends with digit
        if (!num.equals("")) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int result = sumNumbers(input);

        System.out.println("Sum of numbers: " + result);

        sc.close();
    }
}
