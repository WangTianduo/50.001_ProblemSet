public class GCD {
    public static void main (String[] args) {
        System.out.println("In GCD");
        System.out.println("GCD(33,81) = " + gcd(33,81));

    }
    //    INPUT: Integers x, y
//    such that x >= y and y > 0
    public static int gcd (int x, int y) {
        if (y == 0)
            return x;
        else
            return gcd (y, x % y);
    }

}
