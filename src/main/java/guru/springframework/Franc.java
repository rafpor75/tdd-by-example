package guru.springframework;

public class Franc extends Money {
	private String currency;

	public Franc(int amount, String currency) {
		this.amount=amount;
		this.currency=currency;
	}

	public Franc times(int multiplier) {
		
		return new Franc(amount*multiplier, "CHF");
	}

	@Override
	protected String currency() {
		
		return currency;
	}

	
}
