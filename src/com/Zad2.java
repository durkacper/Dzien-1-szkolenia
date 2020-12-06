package com;

public class Zad2 {
// wypisz największą liczbę niepodzielną przez 2,3,5,7 ale mniejszą od 1000

    public static void main(String[] args) {

        for (int i =999; i>= 0; i--){
            if(i%2 != 0 && i%3 != 0 && i%5 != 0 && i%7 != 0){
                System.out.println(i);
                break;
            }
        }
    }
}
