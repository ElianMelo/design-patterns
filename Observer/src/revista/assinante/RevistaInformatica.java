/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 13/04/2020
Resumo: Classe Subject(Observable) que simula um comportamento de uma revista
Informações adicionais: https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
*/
package revista.assinante;

import java.util.Observable;
 
@SuppressWarnings("deprecation")
public class RevistaInformatica extends Observable {
 
    private int edicao;
 
    public void setNovaEdicao(int novaEdicao) {
        this.edicao = novaEdicao;
         
        setChanged();
        notifyObservers();
    }
     
    public int getEdicao() {
        return this.edicao;
    }
 
}