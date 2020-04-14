package fornecedor.cliente;

import java.util.Observable;

@SuppressWarnings("deprecation")
public class Fornecedor extends Observable {
	
	private Integer nroProducao;
	private String nome;
	
	Fornecedor(String nome, Integer nroProducao) {
		this.nome = nome;
		this.nroProducao = nroProducao;
	}

	public Integer getNroProducao() {
		return nroProducao;
	}
	
	public void setNroProducao(Integer nroProducao) {
		this.nroProducao = nroProducao;
        setChanged();
        notifyObservers();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
