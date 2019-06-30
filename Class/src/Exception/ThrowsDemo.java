package Exception;


public class ThrowsDemo {

	public static void main(String[] args) {
		
		try
		// here main methids is caller of divide methids
		//
		//now it is maincmethods responsibilties to handle the exception using try caltch block 
			{
			divide(23,0);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(" in catch");
		}
        System.out.println("after exception");
	 
	}

	
	public static void divide(int firstNumber,int secondNumber ) throws ArithmeticException
	{
		int result = firstNumber/secondNumber;
		System.out.println(result);
	}
}
