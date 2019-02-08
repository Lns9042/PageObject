package Obj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class linkedinHomePage{

WebDriver driver;
	
	public linkedinHomePage(WebDriver driver)
	{
		this.driver =driver;
	}
	
	By lastname= By.xpath(".//*[@id='layout-main']/div/div[3]/form/input[2]");
	By search =By.xpath(".//*[@id='layout-main']/div/div[3]/form/input[4]");

	public WebElement lastname()
	{
		return driver.findElement(lastname);
	}
	
	public WebElement search()
	{
		return driver.findElement(search);
	
	}
}
