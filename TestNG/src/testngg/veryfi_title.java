package testngg;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;

public class veryfi_title


{
    @Test
	public void verifyTitle()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		String st=wd.getTitle();
		
		String actual_title="Geneo Student Login"; 
		Assert.assertEquals(actual_title, st);
		
		System.out.println("Title matched");
		
	}
	
	
}
