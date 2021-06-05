package ro.ase.cts.mock;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class StudentFake implements IStudent{
	
	private String valoareGetNume;
	private List<Integer> valoareGetNote;
	private float valoareCalculeazaMedie;
	private int valoareGetNota;
	private boolean valoareAreRestante;

	public void setValoareAreRestante(boolean valoareAreRestante) {
		this.valoareAreRestante = valoareAreRestante;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return this.valoareGetNume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return this.valoareGetNote;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return this.valoareCalculeazaMedie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return this.valoareGetNota;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return this.valoareAreRestante;
	}

}
