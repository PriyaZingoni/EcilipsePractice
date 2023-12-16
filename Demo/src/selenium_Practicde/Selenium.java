package selenium_Practicde;

import java.awt.Dimension;
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

public class Selenium {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.driver.chrome", "C:\\Users\\EffiaSoft\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Dimension d= new Dimension (300, 500);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		
	String URl=	driver.getCurrentUrl();
	System.out.println("Current URL is " +URl);
	
	if (URl.equals("https://www.amazon.in"))
	{
		
		System.out.println("Both Url are ame");
	}
	else
	{
		
		System.out.println("Both are different");
		
	
	}
	
	
	String title=driver.getTitle();
	System.out.println("title is " + title);
	
	
	
	WebElement logo=driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
    boolean L=	logo.isDisplayed();
	System.out.println(L);
	Thread.sleep(3000);

	
	WebElement Text=driver.findElement(By.xpath("(//a[@tabindex='0'])[2]"));
	
	String S= Text.getText();
	
	System.out.println(S);
	
	
	Thread.sleep(3000);

	// how to take SS in Selenium
	
	File Source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File Destiation = new File ("C:\\Selenium Material\\Amazon.jpg");
	FileHandler.copy(Source, Destiation);

	Thread.sleep(3000);
	
	
	//How to handel drop down in selenium
	
	
	//  WebElement All=driver.findElement(By.xpath("//select[@title='Search in']"));
//	  All.click();
	//   Select X = new Select(All);
	 //  X.selectByVisibleText("Amazon Fashion");
	       
	   
	   
	

	   
	
	// how to handel Mouse Actions in selenium
		
		
	WebElement Prime= driver.findElement(By.xpath("//span[text()='Prime']"));
	Actions act= new Actions (driver);
	act.moveToElement(Prime).build().perform();
	
	driver.close();
	
	
	}}

