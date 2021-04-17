package ro.ase.cts.facade.main;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Masa;
import ro.ase.cts.facade.clase.Picolo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Masa masa1 = new Masa(1, 10);
//		if(OperatorMese.esteLibera(masa1.getNrMasa())) {
//			Picolo picolo1 = new Picolo("Gigel");
//			if(picolo1.esteDebarasataMasa(masa1.getNrMasa())) {
//				if(picolo1.esteAranjata(masa1.getNrMasa())) {
//					System.out.println("Poftiti la masa domnule client!");
//				} else {
//				System.out.println("Va rog mai asteptati putin!");
//				}
//			} else {
//				System.out.println("Va rog mai asteptati putin!");
//			}
//		} else {
//			System.out.println("Va rog mai asteptati putin!");
//		}
		
		Masa masa2 = new Masa(30, 4);
		if(Facade.esteMasaPregatita(masa2)) {
			System.out.println("Poftiti la masa domnule client!");
		} else {
			System.out.println("Va rog mai asteptati putin!");
		}
		
	}

}
