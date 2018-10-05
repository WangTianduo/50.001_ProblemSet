import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MultipleExceptions {
    public static void main(String args[]) {
        try {
            File f = new File("e:\\myfile.txt");
            FileInputStream fis = new FileInputStream(f);
            //int i = 5 / 0;
        }
        catch (FileNotFoundException ex) {
            // first catch block
            System.out.println("In first catch block");
        }
        catch (IOException ex) {
            //do something here
        }
        catch (Exception exception) {
            // this has to be the last, since it is the most general
            System.out.println ("In Exception");
            System.out.println (exception);
        }
        finally {  // the finally block
            //continue processing here.
        }
    }
}
