/*
Nome do autor: Elian Melo Morais
Data de cria��o do arquivo: 13/04/2020
Resumo: Interface que implementa o funcionamento de um observer	
Informa��es adicionais: https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
*/
package interfaces;

import java.util.Observable;

@SuppressWarnings("deprecation")
public interface Observer {
	void update(Observable o);
}
