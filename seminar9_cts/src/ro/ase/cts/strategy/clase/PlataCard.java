package ro.ase.cts.strategy.clase;

public class PlataCard implements Payable{

	@Override
	public void pay(float suma) {
		// TODO Auto-generated method stub
		System.out.println("A fost realizata o plata cu cardul in valoare de " + suma + " lei");
	}

}
