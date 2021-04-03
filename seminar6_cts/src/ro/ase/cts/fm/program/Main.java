package ro.ase.cts.fm.program;

import ro.ase.cts.fm.clase.FabricaAtacanti;
import ro.ase.cts.fm.clase.FabricaJucatori;
import ro.ase.cts.fm.clase.FabricaMijlocasi;
import ro.ase.cts.fm.clase.FabricaPortari;
import ro.ase.cts.fm.clase.Jucator;

public class Main {
	
	public static void afiseazaInformatiiJucator(FabricaJucatori fabrica, String nume, int nrTricou) {
		Jucator jucator = fabrica.creeazaJucator(nume, nrTricou);
		System.out.println(jucator.toString());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		afiseazaInformatiiJucator(new FabricaAtacanti(), "Popescu", 15);
		afiseazaInformatiiJucator(new FabricaPortari(), "Ionescu", 17);
		afiseazaInformatiiJucator(new FabricaMijlocasi(), "Ion", 10);
	}

}
