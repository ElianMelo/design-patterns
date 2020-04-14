/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 13/04/2020
Resumo: Interface que implementa o funcionamento de um observer	
Informações adicionais: https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
*/
package interfaces;

import java.util.Observable;

@SuppressWarnings("deprecation")
public interface Observer {
	void update(Observable o);
}
