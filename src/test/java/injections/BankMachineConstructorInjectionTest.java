package injections;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import modules.dependency.api.CashProvider;

class BankMachineConstructorInjectionTest {
	
	private static BankMachineConstructorInjection constructorInjectionTest;

	@BeforeAll
	static void setUp() {
		CashProvider cashProvider = new StubCashProvider();
		constructorInjectionTest = new BankMachineConstructorInjection(cashProvider);
	}
	
	@Test
	void amount_1_coin_1() {
		assertEquals(1, constructorInjectionTest.getAmountInCoins(1));
	}

	@Test
	void amount_2_coin_2() {
		assertEquals(2, constructorInjectionTest.getAmountInCoins(2));
	}

	@Test
	void amount_29_coin_4() {
		assertEquals(4, constructorInjectionTest.getAmountInCoins(29));
	}

	@Test
	void amount_4_notes_0() {
		assertEquals(0, constructorInjectionTest.getAmountInNotes(4));
	}

	@Test
	void amount_29_notes_25() {
		assertEquals(25, constructorInjectionTest.getAmountInNotes(29));
	}

}
