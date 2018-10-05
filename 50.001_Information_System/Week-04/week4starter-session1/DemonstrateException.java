import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DemonstrateException {
    public static void main (String[] args) {
        System.out.println("In DemoExceptions");
        File file = new File("e:\\ubunturef.pdf");
        FileReader fr = new FileReader(file);
    }
}

