package ClassPackage;

import java.util.Arrays;

public class CommanElementFromArray {

	
	public static void main(String[] args) {
		
		
		/*int arr1[]= {5,7,4,3,2};
		int arr2[]= {7,8,99,200};
		
		
		for (int i=0;i<arr1.length;i++)
		{
			for (int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println("common element is " + arr1[i]);
				}
			}
		}
		*/
		
		int arr1[]= {5,7,4,3,2,1};
		//int a=arr1.length/2;
		//int arr2[]= {};
		int arr2[]= {0,0,0,0,0,0};
		
		for (int i=0;i<arr1.length;i++)
		{
			
			arr2[i]=arr2[i]+arr1[5-(i)];
			
			//System.out.println();
			
		}
		System.out.println(Arrays.toString(arr2));
		
		
}
}
