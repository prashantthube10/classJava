package homework;

public class ReverseNumber {

	public static void main(String[] args) {
		
		
		
		int number=12345;
		int rnumber=0;
		
		while(number!=0)
		{
			
		
		rnumber=rnumber*10;
		rnumber=rnumber + number%10;
		number=number/10;

		}
		System.out.println(rnumber);
	}

}
