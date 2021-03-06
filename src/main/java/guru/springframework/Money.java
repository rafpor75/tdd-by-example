package guru.springframework;

public abstract class Money {
	protected int amount;
	protected abstract String currency();
	
	public abstract Money times(int multiplier);
	
	public static Money dollar(int amount) {
		return new Dollar(amount,"USD");
	}
	
	public static Money franc(int amount) {
		return new Franc(amount,"CHF");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
}
