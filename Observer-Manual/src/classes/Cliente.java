package classes;

import interfaces.Sujeito;

public class Cliente extends ConcreteObservador {

	private String nome;

	Cliente(Sujeito o, String nome) {
		super(o);
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void update(Sujeito o) {
		if(o instanceof Locadora) {
			Locadora l = (Locadora) o;
			System.out.println("Olá " + this.getNome() + " Temos uma nova revista da locadora " + l.getNome());
		}
	}

}
