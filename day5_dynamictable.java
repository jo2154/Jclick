package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day5_dynamictable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		//find total row
		int trow=driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
		
		//find total column
		int tcol=driver.findElements(By.xpath("//table[@id='countries']//tr[2]//td")).size();
		
		boolean status = false;
		
		for(int r=1; r<=trow; r++)
		{
			String langs=driver.findElement(By.xpath("//table[@id='countries']//tr["+r+"]//td[5]")).getText();
			String exp ="English";
			
			String [] arr=langs.split(";");
			
			for(String act:arr)
			{
				if (act.trim().equals(exp))
				{
					driver.findElement(By.xpath("//table[@id='countries']//tr["+r+"]//td[1]//input")).click();
					status = true;
				}
			}
			
		}
		if(! status )
		{
			System.out.println("No data is found...........");
		}
		

	}

}
