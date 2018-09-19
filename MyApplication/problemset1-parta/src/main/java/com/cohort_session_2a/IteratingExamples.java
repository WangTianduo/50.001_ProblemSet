package com.cohort_session_2a;
import java.util.*;
/**
 * Created by User on 2018/9/19.
 */


public class IteratingExamples {

    public static int Act2Iterator(List<Integer> integers) {
        int sum = 0;
        List<Integer> input = integers;

        for (Iterator<Integer> iter = input.iterator(); iter.hasNext();) {

            sum += iter.next();
        }
        // Insert code here to sum up input using an Iterator ...

        return sum;
    }
}
