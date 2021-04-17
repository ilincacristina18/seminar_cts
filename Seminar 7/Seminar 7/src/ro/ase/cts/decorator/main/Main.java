package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.DecoratorContactlessCard;
import ro.ase.cts.decorator.clase.DecoratorContactlessTelefon;

public class Main {

	public static void main(String[] args) {
		Card card = new Card("Popescu Alina");
		card.platestePOS();
		card.platesteOnline();
		System.out.println("-------------------------");
		DecoratorContactlessCard decoratorContactlessCard = new DecoratorContactlessCard(card);
		decoratorContactlessCard.platesteContactless();
		decoratorContactlessCard.platesteOnline();
		decoratorContactlessCard.platestePOS();
		System.out.println("-------------------------");
		DecoratorContactlessTelefon decoratorContactlessTelefon = new DecoratorContactlessTelefon(card);
		decoratorContactlessTelefon.platesteContactless();
	}

}
