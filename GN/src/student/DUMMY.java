package student;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.RemoteWebDriver;
public class DUMMY {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.quikr.com/post-classifieds-ads/?postadcategoryid=1402");
		wd.manage().window().maximize();


//		Thread.sleep(4000);
//        WebElement yy= wd.findElement(By.xpath("//input[@list='brands']"));
//        yy.sendKeys("BMW");
////        Keyboard keyboard = ((RemoteWebDriver) wd).getKeyboard();
////        keyboard.sendKeys(Keys.ARROW_DOWN);
////        keyboard.sendKeys(Keys.ENTER);
		
		JavascriptExecutor jse = (JavascriptExecutor)wd;
		jse.executeScript("window.scrollBy(0,500)", "");
        Thread.sleep(4000);
        List <WebElement> ss=wd.findElements(By.xpath("//*[@id='cityName']/option"));
        
        for(int i=0;i<ss.size();i++)
        {
        WebElement tt=ss.get(i);
        String dd= tt.getAttribute("value");
        WebElement yy= wd.findElement(By.xpath("//input[@list='cityName']"));
        yy.sendKeys(dd);
        System.out.println(dd);
        System.out.println("------------------");
       
        yy.clear();
        Thread.sleep(500);
        List <WebElement> ff=wd.findElements(By.xpath("//*[@id='locality']/option"));
        
	        for(int j=0;j<ff.size();j++)
	        {
	        	WebElement gg=ff.get(j);
	        	String aa= gg.getAttribute("value");
	        	System.out.println(aa);
	        }
	        System.out.println(i+" city completed");
	        System.out.println("======================");
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
				        
		}
		

	}


