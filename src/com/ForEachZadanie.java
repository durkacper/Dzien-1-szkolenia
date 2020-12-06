package com;

import java.util.ArrayList;
import java.util.List;

public class ForEachZadanie {
    public static void main(String[] args) {


        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            integerList.add(i);
        }

        for (int i : integerList) {
            if (i % 2 == 0) {
                integerList.set(i, i * 2);
            }
        }

        for (int i : integerList) {
            System.out.println(integerList.get(i));
        }
    }


}
