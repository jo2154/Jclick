package Testcase;



import org.testng.annotations.Test;

import WebPages.loginPage;
import base.Basetest;

public class TC_001   extends Basetest{

	
	@Test  (groups= {"sanity"})
	public void login () {
		
		try 
		{
			loginPage lp = new loginPage (driver);
			lp.set_email_log("jhon098@gmail.com");
			lp.set_pass_log("jhon098@gmail.com  ");
			lp.Enter_login();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
		}
		
	}
	

}
