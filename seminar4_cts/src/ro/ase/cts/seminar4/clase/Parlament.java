package ro.ase.cts.seminar4.clase;

public class Parlament {
	private String tara;
	private int nrParlamentari;
	private int durataMandat;
	private String denumireSediu;
	
	//eager initialization
	private static Parlament parlament = new Parlament();
	
	public static Parlament getInstance() {
		return parlament;
	}
	
	private Parlament() {
		tara = "";
		nrParlamentari = 0;
		durataMandat = 0;
		denumireSediu = "";
	}
	
	private Parlament(String tara, int nrParlamentari, int durataMandat, String denumireSediu) {
		this.tara = tara;
		this.nrParlamentari = nrParlamentari;
		this.durataMandat = durataMandat;
		this.denumireSediu = denumireSediu;
	}


	public void setTara(String tara) {
		this.tara = tara;
	}


	public void setNrParlamentari(int nrParlamentari) {
		this.nrParlamentari = nrParlamentari;
	}


	public void setDurataMandat(int durataMandat) {
		this.durataMandat = durataMandat;
	}


	public void setDenumireSediu(String denumireSediu) {
		this.denumireSediu = denumireSediu;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parlament [tara=");
		builder.append(tara);
		builder.append(", nrParlamentari=");
		builder.append(nrParlamentari);
		builder.append(", durataMandat=");
		builder.append(durataMandat);
		builder.append(", denumireSediu=");
		builder.append(denumireSediu);
		builder.append("]");
		return builder.toString();
	}

	
}
