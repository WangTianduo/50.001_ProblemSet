import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ngaiman_cheung on 12/9/17.
 */

public class PerformanceCheck {

    public static void main(String[] args) {
        Integer[] a = new Integer[50000];

        List<Integer> w = new ArrayList<>(Arrays.asList(a));


        long started = System.nanoTime();
        int totalCnt = 100000;
        for (int k=0; k<totalCnt; k++){
            w.add(5,2000); // insertion
        }

//        for (int k=0; k< totalCnt; k++) {
//            w.get(25000);
//        }
        long time = System.nanoTime();
        long timeTaken = time - started;
        System.out.println("time taken:" + timeTaken/1000000.0 + "ms");


    }
}
