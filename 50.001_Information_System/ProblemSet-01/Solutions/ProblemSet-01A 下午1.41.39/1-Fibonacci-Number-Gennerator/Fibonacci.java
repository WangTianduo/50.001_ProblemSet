// **ATTENTION**
// Edit just this file to submit your answer
// You need not edit the Main.java file 

public class Fibonacci{
    
    public static String fibonacci( int n ){

        int f1 = 0;
        int f2 = 1;

        String ans = f1 + "," + f2;

        for (int i = 2; i < n; i++) {

            int mysum = f1 + f2;
            f1 = f2;
            f2 = mysum;

            ans = ans + "," + mysum;

        }

        return ans;
    
    }
        
}
