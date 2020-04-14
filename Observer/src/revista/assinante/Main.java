/*
Nome do autor: Elian Melo Morais
Data de criação do arquivo: 13/04/2020
Resumo: Classe principal para realização de testes
Informações adicionais: https://www.devmedia.com.br/padrao-de-projeto-observer-em-java/26163
*/
package revista.assinante;

public class Main {
	
    public static void main(String[] args) {
        int novaEdicao = 3;
        RevistaInformatica revistaInformatica = new RevistaInformatica();       
        Assinante1 assinante1 = new Assinante1("Roberto", revistaInformatica);
        Assinante1 assinante2 = new Assinante1("Carlos", revistaInformatica);
        System.out.println(assinante1);
        System.out.println(assinante2);
         
        revistaInformatica.setNovaEdicao(novaEdicao);
    }

}
