package DECORATOR.decorateurs;

import DECORATOR.boissons.Boisson;

public abstract class AbstractDecorator extends Boisson {
    protected Boisson boisson;

    public AbstractDecorator(Boisson boisson) {
        this.boisson = boisson;
    }

    public abstract String getDescription();
}
