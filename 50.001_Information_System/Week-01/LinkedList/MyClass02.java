package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class MyClass02 {
    public static void main(String [] args) {
        System.out.println("hello class");
        tst2();

    }

    public static List<String> tst2() {
        int limit = 100000;
        String [] s = new String[limit];


        LinkedList<String> l = new LinkedList<>(Arrays.asList(s));


        int iter=20000;


        System.out.println("start");
        long startTime = System.nanoTime();

        for (int i=0; i<iter; i++) {
            int idx = (int) ( Math.random() * (limit - 1)) ;
            // Math.random() returns float number 0-1, include 0 but not 1

            String s2 = l.get(idx);
            //l.add(2, "hello");

        }

        long endTime = System.nanoTime();

        System.out.printf("done with %f ms\n", (double) (endTime - startTime) / (1000000.0) );



        return l;

    }


}
