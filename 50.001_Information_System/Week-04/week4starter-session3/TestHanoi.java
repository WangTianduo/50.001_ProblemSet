package com.example;

/**
 * Created by jit_biswas on 10/2/2017.
 */
public class TestHanoi {
    private static int count = 0;
    public static void main (String[] args) {
        System.out.println("In Towers of Hanoi");
        hanoi(3, "Tower A", "Tower B", "Tower C");
        //System.out.println(count + " Moves altogether.");

    }
    public static void hanoi (int n, String  from, String via, String to) {
        if (n <= 0) return;
        else {
            hanoi(n-1, from, to, via);
            System.out.println ("Move block from " + from + " to " + to);
            //count += 1;
            hanoi(n-1, via, from, to);
        }
    }
}
