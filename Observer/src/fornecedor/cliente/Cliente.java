/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 13/04/2020
Resumo: Classe concreta que implementa a interface Observer
Informa��es adicionais: https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
*/
package fornecedor.cliente;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Cliente implements Observer {
	
	private String nome;
	
	Cliente(String nome, Observable o){
		this.nome = nome;
		o.addObserver(this);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Fornecedor) {
			Fornecedor fornecedor = (Fornecedor) o;
			System.out.println("Ol� " + nome + "! N�s da fornecedora " + fornecedor.getNome() + " estamos com uma nova produ��o de id:" + fornecedor.getNroProducao());
		}
	}

}
