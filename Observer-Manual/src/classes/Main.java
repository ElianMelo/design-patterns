/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 14/04/2020
Resumo: Classe principal para realizacao de testes
Informações adicionais: https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
*/
package classes;

public class Main {
	
	public static void main(String[] args) {
		Locadora l = new Locadora("HiperMax");
		Cliente c = new Cliente(l, "Roberto");
		Cliente d = new Cliente(l, "Deniro");
		System.out.println(c);
		System.out.println(d);
		l.notifyObs();
		l.setNome("Magalu");
	}

}
