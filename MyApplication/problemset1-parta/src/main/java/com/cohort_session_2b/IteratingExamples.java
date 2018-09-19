package com.cohort_session_2b;

/**
 * Created by User on 2018/9/19.
 */
import java.util.*;

public class IteratingExamples {

    public static int Act2ForEach(List<Integer> integers) {

        int sum = 0;
        List<Integer> input = integers;

        for (int i : input) {

            sum += i;
        }

        return sum;


    }
}