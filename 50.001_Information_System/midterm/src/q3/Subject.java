package q3;

public interface Subject {

    void notifyObservers();
    void register(Observer o);
    void unregister(Observer o);


}
