package q3;

public class Fish implements Observer{
    private String id;

    public Fish(String id, Subject s) {
        this.id = id;
        s.register(this);
    }

    @Override
    public void update(int t) {
        System.out.println("Fish " + id + " receives temperature alert: " + t);
    }
}
