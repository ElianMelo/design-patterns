package classes;

import java.util.ArrayList;

import interfaces.Observador;
import interfaces.Sujeito;

public class ConcreteSujeito implements Sujeito {

	ArrayList<Observador> Observadores = new ArrayList<>();
	
	@Override
	public void attach(Observador o) {
		Observadores.add(o);
	}

	@Override
	public void detach(Observador o) {
		Observadores.remove(o);
	}

	@Override
	public void notifyObs() {
		for (Observador o : Observadores) {
			o.update(this);
		}
	}

}
