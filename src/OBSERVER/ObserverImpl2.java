package OBSERVER;

public class ObserverImpl2 implements Observer {

    @Override
    public void update(int state) {
        double result = Math.pow(state, 2);
        System.out.println("********ObserverImpl2********");
        System.out.println("Nouvlle mise à jour: " + result);
        System.out.println("****************");
    }
}
