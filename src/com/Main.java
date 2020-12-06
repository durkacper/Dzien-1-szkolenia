package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Podaj liczbe a:");
        int a = scanner.nextInt();

        System.out.printf("Podaj lioczbe b:");
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println("a mniejsze od b");
        } else if (a == b) {
            System.out.println("a rowna sie b");
        } else {
            System.out.println("a wieksze od b");

        }
    }
}
