package q4;

// package com.cheung.lib2018midterm;

import java.util.ArrayList;
import java.util.Arrays;


//starting code

public class AllSeq {

    private ArrayList<String> a = new ArrayList<String>();

    public static void main(String[] args) {
        String[] s = {"p", "q"};
        System.out.println(compAllSeq(s, 3));

        String[] s2 = {"1", "2", "3", "4"};
        System.out.println(compAllSeq(s2, 1));

    }


    public static ArrayList<String> compAllSeq(String[] strings, int k){
        ArrayList<String> waitlist = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();
        for (String s: strings) {
            waitlist.add(s);
        }

        if (k == 1) {
            for (String str: waitlist) {
                char[] input = str.toCharArray();
                permute(input, 0, output);
            }
        }else {
            for (int i = 0; i < k-1; i++) {
                for (String s: strings) {
                    System.out.println("!!!");
                }
            }
        }

        return waitlist;
    }


    private static void permute(char[] str, int start, ArrayList<String> a) {
        if (start == str.length - 1 && !a.contains(str)) {
            a.add(new String(str));
        }

        for (int i = start; i <= str.length - 1; i++) {
            swap(str, i, start);
            permute(str, start + 1, a);
            swap(str, i, start);
        }
    }

    private static void swap(char chs[],int i,int j)
    {
        if (i == j) {
            return;
        }

        if (i - j == 2) {
            char temp;
            temp = chs[j];
            chs[j] = chs[i];
            chs[i] = chs[j+1];
            chs[j+1] = temp;
            return;
        }
        char temp;
        temp=chs[i];
        chs[i] = chs[j];
        chs[j] = temp;
    }

}
