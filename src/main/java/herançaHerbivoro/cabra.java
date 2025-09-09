package src.main.java.herançaHerbivoro;
import src.main.java.Herbivoros;

public class cabra extends Herbivoros {
    public void fazerBarulho() {
        System.out.println("A cabra está balindo.");
    }
    public void mover() {
        System.out.println("A cabra está correndo.");
    }

    public void comer() {
        System.out.println("A cabra está se alimentando.");
    }

    public void dormir() {
        System.out.println("A cabra está dormindo.");
    }
}