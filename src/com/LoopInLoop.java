package com;

public class LoopInLoop {
        public static void main(String[] args) {
            int[][] myArray = new int[10][20];

            int counter = 0;
            for (int i = 0; i < myArray.length; i++) {
                for (int j = 0; j < myArray[i].length; j++) {
                    myArray[i][j] = counter;
                    counter++;
                    System.out.println("tab[" + i + "," + j + "] = " + myArray[i][j] + ";");
                }
            }
        }
    }