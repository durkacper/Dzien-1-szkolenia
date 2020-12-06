package com;

import java.util.Scanner;

public class SwitchNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Podaj imie");
        String name = sc.next();

        switch (name) {
            case "Michal":
                System.out.printf("Czesc " + name);
                break;
            case "Kamil":
                System.out.printf("Czesc " + name);
                break;
            case "Ala":
                System.out.printf("Czesc " + name);
                break;
            default:
                System.out.printf("Nie znam cie");

        }
    }
}
