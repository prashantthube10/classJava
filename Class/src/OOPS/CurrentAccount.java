package OOPS;

public class CurrentAccount  extends BankAccount{

int balance =0;
int count=0;
int amount;


/*// use of super 
super is used for calling superclass properties
calling  super class constructor
we can call super class constructor only from subclass constructor
super statement must be first statement
5.if we don't add super statement explicitly in the sub class constructor java compiler  will add a default statement like super
6.this default statement will call default constructor  */

	
	public void withdraw(int amount)
	{
		balance=balance-amount;
		count++;
		if(count>5)
		{
			balance=balance-5;	
		}
	}
	
	
	public void deposit(int amount)
	{
		balance=balance+amount;
		count++;
		if(count>5)
		{
			balance=balance-5;	
		}
	}
	
	public void checkBalance()
	{
		count++;
		if(count>5)
		{
			balance=balance-5;	
		}
		System.out.println(" Current balance is "+ balance);
	}
	


}
