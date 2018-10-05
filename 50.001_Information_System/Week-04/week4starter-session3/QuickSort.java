package com.example;

import java.util.Arrays;

public class QuickSort {
    public static void main (String[] args) {

        Integer[] c = {20, 1, 45, 8, 10, 99, 32, 77, 43, 31 };
        Integer[] d = {20, 1, 45, 8, 10, 99, 32, 77, 43, 31 };


        System.out.println("Initial array:       " + Arrays.toString(d) + "\n");
        q_sort(c, 0, c.length - 1);
        System.out.println("From Quicksort:      " + Arrays.toString(c));

    }

    //quick sort

    public static void q_sort(Integer A[], int left, int right) {
        Integer pivotval, pivot, prev_left, prev_right;

        //save the left and right indices
        prev_left = left;
        prev_right = right;
        pivotval = A[left];

        while (left < right) {
            while ((A[right] >= pivotval) && (left < right))
                right--;
            if (left != right) {
                A[left] = A[right];
                left++;
            }
            while ((A[left] <= pivotval) && (left < right))
                left++;
            if (left != right) {
                A[right] = A[left];
                right--;
            }
        }

        // now recursively invoke the smaller problems
        A[left] = pivotval;
        pivot = left; // this is the final position of pivotval
        // now reinstate the previous left and right values
        left = prev_left;
        right = prev_right;
        if (left < pivot)
            q_sort(A, left, pivot-1);
        if (right > pivot)
            q_sort(A, pivot+1, right);
    }
}