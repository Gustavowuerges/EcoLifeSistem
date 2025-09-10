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

    public boolean podeComer(porte predador, porte presa){
        return predador == porte.pequeno && presa == porte.pequeno || predador == porte.medio && (presa == porte.pequeno || presa == porte.medio) || predador == porte.grande;

    }
}
