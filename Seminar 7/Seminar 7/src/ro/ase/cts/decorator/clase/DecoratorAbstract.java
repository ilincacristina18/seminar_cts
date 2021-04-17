package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements CardBancar{
	
	private CardBancar cardBancar;

	public DecoratorAbstract(CardBancar card) {
		this.cardBancar = card;
	}
	
	public CardBancar getCardBancar() {
		return cardBancar;
	}

	public abstract void platesteContactless();

	@Override
	public void platestePOS() {
		this.cardBancar.platestePOS();
	}

	@Override
	public void platesteOnline() {
		this.cardBancar.platesteOnline();
	}
	

}
