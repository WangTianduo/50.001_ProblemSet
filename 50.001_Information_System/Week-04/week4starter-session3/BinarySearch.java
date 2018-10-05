package com.example;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        Integer[] a = {20, 1, 45, 8, 10, 99, 32, 77, 43, 31};
        Integer[] d = {20, 1, 45, 8, 10, 99, 32, 77, 43, 31};

        //Iterative sort
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                // if (a[i] > a[j]) {
                if (a[i].compareTo(a[j]) > 0) {
                    Integer temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("Initial array:       " + Arrays.toString(d) + "\n");
        System.out.println("From Selection sort: " + Arrays.toString(a));

        System.out.println(binsearch(a, 45, 0, 8));
    }

    public static Integer binsearch(Integer[] A, int n, int l, int r) {
        if (l >= r) {
            if (A[l] == n)
                return l;
            else
                return -1;
        } else {
            int mid = (l + r) / 2;
            if (n == A[mid]) return mid;
            else {
                if (n < A[mid]) return binsearch(A, n, l, mid - 1);
                else return binsearch(A, n, mid + 1, r);
            }
        }
    }


}
