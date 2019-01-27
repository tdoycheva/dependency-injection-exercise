package injections;

import java.util.Collections;
import java.util.List;

import modules.application.Money;
import modules.dependency.api.CashProvider;
import modules.dependency.impl.CashProviderImpl;

/**
 * Dependency injection using parameter in the method
 *
 */
public class BankMachineParameterInjection {

	public int getAmountInCoins(int amount, CashProvider cashProvider) {
		if (cashProvider == null) {
			cashProvider = new CashProviderImpl();
		}

		List<Money> notes = cashProvider.getNotes("EUR");
		Collections.sort(notes);
		return (amount <= 0) ? -1 : amount % notes.get(0).getAmount();

	}

	public int getAmountInNotes(int amount, CashProvider cashProvider) {
		return amount - getAmountInCoins(amount, cashProvider);
	}

}
