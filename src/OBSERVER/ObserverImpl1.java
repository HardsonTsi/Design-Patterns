package OBSERVER;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        int state = ((ObservableImpl) observable).getState();
        double result = Math.pow(state, 2) + 9;
        System.out.println("********ObserverImpl1********");
        System.out.println("Nouvlle mise à jour: " + result);
        System.out.println("****************");
    }
}
