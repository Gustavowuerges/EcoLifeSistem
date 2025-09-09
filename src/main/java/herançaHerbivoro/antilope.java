package src.main.java.herançaHerbivoro;
import src.main.java.Herbivoros;

public class antilope extends Herbivoros {
    public void fazerBarulho() {
        System.out.println("O antílope está relinchando.");
    }
    public void mover() {
        System.out.println("O antílope galopa pelos ambiente.");
    }

    public void comer() {
        System.out.println("O antílope está se alimentando.");
    }

    public void dormir() {
        System.out.println("O antílope deita e graciosamente dorme.");
    }
}