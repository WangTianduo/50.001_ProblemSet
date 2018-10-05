package com.example;

import java.util.ArrayList;
import java.util.List;

public class TestPalindrome {

    public static void main (String[] args) {
        System.out.println("In TestPalindrome");
        String[] s = new String[4];
        s[0] = "Able was I ere I saw elba";
        s[1] = "";
        s[2] = "P";
        s[3] = "Palindrome";
        for (int i = 0; i < 4; i++) {
            System.out.println(testPalindrome(s[i]));
        }
    }
    public static boolean testPalindrome(String s) {
        // Enter code here
    }
}
