package injections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import modules.dependency.api.CashProvider;

class BankMachineParameterInjectionTest {
	
	private static CashProvider cashProvider;
	private static BankMachineParameterInjection parameterInjectionTest;

	@BeforeAll
	static void setUp() {
		cashProvider = new StubCashProvider();
		parameterInjectionTest = new BankMachineParameterInjection();
	}
	@Test
	void amount_1_coin_1() {
		assertEquals(1, parameterInjectionTest.getAmountInCoins(1, cashProvider));
	}

	@Test
	void amount_2_coin_2() {
		assertEquals(2, parameterInjectionTest.getAmountInCoins(2, cashProvider));
	}

	@Test
	void amount_29_coin_4() {
		assertEquals(4, parameterInjectionTest.getAmountInCoins(29, cashProvider));
	}

	@Test
	void amount_4_notes_0() {
		assertEquals(0, parameterInjectionTest.getAmountInNotes(4, cashProvider));
	}

	@Test
	void amount_29_notes_25() {
		assertEquals(25, parameterInjectionTest.getAmountInNotes(29, cashProvider));
	}

}
