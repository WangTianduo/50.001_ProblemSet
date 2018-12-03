package q5;

import java.util.*;

public class TestStronglyConnected1 {
    public static void main (String[] args){
        int nodecount=5;
        int linkcount=5;
        ArrayList<Integer> listOfLink = new ArrayList<Integer> ( Arrays.asList(0,5,5,0,1,5,5,1,2,5,5,2,3,5,5,3,4,5,5,4));

        System.out.println(StronglyConnected.testStronglyConnected(nodecount, linkcount, listOfLink));
    }
}

