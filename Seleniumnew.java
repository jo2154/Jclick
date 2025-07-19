package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Seleniumnew {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		WebElement ele=driver.findElement(By.xpath("//select[@id='country']"));
		
		 Select sel=new Select(ele);
		 sel.selectByVisibleText("Canada");
	     sel.selectByValue("germany");
	     sel.selectByIndex(1);
				
				List <WebElement>  values=driver.findElements(By.xpath("//select[@id='country']//option"));
				
				for(WebElement value:values)
				{
					String dropvalue=value.getText();
					String act=value.getDomAttribute("value");
					String exp ="germany";
					if(act.equals(exp))
					{
						sel.selectByValue(act);
					}	
					System.out.println(dropvalue);
				}
				
				
				
			}

		}
		
		
		
		
		
		
		
		
		


