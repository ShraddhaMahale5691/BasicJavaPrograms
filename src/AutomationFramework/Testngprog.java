package AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngprog {
	/*@Test
	public void Testngprog1()
	{
		System.setProperty("webdriver.chrome.driver", "D://Shraddha Wahini//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

	}*/
	
	@BeforeSuite
	public void BeforeSuiteMethod()
	{
	System.out.println("This is before suite method******A");	
	}
	
	@BeforeTest
	public void BeforeTestMethod()
	{
	System.out.println("This is before test method******A");	
	}
	
	@BeforeClass
	public void BeforeClassMethod()
	{
	System.out.println("This is before class method******A");	
	}
	@BeforeMethod
	public void BeforemethodMethod()
	{
	System.out.println("This is before methods method******A");	
	}
	
	@Test(priority=1)
	public void Test1()
	{
		System.out.println("This is TestOne******A");
		
	}
	
	@Test(priority=3)
	public void Test2()
	{
		System.out.println("This is Testtwo******A");
		
	}
	
	
	@AfterSuite
	public void AfterSuiteMethod()
	{
	System.out.println("This is after suite method******A");	
	}
	
	@AfterTest
	public void AfterTestMethod()
	{
	System.out.println("This is after test method******A");	
	}
	
	@AfterClass
	public void AfterClassMethod()
	{
	System.out.println("This is after class method******A");	
	}
	@AfterMethod
	public void AftermethodMethod()
	{
	System.out.println("This is after methods method******A");	
	}
}
