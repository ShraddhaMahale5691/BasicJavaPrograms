package Testngdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.apache.xml.security.encryption.DocumentSerializer;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	     
		ArrayList<Object> arr = new ArrayList<Object>();
		    
		arr.add("ddd");
		arr.add(2);
		arr.add(11122.33);    
        System.out.println(arr);
        
        HashMap<Integer,String> data=new HashMap<Integer,String>();
        data.put(1, "Sai");
        data.put(2, "Shravani");
        data.put(3, "Gauri");
        
     //   System.out.println(data);
        Iterator<HashMap.Entry<Integer,String>> it=data.entrySet().iterator();
        while(it.hasNext())
        {
        	HashMap.Entry<Integer,String> test = it.next();
        	System.out.println("Key :"+test.getKey());
        	System.out.println("Value : "+test.getValue());
        }
		Testngprog2();
	}
	public static void Testngprog2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D://Shraddha Wahini//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Flipkart.com");
		driver.manage().window().maximize();
		WebElement userNameTxt=driver.findElement(By.xpath(".//DIV[@CLASS='IiD88i _351hSN']//input[@class='_2IX_2- VJZDxU']"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].value='Amol1'", userNameTxt);
       	Thread.sleep(5000);
        driver.close();
	}
}
