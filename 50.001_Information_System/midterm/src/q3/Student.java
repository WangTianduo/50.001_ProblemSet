package q3;

public class Student implements Observer{
    private String id;

    public Student(String id, Subject s) {
        this.id = id;
        s.register(this);
    }

    @Override
    public void update(int t) {
        System.out.println("Student " + id + " receives temperature alert: " + t);
    }
}
