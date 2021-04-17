package ro.ase.cts.adapterClase.main;

import ro.ase.cts.adapterClase.clase.AdapterLeasingClase;
import ro.ase.cts.adapterClase.clase.Creditable;

public class Main {
	
	public static void printeazaInformatiiCredit(Creditable credit) {
		credit.crediteaza();
	}

	public static void main(String[] args) {
		System.out.println("------------------------------------------------------------");
		AdapterLeasingClase adapterLeasing1 = new AdapterLeasingClase("Gigel", 25000);
		printeazaInformatiiCredit(adapterLeasing1);
	}

}
