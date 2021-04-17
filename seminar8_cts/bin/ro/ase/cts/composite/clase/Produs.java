package ro.ase.cts.composite.clase;

public class Produs implements ComponentaAbstracta{
	private String numeProdus;
	
	public Produs(String numeProdus) {
		super();
		this.numeProdus = numeProdus;
	}

	@Override
	public void printareElement() {
		// TODO Auto-generated method stub
		System.out.println("Produsul " + this.numeProdus);
	}

	@Override
	public void adaugaNod(ComponentaAbstracta componentaAbstracta) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public void stergeNod(ComponentaAbstracta componentaAbstracta) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public ComponentaAbstracta getNod(int pozitie) {
		// TODO Auto-generated method stub
		return null;
	}

}
