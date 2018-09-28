// ATTENTION
// just edit this file
// you need not edit Main.java


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
