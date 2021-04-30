package AutomationFramework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgclass {
	@BeforeSuite
	public void BeforeSuiteMethod()
	{
	System.out.println("This is before suite method********************B");	
	}
	
	@BeforeTest
	public void BeforeTestMethod()
	{
	System.out.println("This is before test method********************B");	
	}
	
	@BeforeClass
	public void BeforeClassMethod()
	{
	System.out.println("This is before class method********************B");	
	}
	@BeforeMethod
	public void BeforemethodMethod()
	{
	System.out.println("This is before methods method********************B");	
	}

	@Test(priority=1)
	public void Test3()
	{
		
		//System.out.println("Browser is ------>"+browser);
		System.out.println("This is Test3********************B");
		
	}
	
	@Test(priority=2)
	public void Test4()
	{
		System.out.println("This is Test4********************B");
		
	}
	
	
	@AfterSuite
	public void AfterSuiteMethod()
	{
	System.out.println("This is after suite method********************B");	
	}
	
	@AfterTest
	public void AfterTestMethod()
	{
	System.out.println("This is after test method********************B");	
	}
	
	@AfterClass
	public void AfterClassMethod()
	{
	System.out.println("This is after class method********************B");	
	}
	@AfterMethod
	public void AftermethodMethod()
	{
	System.out.println("This is after methods method********************B");	
	}
}
