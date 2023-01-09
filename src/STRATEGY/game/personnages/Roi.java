package STRATEGY.game.personnages;

import STRATEGY.game.strategies.ComportementHache;

public class Roi extends Personnage {

    public Roi() {
        this.comportementArme = new ComportementHache();
    }

    @Override
    public void combattre() {
        this.score += 2;
        System.out.println("Je suis une roi...");
        this.comportementArme.utiliserArme();
        System.out.println("Score = " + this.score);
    }


}
