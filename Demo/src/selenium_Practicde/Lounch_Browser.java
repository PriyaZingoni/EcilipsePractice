package selenium_Practicde;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Lounch_Browser {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EffiaSoft\\Documents\\Selenium Material\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		driver.get("http://localhost:4200/crm");
		
		String URl=driver.getCurrentUrl();
		 if(URl.equals("http://localhost:4200/crm"))
		 {
			 System.out.println("U r in Localhost Website");
			 }
		 else {
			 
			 System.out.println("U r in Not Localhost Website");
		 }
		 
		 
		
		Thread.sleep(3000);
		
	WebElement Logo= driver.findElement(By.xpath("//i[@class='company_logo']"));
	boolean a= Logo.isDisplayed();
	System.out.println("Logo is Present");

		
		WebElement Customer= driver.findElement(By.xpath("//button[text()='Customer']"));	
		Customer.click();
	  Thread.sleep(3000);
	 WebElement Surname= driver.findElement(By.xpath("//input[@name='surname']"));
	Surname.sendKeys("Gunji");
	
	Thread.sleep(3000);
	
	WebElement Search_Button=driver.findElement(By.xpath("//i[@class='icon icon-search']"));	
	Search_Button.click();
	
	Thread.sleep(3000);
	
	WebElement New_Booking=driver.findElement(By.xpath("//button[text()='New Booking']"));
	
	Actions act=new Actions(driver);
	act.moveToElement(New_Booking);
	
	New_Booking.click();
	
	Thread.sleep(3000);
	
	WebElement Currency=driver.findElement(By.xpath("//input[@placeholder=' Please Select Currency']"));
    Currency.sendKeys("United States of America Dollars");
    WebElement Date= driver.findElement(By.xpath("//input[@container='body']"));
	Date.click();

     //Select c=new Select(Currency);
	//c.selectByVisibleText("United States of America Dollars");
	Thread.sleep(3000);

	
	File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Destination=new File("C:\\Users\\EffiaSoft\\Pictures\\screenshot.jpg");
	FileHandler.copy(Source, Destination);
	
	driver.close();
	}

}
