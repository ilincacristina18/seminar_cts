package ro.ase.cts.proxy.clase;

public class ManagerRezervari implements Rezervabil{
	private String numeLocal;

	public ManagerRezervari(String numeLocal) {
		super();
		this.numeLocal = numeLocal;
	}


	@Override
	public void rezerva(int nrPersoane) {
		// TODO Auto-generated method stub
		System.out.println("A fost realizata o rezervare la restaurantul " + this.numeLocal +
				"pentru un numar de " + nrPersoane + " persoane.");
	}

}
