package Exception;

public class ThrowDemo {

	public static void main(String[] args) {

		
		divide(4, 0);
	}

	public static void divide(int a,int  b ) 
	{
		if(b==0)
		{
			throw new RuntimeException("please provide a non zero number");
			
		}
		
		System.out.println("result"  + (a/b));
	}


}
