/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 14/04/2020
Resumo: Classe que implementa os metodos de um Observer
Informações adicionais: https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
*/
package classes;

import interfaces.Observador;
import interfaces.Sujeito;

public class ConcreteObservador implements Observador {
	
	ConcreteObservador(Sujeito o) {
		o.attach(this);
	}

	@Override
	public void update(Sujeito s) {
		System.out.println("Observador: " + this);
		System.out.println("Sujeito: " + s);
	}

}
