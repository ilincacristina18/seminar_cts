package ro.ase.cts.proxy.clase;

public class ProxyManager implements Rezervabil{
	
	private ManagerRezervari managerRezervari;
	private int nrMinimPersoane;

	public ProxyManager(ManagerRezervari managerRezervari, int nrMinimPersoane) {
		super();
		this.managerRezervari = managerRezervari;
		this.nrMinimPersoane = nrMinimPersoane;
	}

	@Override
	public void rezerva(int nrPersoane) {
		// TODO Auto-generated method stub
		if(nrPersoane >= this.nrMinimPersoane) {
			this.managerRezervari.rezerva(nrPersoane);
		} else {
			System.out.println("Rezervarea nu se poate realiza. Veniti fara rezervare!");
		}
	}

}
