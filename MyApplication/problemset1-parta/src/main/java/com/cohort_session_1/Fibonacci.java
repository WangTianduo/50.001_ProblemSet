package com.cohort_session_1;

/**
 * Created by User on 2018/9/19.
 */

public class Fibonacci {

    public static String fibonacci( int n ){

        int f1 = 0;
        int f2 = 1;

        String ans = f1 + "," + f2;

        for (int i = 2; i < n; i++) {

            int mysum = f1 + f2;
            f1 = f2;
            f2 = mysum;

            ans = ans + "," + mysum;

        }

        return ans;

    }
}
