package homework;

public class SameArrayCheck {

	public static void main(String[] args) {
		int count=0;
		int stdCount=4;
		
		int arr1 []= {4,8,7,5};
		int arr2 []= {5,7,4,8};

		for (int i=0;i<arr1.length;i++)
		{ 
			
			for (int j=0;j<arr2.length;j++)
			{ 
				if (arr1[i]==arr2[j]  )
				{
					//System.out.println("same");
					count++;
					
				}
				
				
			}
		}
		
		if (count==stdCount)
		{
			System.out.println("it's same");
		}
		else
		{
			System.out.println("it's not same");
		}
		
	
		
		

	}

}
