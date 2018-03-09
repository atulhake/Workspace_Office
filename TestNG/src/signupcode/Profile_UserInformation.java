package signupcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Profile_UserInformation
{
     @Test
	public void Without_name() throws InterruptedException
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
				Thread.sleep(1000);
				wd.findElement(By.id("update_flag_login")).click();  // Kill all session
				Thread.sleep(5000);
				wd.findElement(By.xpath(".//img[@class='landing_user']")).click();   // menu option
				Thread.sleep(3000);
				wd.findElement(By.xpath(".//a[contains(text(),'Geneo')]")).click(); //GENEO OPTION OF MENU BAR 
				Thread.sleep(6000);  // DONT CHANGE THIS TIME 12SEC.
				wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/button")).click(); 
				wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/ul/li[2]/a")).click(); //10th Standard
		        System.out.println("");
			    System.out.println("");
				System.out.println("10th standard");
				wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/span/img")).click();  //subject dropdown
			    wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/ul/li[1]/a/b")).click(); //Maths 
				System.out.println("Mathamatics");
				  wd.findElement(By.xpath(".//img[@class='landing_user']")).click();   // menu option
			        Thread.sleep(8000);
			        wd.findElement(By.xpath(".//a[contains(text(),'My Profile')]")).click(); //my profile option 
			        Thread.sleep(2000);
			        wd.findElement(By.id("Edit_profile")).click();    //edit profile  //not working with xpath 
			        wd.findElement(By.xpath("//input[@id='user_name']")).clear();
			        wd.findElement(By.xpath("//input[@id='user_name']")).sendKeys("RTM Test");
			        wd.findElement(By.xpath(".//*[@id='user_Birthday']")).clear();
			        wd.findElement(By.xpath(".//*[@id='user_Birthday']")).sendKeys("06/09/2017");
			        wd.findElement(By.xpath(".//*[@id='mCSB_7_container']/div[11]/div[1]")).click();   //random click to  dissappear of calender.
			        Thread.sleep(2000);
			        Select kk = new Select(wd.findElement(By.cssSelector("#user_Gender")));   //   for drop down used select class
			        kk.selectByVisibleText("Male");
			       //kk.selectByVisibleText("Female");
			        wd.findElement(By.xpath(".//*[@id='user_Address']")).clear();
			        wd.findElement(By.xpath(".//*[@id='user_Address']")).sendKeys("white house");
			        wd.findElement(By.xpath(".//*[@id='user_Address1']")).clear();
			        wd.findElement(By.xpath(".//*[@id='user_Address1']")).sendKeys("white house , london");
			        wd.findElement(By.xpath(".//*[@id='user_city']")).clear();
			        wd.findElement(By.xpath(".//*[@id='user_city']")).sendKeys("Washington, D.C");
			        wd.findElement(By.xpath(".//*[@id='user_state']")).clear();
			        wd.findElement(By.xpath(".//*[@id='user_state']")).sendKeys("Florida");
			        wd.findElement(By.xpath(".//*[@id='user_zcode']")).clear();
			        wd.findElement(By.xpath(".//*[@id='user_zcode']")).sendKeys("456587");
			        wd.findElement(By.xpath(".//*[@id='user_country']")).clear();
			        wd.findElement(By.xpath(".//*[@id='user_country']")).sendKeys("India");
			        WebElement element = wd.findElement(By.xpath(".//*[@id='user_Phone']"));    //scroll down for phone number field
					JavascriptExecutor scroll = (JavascriptExecutor) wd;
					scroll.executeScript("arguments[0].scrollIntoView(true);",element);
					Thread.sleep(3000);
			        
			        wd.findElement(By.xpath(".//*[@id='user_Phone']")).clear();
			        wd.findElement(By.xpath(".//*[@id='user_Phone']")).sendKeys("9887655432");
			        
			        wd.findElement(By.id("update_profile")).click();   //     update button
			   	 WebDriverWait wait= new WebDriverWait(wd, 10);
				 Boolean jj = wait.until(ExpectedConditions.textToBe(By.cssSelector("#alert-msg"),"Personal information updated successfully."));
		         if(jj)
		         {
		        	 System.out.println("Update information pop up appeared");
		        	 wd.findElement(By.xpath(".//*[@id='myModal_alertmessage']/div/div/div[3]/center/button")).click();  
		        	 System.out.println("Update information pop up Ok button clicked");
		         }
			        
			       
		//	        wd.findElement(By.id("update_profile")).click();   //     update button
		//	        WebDriverWait wait= new WebDriverWait(wd, 7);
		//	        Boolean uu = wait.until(ExpectedConditions.textToBe(By.xpath(".//*[@id='alert-msg']"),"Name,Phone are Mandatory."));
		//	        Thread.sleep(3000);
		//	       if(uu)
		//			  {
		//	    	   wd.findElement(By.xpath("//*[@id='myModal_alertmessage']/div/div/div[3]/center/button")).click();  //OK button // manual created firefox xpath didn't work
		//				
		//				  System.out.println("Ok button of error pop is clicked");
		//			  }
		//		        wd.findElement(By.xpath(".//button[contains(text(),'Cancel')]")).click();     //cancel button neighbor of edit button
		//	   		     System.out.println("Cancel button clicked");
			        
					}
		
    
 	        
 			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
