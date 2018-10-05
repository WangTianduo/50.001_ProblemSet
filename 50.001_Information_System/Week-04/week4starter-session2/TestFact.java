package com.example;

/**
 * Created by jit_biswas on 10/2/2017.
 */
public class TestFact {
    public static void main (String[] args) {
        System.out.println("In TestFact");
        int k = 5;
        int answer=1;
        for (int i = 1; i <= k; i++) {
            answer = answer * i;
        }
        System.out.println("Factorial (using iteration) of " + k + " is " + answer);
        System.out.println("----------");
        System.out.println("Factorial (using recursion) of " + k + " is " + rfact(k));
    }
    public static int rfact (int n) {
         // enter code here

    }
}
