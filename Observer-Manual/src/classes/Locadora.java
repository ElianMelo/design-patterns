package classes;

public class Locadora extends ConcreteSujeito {

	private String nome;
	
	Locadora(String nome){
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
		this.notifyObs();
	}
}
