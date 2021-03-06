package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readers.EleviReader;
import ro.ase.cts.clase.readers.StudentiReader;
import ro.ase.cts.clase.readers.Readable;

public class Program {
	public static List<Aplicant> citesteAplicanti(String numeFisier, Readable reader) throws FileNotFoundException{
		return reader.readAplicanti(numeFisier);
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citesteAplicanti("elevi.txt", new EleviReader());
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
