package ro.ase.cts.flyweight.main;

import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare1 = new Rezervare(1, 1);
		Rezervare rezervare2 = new Rezervare(2, 1);
		Rezervare rezervare3 = new Rezervare(3, 1);
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		
		flyweightFactory.getClient("123456").printeazaRezervare(rezervare1);
		flyweightFactory.getClient("4763743").printeazaRezervare(rezervare2);
		flyweightFactory.getClient("123456").printeazaRezervare(rezervare3);
	}

}
