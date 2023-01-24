package DECORATOR;


import DECORATOR.boissons.Boisson;
import DECORATOR.boissons.Espresso;
import DECORATOR.decorateurs.Chocolat;
import DECORATOR.decorateurs.Vanille;

public class Application {
    public static void main(String[] args) {
        Boisson b = new Espresso();
        System.out.println("========");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("========");
        b = new Chocolat(b);
        System.out.println("========");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("========");
        b = new Vanille(b);
        System.out.println("========");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("========");
    }
}
