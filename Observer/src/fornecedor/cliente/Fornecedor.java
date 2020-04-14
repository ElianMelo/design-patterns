/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 13/04/2020
Resumo: Cria uma classe concreta que extende o Observable(Subject) e possui comportamento de um Fornecedor
Informações adicionais: https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
*/
package fornecedor.cliente;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Fornecedor extends Observable {
	
	private Integer nroProducao;
	private String nome;
	
	Fornecedor(String nome, Integer nroProducao) {
		this.nome = nome;
		this.nroProducao = nroProducao;
	}

	public Integer getNroProducao() {
		return nroProducao;
	}
	
	public void setNroProducao(Integer nroProducao) {
		this.nroProducao = nroProducao;
        setChanged();
        notifyObservers();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
