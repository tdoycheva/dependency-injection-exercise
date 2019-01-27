package injections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import modules.dependency.api.CashProvider;

class BankMachineSetterInjectionTest {
	
	private static BankMachineSetterInjection setterInjectionTest;

	@BeforeAll
	static void setup() {
		setterInjectionTest = new BankMachineSetterInjection();
		CashProvider cashProvider = new StubCashProvider();
		setterInjectionTest.setCashProvider(cashProvider);
	}

	@Test
	void amount_1_coin_1() {

		assertEquals(1, setterInjectionTest.getAmountInCoins(1));
	}

	@Test
	void amount_2_coin_2() {
		assertEquals(2, setterInjectionTest.getAmountInCoins(2));
	}

	@Test
	void amount_29_coin_4() {
		assertEquals(4, setterInjectionTest.getAmountInCoins(29));
	}

	@Test
	void amount_4_notes_0() {
		assertEquals(0, setterInjectionTest.getAmountInNotes(4));
	}

	@Test
	void amount_29_notes_25() {
		assertEquals(25, setterInjectionTest.getAmountInNotes(29));
	}

}
