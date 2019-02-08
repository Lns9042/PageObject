package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Obj.linkedinHomePage;
import Obj.linkedinLoginPage;

public class LoginApplication {

	
	
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANISHA\\eclipse-workspace\\chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		
		driver.get("https://www.linkedin.com");
		driver.manage().window().maximize();
		
		//System.out.println(driver.getTitle());
		/*
		linkedinLoginPage rd=new linkedinLoginPage(driver);
		rd.emailid().sendKeys("lns9042@gmail.com");
		rd.password().sendKeys("poonam007");
		rd.submit().click();
		*/
		linkedinHomePage rh=new linkedinHomePage(driver);
		
		rh.lastname().sendKeys("Morankar");
		rh.search().click();
		
		
		
	}
	
	
}
