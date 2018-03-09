package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserfactory 
{
    static WebDriver wd;
	public static WebDriver StartBrowser(String browsername, String url)
	
	{
		
		if(browsername.equalsIgnoreCase("Firefox"))
		{
			
			wd=new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			wd=new ChromeDriver();
			//wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}else if(browsername.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
			wd=new InternetExplorerDriver();
		}
		
		wd.manage().window().maximize();
		wd.get(url);
		return wd;
			
	}
	
}
