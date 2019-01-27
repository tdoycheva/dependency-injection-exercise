package modules.dependency.api;

import java.util.List;

import modules.application.Money;

public interface CashProvider {
	public List<Money> getNotes(String currency);

	public List<Money> getCoins(String currency);
}
