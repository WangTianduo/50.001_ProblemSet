package com.example;

/**
 * Created by jit_biswas on 10/3/2017.
 */
public class TestAnagram {
    public static void main (String[] args) {
        String input = "CAT";
        anagram("", input);
    }

    public static void anagram( String prefix, String suffix ) {
        String newPrefix, newSuffix;
        int numOfChars = suffix.length();

        if (numOfChars == 1) {
            //End case: print out one anagram
            System.out.println( prefix + suffix );

        } else {
            for (int i = 1; i <= numOfChars; i++ ) {
                newSuffix = suffix.substring(1, numOfChars);
                newPrefix = prefix + suffix.charAt(0);
                anagram( newPrefix, newSuffix );
                //recursive call
                //rotate left to create a rearranged suffix
                suffix = newSuffix + suffix.charAt(0);
            }
        }
    }


}
