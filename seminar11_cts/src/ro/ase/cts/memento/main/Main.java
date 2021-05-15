package ro.ase.cts.memento.main;

import ro.ase.cts.memento.classes.ManagerMemento;
import ro.ase.cts.memento.classes.Meci;

public class Main {

	public static void main(String[] args) {
        ManagerMemento manager = new ManagerMemento();
		
		Meci meci1 = new Meci("Steaua", "Dinamo", 187, 170, 10);
		manager.adaugaMemento(meci1.creareMemento());
		
		meci1.setEchipaGazda("Rapid");
		meci1.setNrSpectatori(150);
		manager.adaugaMemento(meci1.creareMemento());
		
		System.out.println(meci1);
		System.out.println("---------------");
		
		meci1.setMemento(manager.getMemento(0));
		System.out.println(meci1);
		System.out.println("---------------");
		
		meci1.setMemento(manager.getLastMemento());
		System.out.println(meci1);
		}

}
