package Testngdemo;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterdemo {
	
public String Filepath=System.getProperty("user.dir")+"Testngdemo/FlipKartExcel.xlsx";
@Test 
@Parameters("browser")
public void broser(String browser)
{
	System.out.println("fffffffffffffffffffffffffffffffffffff"+browser);
}

@Test(dataProvider="ExcelData")
public void userdetails(String name,String pwd)
{
	System.out.println("User Id is : "+name);
	System.out.println("pwd is : "+pwd);
}

@Test
public Object[][] Data() throws FileNotFoundException
{
	
    

	
	return null;
	
}
}
