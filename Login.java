package Testjohn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.Basepage;

		public class Login extends Basepage
		{
            
			   public Login(WebDriver driver) 
			  {
				
				   super (WebDriver driver);
		       
			  }

			@FindBy (xpath ="//input[@data-qa='login-email']")
			WebElement login_email;
			
			@FindBy (name="password")
			WebElement password;
			
			@FindBy (xpath="//button [text()='Login']")
		     WebElement login;
			
			@FindBy (xpath="//input[@data-qa='signup-email']")
			WebElement signup_email;
			
			
			public void set_email_log(String email_Id)
			{
				login_email.sendKeys(email_Id);
			}
			
			public void set_pass_log(String pass)
			{
				password.sendKeys(pass);
			}
			
			public void Enter_login ()
			{
				login.click();
			}
			
	}

	
