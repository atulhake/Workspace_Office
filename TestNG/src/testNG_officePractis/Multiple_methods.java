package testNG_officePractis;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Multiple_methods
{
	//====================Login_LogOut module=============================//
	@Test(priority=2)
  public void Login_LogOut() throws InterruptedException     
  {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.id("login_input_Uname")).sendKeys("etegatul@gmail.com");
		wd.findElement(By.id("login_input_Pwd")).sendKeys("Geneo@123");
		wd.findElement(By.xpath("/html/body/div[2]/div/div/form/input")).click();
		System.out.println("successful Logged in");
		Thread.sleep(3000);
		wd.findElement(By.id("update_flag_login")).click();  // Kill all session
		Thread.sleep(3000);
		wd.findElement(By.className("lock_nav")).click();
		System.out.println("successful Logged Out");
		
  }
	
	//====================All chapter Index Module=============================//
	@Test(priority=1)
	  public void All_chapter() throws InterruptedException
	  {
		
	  }
}
