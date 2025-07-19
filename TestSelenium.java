package com.selenium.test;

public class TestSelenium {

	     public static void main(String arg[]) {
		
	   WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.akinfopark.com/");
		driver.manage().window().maximize();
		
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
		

		String currentUrl=driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		
		

	}

}
