
public class SavingAccount {

	private  int balance =0;
	public void deposit(int amount) {
		this.balance = amount;
	}

	public int balance() {
		return balance;
	}

	public void withdrow(int amount) {
		balance -= amount;
	}

}
