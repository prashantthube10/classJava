package OOPS;

public class BankUser extends BankAccount{

	public static void main(String[] args) {
		
		CurrentAccount currentAccount=new CurrentAccount();
		
		
		
		currentAccount.deposit(500);
		currentAccount.withdraw(10);
		currentAccount.withdraw(50);
		currentAccount.withdraw(50);
		currentAccount.withdraw(50);
		
		currentAccount.deposit(50);
		currentAccount.checkBalance();
		
	}

}
