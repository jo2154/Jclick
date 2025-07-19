package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dayseven {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//find total no of row
		int trow=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		//find total no of column
		int tcol=driver.findElements(By.xpath("//table[@name='BookTable']//tr[2]//td")).size();
		
		//print all the values from the table
	for(int r =2; r<=trow; r++)
		{
			for(int c=1; c <=tcol; c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"  ");
			}
			System.out.println();
		
		
		boolean status = false;
		//Find specific conditions
		
		
		String expauthor = "Amit";
		for(int p=2; p<=trow; r++)
		{
	          String actauthor=	driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
	          if(actauthor.equals(expauthor))
	          {
	        	  String auth=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
	        	  System.out.println(auth);
	        	  status = true;
	          }
			
		}	
		if(! status )
		{
			System.out.println("No data is matched............");
		}
			
		
		driver.close();

	  }

   }

}







