package injections;

import java.util.ArrayList;
import java.util.Arrays;

import modules.application.Money;
import modules.dependency.api.CashProvider;

public class StubCashProvider implements CashProvider {
	
	 @Override
     public ArrayList<Money> getNotes(String currency) {
         return new ArrayList<Money>(Arrays.asList(new Money(99),new Money(5),new Money(11)));
     }

     @Override
     public ArrayList<Money> getCoins(String currency) {
         return null;
     }

}
