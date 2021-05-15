package ro.ase.cts.memento.classes;

public class Memento {
	private String echipaGazda;
	private String echipaOaspete;
	private int nrSpectatori;
	
	public Memento(String echipaGazda, String echipaOaspete, int nrSpectatori) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaOaspete = echipaOaspete;
		this.nrSpectatori = nrSpectatori;
	}

	public String getEchipaGazda() {
		return echipaGazda;
	}

	public String getEchipaOaspete() {
		return echipaOaspete;
	}

	public int getNrSpectatori() {
		return nrSpectatori;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Memento [echipaGazda=");
		builder.append(echipaGazda);
		builder.append(", echipaOaspete=");
		builder.append(echipaOaspete);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append("]");
		return builder.toString();
	}
	

}
