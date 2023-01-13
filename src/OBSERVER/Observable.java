package OBSERVER;

public interface Observable {
    void subscribe(Observer o);

    void unsuscribe(Observer o);

    void notifyObservers();
}
