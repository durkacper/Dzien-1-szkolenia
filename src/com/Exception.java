package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {

        try {
            System.out.println("przed wyjątkiem");
            //int a = 2 / 0;
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            System.out.println("po wyjątku");
        } catch (ArithmeticException e) {
            System.out.println("to jest blad arytmetyczny: " +
                    e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("blad danych " + e.getMessage());
        }finally {
            System.out.println("po wyjątku");
        }

    }
}
