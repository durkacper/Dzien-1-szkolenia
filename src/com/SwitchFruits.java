package com;

import java.util.Scanner;

public class SwitchFruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj nazwę owocu");
        String fruitName = sc.next();

        System.out.println("Podaj ilosc owocow");
        int amountOfFruits = sc.nextInt();

        switch (fruitName) {
            case "pomarancze":
                if (amountOfFruits > 100) {
                    System.out.println("Owocow jest za duzo o " + (amountOfFruits - 100) + " kg");
                } else if (amountOfFruits == 100) {
                    System.out.println("Owocow jest w sam raz");
                } else
                    System.out.println("Mamy jeszcze " + (100 - amountOfFruits) + " kg miejsca");

                break;

            case "jablka":
                if (amountOfFruits > 100) {
                    System.out.println("Owocow jest za duzo o " + (amountOfFruits - 100) + " kg");
                } else if (amountOfFruits == 100) {
                    System.out.println("Owocow jest w sam raz");
                } else
                    System.out.println("Mamy jeszcze " + (100 - amountOfFruits) + " kg miejsca");
                break;

            case "banany":
                if (amountOfFruits > 100) {
                    System.out.println("Owocow jest za duzo o " + (amountOfFruits - 100) + " kg");
                } else if (amountOfFruits == 100) {
                    System.out.println("Owocow jest w sam raz");
                } else
                    System.out.println("Mamy jeszcze " + (100 - amountOfFruits) + " kg miejsca");
                break;
        }
    }
}
