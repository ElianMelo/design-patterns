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
