import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;


public class _SavingAccountYearTest {

//	@Test
//	public void depositAndWithdroval() {
//		SavingAccountYear account = new SavingAccountYear();
//		account.deposit(100);
//		assertEquals("After deposit",100, account.balance());
//		account.withdrow(50);
//		assertEquals("After withdrow ",50, account.balance());		
//	}
	
//	@Test
//	public void negativeBalanceIsJustFine(){
//		SavingAccountYear  account = new SavingAccountYear();
//		account.withdrow(75);
//		assertEquals(-75, account.balance());
//	}
	
	@Test
	public void endingBalance(){
		SavingAccountYear accountYear = new SavingAccountYear(10000,10);
		assertEquals(11000, accountYear.endingBalance());
		
	}
	
	@Test
	@Ignore
	public void nextYearsStartingBalanceShouldEquakThisYearsEndingBalance(){
		SavingAccountYear account = new SavingAccountYear(1000,10);
//		SavingAccountYear account =  new SavingAccountYear();
//		account.deposit(10000);
//		SavingAccountYear nextYear = account.nextYear(10);
		assertEquals(account.endingBalance(), account.nextYear().startingBalance());
	}
	
	
	

}
