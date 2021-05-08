package ro.ase.cts.command.classes;

public class ComandaCreare extends ComandaAbstracta {

	public ComandaCreare(Executant executant, float suma) {
		super(executant, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.getExecutant().creeazaCont(super.getSuma());
	}

}
