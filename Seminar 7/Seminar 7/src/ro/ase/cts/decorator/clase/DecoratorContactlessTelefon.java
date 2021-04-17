package ro.ase.cts.decorator.clase;

public class DecoratorContactlessTelefon extends DecoratorAbstract {

	public DecoratorContactlessTelefon(CardBancar card) {
		super(card);
	}

	@Override
	public void platesteContactless() {
		System.out.println( ((Card)super.getCardBancar()).getTitular() + " a platit contactless cu telefonul");
		
	}
	
	
}
