package homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Constructor {
	
	
	
	
	public static void test(Object o)
	{
		System.out.println("object");
	}

	public static void test(String str)
	{
		System.out.println("String");
	}

	public static void test(Integer i)
	{
		System.out.println("Integer");
	}



	public static void main(String[] args) throws IOException {
		
		String str="prashant";
		

		String s="Test Java";
				boolean b;
		b=s.startsWith("Test");
		System.out.println(b);
		
		String data = "Programming";
		
		FileWriter writer = new FileWriter(new File("datafolder/abc.txt"));
		writer.write("Java".concat(data));
		

	}

	}
