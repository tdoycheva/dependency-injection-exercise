package injections;

import java.util.Collections;
import java.util.List;

import modules.application.Money;
import modules.dependency.api.CashProvider;

/**
 * Dependency injection using setter method
 *
 */
public class BankMachineSetterInjection {

	private CashProvider cashProvider;
	
	public int getAmountInCoins(int amount) {
		List<Money> notes = cashProvider.getNotes("EUR");
		Collections.sort(notes);
		return (amount <= 0) ? -1 : amount % notes.get(0).getAmount();
	}

	public int getAmountInNotes(int amount) {
		return amount - getAmountInCoins(amount);
	}

	public void setCashProvider(CashProvider cashProvider) {
		this.cashProvider = cashProvider;
	}

	
}
