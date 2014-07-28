
public class SavingAccountYear {

	private  int balance =0;
	private int interestRate = 0;
	
	public SavingAccountYear() {
	}
	public SavingAccountYear(int startingBalance, int interestRate) {
		this.balance = startingBalance;
		this.interestRate  = interestRate;
	}

	public void deposit(int amount) {
		this.balance += amount;
	}

	public int balance() {
		return balance;
	}

	public void withdrow(int amount) {
		balance -= amount;
	}

	public SavingAccountYear nextYear() {
		SavingAccountYear account = new SavingAccountYear();
		account.deposit(balance() + (balance()*interestRate/100));
		return  account;
	}

	public int endingBalance() {
		return balance() + (balance()*interestRate/100);
	}
	public int startingBalance() {
		return 0;
	}

}
