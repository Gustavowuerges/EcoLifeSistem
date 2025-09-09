package src.main.java.herançaCarnivoro;
import src.main.java.Carnivoros;

public class lobo extends Carnivoros { 
    
    public void fazerBarulho() {
        System.out.println("O lobo está uivando.");
    }
    public void mover() {
        System.out.println("O lobo está correndo.");
    }

    public void comer() {
        System.out.println("O lobo está se alimentando.");
    }

    public void dormir() {
        System.out.println("O lobo está dormindo.");
    }

    public void cacar() {
        System.out.println("O lobo está caçando.");
    }  
}