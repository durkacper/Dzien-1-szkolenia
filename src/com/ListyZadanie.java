package com;

import java.util.ArrayList;
import java.util.List;

public class ListyZadanie {

    public static void main(String[] args) {
            List<Integer> integerList = new ArrayList<>();

            for (int i = 0; i <= 100; i++) {
                integerList.add(i);
            }

            for (int i = 0; i <= 100; i++) {
                if (i%2 == 0){
                    integerList.set(i,i*2);
                }
            }

            for (int i = 0; i <= 100; i++) {
                System.out.println(integerList.get(i));
            }
        }

    }