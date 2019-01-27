package injections;

import java.util.Collections;
import java.util.List;

import modules.application.Money;
import modules.dependency.api.CashProvider;

/**
 * Dependency injection using the constructor
 *
 */
public class BankMachineConstructorInjection {

	private CashProvider cashProvider;

	/**
	 * Inject CashProvider in the constructor with default visibility because it is
	 * used only in the tests
	 **/
	BankMachineConstructorInjection(CashProvider cashProvider) {
		this.cashProvider = cashProvider;
	}

	public int getAmountInCoins(int amount) {
		List<Money> notes = cashProvider.getNotes("EUR");
		Collections.sort(notes);
		return (amount <= 0) ? -1 : amount % notes.get(0).getAmount();
	}

	public int getAmountInNotes(int amount) {
		return amount - getAmountInCoins(amount);
	}
}
