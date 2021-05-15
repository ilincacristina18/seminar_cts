package ro.ase.cts.observer.main;

import ro.ase.cts.observer.classes.ClientAbonat;
import ro.ase.cts.observer.classes.ManagerSala;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerSala manager1 = new ManagerSala("Manager1");
		
		ClientAbonat clientAbonat1 = new ClientAbonat("Popescu");
		ClientAbonat clientAbonat2 = new ClientAbonat("Georgescu");
		
		manager1.adaugaAbonat(clientAbonat1);
		manager1.adaugaAbonat(clientAbonat2);
		
		manager1.anuntaMeci("volei");
		
		manager1.stergereAbonat(clientAbonat2);
		
		manager1.anuntaMeci("fotbal");
	}

}
