package com;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Zad3 {
    //dla wczytanej z klawiatury liczby naturalnej n wypisuje jej dzielniki

    public static void main(String[] args) {

        List<Integer> dzielniki = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę n");
        int number = scanner.nextInt();

        for(int i = 1; i<= number; i++){
            if(number%i == 0){
                dzielniki.add(i);
            }
        }
        System.out.println(dzielniki);
    }
}
