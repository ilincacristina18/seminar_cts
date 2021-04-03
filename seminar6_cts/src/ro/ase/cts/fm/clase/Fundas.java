package ro.ase.cts.fm.clase;

public class Fundas extends Jucator{

	public Fundas(String nume, int nrTricou) {
		super(nume, nrTricou);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fundas []").append(super.toString());
		return builder.toString();
	}

	
}
