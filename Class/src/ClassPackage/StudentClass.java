package ClassPackage;

public class StudentClass {

	

	private String name;
	private int rollNumber;
	private int age;
	private int StudentClass;
	
	
	
	public void setName(String nameofstudent,int rollnumber,int studentage,int classofstudent)
	{
		name=nameofstudent;
		rollNumber=rollnumber;
		age=studentage;
		StudentClass=classofstudent;
		
	}
	
	
	public String getname()
	{
		return name;
	}
	
	public int  getrollNumber()
	{
		return rollNumber;
	}
	
	public int  getage()
	{
		return age;
	}
	
	public int  getStudentClass()
	{
		return StudentClass;
	}
	
	
	
	
	public void result(int [] marks)
	{
		int failcount=0;
		int passcount=0;
		
		for(int i=0;i<5;i++)
		{
			if (marks[i]<35)
			{
				//System.out.println("fail");
				failcount++;
			}
			else
			{
				//System.out.println("Pass");
				passcount++;
			}
		}
		
		System.out.println("no. of subject fail --  " + failcount);
		System.out.println("no. of subject pass " + passcount);

	
	}
	
	public void percentage(int [] marks)
	{
		int totoalmarks=0;
		for(int i=0;i<5;i++)
		{
			totoalmarks=totoalmarks+marks[i];
		}
      System.out.println("percentage is " + (totoalmarks*1.0/marks.length));
	
	}
	
	
	
	
	
	
	
	
	
	
}
