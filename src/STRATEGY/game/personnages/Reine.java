package STRATEGY.game.personnages;

import STRATEGY.game.strategies.ComportementArcEtFleche;
import STRATEGY.game.strategies.ComportementHache;

public class Reine extends Personnage {
    public Reine() {
        this.comportementArme = new ComportementArcEtFleche();
    }

    @Override
    public void combattre() {
        this.score += 4;
        System.out.println("Je suis une reine...");
        this.comportementArme.utiliserArme();
        System.out.println("Score = " + this.score);
        if (score >= 10){
            this.setComportementArme(new ComportementHache());
        }
    }
}
