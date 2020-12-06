package com;


import java.util.Scanner;

public class Zad1 {
// liczy sumę n początkowych liczb naturalnych podzielnych przez 5
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int suma = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 5 == 0) {
                int wynik = suma += i;
            }
        }
        System.out.println(suma);
    }
}