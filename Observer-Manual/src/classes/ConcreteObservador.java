package classes;

import interfaces.Observador;
import interfaces.Sujeito;

public class ConcreteObservador implements Observador {
	
	ConcreteObservador(Sujeito o) {
		o.attach(this);
	}

	@Override
	public void update(Sujeito s) {
		System.out.println("Observador: " + this);
		System.out.println("Sujeito: " + s);
	}

}
