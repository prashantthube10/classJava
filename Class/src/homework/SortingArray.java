package homework;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		
		///////    logoc to find smallest and highest number from an array.
	//	int arr [] = {8,2,7,4};
		
		
		/*int max=arr[0];
		int min=arr[0];
		
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if (arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("min vale = " + min);
		System.out.println("max value = " + max);*/
		
		/// logic to order the array on descending order
		
		/*int arr [] = {8,2,7,4};
		
		for(int i=0;i<arr.length;i++)
		{
		for(int j=0;j<arr.length;j++)
		{
              int temp=arr[i];
			if(temp>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			
		}

		}

		System.out.println(Arrays.toString(arr));*/
		
		
		
		/// logic to order the array on ascending order
		
		
                int arr [] = {8,2,7,4};
		
		for(int i=0;i<arr.length;i++)
		{
		for(int j=0;j<arr.length;j++)
		{
              int temp=arr[i];
			if(temp<arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			
		}

		}

		System.out.println(Arrays.toString(arr));
		
		
		
		
		

	}

}
