package com.epam.coreJava.task4;

import java.util.Scanner;

public class StringCompression {

    public static String compressString(String str) {

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(str.charAt(i)).append(count);
                count = 1;
            }
        }

        // Return original if compressed string is not smaller
        if (compressed.length() >= str.length()) {
            return str;
        }

        return compressed.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = compressString(input);

        System.out.println("Output: " + result);

        sc.close();
    }
}