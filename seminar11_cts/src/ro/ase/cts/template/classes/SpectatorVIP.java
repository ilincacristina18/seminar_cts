package ro.ase.cts.template.classes;

public class SpectatorVIP extends SpectatorAbstract{
	private String nume;
	private int nrLoja;

	public SpectatorVIP(String nume, int nrLoja) {
		super();
		this.nume = nume;
		this.nrLoja = nrLoja;
	}

	@Override
	public void seAseazaLaCoada() {
		
	}

	@Override
	public void prezintaBilet() {
		System.out.println("Spectatorul VIP " + this.nume + " a prezentat biletul pentru loja");
	}

	@Override
	public void seFaceControlulCorporal() {
		System.out.println("Spectatorului VIP " + this.nume + " i s-a facut controlul corporal");
	}

	@Override
	public void seOcupaLoc() {
		System.out.println("Spectatorul VIP " + this.nume + " a ocupat locul cu numarul " + this.nrLoja + " de la loja");
	}

}
