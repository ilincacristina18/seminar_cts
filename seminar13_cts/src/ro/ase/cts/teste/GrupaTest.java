package ro.ase.cts.teste;

import static org.junit.Assert.*;

import java.lang.reflect.Executable;

import org.junit.experimental.categories.Category;

import ro.ase.cts.categories.TesteRight;
import ro.ase.cts.categories.TesteUrgente;
import ro.ase.cts.clase.Grupa;

public class GrupaTest {

	@org.junit.Test
	@Category(TesteRight.class)
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1086);
		assertEquals(1086, grupa.getNrGrupa());
	}
	
	@org.junit.Test
	public void testConstructorLimitaInferioara() {
		//test pentru limita inferioara si limita superioara - Boundary
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@org.junit.Test
	@Category(TesteUrgente.class)
	public void testConstructorLimitaSuperioara() {
		//test pentru limita inferioara si limita superioara
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testConstructorException1() {
		Grupa grupa = new Grupa(900);
		//assertThrows(IllegalArgumentException.class, () -> {new Grupa(900)});
	}

	@org.junit.Test(expected = IllegalArgumentException.class)
	public void testConstructorException2() {
		Grupa grupa = new Grupa(1200);
		//assertThrows(IllegalArgumentException.class, () -> {new Grupa(900)});
	}
	
	@org.junit.Test(timeout = 500)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1086);
	}
	
	@org.junit.Test
	@Category(TesteUrgente.class)
	public void testConstructorRange() {
		Grupa grupa = new Grupa(1001);
		assertEquals(1001, grupa.getNrGrupa());
		Grupa grupa2 = new Grupa(1099);
		assertEquals(1099, grupa2.getNrGrupa());
		
	}
	
	@org.junit.Test
	public void testConstructorExistance() {
		Grupa grupa = new Grupa(1041);
		assertNotNull(grupa.getStudenti());
	}
}
