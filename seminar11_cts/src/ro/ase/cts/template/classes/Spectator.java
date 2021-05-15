package ro.ase.cts.template.classes;

public class Spectator extends SpectatorAbstract{
	private String numeSpectator;

	public Spectator(String numeSpectator) {
		this.numeSpectator = numeSpectator;
	}


	@Override
	public void seAseazaLaCoada() {
		System.out.println(this.numeSpectator + " s-a asezat la coada");
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println(this.numeSpectator + " a prezentat biletul");
		
	}

	@Override
	public void seFaceControlulCorporal() {
		System.out.println(this.numeSpectator + " a efectuat controlul corporal");
		
	}

	@Override
	public void seOcupaLoc() {
		System.out.println(this.numeSpectator + " si-a ocupat locul");
		
	}
	
}
