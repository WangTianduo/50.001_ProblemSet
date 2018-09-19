package com.homework_1;

/**
 * Created by User on 2018/9/19.
 */

public class Main {

    public static void main(String[] args) {
        int[] input = {4, 7, 14, 23, 99};
        PrimeNumberChecker checker = new PrimeNumberChecker();
        for (int i: input) {
            System.out.print(checker.isPrime(i) + ",");
        }
    }
}
