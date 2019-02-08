package Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class linkedinLoginPage{

	WebDriver driver;
	
	public linkedinLoginPage(WebDriver driver)
	{
		this.driver =driver;
	}
	By username = By.xpath(".//*[@id='login-email']");		
	By password = By.xpath(".//*[@id='login-password']");				
	By login = By.id("login-submit");
	
	
//write method for getting email id
	public WebElement emailid()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(login);
	}
	
	
	
	
	
	
}