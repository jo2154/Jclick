package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class day7execelreading {

	public static void main(String[] args) throws IOException {
	
		//setting file
		FileInputStream file = new FileInputStream (System.getProperty("user.dir")+("\\Excel\\Book1.xlsx"));
		
		//Workbook setting
		XSSFWorkbook workbook =new XSSFWorkbook  (file);
		
		//sheet setting
		XSSFSheet sheet =   workbook.getSheet("Sheet1");
		
		//find total row and column
		int trow=sheet.getLastRowNum();  //always start with zero  //3
		System.out.println("Total no of row  : "+trow);
		
		int tcol=sheet.getRow(0).getLastCellNum();  //always start with 1   //3
		System.out.println("Total no of column  : "+tcol);
		
		//find all the values from the value
		
		for (int r =0; r<=trow; r++) 
		{
			XSSFRow row = sheet.getRow(r);
			for (int c=0; c<tcol; c++)
			{
				XSSFCell cell=row.getCell(c);
				System.out.print(cell+"  ");
			}
			System.out.println();
		}
		
		
		
		

	}

}
