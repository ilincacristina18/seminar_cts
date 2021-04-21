package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PlataBonMasa;
import ro.ase.cts.strategy.clase.PlataCard;
import ro.ase.cts.strategy.clase.PlataCash;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client1 = new Client("Ionel", new PlataCash());
		client1.platesteNota(200);
		client1.setPlata(new PlataCard());
		client1.platesteNota((float)100.5);
		client1.setPlata(new PlataBonMasa());
		client1.platesteNota(100);
	}

}
