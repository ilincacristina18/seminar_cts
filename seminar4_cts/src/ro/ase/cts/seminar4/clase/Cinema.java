package ro.ase.cts.seminar4.clase;

public class Cinema {
	private String denumireCinema;
	private int nrSali;
	private float pretBilet;
	
	private static Cinema cinema = null;
	
	public static Cinema getInstance(String denumireCinema, int nrSali, float pretBilet) {
		if(cinema == null) {
			synchronized (Cinema.class) {
			cinema = new Cinema(denumireCinema, nrSali, pretBilet);
		}
		}
		return cinema;
	}
	
	private Cinema() {
		denumireCinema = "";
		nrSali = 0;
		pretBilet = 0;
	}

	private Cinema(String denumireCinema, int nrSali, float pretBilet) {
		super();
		this.denumireCinema = denumireCinema;
		this.nrSali = nrSali;
		this.pretBilet = pretBilet;
	}

	public void setDenumireCinema(String denumireCinema) {
		this.denumireCinema = denumireCinema;
	}

	public void setNrSali(int nrSali) {
		this.nrSali = nrSali;
	}

	public void setPretBilet(float pretBilet) {
		this.pretBilet = pretBilet;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cinema [denumireCinema=");
		builder.append(denumireCinema);
		builder.append(", nrSali=");
		builder.append(nrSali);
		builder.append(", pretBilet=");
		builder.append(pretBilet);
		builder.append("]");
		return builder.toString();
	}

	
}
