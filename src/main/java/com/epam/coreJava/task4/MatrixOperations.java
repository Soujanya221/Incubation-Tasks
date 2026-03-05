package com.epam.coreJava.task4;

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows and columns of first matrix:");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println("Enter rows and columns of second matrix:");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];

        System.out.println("Enter elements of first matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                B[i][j] = sc.nextInt();
            }
        }

        System.out.println("Choose operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");

        int choice = sc.nextInt();

        if(choice == 1){

            if(r1 == r2 && c1 == c2){
                int[][] result = new int[r1][c1];

                for(int i=0;i<r1;i++){
                    for(int j=0;j<c1;j++){
                        result[i][j] = A[i][j] + B[i][j];
                    }
                }

                System.out.println("Result Matrix (Addition):");
                for(int i=0;i<r1;i++){
                    for(int j=0;j<c1;j++){
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }

            } else {
                System.out.println("Addition not possible. Dimensions must be same.");
            }

        } else if(choice == 2){

            if(c1 == r2){
                int[][] result = new int[r1][c2];

                for(int i=0;i<r1;i++){
                    for(int j=0;j<c2;j++){
                        for(int k=0;k<c1;k++){
                            result[i][j] += A[i][k] * B[k][j];
                        }
                    }
                }

                System.out.println("Result Matrix (Multiplication):");
                for(int i=0;i<r1;i++){
                    for(int j=0;j<c2;j++){
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }

            } else {
                System.out.println("Multiplication not possible.");
            }
        }

        sc.close();
    }
}
