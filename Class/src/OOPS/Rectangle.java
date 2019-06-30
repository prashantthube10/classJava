package OOPS;

public class Rectangle extends Shape {

	private double length;
	 private double width;
	
	 
	 public Rectangle (double legthvalue,double widthvalue)
		{
		 length = legthvalue;
		 width = widthvalue;
			
		}
	
	
	@Override
	public void area() {
		
		double area = length*width;
		System.out.println("area of Rectangle  " + area);
		
		
	}

	@Override
	public void perimeter() {
		
		double perimeter = 2*(length+width);
		System.out.println("perimeter of Rectangle " + perimeter);
		
		
		
	}

	

	}


