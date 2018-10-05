package com.example;

import java.util.Arrays;

public class SortsAndSearch {
    public static void main (String[] args) {
        Integer[] a = {20, 1, 45, 8, 10, 99, 32, 77, 43, 31 };
        Integer[] b = {20, 1, 45, 8, 10, 99, 32, 77, 43, 31 };
        Integer[] c = {20, 1, 45, 8, 10, 99, 32, 77, 43, 31 };
        Integer[] d = {20, 1, 45, 8, 10, 99, 32, 77, 43, 31 };

        //Iterative sort
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j < a.length; j++) {
                // if (a[i] > a[j]) {
                if (a[i].compareTo(a[j]) > 0 ) {
                    Integer temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("Initial array:       " + Arrays.toString(d) + "\n");
        System.out.println("From Selection sort: " + Arrays.toString(a));
        mergeSort(b);
        System.out.println("From Mergesort:      " + Arrays.toString(b));
        q_sort(c, 0, c.length - 1);
        System.out.println("From Quicksort:      " + Arrays.toString(c));
        System.out.println(binsearch(b, 45, 0, 8));
    }

    public static Integer binsearch(Integer [] A, int n, int l, int r) {
        if (l >= r) {
            if (A[l] == n)
                return l;
            else
                return -1;
        }
        else {
            int mid = (l+r) / 2;
            if (n == A[mid]) return mid;
            else {
                if (n < A[mid]) return binsearch(A, n, l, mid-1);
                else return binsearch (A, n, mid+1, r);
            }
        }
    }


    public static void mergeSort(Comparable [ ] a)
    {
        Comparable[] tmp = new Comparable[a.length];
        mergeSort(a, tmp,  0,  a.length - 1);
    }


    private static void mergeSort(Comparable [ ] a, Comparable [ ] tmp, int left, int right)
    {
        if( left < right )
        {
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }


    private static void merge(Comparable[ ] a, Comparable[ ] tmp, int left, int right, int rightEnd )
    {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;

        while(left <= leftEnd && right <= rightEnd)
            if(a[left].compareTo(a[right]) <= 0)
                tmp[k++] = a[left++];
            else
                tmp[k++] = a[right++];

        while(left <= leftEnd)    // Copy rest of first half
            tmp[k++] = a[left++];

        while(right <= rightEnd)  // Copy rest of right half
            tmp[k++] = a[right++];

        // Copy tmp back
        for(int i = 0; i < num; i++, rightEnd--)
            a[rightEnd] = tmp[rightEnd];
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