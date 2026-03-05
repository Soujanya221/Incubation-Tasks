package com.epam.coreJava.task5;

import java.util.Scanner;

public class SpeedTicket {

    public static int caughtSpeeding(int speed, boolean isBirthday) {

        if (isBirthday) {
            speed = speed - 5;
        }

        if (speed <= 60) {
            return 0; // no ticket
        }
        else if (speed <= 80) {
            return 1; // small ticket
        }
        else {
            return 2; // big ticket
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed: ");
        int speed = sc.nextInt();

        System.out.print("Is it your birthday? (true/false): ");
        boolean isBirthday = sc.nextBoolean();

        int result = caughtSpeeding(speed, isBirthday);

        System.out.println("Ticket result: " + result);

        sc.close();
    }
}
