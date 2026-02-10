package com.epam.collections.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            int score = scan.nextInt();
            players[i] = new Player(name, score);
        }
        scan.close();

        Arrays.sort(players, new Checker());
        for (Player p : players) {
            System.out.println(p.name + " " + p.score);
        }
    }
}