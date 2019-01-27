package modules.dependency.impl;

import java.util.Arrays;
import java.util.List;

import modules.application.Money;
import modules.dependency.api.CashProvider;

public class CashProviderImpl implements CashProvider {

	public List<Money> getNotes(String currency) {
		if ("EUR".equals(currency)) {
			return Arrays.asList(new Money(5, "note"), new Money(10, "note"), new Money(20, "note"),
					new Money(50, "note"), new Money(100, "note"));
		}
		return Arrays.asList(new Money(10, "note"), new Money(20, "note"), new Money(50, "note"));
	}

	public List<Money> getCoins(String currency) {
		if ("EUR".equals(currency)) {
			return Arrays.asList(new Money(1, "coin"), new Money(2, "coin"));
		}
		return Arrays.asList(new Money(1, "coin"), new Money(2, "coin"), new Money(5, "coin"));
	}
}
