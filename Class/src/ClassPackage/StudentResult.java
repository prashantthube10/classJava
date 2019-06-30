package ClassPackage;

public class StudentResult {

	public static void main(String[] args) {

		
		
		StudentClass obj1=new StudentClass();
		
		obj1.setName("prashant", 10, 25, 10);
		
		
		obj1.getname();
		obj1.getrollNumber();
		obj1.getage();
		obj1.getStudentClass();
		
		System.out.println("name of student  --" + obj1.getname());
		System.out.println("roll numer of student -- " + obj1.getrollNumber() );
		System.out.println(" age of student -- " + obj1.getage());
		System.out.println(" class of sutdent -- " + obj1.getStudentClass());
		
		int marks[]= {34,75,35,20,80};
		obj1.result(marks);
		
		obj1.percentage(marks);
		
		
			
		
		
		
		
		
		
	}

}
