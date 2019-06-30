package Exception;

public class FinalyBlockDemo {
	
	public static void main(String[] args) {
		
		int firstNumber =0;
		int secondNumber=23;

				try {
					
					System.exit(0);
					
		int result1=secondNumber/firstNumber;
		
		//System.exit(0);
				}
				catch(ArithmeticException ex)
				{
					System.out.println(" plz check divide by value it should not be zero");
				}
		
		
		finally
		{
			System.out.println(" i m final");
		}
		
		
	}

}
