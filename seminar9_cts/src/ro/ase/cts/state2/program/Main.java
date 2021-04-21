package ro.ase.cts.state2.program;

import ro.ase.cts.state2.clase.Masa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa1 = new Masa(1);
		masa1.elibereazaMasa();
		masa1.ocupaMasa();
		masa1.rezervaMasa();
		masa1.elibereazaMasa();
		masa1.rezervaMasa();
	}

}
