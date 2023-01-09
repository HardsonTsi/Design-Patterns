package STRATEGY.design_strategy;


import STRATEGY.design_strategy.strategy.StrategyImpl1;
import STRATEGY.design_strategy.strategy.StrategyImpl2;

public class Application {

    public static void main(String[] args) {

        Context context = new Context();
        context.process();

        System.out.println("------");

        //strategie 1
        context.setStratety(new StrategyImpl1());
        context.process();

        System.out.println("------");

        //strategie 2
        context.setStratety(new StrategyImpl2());
        context.process();

        System.out.println("------");

    }

}
