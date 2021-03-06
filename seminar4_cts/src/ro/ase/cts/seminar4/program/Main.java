package ro.ase.cts.seminar4.program;

import ro.ase.cts.seminar4.clase.Cinema;
import ro.ase.cts.seminar4.clase.Parlament;
import ro.ase.cts.seminar4.clase.ParlamentLazy;

public class Main {
	public static void main(String[] args) {
		//Parlament parlament1 = new Parlament("Romania", 123, 4, "Bucuresti");
		//Parlament parlament2 = new Parlament("Bulgaria", 456, 14, "Sofia");
		
		Parlament parlament1 = Parlament.getInstance();
		Parlament parlament2 = Parlament.getInstance();
		
		System.out.println(parlament1.toString());
		System.out.println(parlament2.toString());
		System.out.println("---------------------------------------");
		
		parlament1.setTara("Romania");
		parlament2.setNrParlamentari(300);
		
		System.out.println(parlament1.toString());
		System.out.println(parlament2.toString());
		System.out.println("---------------------------------------");
		
		ParlamentLazy parlamentLazy1 = ParlamentLazy.getInstance("Serbia", 400, 8, "Belgrad");
		ParlamentLazy parlamentLazy2 = ParlamentLazy.getInstance("UK", 500, 2, "Londra");
		
		System.out.println(parlamentLazy1.toString());
		System.out.println(parlamentLazy2.toString());
		System.out.println("---------------------------------------");
		
		Cinema cinema1 = Cinema.getInstance("Cinema1", 10, 30);
		Cinema cinema2 = Cinema.getInstance("Cinema2", 5, 15);
		System.out.println(cinema1.toString());
		System.out.println(cinema2.toString());
		System.out.println("---------------------------------------");
	}
}
