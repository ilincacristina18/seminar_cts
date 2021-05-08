package ro.ase.cts.command.main;

import ro.ase.cts.command.classes.ComandaCreare;
import ro.ase.cts.command.classes.ComandaDepunere;
import ro.ase.cts.command.classes.ComandaRetragere;
import ro.ase.cts.command.classes.Executant;
import ro.ase.cts.command.classes.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerComenzi managerComenzi = new ManagerComenzi();
		Executant cont1 = new Executant("Gigel");
		ComandaCreare comandaCreare1 = new ComandaCreare(cont1, 1000);
		managerComenzi.adaugaComanda(comandaCreare1);
		managerComenzi.adaugaComanda(new ComandaRetragere(cont1, 123));
		managerComenzi.adaugaComanda(new ComandaDepunere(cont1, 1234));
		managerComenzi.adaugaComanda(new ComandaRetragere(cont1, 2200));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
	}

}
