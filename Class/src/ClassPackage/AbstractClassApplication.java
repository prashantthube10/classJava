package ClassPackage;

public  class AbstractClassApplication extends AbstractClassExample {

	@Override
	public void abstractMethod() {
		
		
		System.out.println("this is an abstract method implemenation ");
		
	}
	
public void abc() {
		
		
		System.out.println("this is an abc menthos only in child ");
		
	}

	public static void main(String[] args) {
		
		AbstractClassExample obj1 = new AbstractClassApplication();
		obj1.abstractMethod();
		obj1.nonabstractMethod();
	
	}

	
	}

	
	


