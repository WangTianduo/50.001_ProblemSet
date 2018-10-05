package com.example;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        Integer[] b = {20, 1, 45, 8, 10, 99, 32, 77, 43, 31};
        Integer[] d = {20, 1, 45, 8, 10, 99, 32, 77, 43, 31};


        System.out.println("Initial array:       " + Arrays.toString(d) + "\n");
        mergeSort(b);
        System.out.println("From Mergesort:      " + Arrays.toString(b));

    }


    public static void mergeSort(Comparable[] a) {
        Comparable[] tmp = new Comparable[a.length];
        mergeSort(a, tmp, 0, a.length - 1);
    }


    private static void mergeSort(Comparable[] a, Comparable[] tmp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }


    private static void merge(Comparable[] a, Comparable[] tmp, int left, int right, int rightEnd) {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while (left <= leftEnd && right <= rightEnd)
            if (a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while (left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while (right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for (int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
    }

}