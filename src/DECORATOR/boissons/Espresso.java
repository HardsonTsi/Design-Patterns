package DECORATOR.boissons;

public class Espresso extends Boisson {
    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cout() {
        return 6;
    }
}
