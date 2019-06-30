package OOPS;

public class Circle extends Shape {
	
	private double redius;
	 double pi=3.14;

	public Circle (double rediusvalue)
	{
		redius = rediusvalue;
		
	}
	
	
	
	@Override
	public void area() {
		
	double area  = pi*(redius*redius);
	System.out.println("area of circle  " + area);
			
			
			
				
	}

	@Override
	public void perimeter() {
		
		double perimeter = 2*pi*redius;
		System.out.println("perimeter of circle  " + perimeter);
		
	}


}
