package modules.application;

public class Money implements Comparable<Money> {
	private int amount;
	private String type;

	public Money(int amount, String type) {
		this.amount = amount;
		this.type = type;
	}

	public Money(int amount) {
		this.amount = amount;
	}

	@Override
	public boolean equals(Object comparedObject) {
		if (comparedObject != null && comparedObject instanceof Money) {
			Money money = (Money) comparedObject;
			return (this.amount == money.amount) && (this.type.equals(money.type));
		}
		return false;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public int compareTo(Money comparedObject) {
		int compareAmount = comparedObject.amount;
		return this.amount - compareAmount;
	}

	public int getAmount() {
		return amount;
	}
}
