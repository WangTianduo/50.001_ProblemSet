import java.util.ArrayList;
import java.util.Collections;

public class TimeFinishAssignment {

    public static void main(String[] args) {
        ArrayList<Integer> listOfAssignment = new ArrayList<>();
        listOfAssignment.add(3);
        listOfAssignment.add(4);
        listOfAssignment.add(3);
        listOfAssignment.add(5);
        listOfAssignment.add(6);
        listOfAssignment.add(2);
        listOfAssignment.add(9);
        listOfAssignment.add(2);

        System.out.println(computeTimeFinish(listOfAssignment));
        // output: 15

    }



    public static int computeTimeFinish(ArrayList<Integer> l) {
       // TODO: implement computeTimeFinish method
        int[] lengthThree = {0, 0, 0};
        Collections.sort(l);
        for (int i = l.size() - 1; i >= 0; i--) {
            lengthThree[findMinInThree(lengthThree)] += l.get(i);
        }

        int output = lengthThree[0];
        for (int i = 0; i < 2; i++) {
            if (lengthThree[i + 1] > lengthThree[i]) {
                output = lengthThree[i+1];
            }
        }
        return output;

    }

    public static int findMinInThree(int[] lengthThree) {
        int minIndex = 0;
        for (int i = 0; i < lengthThree.length; i++) {
            if (lengthThree[i] < lengthThree[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }



}
