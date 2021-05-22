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

}
