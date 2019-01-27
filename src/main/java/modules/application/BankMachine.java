package modules.application;

import java.util.Collections;
import java.util.List;

import modules.dependency.api.CashProvider;
import modules.dependency.impl.CashProviderImpl;

public class BankMachine {

	public int getAmountInCoins(int amount) {
		CashProvider cashProvider = new CashProviderImpl();
		List<Money> notes = cashProvider.getNotes("EUR");
		Collections.sort(notes);
		return (amount <= 0) ? -1 : amount % notes.get(0).getAmount();

	}

	public int getAmountInNotes(int amount) {
		return amount - getAmountInCoins(amount);
	}

}