import java.util.Scanner;

public class TestScores {

    public static void testScores(double[] s) {
            // Type your codes here




    }
    public static void main(String [] args) {
        try {
            double[] values = {1.2,1.3,1,102};
            testScores(values);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
            System.out.println("Exception: Values cannot be less than 0 or bigger than 100 ");
        }
        System.out.println("Execution continues here");
    }

}
