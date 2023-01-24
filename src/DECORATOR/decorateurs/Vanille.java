package DECORATOR.decorateurs;

import DECORATOR.boissons.Boisson;

public class Vanille extends AbstractDecorator {
    public Vanille(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double cout() {
        return 0.9 + boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " à la vanille";
    }
}
