package ro.ase.cts.suites;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ro.ase.cts.categories.TesteRight;
import ro.ase.cts.categories.TesteUrgente;

@RunWith(Categories.class)
@Suite.SuiteClasses(CompleteTestSuite.class)
@Categories.IncludeCategory({TesteRight.class, TesteUrgente.class})
@Categories.ExcludeCategory(TesteRight.class)
public class CustomTestSuites {

}
