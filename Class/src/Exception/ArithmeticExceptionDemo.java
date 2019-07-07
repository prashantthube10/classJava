package Exception;

public class ArithmeticExceptionDemo {

	
	public static void main(String[] args) {
		
		
		int firstNumber =0;
		int secondNumber=23;

				try {
		int result1=secondNumber/firstNumber;
				}
				
				catch(ArithmeticException e)
				{
					System.out.println(" plz check divide by value it should not be zero");
					System.exit(0);
				}
				catch(Exception e)
				{
					System.out.println("catch 1");
				}
		
		finally
		{
			System.out.println("finally");
		}
         
		
		/*double thirdNumber =0;
		double fourthNumber=23;
		
				double result=fourthNumber/thirdNumber;*/
				
		
	}
}
;


