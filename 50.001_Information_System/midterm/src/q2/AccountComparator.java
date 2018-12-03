package q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AccountComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Account a1 = (Account)o1;
        Account a2 = (Account)o2;

        String id1 = a1.getId();
        String id2 = a2.getId();

        ArrayList<String> temp = new ArrayList<>();
        temp.add(id1);
        temp.add(id2);

        Collections.sort(temp);

        if (id1 == id2) {
            return 0;
        }

        if (temp.get(0) == id1) {
            return -1;
        }else {
            return 1;
        }

    }
}
