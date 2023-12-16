package selenium_Practicde;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\EffiaSoft\\Documents\\Selenium Material\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> AllTH= driver.findElements(By.xpath("//table[@id=\"customers\"]//th"));
		for(WebElement Th:AllTH)
		{
			String ThText=Th.getText();
			System.out.println(ThText);
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		System.out.println();
		System.out.println("--------------------------------------------------------------------");
	List<WebElement> AllTd=	driver.findElements(By.xpath("//table[@id=\"customers\"]//td"));
	int Size=AllTd.size();
	System.out.println(Size);
			
	for(WebElement Td: AllTd)
	{
		String TdText= Td.getText(); 
		System.out.println(TdText + "  ");
		
		System.out.println("--------------------------------------------------------------------" + "   ");

		
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	 WebElement Country = driver.findElement(By.xpath("//table[@id=\"customers\"]//tr[3]//td[1]"));
	 String CountryText=Country.getText();
	 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	 System.out.println(CountryText);
driver.quit();
}
}