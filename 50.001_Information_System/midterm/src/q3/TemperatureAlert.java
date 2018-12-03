package q3;

import java.util.ArrayList;

//starting code

public class TemperatureAlert implements Subject{
    private int temperature;
    private ArrayList<Observer> list = new ArrayList<>();

    public TemperatureAlert() {
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        if (temperature < 10 || temperature > 35) {
            notifyObservers();
        }
    }

    @Override
    public void register(Observer o) {
        list.add(o);
    }

    @Override
    public void unregister(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: list) {
            o.update(temperature);
        }
    }
}
