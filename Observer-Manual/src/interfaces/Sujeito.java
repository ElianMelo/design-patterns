package interfaces;

public interface Sujeito {
	public void attach(Observador o);
	public void detach(Observador o);
	public void notifyObs();
}
