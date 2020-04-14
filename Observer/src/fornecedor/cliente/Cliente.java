package fornecedor.cliente;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Cliente implements Observer {
	
	private String nome;
	
	Cliente(String nome, Observable o){
		this.nome = nome;
		o.addObserver(this);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof Fornecedor) {
			Fornecedor fornecedor = (Fornecedor) o;
			System.out.println("Ol� " + nome + "! N�s da fornecedora " + fornecedor.getNome() + " estamos com uma nova produ��o de id:" + fornecedor.getNroProducao());
		}
	}

}
