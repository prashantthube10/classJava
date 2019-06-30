package XLXX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelClass {

	public static void main(String[] args) throws FileNotFoundException {

		
		FileInputStream fileinputstream = new FileInputStream("datafolder/classxl.xlsx");
		
		Workbook workbook = new XSSFWorkbook("logindata");
		
		
		
		
	}

}
