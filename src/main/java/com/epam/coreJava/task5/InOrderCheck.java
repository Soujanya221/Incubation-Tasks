package com.epam.coreJava.task5;

import java.util.Scanner;

public class InOrderCheck {

    public static boolean inOrder(int a, int b, int c, boolean bOk) {

        if (bOk) {
            return c > b;
        } else {
            return b > a && c > b;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        System.out.print("Enter bOk (true/false): ");
        boolean bOk = sc.nextBoolean();

        boolean result = inOrder(a, b, c, bOk);

        System.out.println("Result: " + result);

        sc.close();
    }
}
