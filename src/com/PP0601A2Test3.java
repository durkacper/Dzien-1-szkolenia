package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PP0601A2Test3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int counter = 0;

        int firstNumber = scanner.nextInt();
        list.add(firstNumber);

        do {
            int number = scanner.nextInt();
            list.add(number);

            if (number == 42 && list.get(list.size() - 2) != 42) {
                counter++;
            }

        } while (counter != 3);

        System.out.println(list);


    }

}
