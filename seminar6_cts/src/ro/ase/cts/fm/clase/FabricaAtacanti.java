package ro.ase.cts.fm.clase;

public class FabricaAtacanti implements FabricaJucatori{

	@Override
	public Jucator creeazaJucator(String nume, int nrTricou) {
		// TODO Auto-generated method stub
		return new Atacant(nume, nrTricou);
	}

}
