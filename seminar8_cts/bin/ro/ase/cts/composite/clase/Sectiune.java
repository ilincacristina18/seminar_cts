package ro.ase.cts.composite.clase;

import java.util.ArrayList;

public class Sectiune implements ComponentaAbstracta{
	private String numeSectiune;
	private ArrayList<ComponentaAbstracta> listaComponente = new ArrayList<>();

	
	public Sectiune(String numeSectiune) {
		super();
		this.numeSectiune = numeSectiune;
	}
	
	@Override
	public void printareElement() {
		// TODO Auto-generated method stub
		System.out.println("Sectiune " + this.numeSectiune);
		for(ComponentaAbstracta componentaAbstracta : listaComponente)
			componentaAbstracta.printareElement();
	}

	@Override
	public void adaugaNod(ComponentaAbstracta componentaAbstracta) {
		// TODO Auto-generated method stub
		if(componentaAbstracta != null)
		    listaComponente.add(componentaAbstracta);
	}

	@Override
	public void stergeNod(ComponentaAbstracta componentaAbstracta) {
		// TODO Auto-generated method stub
		if(componentaAbstracta != null)
		listaComponente.remove(componentaAbstracta);
	}

	@Override
	public ComponentaAbstracta getNod(int pozitie) {
		// TODO Auto-generated method stub
		if(pozitie >= 0 && pozitie < listaComponente.size()) {
			return listaComponente.get(pozitie);
		}
		throw new IndexOutOfBoundsException();
	}
}
