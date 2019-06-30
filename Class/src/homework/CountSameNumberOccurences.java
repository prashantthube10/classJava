package homework;

public class CountSameNumberOccurences {

	public static void main(String[] args) {
             int arr [] = {8,2,7,2,2,8,4};
		
		
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
		for(int j=i+1;j<arr.length;j++)
		{
           if(arr[i]==arr[j])
           {
        	   count++;
        	   System.out.println("duplicate numbers are " + arr[i] + count );
           }
		}

		}

	}

}
