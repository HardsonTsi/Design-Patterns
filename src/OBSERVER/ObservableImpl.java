package OBSERVER;


import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private final List<Observer> observers = new ArrayList<>();
    private int state = 10;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        this.notifyObservers();
    }

    @Override
    public void subscribe(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void unsuscribe(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        this.observers.forEach(o -> o.update(this));
    }
}
