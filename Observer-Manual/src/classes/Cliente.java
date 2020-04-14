/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 14/04/2020
Resumo: Classe que extende os metodos de uma implementação de Observer
Informações adicionais: https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
*/
package classes;

import interfaces.Sujeito;

public class Cliente extends ConcreteObservador {

	private String nome;

	Cliente(Sujeito o, String nome) {
		super(o);
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void update(Sujeito o) {
		if(o instanceof Locadora) {
			Locadora l = (Locadora) o;
			System.out.println("Olá " + this.getNome() + " Temos uma nova revista da locadora " + l.getNome());
		}
	}

}
