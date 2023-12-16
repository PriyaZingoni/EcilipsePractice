package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Implementation_TestNG {
	WebDriver driver;
	
	@BeforeTest
	void Setup()
	    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\EffiaSoft\\Documents\\Selenium Material\\chromedriver-win64\\chromedriver.exe");
	    driver = new ChromeDriver();	
		}
	
	
	@BeforeClass
	void LounchURL()
	    {
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		}
	
	@Test(priority = 2, dependsOnMethods="URLtest")
	void LogoTest()
	  {
        WebElement Logo= driver.findElement(By.xpath("//i[@class='fa fa-logo ws-hover-text-green'])"));
		if(Logo.isDisplayed())
		{
			System.out.println("Logo is Present on Home Page Hence test case pass");	
		}
		else
		{
			System.out.println("Logo is Not Present on Home Page Hence test case Failed");
	   	}	
	    }
	
	
	@Test(priority=1)
	void URLtest()
	{
		String URL= driver.getCurrentUrl();
		if (URL.equalsIgnoreCase("https://www.w3schools.com/"))
		{
			System.out.println("URL Matched with current URL  Hence test case Pass");
		}
		else
		{
			System.out.println("URL not Matched with current URL  Hence test case Failed");
		}
	}

//	@AfterClass
//	void Close()
//	{
//		driver.quit();
//	}
}
