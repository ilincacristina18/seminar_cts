package ro.ase.cts.strategy.clase;

public class PlataBonMasa implements Payable{

	@Override
	public void pay(float suma) {
		// TODO Auto-generated method stub
		System.out.println("A fost realizata o plata cu bonuri de masa in valoare de " + suma + " lei");
	}

}
