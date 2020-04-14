package revista.assinante;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Assinante1 implements Observer {
     
    Observable revistaInformatica;
    
    String nome;
    int edicaoNovaRevista;
     
    public Assinante1(String nome, Observable revistaInformatica) {
    	this.nome = nome;
        this.revistaInformatica = revistaInformatica;
        revistaInformatica.addObserver(this);
    }
     
    @Override
    public void update(Observable revistaInfSubject, Object arg1) {
        if (revistaInfSubject instanceof RevistaInformatica) {
            RevistaInformatica revistaInformatica = (RevistaInformatica) revistaInfSubject;
            edicaoNovaRevista = revistaInformatica.getEdicao();
            System.out.println("Aten��o, assinante " + nome + " j� chegou a mais uma edi��o da Revista Informatica. " +
                    "Esta � a sua edi��o n�mero: " + edicaoNovaRevista);
        }
    }   
}