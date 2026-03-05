package com.epam.coreJava.task5;

import java.util.Scanner;

public class GreatNumberSix {

    public static boolean checkSixCondition(int a, int b) {

        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        boolean result = checkSixCondition(a, b);

        System.out.println("Result: " + result);

        sc.close();
    }
}
