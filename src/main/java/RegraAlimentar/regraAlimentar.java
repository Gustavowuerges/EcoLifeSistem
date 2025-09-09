package src.main.java.RegraAlimentar;

public class regraAlimentar {

    enum porte{
        pequeno,
        medio,
        grande
    }
    
    private porte predador;
    private porte presa;
    private boolean podeComer;

    public regraAlimentar(){
        this.predador = predador;
        this.presa = presa;
    }

    public boolean podeComer(porte predador, porte presa){
        if(predador == porte.pequeno && presa == porte.pequeno){
            return podeComer = true;
        } else if(predador == porte.medio && (presa == porte.pequeno || presa == porte.medio)){
            return podeComer = true;
        } else if(predador == porte.grande){
            return podeComer = true;
        } else {
            return podeComer = false;
        }
    }
}
