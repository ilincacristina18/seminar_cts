package ro.ase.cts.proxy.main;

import ro.ase.cts.proxy.clase.ManagerRezervari;
import ro.ase.cts.proxy.clase.ProxyManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerRezervari manager1 = new ManagerRezervari("Andromeda");
		manager1.rezerva(2);
		ProxyManager proxy1 = new ProxyManager(manager1, 4);
		proxy1.rezerva(2);
		proxy1.rezerva(4);
	}

}
