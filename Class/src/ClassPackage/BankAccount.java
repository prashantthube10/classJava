package ClassPackage;

public class BankAccount {
	
	
	private String accountHolderName;
	private String accountNumber;
	private double balance;
	
	
	
	
	// constructor
	// constructor by default compiler will create one constructor always has same name as class name
	//default constructor is same like is a constructor with no parameter  
	
//	use of constructor
	
	//1.to create object of a class;
	//2.to assign memory to an object
	//3.to assign default values to instance variable/class properties
	

	public BankAccount(String personName,String accNo,double bal)
	
	
	{
	   accountHolderName=personName;
	   accountNumber=accNo;
	   balance=bal;
	}
	
	
	
	
	//setter methods are always be public and void
    // 2. setter methods start with word set then name of property
	//3.setter methods needs to declare one parameter 
	
	
	
	public void setAccountHolderName(String name)
	{
		accountHolderName=name;
	}
	
	public void setAccountHolderNumber(String accNo)
	{
		accountNumber=accNo;
	}
	
	
	public void setBalance(int bal)
	{
		balance=bal;
	}
	
	
	
	
	public String getAccountHolderName()
	{
		return accountHolderName;
		
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
		
	}
	
	
	
	// normal methods 
	
	public void withdraw(int amount)
	{
		balance=balance-amount;
	}
	
	
	public void deposit(int amount)
	{
		balance=balance+amount;
	}
	
	public void checkBalance()
	{
		System.out.println(" Current balance is "+ balance);
	}
	
	
}
