package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Masa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Masa masa1 = new Masa(1);
		masa1.elibereazaMasa();
		masa1.rezervaMasa();
		masa1.ocupaMasa();
		masa1.elibereazaMasa();
	}

}
