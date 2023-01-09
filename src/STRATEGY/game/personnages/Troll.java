package STRATEGY.game.personnages;

import STRATEGY.game.strategies.ComportementPoignard;

public class Troll extends Personnage {
    public Troll() {
        this.comportementArme = new ComportementPoignard();
    }

    @Override
    public void combattre() {
        this.score += 1;
        System.out.println("Je suis une troll...");
        this.comportementArme.utiliserArme();
        System.out.println("Score = " + this.score);
    }
}
