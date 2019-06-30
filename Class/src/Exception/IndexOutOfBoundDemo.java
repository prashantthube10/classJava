package Exception;

public class IndexOutOfBoundDemo {

	public static void main(String[] args) {
		
		int arr [] = {1,2,3};
		
		int firstNumber = 23;
		int secondNumber=0;
		
		
		try {
		
			int result=firstNumber/secondNumber;
			
		System.out.println(arr[4]);
		
		System.out.println("result of divison is  " + result);
		
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("please check arrray index, it should be in range->");
			System.out.println(" array last index is->" + (arr.length-1));
		}
		
		catch(ArithmeticException ex)
		{
			System.out.println("please check divide by zero value");
			
		}
		
		
		System.out.println("after try catch ");
	}

}
