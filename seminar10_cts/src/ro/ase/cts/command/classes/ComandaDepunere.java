package ro.ase.cts.command.classes;

public class ComandaDepunere extends ComandaAbstracta{

	public ComandaDepunere(Executant executant, float suma) {
		super(executant, suma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void executa() {
		// TODO Auto-generated method stub
		super.getExecutant().depunere(super.getSuma());
	}

}
