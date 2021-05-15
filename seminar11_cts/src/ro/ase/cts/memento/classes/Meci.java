package ro.ase.cts.memento.classes;

public class Meci {
	private String echipaGazda;
	private String echipaOaspete;
	private int nrBilete;
	private int nrSpectatori;
	private int nrJandarmi;
	
	public Meci(String echipaGazda, String echipaOaspete, int nrBilete, int nrSpectatori, int nrJandarmi) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaOaspete = echipaOaspete;
		this.nrBilete = nrBilete;
		this.nrSpectatori = nrSpectatori;
		this.nrJandarmi = nrJandarmi;
	}

	public void setEchipaGazda(String echipaGazda) {
		this.echipaGazda = echipaGazda;
	}

	public void setEchipaOaspete(String echipaOaspete) {
		this.echipaOaspete = echipaOaspete;
	}

	public void setNrBilete(int nrBilete) {
		this.nrBilete = nrBilete;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Meci [echipaGazda=");
		builder.append(echipaGazda);
		builder.append(", echipaOaspete=");
		builder.append(echipaOaspete);
		builder.append(", nrBilete=");
		builder.append(nrBilete);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append("]");
		return builder.toString();
	}
	
	public Memento creareMemento() {
		return new Memento(this.echipaGazda, this.echipaOaspete, this.nrSpectatori);
	}
	
	public void setMemento(Memento memento) {
		this.echipaGazda = memento.getEchipaGazda();
		this.echipaOaspete = memento.getEchipaOaspete();
		this.nrSpectatori = memento.getNrSpectatori();
	}
	
}
