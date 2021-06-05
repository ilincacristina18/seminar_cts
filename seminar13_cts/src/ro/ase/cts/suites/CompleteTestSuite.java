package ro.ase.cts.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ro.ase.cts.teste.GrupaTest;
import ro.ase.cts.teste.GrupaTestWihMocks;
import ro.ase.cts.teste.GrupaTestWithFakes;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestWihMocks.class, GrupaTestWithFakes.class})
public class CompleteTestSuite {
	
}
