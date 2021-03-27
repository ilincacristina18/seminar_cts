package ro.ase.cts.clase;

public class Medic extends PersonalMedical{
	
	public Medic(String nume, float salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}

	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append(super.toString()).append('}');
        return sb.toString();
    }

}
