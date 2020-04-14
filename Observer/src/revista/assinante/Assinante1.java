/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 13/04/2020
Resumo: Classe Observer que observa uma revista
Informações adicionais: https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
*/
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
            System.out.println("Atenção, assinante " + nome + " já chegou a mais uma edição da Revista Informatica. " +
                    "Esta é a sua edição número: " + edicaoNovaRevista);
        }
    }   
}