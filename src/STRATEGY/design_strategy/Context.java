package STRATEGY.design_strategy;

import STRATEGY.design_strategy.strategy.IStratety;

public class Context {

    //interface strategie
    private IStratety stratety;

    //strategie par defaut
    public Context() {
        this.stratety = new DefaultStrategyImpl();
    }

    //method executant la strategie
    public void process() {
        System.out.println("Etape 1 de l'algorithme...");
        stratety.applyStrategy();
        System.out.println("Etape finale de l'algorithme...");
    }

    public void setStratety(IStratety stratety) {
        this.stratety = stratety;
    }
}
