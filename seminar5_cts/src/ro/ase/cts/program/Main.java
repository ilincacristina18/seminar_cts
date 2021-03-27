package ro.ase.cts.program;

import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.clase.Reteta;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> solutii1 = new ArrayList<>();
		solutii1.add("apa");
		List<Integer> cantitati1 = new ArrayList<>();
		cantitati1.add(10);
		
		Reteta reteta1 = new Reteta(solutii1, cantitati1);
		Reteta reteta2 = (Reteta) reteta1.copiaza();
		System.out.println(reteta1);
		System.out.println("----------------------------");
		System.out.println(reteta2);
		
		//pentru verificare
		if(reteta1 == reteta2) {
			System.out.println("Sunt identice");
		} else {
			System.out.println("Au instante diferite");
		}
	}

	
	
}
