package STRATEGY.game.strategies;

public class ComportementPoignard implements ComportementArme {
    @Override
    public void utiliserArme() {
        System.out.println("Je combat en utilisant un poignard...");
    }
}
