package Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelsetting {

	public static void main(String[] args) throws IOException {
	
				FileInputStream file = new FileInputStream (System.getProperty("user.dir")+("\\Excel\\Book1.xlsx"));
			    XSSFWorkbook workbook =new XSSFWorkbook  (file);
			    XSSFSheet sheet =   workbook.getSheet("Sheet1");
			   int trow=sheet.getLastRowNum();  //always start with zero  //3
			   System.out.println("Total no of row  : "+trow);
			   int tcol=sheet.getRow(0).getLastCellNum();  //always start with 1   //3
			   System.out.println("Total no of column  : "+tcol);
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
