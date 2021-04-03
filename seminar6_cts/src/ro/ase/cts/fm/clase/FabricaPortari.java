package ro.ase.cts.fm.clase;

public class FabricaPortari implements FabricaJucatori{

	@Override
	public Jucator creeazaJucator(String nume, int nrTricou) {
		// TODO Auto-generated method stub
		return new Portar(nume, nrTricou);
	}

}
