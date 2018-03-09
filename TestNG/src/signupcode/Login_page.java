package signupcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Login_page      //======login==show password==forgot password========///                               
{
    @Test
	public void positive_testing()
	{     
    	
    	
    	System.out.println("positive_testing stated");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.id("login_input_Uname")).sendKeys("etegatul@gmail.com");
		wd.findElement(By.id("login_input_Pwd")).sendKeys("Geneo@123");
		wd.findElement(By.xpath("/html/body/div[2]/div/div/form/input")).click();
		System.out.println("successful Logged in");
		wd.quit();
		System.out.println("positive_testing completed");
	}
	
    
    @Test
   	public void with_only_username() throws InterruptedException
   	{
    	System.out.println("with_only_username testing stated");
   		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
   		WebDriver wd = new ChromeDriver();
   		wd.get("https://geneo.in/geneo_live/student_login.html");
   		wd.manage().window().maximize();
   		System.out.println("window Maximized");
   		wd.findElement(By.id("login_input_Uname")).sendKeys("etegatul@gmail.com");
   		wd.findElement(By.xpath("/html/body/div[2]/div/div/form/input")).click();      // login button click event
   		Thread.sleep(5000);
	   	 
	   	WebDriverWait wait= new WebDriverWait(wd, 7);
	   //	Boolean jj = wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='myModal_alertmessage']/div/div/div[3]/center/button"),"Ok"));
		Boolean uu = wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='alert-msg']"),"Please enter valid Username and Password."));
			  if(uu)
			  {
				  
				  wd.findElement(By.xpath(".//*[@id='myModal_alertmessage']/div/div/div[3]/center/button")).click();
				  System.out.println("Login with only username test passed");
			  }
			  else
			  { 
				  System.out.println("Login with only username test Failed");
			  }
			  System.out.println("with_only_username testing completed");
			  wd.quit();
   	}
   	
    
    @Test
   	public void with_only_Password() throws InterruptedException
   	{
    	System.out.println("with_only_Password testing stated");
   		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
   		WebDriver wd = new ChromeDriver();
   		wd.get("https://geneo.in/geneo_live/student_login.html");
   		wd.manage().window().maximize();
   		System.out.println("window Maximized");
   	
   		wd.findElement(By.id("login_input_Pwd")).sendKeys("Geneo@123");
   		wd.findElement(By.xpath("/html/body/div[2]/div/div/form/input")).click();      // login button click event
   		Thread.sleep(5000);
	   	 
	   	WebDriverWait wait= new WebDriverWait(wd, 7);
	   //	Boolean jj = wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='myModal_alertmessage']/div/div/div[3]/center/button"),"Ok"));
		Boolean uu = wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='alert-msg']"),"Please enter valid Username and Password."));
			  if(uu)
			  {
				  
				  wd.findElement(By.xpath(".//*[@id='myModal_alertmessage']/div/div/div[3]/center/button")).click();
				  System.out.println("Login with only Password test passed");
			  }
			  else
			  { 
				  System.out.println("Login with only Password test Failed");
			  }
			  System.out.println("with_only_Password testing completed");
			  wd.quit();
   	}
   	
  @Test
   	public void with_blank_UserName_And_password() throws InterruptedException
   	{
	  System.out.println("with_blank_UserName_And_password testing stated");
   		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
   		WebDriver wd = new ChromeDriver();
   		wd.get("https://geneo.in/geneo_live/student_login.html");
   		wd.manage().window().maximize();
   		System.out.println("window Maximized");
   	
   		
   		wd.findElement(By.xpath("/html/body/div[2]/div/div/form/input")).click();      // login button click event
   		Thread.sleep(5000);
	   	 
	   	WebDriverWait wait= new WebDriverWait(wd, 7);
	   //	Boolean jj = wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='myModal_alertmessage']/div/div/div[3]/center/button"),"Ok"));
		Boolean uu = wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='alert-msg']"),"Please enter Username and Password."));
			  if(uu)
			  {
				  
				  wd.findElement(By.xpath(".//*[@id='myModal_alertmessage']/div/div/div[3]/center/button")).click();
				  System.out.println("Login with Blank UserName & Password test passed");
			  }
			  else
			  { 
				  System.out.println("Login with Blank UserName & Password test Failed");
			  }
			  System.out.println("with_blank_UserName_And_password testing completed");
			  
			  wd.quit();
   	}
  
  @Test
 	public void Forgot_password_positive() throws InterruptedException
 	{
	  System.out.println("Forgot_password_positive testing stated");
 		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
 		WebDriver wd = new ChromeDriver();
 		wd.get("https://geneo.in/geneo_live/student_login.html");
 		wd.manage().window().maximize();
 		System.out.println("window Maximized");
 	
 		
 		wd.findElement(By.xpath("//a[1]")).click();      // Forgot password link
	   	 
 		WebDriverWait wait1= new WebDriverWait(wd, 10);
 		
 		WebElement uu = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btn_SendFogotPassword']")));
 		
 		System.out.println("Forgot password window appeared ");
 		wd.findElement(By.id("txt_UserName")).sendKeys("Etegatul@gmail.com");
 		System.out.println("Email address is entered");
 		uu.click();
 		System.out.println("Forgot password window send button is clicked ");
 		WebDriverWait wait2= new WebDriverWait(wd, 7);
 		
 		WebElement ss = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='myModal_alertmessage']/div/div/div[3]/center/button")));
 		System.out.println("Password resent pop up displayed");
 		wd.findElement(By.xpath(".//*[@id='myModal_alertmessage']/div/div/div[3]/center/button")).click();
 		System.out.println("Password resent pop up Ok button clicked");
 		System.out.println("Check whether password delivered to respective email id & phone number or not ?");
 		System.out.println("Forgot_password_positive testing Completed");
 		wd.quit();
   }
	
  @Test
	public void Forgot_password_with_incorrect_emailID() throws InterruptedException
	{
	  System.out.println("Forgot_password_with_incorrect_emailID testing stated");  
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
	
		
		wd.findElement(By.xpath("//a[1]")).click();      // Forgot password link
        WebDriverWait wait1= new WebDriverWait(wd, 15);
 		
 		WebElement uu = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btn_SendFogotPassword']")));  // just wait until window appear
 		
 		System.out.println("Forgot password window appeared ");
 		wd.findElement(By.id("txt_UserName")).sendKeys("Etegatulhvhgmail.com");
 		System.out.println("Incorrect Email address is entered");
 		uu.click(); 
		System.out.println("send button is clicked");
		
		 WebDriverWait wait= new WebDriverWait(wd, 10);
		 Boolean jj = wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='alertmsg']"),"This Email Address does not seem to be registered. Have you typed the email address correctly?"));
         if(jj)
         {
        	 System.out.println("Incorrect details pop up appeared");
        	 wd.findElement(By.xpath(".//*[@id='myModal_alertmessage']/div/div/div[3]/center/button")).click();  
        	 System.out.println("Incorrect details pop up Ok button clicked");
         }
         System.out.println("Forgot_password_with_incorrect_emailID testing completed");  
         // find out why else part is not working........
        wd.quit();
		 
		
    }
  
  @Test              // find out why else part is not working........
 	public void Forgot_password_with_Blank_emailID() throws InterruptedException
 	{
	  System.out.println("Forgot_password_with_Blank_emailID testing stated");  
 		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
 		WebDriver wd = new ChromeDriver();
 		wd.get("https://geneo.in/geneo_live/student_login.html");
 		wd.manage().window().maximize();
 		System.out.println("window Maximized");
 	
 		
 		wd.findElement(By.xpath("//a[1]")).click();      // Forgot password link
         WebDriverWait wait1= new WebDriverWait(wd, 15);
  		
  		WebElement uu = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='btn_SendFogotPassword']")));  // just wait until window appear
  		
  		System.out.println("Forgot password window appeared ");
  		
  		System.out.println(" Email address is kept blank ");
  		uu.click(); 
        System.out.println("Send button of forgot password is clicked");
     
 		
 		 WebDriverWait wait= new WebDriverWait(wd, 15);
 		 Boolean jj = wait.until(ExpectedConditions.textToBe(By.cssSelector("#alert-msg"),"Please enter your Email ID or Phone Number."));  // wonder !!!   xpath did not work here i have used cssSelector good troyubleshoot
 		 // find out why else part is not working........
 		 if(jj)
          {
         	 System.out.println("Incorrect details pop up appeared");
         	 wd.findElement(By.xpath(".//*[@id='myModal_alertmessage']/div/div/div[3]/center/button")).click();  
         	 System.out.println("Incorrect details pop up Ok button clicked");
         	 
          }
 		System.out.println("Forgot_password_with_Blank_emailID testing completed"); 
         wd.quit();
 		 
     }
  
     //@Test              // could not implement
     public void show_password() throws InterruptedException
     {
    	 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
  		WebDriver wd = new ChromeDriver();
  		wd.get("https://geneo.in/geneo_live/student_login.html");
  		wd.manage().window().maximize();
  		System.out.println("window Maximized");
  		wd.findElement(By.id("login_input_Pwd")).sendKeys("Geneo@123");
  	
  		Thread.sleep(5000);
  		String ss=wd.findElement(By.id("login_input_Pwd")).getText();
  		System.out.println("your entered encrypted Password is = "+ss);
  		Thread.sleep(5000);
  		wd.findElement(By.xpath("//div[@class='forgot_password']/span")).click();
  		Thread.sleep(5000);
  		String tt=wd.findElement(By.id("login_input_Pwd")).getText();
  		System.out.println("your entered encrypted Password is = "+tt);
  		
  		
     }
    
  
  
  
}
