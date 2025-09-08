package scr.main.java;

public class Carnivoros implements EcoInterface {

        //Implementação Interface na classe carnivoros
        @Override
        public void comer() {
            System.out.println("O animal está comendo.");
        }

        @Override
        public void dormir() {
            System.out.println("O animal está dormindo.");
        }

        @Override
        public void fazerBarulho() {
            System.out.println("O animal está fazendo barulho.");
        }
    
        @Override
        public void mover() {
            System.out.println("O animal está se movendo.");
        }
        
        @Override
        public void cacar() {
            System.out.println("O animal está caçando.");
        }

        //Implementação Interface animais especificos

        
}
