package q5;

import java.util.ArrayList;
import java.util.HashMap;

//starting code

public class StronglyConnected {


    static boolean testStronglyConnected(int nodecount, int linkcount, ArrayList<Integer> l) {

        if (nodecount > linkcount) return false;

        ArrayList<Integer> out = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();

        HashMap<Integer, Integer> out_in = new HashMap<>();

        for (int i = 0; i < l.size(); i = i+2) {
            out.add(l.get(i));
            in.add(l.get(i+1));
        }

        int start = 0;
        int temp = out.get(0);

        while(!out.isEmpty() || !in.isEmpty()) {
            int oout = out.get(start);
            int iin = in.get(start);

            System.out.println(out);
            System.out.println(in);

            out.remove(start);
            in.remove(start);

            if (out.contains(iin)) {
                start = out.indexOf(iin);
            }else {
                if (temp == iin) {
                    return true;
                }
                return false;
            }

        }

        return true;

    }
}
