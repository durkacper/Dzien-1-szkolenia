package com;

public class ExceptionZadanie {

    public static void main(String[] args) {

        int[] tab = {1, 2, 3, 4, 5};

        try {
            for (int i = 0; i < 10; i++) { //i<10 wykracza poza 5 elementów
                System.out.println(tab[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}