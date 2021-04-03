package ro.ase.cts.fm.clase;

public class Portar extends Jucator{

	public Portar(String nume, int nrTricou) {
		super(nume, nrTricou);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Portar []").append(super.toString());
		return builder.toString();
	}

	
}
