package com.example;


import java.util.Arrays;

public class IterativeSort {
    public static void main (String[] args) {
        Integer[] a = {20, 1, 45, 8, 10, 99, 32, 77, 43, 31 };

        Integer[] d = {20, 1, 45, 8, 10, 99, 32, 77, 43, 31 };

        //Iterative sort
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                // if (a[i] > a[j]) {
                if (a[i].compareTo(a[j]) > 0 ) {
                    Integer temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("Initial array:       " + Arrays.toString(d) + "\n");
        System.out.println("From Iterative sort: " + Arrays.toString(a));

    }

}