package src.main.java.herançaHerbivoro;
import src.main.java.Herbivoros;

public class veado extends Herbivoros {
    public void fazerBarulho() {
        System.out.println("O veado está berrando.");
    }
    public void mover() {
        System.out.println("O veado está correndo.");
    }

    public void comer() {
        System.out.println("O veado está se alimentando.");
    }

    public void dormir() {
        System.out.println("O Veado está dormindo.");
    }
}
