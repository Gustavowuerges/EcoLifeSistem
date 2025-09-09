package src.main.java.herançaCarnivoro;
import src.main.java.Carnivoros;

public class jacare extends Carnivoros {
    
    public void fazerBarulho() {
        System.out.println("O jacaré está rugindo.");
    }
    public void mover() {
        System.out.println("O jacaré está nadando.");
    }

    public void comer() {
        System.out.println("O jacaré está se alimentando.");
    }

    public void dormir() {
        System.out.println("O jacaré está dormindo.");
    }

    public void cacar() {
        System.out.println("O jacaré está caçando.");
    }
}