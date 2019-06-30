package homework;

public class AdditionofNumber {

	public static void main(String[] args) {
		
		
		int number=356;
		int add=0;
		while(number!=0)
		{
			
			add=add+number%10;
			number=number/10;
		}
      System.out.println(add);
	}

}
