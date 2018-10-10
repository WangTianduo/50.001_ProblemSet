package comparator_interface;

import java.util.Comparator;

public class OctagonComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Octagon oct1 = (Octagon) o1;
        Octagon oct2 = (Octagon) o2;
        return (int)(oct1.getSide() - oct2.getSide());
    }
}

