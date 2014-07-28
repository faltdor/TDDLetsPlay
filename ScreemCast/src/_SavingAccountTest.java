import static org.junit.Assert.*;

import org.junit.Test;


public class _SavingAccountTest {

	@Test
	public void depositAndWithdroval() {
		SavingAccount account = new SavingAccount();
		account.deposit(100);
		assertEquals("After deposit",100, account.balance());
		account.withdrow(50);
		assertEquals("After withdrow ",50, account.balance());		
	}
	
	@Test
	public void negativeBalanceIsJustFine(){
		SavingAccount  account = new SavingAccount();
		account.withdrow(75);
		assertEquals(-75, account.balance());
	}

}
