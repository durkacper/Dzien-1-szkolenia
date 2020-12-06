package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RNO_DODProsteDodawanie {

    public static void main(String[] args) {

        System.out.println("podaj liczbe testow: ");
        Scanner scanner = new Scanner(System.in);
        int testNumber = scanner.nextInt();
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < testNumber; i++) {
            int amountNumbersToSum = scanner.nextInt();
            int sum = 0;
                for (int j = 0; j < amountNumbersToSum; j++){
                    sum = sum + scanner.nextInt();
            }
                results.add(sum);
        }
        System.out.println(results);

    }
}
