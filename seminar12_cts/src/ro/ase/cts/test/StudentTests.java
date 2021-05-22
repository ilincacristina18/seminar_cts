package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorWorksCorectlyForName() {
		String nume = "Gigel";
		Student student = new Student(nume);
		/*
		 * if(nume.equals(student.getNume())) { System.out.println("e in regula"); }
		 * else { System.out.println("constructorul nu initializeaza numele corect"); }
		 */
		assertEquals(nume, student.getNume()); //va face exact ce s-a facut in if
	}
	
	@Test
	public void testSetNume() {
		String nume = "Popescu";
		Student student = new Student();
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testDefaultConstructorWorksCorectly() {
		Student student = new Student();
		//assertNotEquals(null, student.getNote());
		assertNotNull("Lista de note nu a fost initializata", student.getNote());
		assertNotNull("Numele nu a fost initializat", student.getNume());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testGetNota() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(6);
		student.adaugaNota(7);
		student.adaugaNota(9);
		assertEquals(7, student.getNota(2));
	}
	
	@Test
	public void testAdaugaOSinguraNota() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaNotaIncorecta() {
		Student student = new Student();
		/*
		 * //1 try { //2 student.adaugaNota(-1); //3 - nu ajunge aici
		 * fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie"); }
		 * catch(IllegalArgumentException exception) { //4 } catch (Exception e) { //5 -
		 * nu ajunge aici fail("Nu arunca o exceptie de tipul IllegalArgument"); } //6
		 */	
		student.adaugaNota(-1);
	}
	
	@Test
	public void testStudentulAreRestante() {
		Student student = new Student();
		student.adaugaNota(4);
		boolean rezultat = student.areRestante();
		//assertEquals(true, rezultat);
		assertTrue(rezultat);
		Student student2 = new Student();
		student2.adaugaNota(10);
		boolean rezultat2 = student2.areRestante();
		assertFalse(rezultat2);
	}
	
	@Test
	public void testCalculeazaMedieCorect() {
		Student student = new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		//assertEquals(9.5, student.calculeazaMedie());
		assertEquals(9.5, student.calculeazaMedie(), 0.01);
	}

}
