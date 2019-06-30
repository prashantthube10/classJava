package OOPS;

public class SavingAccount extends BankAccount {
	
	
	public void withdraw(int amount)
	{
		int count =0;
		count++;
		
		int balance=0;
		balance = balance -amount;
		
		if(count>5)
		{
			balance = balance -10;
			
			
			
		}
		
		
	}

	
}
