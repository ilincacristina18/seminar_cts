package ro.ase.cts.state2.clase;

public class StareRezervata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(masa.getStare() instanceof StareLibera) {
			System.out.println("Masa cu numarul " + masa.getNrMasa() + " a fost rezervata");
		} else {
			System.out.println("Masa nu poate fi rezervata!");
		}
	}

}
