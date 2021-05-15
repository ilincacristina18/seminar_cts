package ro.ase.cts.template.main;

import ro.ase.cts.template.classes.Spectator;
import ro.ase.cts.template.classes.SpectatorVIP;

public class Main {

	public static void main(String[] args) {
		Spectator spectator = new Spectator("Gigel");
		SpectatorVIP spectatorVIP = new SpectatorVIP("Becali", 1);
		
		spectator.intraPeStadion();
		spectatorVIP.intraPeStadion();
	}

}
