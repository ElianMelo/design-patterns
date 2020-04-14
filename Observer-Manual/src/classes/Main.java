package classes;

public class Main {
	
	public static void main(String[] args) {
		Locadora l = new Locadora("HiperMax");
		Cliente c = new Cliente(l, "Roberto");
		Cliente d = new Cliente(l, "Deniro");
		System.out.println(c);
		System.out.println(d);
		l.notifyObs();
		l.setNome("Magalu");
	}

}
