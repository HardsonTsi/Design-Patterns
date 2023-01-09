package STRATEGY.design_strategy;


import STRATEGY.design_strategy.strategy.IStratety;

public class DefaultStrategyImpl implements IStratety {
    @Override
    public void applyStrategy() {
        System.out.println("Etape intermediaire de l'algo de la strategie par defaut");
    }
}
