package STRATEGY.game;

import STRATEGY.game.personnages.Personnage;
import STRATEGY.game.personnages.Reine;
import STRATEGY.game.personnages.Roi;
import STRATEGY.game.strategies.ComportementPoignard;

public class Game {
    public static void main(String[] args) {
        Personnage reine = new Reine();
        reine.combattre();
        reine.combattre();
        reine.combattre();
        reine.combattre();

        System.out.println("------");

        Personnage roi = new Roi();
        roi.combattre();

        System.out.println("------");

        roi.setComportementArme(new ComportementPoignard());
        roi.combattre();


    }
}
