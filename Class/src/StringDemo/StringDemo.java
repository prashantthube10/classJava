package StringDemo;

public class StringDemo {

	public static void main(String[] args) {
		
		
		String a = "Hello";
		String b = "Hello";
	    String c = new String ("hello");
		String d= new String ("Hello");
		
		
		if(a.equals(b))
		{
			System.out.println(" a and b are same");
		}
		else
		{
			System.out.println("a and b are different");
		}
		
		if (c.equals(b))
		{
			System.out.println("c and b are same");
		}
		else
		{
			System.out.println("c and b are different");
		}
		if (c.equals(d))
		{
			System.out.println("c and d are same");
		}
		
		
		
		else
		{
			System.out.println("c and d are different");
		}
		 
		
		
	}

}
