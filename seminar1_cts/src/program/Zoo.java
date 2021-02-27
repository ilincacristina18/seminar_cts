package program;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeper zookeper;
	private List<Animal> animals;
	
	public Zoo() {
		this.animals = new ArrayList<>();
		this.zookeper = new Zookeper("Gigel");
	}
	
	public Zoo(Zookeper zookeper, List<Animal> animals) {
		this.zookeper = zookeper;
		this.animals = animals;
	}
	
	public void Add(Animal animal) {
		this.animals.add(animal);
	}
	
	public void feedAllAnimals() {
		for(Animal a:animals) {
			zookeper.feed(a);
		}
	}
}
