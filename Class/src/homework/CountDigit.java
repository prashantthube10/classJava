package homework;

public class CountDigit {

	public static void main(String[] args) {

		int number=123356;
		int count=0;
		while(number!=0)
		{
			
			//add=add+number%10;
			number=number/10;
			count++;
		}
      System.out.println(count);

	}

}
