package OOPS;

public class StatickeywordRules {
	
	int firstnumber = 56;
	static int secondnumber = 90;
	
	
	//instance methods can access both instance and static variables
	public void instance_method_1()
	{
		firstnumber=78;  //accessing static variables inside instance method
		
		secondnumber=98;  //accessing instance variable inside instance method
		
	}

	
	// instance method can call both static and instance method directly
	
	public void instance_method_2()
	{
		instance_method_1();  //calling instance methods from instance method
		
		static_method_1();  //calling static method from instance method
		
	}
	
	// static method can only access static variables
	
	public static void static_method_1()
	{
firstnumber=98;  //accessing instance  variables from static method
		
		secondnumber=100;  //accessing static variable inside static method
		
	}
	
	
	//static methods can only call static methods directly
	public static void static_method_2()
	{
instance_method_1();  //calling instance methods from static  method

static_method_1();  //calling static method from static method
		
	}
	
	
}
