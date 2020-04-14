/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 14/04/2020
Resumo: Interface que implementa o funcionamento de um subject	
Informações adicionais: https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
*/
package interfaces;

public interface Sujeito {
	public void attach(Observador o);
	public void detach(Observador o);
	public void notifyObs();
}
