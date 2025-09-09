package src.main.java.herançaCarnivoro;
import src.main.java.Carnivoros;

public class hiena extends Carnivoros { 
    
    public void fazerBarulho() {
        System.out.println("A hiena está rindo.");
    }
    public void mover() {
        System.out.println("A hiena está correndo.");
    }

    public void comer() {
        System.out.println("A hiena está se alimentando.");
    }

    public void dormir() {
        System.out.println("A hiena está dormindo.");
    }

    public void cacar() {
        System.out.println("A hiena está caçando.");
    }
}