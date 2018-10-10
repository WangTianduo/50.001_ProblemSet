package comparable_interface;

import java.lang.Comparable;

public class Octagon implements Comparable{

    private double side;
    public Octagon(double side){
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    @Override
    public int compareTo(Object o) {

        Octagon oct = (Octagon)o;
        return (int)(this.side - oct.side);
    }

}
