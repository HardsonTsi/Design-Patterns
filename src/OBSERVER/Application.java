package OBSERVER;

public class Application {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl2();
        Observer observer3 = new ObserverImpl1();

        observable.subscribe(observer1);

        observable.setState(55);

        observable.subscribe(observer2);
        observable.subscribe(observer3);

        observable.unsuscribe(observer1);

        observable.setState(55);

    }
}
