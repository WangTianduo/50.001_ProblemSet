
import java.sql.SQLOutput;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer");
    }
}
