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
