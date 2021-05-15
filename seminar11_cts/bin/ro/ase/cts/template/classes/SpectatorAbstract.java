package ro.ase.cts.template.classes;

public abstract class SpectatorAbstract {
	
	public final void intraPeStadion() {
		seAseazaLaCoada();
		prezintaBilet();
		seFaceControlulCorporal();
		seOcupaLoc();
	}
	
	public abstract void seAseazaLaCoada();
	public abstract void prezintaBilet();
	public abstract void seFaceControlulCorporal();
	public abstract void seOcupaLoc();
}
