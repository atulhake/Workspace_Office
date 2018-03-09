package testngg;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dependency 
{
	
	WebDriver web;
	@BeforeClass
   	public void startbrowser()
   	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	web = new ChromeDriver();
   		System.out.println("=========browser started===========");

   	}
	 @Test(invocationCount = 5)
		public void login()
		{
		
	       
	       
	       web.get("https://geneo.in/geneo_live/student_login.html");
	       web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           String current_url = web.getCurrentUrl();
           System.out.println(current_url);
           Assert.assertTrue(current_url.contains("student_login"));
           System.out.println("Login successful");
           
           
		}
	
	@AfterClass
	void closeApp()
	   	{
		
		web.quit();
		System.out.println("===========browser closed==============");

	   	}	
}
