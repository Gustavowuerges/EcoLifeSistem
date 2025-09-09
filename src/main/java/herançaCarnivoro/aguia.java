package src.main.java.herançaCarnivoro;
import src.main.java.Carnivoros;

public class aguia extends Carnivoros {
    
    public void fazerBarulho() {
        System.out.println("A águia está gritando.");
    }
    public void mover() {
        System.out.println("A águia está voando.");
    }

    public void comer() {
        System.out.println("A águia está se alimentando.");
    }

    public void dormir() {
        System.out.println("A águia está dormindo.");
    }

    public void cacar() {
        System.out.println("A águia está caçando.");
    }
}