/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 13/04/2020
Resumo: Classe principal para realização de testes	
Informações adicionais: https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
*/
package fornecedor.cliente;

public class CliFornMain {
	
	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor("Gás Bras", 1);
		Cliente cliente1 = new Cliente("Roberto", fornecedor);
		Cliente cliente2 = new Cliente("Carlos", fornecedor);
		
		System.out.println("Novo cliente cadastrado: " + cliente1.getNome());
		System.out.println("Novo cliente cadastrado: " + cliente2.getNome());
		
		System.out.println("-----------------------------------------------");
		
		fornecedor.setNroProducao(5);
		fornecedor.setNroProducao(6);
		fornecedor.setNroProducao(7);
		fornecedor.setNroProducao(8);
	}

}
