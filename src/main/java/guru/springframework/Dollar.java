package guru.springframework;

public class Dollar extends Money {

	private String currency;

	public Dollar(int amount, String currency) {
		this.amount=amount;
		this.currency=currency;
	}

	public Dollar times(int multiplier) {
		
		return new Dollar(amount*multiplier,"USD");
	}

	@Override
	protected String currency() {
		// TODO Auto-generated method stub
		return currency;
	}

	

}
