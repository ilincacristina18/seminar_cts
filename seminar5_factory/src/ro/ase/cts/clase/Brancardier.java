package ro.ase.cts.clase;

public class Brancardier extends PersonalMedical {

	public Brancardier(String nume, float salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Brancardier{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }

}
