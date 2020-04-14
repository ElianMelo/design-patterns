/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 14/04/2020
Resumo: Classe que extende os metodos de uma implementa��o de Subject
Informa��es adicionais: https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
*/
package classes;

public class Locadora extends ConcreteSujeito {

	private String nome;
	
	Locadora(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		this.notifyObs();
	}
}
