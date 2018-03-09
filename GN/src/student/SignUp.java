package student;

import java.awt.List;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		//============================All blank scenario======================//
		
//		wd.findElement(By.id("user_fname")).click();
//		wd.findElement(By.id("user_lname")).click();
//		wd.findElement(By.id("user_standard")).click();
//		wd.findElement(By.id("user_email")).click();
//		wd.findElement(By.id("user_mobile_number")).click();
//		wd.findElement(By.id("user_relation")).click();
//		wd.findElement(By.id("user_password")).click();
//		wd.findElement(By.id("user_confirm_password")).click();
//		System.out.println("All field completed till verified password");
//		wd.findElement(By.id("termofuse")).click();
//		System.out.println("Terms of use button clicked");
//		Thread.sleep(1000);
//		wd.findElement(By.xpath(".//*[@id='myModal_termsandcondition']/div/div/div/div/button[contains(text(),'Decline')]")).click();  //Decline
//		System.out.println("Decline button click verified");
//		Thread.sleep(1000);
//		wd.findElement(By.id("termofuse")).click();
//		System.out.println("Terms of use button clicked");
//		Thread.sleep(1000);
//		wd.findElement(By.xpath(".//*[@id='myModal_termsandcondition']/div/div/div/div/button[contains(text(),'Agree')]")).click();    // agree button
//		Thread.sleep(1000);
//		wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
//	   String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
//	   System.out.println("Error message is = "+alert_msg);
//		
//		//=================================positive testing=================================//
//		
//	   wd.findElement(By.id("user_fname")).sendKeys("sss");   
//	   wd.findElement(By.id("user_lname")).sendKeys("hhh");
//		wd.findElement(By.id("user_standard")).click();
//		
//		
//		wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
//		wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
//		wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
//		wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
//		wd.findElement(By.id("user_relation")).click();
//		wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
//		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
//		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
//		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
//		wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
//		wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
//		wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
//		wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
//	   
//		Thread.sleep(7000);
//         boolean  tt = wd.findElement(By.xpath("//*[@id='otp_text']")).isDisplayed();
//         System.out.println(tt);
//         if(tt)
//         {
//         System.out.println("OTP window Appeared ..test passed");
//         }
//         else
//         {
//         System.out.println("OTP window does not appeared ..test Failed");
//         }
         


//====================================name field blank test================================//
     
		
//		wd.findElement(By.id("user_standard")).click();
//		wd.findElement(By.xpath("//option[@value='Standard IX']")).click();    
//		wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
//		wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
//		wd.findElement(By.id("user_relation")).click();
//		wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
//		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
//		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
//		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
//		wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
//		wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
//		wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
//		wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
//		String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
//		System.out.println("Error message is = "+alert_msg);
//	    System.out.println("Expected error message is = 'Please Enter Your Name.'");
		
   
		//============================================Without selection of standards==============================//
		
		
//	     	wd.findElement(By.id("user_fname")).sendKeys("sss");   
//		    wd.findElement(By.id("user_lname")).sendKeys("hhh");
//			wd.findElement(By.id("user_standard")).click();   
//			wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
//			wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
//			wd.findElement(By.id("user_relation")).click();
//			wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
//			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
//			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
//			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
//			wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
//			wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
//			wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
//			wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
//			String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
//			System.out.println("Error message is = "+alert_msg);
//		    System.out.println("Expected error  message is = 'Please Select Your Standard.'");
		
		//==================================Without email address=============================//
		
//		 wd.findElement(By.id("user_fname")).sendKeys("sss");   
//		   wd.findElement(By.id("user_lname")).sendKeys("hhh");
//			wd.findElement(By.id("user_standard")).click();
//			
//			
//			wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
//			wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
//			wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
//			wd.findElement(By.id("user_relation")).click();
//			wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
//			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
//			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
//			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
//			wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
//			wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
//			wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
//			wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
//			String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
//			System.out.println("Error message is = "+alert_msg);
//		    System.out.println("Expected error  message is = 'Please Enter Your Email.'");
//		    
		    //====================================Without mobile number field=============================//
		    
//			   wd.findElement(By.id("user_fname")).sendKeys("sss");   
//			   wd.findElement(By.id("user_lname")).sendKeys("hhh");
//				wd.findElement(By.id("user_standard")).click();
//				
//				
//				wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
//				wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
//				wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
//			
//				wd.findElement(By.id("user_relation")).click();
//				wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
//				//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
//				//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
//				//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
//				wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
//				wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
//				wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
//				wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
//				String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
//				System.out.println("Error message is = "+alert_msg);
//			    System.out.println("Expected error  message is = 'Please Enter Mobile Number.'");
//			    
//===============================================Without selection of reletion=======================================//
			    
//				   wd.findElement(By.id("user_fname")).sendKeys("sss");   
//				   wd.findElement(By.id("user_lname")).sendKeys("hhh");
//					wd.findElement(By.id("user_standard")).click();
//				
//					
//					wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
//					wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
//					wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
//					wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
//					wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
//					wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
//					wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
//					wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
//				String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
//				System.out.println("Error message is = "+alert_msg);
//			    System.out.println("Expected error  message is = 'Please enter specific relation.");
//			    
			//===================================Without Password field ==================================//
			    
//		        wd.findElement(By.id("user_fname")).sendKeys("sss");   
//		        wd.findElement(By.id("user_lname")).sendKeys("hhh");
//		     	wd.findElement(By.id("user_standard")).click();
//				wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
//				wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
//				wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
//				wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
//				wd.findElement(By.id("user_relation")).click();
//				wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
//				//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
//				//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
//				//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
//		     	wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
//				wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
//				wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
//				String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
//				System.out.println("Error message is = "+alert_msg);
//			    System.out.println("Expected error  message is = 'Please Enter Password.");
//			    
	//============================================Without confirm password field====================================//
			    
//				   wd.findElement(By.id("user_fname")).sendKeys("sss");   
//				   wd.findElement(By.id("user_lname")).sendKeys("hhh");
//					wd.findElement(By.id("user_standard")).click();
//					
//					
//					wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
//					//wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
//					wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
//					wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
//					wd.findElement(By.id("user_relation")).click();
//					wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
//					//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
//					//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
//					//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
//					wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
//					
//					wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
//					wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click(); 
//					String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
//					System.out.println("Error message is = "+alert_msg);
//				    System.out.println("Expected error  message is = 'Please Enter Confirm Password.");
				    
	//============================================Without without selection of i agree====================================//
				    wd.findElement(By.id("user_fname")).sendKeys("sss");   
					   wd.findElement(By.id("user_lname")).sendKeys("hhh");
						wd.findElement(By.id("user_standard")).click();
						
						
						wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
						//wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
						wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
						wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
						wd.findElement(By.id("user_relation")).click();
						wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
						//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
						//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
						//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
						wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
						wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
						
						wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click(); 
						String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
						System.out.println("Error message is = "+alert_msg);
					    System.out.println("Expected error  message is = 'Please agree terms of use.");
		
		}
		

	}


