package testNG;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonShopping {
	WebDriver driver;
	
	
	@BeforeTest
	void BrowserLunch() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EffiaSoft\\Documents\\Selenium Material\\chromedriver-win64\\chromedriver.exe");
	 driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.in/");
		
	}
	
	@Test
	void FindElement() throws InterruptedException
	{
		WebElement AmazonSearch= driver.findElement(By.xpath("//input [@placeholder='Search Amazon.in']"));
		AmazonSearch.click();
		AmazonSearch.sendKeys("iphone 15 pro max");
		
		WebElement SearchIcon =driver.findElement(By.xpath("//input[@type='submit']"));
		SearchIcon.click();
		
		WebElement Iphone =driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
		Iphone.click();
		String Title= driver.getTitle();
		System.out.println("Title is " + Title);
		 String URl=driver.getCurrentUrl();
		 System.out.println("Current Url is " +URl);
		 
		ArrayList<String> AdrofAllWin=new ArrayList (driver.getWindowHandles());
		System.out.println(AdrofAllWin);
		driver.switchTo().window(AdrofAllWin.get(1));
		
		 
		
     	Thread.sleep(3000);
		WebElement BuyNow= driver.findElement(By.xpath("//input[@title='Buy Now']"));
     	BuyNow.click();
	
     	WebElement Email=driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
     	Email.sendKeys("priyaZingoni1234567@gmail.com");
     	
     	WebElement ContinueBtn = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
     	ContinueBtn.click();
		
     	Thread.sleep(3000);
	}
	
	
	
	
	@AfterTest
	void CloseBrowser()
	{
	System.out.println("I want to Close the Browser");
     driver.quit();
}

}
