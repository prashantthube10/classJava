package ClassPackage;

public class BankUsers {

	
	
	public static void main(String[] args) {
		
		BankAccount user1=new BankAccount("sagar","789",5000);
		user1.setAccountHolderName("sagr");
		user1.setAccountHolderNumber("789");
		user1.setBalance(5000);
		
		
		
		BankAccount user2=new BankAccount("navin","999",10000);
		user2.setAccountHolderName("navin");
		user2.setAccountHolderNumber("999");
		user1.setBalance(10000);
		
		user1.deposit(200);
		user2.withdraw(300);
		
		
		user1.checkBalance();
		user2.checkBalance();
		
		
		//application of the getter methods
		
		System.out.println( " Account holder name is " + user1.getAccountHolderName());
		System.out.println("account number is " +  user1.getAccountNumber());
		
		
		
	}
}
