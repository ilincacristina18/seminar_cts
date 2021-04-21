package ro.ase.cts.state2.clase;

public class StareOcupata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		// TODO Auto-generated method stub
		if(!(masa.getStare() instanceof StareOcupata)) {
			System.out.println("Masa cu numarul " + masa.getNrMasa() + " a fost ocupata");
		} else {
			System.out.println("Masa nu poate fi ocupata!");
		}
	}

}
