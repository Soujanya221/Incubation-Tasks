package com.epam.coreJava.task5;

import java.util.Scanner;

public class TeaCandyParty {

    public static int partyResult(int tea, int candy) {

        if (tea < 5 || candy < 5) {
            return 0; // bad party
        }

        if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2; // great party
        }

        return 1; // good party
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount of tea: ");
        int tea = sc.nextInt();

        System.out.print("Enter amount of candy: ");
        int candy = sc.nextInt();

        int result = partyResult(tea, candy);

        System.out.println("Party Result: " + result);

        sc.close();
    }
}
