package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicsOfAnotataion {
	
	void Dbconnect()
	{
		System.out.println("");
	}
	
	@BeforeTest
	void Envsetup()
	{
		System.out.println("Env is setup succesfully");
	}
	
	
	@BeforeClass
	void BrowserSetup()
	{
		System.out.println("Setup is done");
	}

	@BeforeMethod
	void BrowserLounch()
	{
	System.out.println("Browser Lounch Syccessfully");
	}
	
	@Test
	void TestA()
	{
		System.out.println("This is My fisrt test");
	}
	
	@Test
	void TestB()
	{
		System.out.println("This is My Test B");
	}
	
	@AfterMethod
	void BrowserCLose()
	{
		System.out.println("Browser Close Succesfully");
	}
	
	@AfterClass
	void SetupCloss()
	{
		System.out.println("Setup is close");
	}
	
	
	@AfterTest
	void envclose()
	{
		System.out.println("env closed");
	}
}
