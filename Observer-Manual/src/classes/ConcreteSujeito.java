/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 14/04/2020
Resumo: Classe que implementa os metodos de um Subject
Informações adicionais: https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
*/
package classes;

import java.util.ArrayList;

import interfaces.Observador;
import interfaces.Sujeito;

public class ConcreteSujeito implements Sujeito {

	ArrayList<Observador> Observadores = new ArrayList<>();
	
	@Override
	public void attach(Observador o) {
		Observadores.add(o);
	}

	@Override
	public void detach(Observador o) {
		Observadores.remove(o);
	}

	@Override
	public void notifyObs() {
		for (Observador o : Observadores) {
			o.update(this);
		}
	}

}
