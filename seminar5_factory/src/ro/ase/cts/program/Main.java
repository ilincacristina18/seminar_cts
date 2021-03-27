package ro.ase.cts.program;

import ro.ase.cts.clase.Factory;
import ro.ase.cts.clase.FactorySingleton;
import ro.ase.cts.clase.PersonalMedical;
import ro.ase.cts.clase.TipPersonal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory factory = new Factory();
		
		PersonalMedical medic1 = factory.create(TipPersonal.MEDIC, "Ionescu", 5000);
		PersonalMedical asistent1 = factory.create(TipPersonal.ASISTENT, "Popescu", 2000);
		
		System.out.println(medic1);
		System.out.println(asistent1);
		
		PersonalMedical medic2 = FactorySingleton.getInstance().create(TipPersonal.MEDIC, "Radu", 6000);
		System.out.println(medic2);
	}

}
