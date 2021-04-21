package ro.ase.cts.state2.clase;

public class StareLibera implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStare() instanceof StareLibera)) {
			System.out.println("Masa cu numarul " + masa.getNrMasa() + " a fost eliberata");
		} else {
			System.out.println("Masa nu poate fi eliberata!");
		}
	}

}
