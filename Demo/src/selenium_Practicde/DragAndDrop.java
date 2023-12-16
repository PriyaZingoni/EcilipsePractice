package selenium_Practicde;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Material\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/droppable/");
		
		WebElement Source=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Destintion=driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		
		act.dragAndDrop(Source, Destintion).build().perform();
		
		
	}

}
