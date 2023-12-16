package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicsOfKeyword {

	@Test(groups= "Smoke" , timeOut=3000)
	void Login() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("Login Into facebook");
	
	}
	
	
	@Test(priority = 2, groups= "regression", dependsOnMethods="Login") //-------- Group Run karnya sati right click >> run as>> run configuration>> select group option>> select wahtergroup u want
	void MyAcoount()
	{
		System.out.println("Manage My FB Account");
	}
	
	@Test(priority = 1,  groups="Sanity")
	void LogOut()
	{
		System.out.println("LogOut facebook Account");
	}
	
	
	@Test(priority = 3,  groups="Sanity")
	void DemoOfGroupKeyword()
	{
		System.out.println("Sanity Testing test case");
	}
	
}
