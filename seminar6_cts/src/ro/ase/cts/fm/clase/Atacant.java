package ro.ase.cts.fm.clase;

public class Atacant extends Jucator{

	public Atacant(String nume, int nrTricou) {
		super(nume, nrTricou);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Atacant []").append(super.toString());
		return builder.toString();
	}
	
	
}
