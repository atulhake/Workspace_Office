package signupcode;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class signUp_TestNG
{
	@Test
	public void ALl_blank() throws InterruptedException, Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.aspx");
		//wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
//=================================================//
		Thread.sleep(2000);
		By firstName=By.id("user_fname");
		By LastName=By.id("user_lname");
		By Standard=By.id("user_standard");
		By EmailID=By.id("user_email");
		By MobileNO=By.id("user_mobile_number");
		By Userreletion=By.id("user_relation");
		By Password=By.id("user_password");
		By ConfirmPassword	=By.id("user_confirm_password");
		By termOfUse=By.id("termofuse");
		By Decline=By.xpath(".//*[@id='myModal_termsandcondition']/div/div/div/div/button[contains(text(),'Decline')]");
		By accept=By.xpath(".//*[@id='myModal_termsandcondition']/div/div/div/div/button[contains(text(),'Agree')]");
		By SignUP=By.xpath("//form/button[contains(text(),'SIGN UP')]");
		By AlertMsg	=By.xpath("//*[@class='input_alert_msg error']");
		By selectSTD= By.id("user_standard");
		By EightSDT= By.xpath("//*[@id='user_standard']/option[contains(text(),'Standard VIII')]");
		By NineSDT=By.xpath("//*[@id='user_standard']/option[contains(text(),'Standard IX')]");
		By TenthsSDT=By.xpath("//*[@id='user_standard']/option[contains(text(),'Standard X')]");
		By UserReletion= By.id("user_relation");  
		By Stud=By.xpath("//*[@id='user_relation']/option[contains(text(),'Student')]");
		By parent=By.xpath("//*[@id='user_relation']/option[contains(text(),'Parent')]");
		By teacher=By.xpath("//*[@id='user_relation']/option[contains(text(),'Teacher')]");
		By others=By.xpath("//*[@id='user_relation']/option[contains(text(),'Others')]");
		By OthersText=By.cssSelector("#user_otherRelation");
		By OTPWindow=By.xpath("//*[@id='myModal_OTP']/div/div/div[2]/div[1]/p[2]");
		By CheckBox=By.xpath("/html/body/div[2]/div/div/form/p/label");
		By msg1=By.xpath("/html/body/div[2]/div/div/form/div[1]/label[contains(text(),'Please Enter Your Name.')]");
		By msg2=By.xpath("/html/body/div[2]/div/div/form/div[1]/label[contains(text(),'Please Enter Last Name')]");
		By msg3=By.xpath("/html/body/div[2]/div/div/form/label[contains(text(),'Please Enter valid Email Id')]");
		By msg4=By.xpath("/html/body/div[2]/div/div/form/label[contains(text(),'Please Select Your Standard')]");
		By msg5=By.xpath("/html/body/div[2]/div/div/form/label[contains(text(),'Please Enter valid Phone Number')]");
		By msg6=By.xpath("/html/body/div[2]/div/div/form/div[1]/label[contains(text(),'Please enter specific relation.')]");
		By msg7=By.xpath("/html/body/div[2]/div/div/form/div[1]/label[contains(text(),'Please Enter Password.')]");
		By msg8=By.xpath("/html/body/div[2]/div/div/form/div[1]/label[contains(text(),'Please Enter Confirm Password.')]");
		By msg9=By.xpath("/html/body/div[2]/div/div/form/div[1]/label[contains(text(),'Please agree terms of use.')]");
		WebElement usertype =wd.findElement(UserReletion);
	
	
		
		
		
			//===============================================================================
		 File src=new File("C:\\Users\\iets\\workspace\\TestNG\\src\\supportingFiles\\SignUpPageValidations.xlsx");
    	 
  	   FileInputStream fis=new FileInputStream(src);
  	  XSSFWorkbook wb=new XSSFWorkbook(fis);
  	    XSSFSheet sh1= wb.getSheetAt(0);
  	    int rowcount= sh1.getLastRowNum();
  	    int count= rowcount;
  	    System.out.println("total row no is ="+count);
  	   
  	String firstName_; 
  	String LastName_;
  	String Standard_;
  	String EmailID_;
  	String MobileNO_;
  	String Userreletion_;
  	String Password_;
  	String ConfirmPassword_;
  	String Decline_;
  	String AlertMsg_;
  	String Iagree_;
  	 XSSFCell cell_1;
  	XSSFCell cell_2;
  	XSSFCell cell_3;
  	XSSFCell cell_4;
  	XSSFCell cell_5;
  	XSSFCell cell_6;
  	XSSFCell cell_7;
  	XSSFCell cell_8;
	XSSFCell cell_9;
  	  XSSFRow row;
  	  XSSFCell cell;
  	  DataFormatter df = new DataFormatter();
  			for(int i=1;i<=26;i++)
				{
  				if(i==17 ||i==21)
  				{
  					continue;
  				}
  				System.out.println(i);
					wd.get("https://geneo.in/geneo_live/student_signup.aspx");
					try {
						
						row = sh1.getRow(i);
						cell_1 = row.getCell(1);
						cell_2 = row.getCell(2);
						cell_3 = row.getCell(3);
						cell_4 = row.getCell(4);
						cell_5 = row.getCell(5);
						cell_6 = row.getCell(6);
						cell_7 = row.getCell(7);
						cell_8 = row.getCell(8);
						cell_9 = row.getCell(9);
						firstName_ = df.formatCellValue(cell_1);
						LastName_ = df.formatCellValue(cell_2);
						
						Standard_ = df.formatCellValue(cell_3);
						EmailID_ = df.formatCellValue(cell_4);
						MobileNO_ = df.formatCellValue(cell_5);
						Userreletion_=df.formatCellValue(cell_6);
						Password_ = df.formatCellValue(cell_7);
						ConfirmPassword_ = df.formatCellValue(cell_8);
					     Iagree_=df.formatCellValue(cell_9);
					    wd.findElement(firstName).sendKeys(firstName_);
						wd.findElement(LastName).sendKeys(LastName_);
						wd.findElement(selectSTD).click();
						Thread.sleep(250);
						switch (Standard_){
						case "VIII" : 
							wd.findElement(EightSDT).click();
						break;
						case "IX":
							wd.findElement(NineSDT).click();
						break;
						case "X" :
							wd.findElement(TenthsSDT).click();
						break;
						}
						Thread.sleep(250);
						wd.findElement(EmailID).sendKeys(EmailID_);
						wd.findElement(MobileNO).sendKeys(MobileNO_);
						//wd.findElement(UserReletion).click();
						
						Thread.sleep(250);
						
						
						switch (Userreletion_)
						{
						
						case "Student" : 
							wd.findElement(Stud).click();
						break;
						case "Parent":
							wd.findElement(parent).click();
						break;
						case "Teacher" :
							wd.findElement(teacher).click();
						break;
						case "Other" :
							wd.findElement(others).click();
							Thread.sleep(2000);
							
							wd.findElement(OthersText).sendKeys("brother");
						break;
						}
						Thread.sleep(250);
						wd.findElement(Password).sendKeys(Password_);
						wd.findElement(ConfirmPassword).sendKeys(ConfirmPassword_);
						
						if(i==9)
							{
							wd.findElement(CheckBox).click();
							
							}
						Thread.sleep(500);
						wd.findElement(CheckBox).click();
						
						
						wd.findElement(SignUP).click();
						Thread.sleep(6000);
						String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
						
						
						switch (i)
						{
						case 1:
							Assert.assertEquals(alert_msg, "Please Enter Your Name.", "Failed");
							System.out.println(i+"Pass");
							break;
						case 2:
							boolean ss1=wd.findElement(OTPWindow).isDisplayed();
							
							if(ss1)
							{
								System.out.println(i+"Pass");
							}else
							{
								System.out.println(i+"failed");
							}
							break;
						case 3:
							boolean ss2=wd.findElement(OTPWindow).isDisplayed();
							if(ss2)
							{
								System.out.println(i+"Pass");
							}else
							{
								System.out.println(i+"failed");
							}
							break;
							
						case 4:
							boolean ss3=wd.findElement(OTPWindow).isDisplayed();
							if(ss3)
							{
								System.out.println(i+"Pass");
							}else
							{
								System.out.println(i+"failed");
							}
							break;
					
						case 5:
							boolean ss4=wd.findElement(OTPWindow).isDisplayed();
							if(ss4)
							{
								System.out.println(i+"Pass");
							}else
							{
								System.out.println(i+"failed");
							}
							break;
						
						case 6:
							boolean ss5=wd.findElement(OTPWindow).isDisplayed();
							if(ss5)
							{
								System.out.println(i+"Pass");
							}else
							{
								System.out.println(i+"failed");
							}
							break;
							
						case 7:
							boolean ss6=wd.findElement(OTPWindow).isDisplayed();
							if(ss6)
							{
								System.out.println(i+"Pass");
							}else
							{
								System.out.println(i+"failed");
							}
							break;
						
						case 8:
							boolean ss7=wd.findElement(OTPWindow).isDisplayed();
							if(ss7)
							{
								System.out.println(i+"Pass");
							}else
							{
								System.out.println(i+"failed");
							}
							break;
							
						
						case 9:
							Assert.assertEquals(alert_msg, "Please agree terms of use.", "Failed");
							System.out.println(i+"Pass");
							break;
						case 10:
							Assert.assertEquals(alert_msg, "Please Enter Your Name.", "Failed");
							System.out.println(i+"Pass");
							break;
						case 11:
							Assert.assertEquals(alert_msg, "Please Enter Your Name.", "Failed");
							System.out.println(i+"Pass");
							break;
							
						case 12:
							Assert.assertEquals(alert_msg, "Please Enter Your Email.", "Failed");
							System.out.println(i+"Pass");
							break;
						case 13:
							Assert.assertEquals(alert_msg, "Email is not valid.", "Failed");
							System.out.println(i+"Pass");
							break;
						case 14:
							Assert.assertEquals(alert_msg, "Email is not valid.", "Failed");
							System.out.println(i+"Pass");
							break;
						case 15:
							Assert.assertEquals(alert_msg, "Email is not valid.", "Failed");
							System.out.println(i+"Pass");
							break;
						case 16:
							Assert.assertEquals(alert_msg, "Mobile number is not valid", "Failed");
							System.out.println(i+"Pass");
							break;
						case 17:
							Assert.assertEquals(alert_msg, "Mobile number is not valid", "Failed");
							System.out.println(i+"Pass");
							break;
						case 18:
							Assert.assertEquals(alert_msg, "Please Enter Password.", "Failed");
							System.out.println(i+"Pass");
							break;
						case 19:
							Assert.assertEquals(alert_msg, "The password must contain at least one special character.", "Failed");
							System.out.println(i+"Pass");
							break;
						case 20:
							Assert.assertEquals(alert_msg, "The password must contain at least one uppercase character.", "Failed");
							System.out.println(i+"Pass");
							break;
						case 21:
							Assert.assertEquals(alert_msg, "The password must contain at least one lowercase character.", "Failed");
							System.out.println(i+"Pass");
							
							break;
						case 22:
							Assert.assertEquals(alert_msg, "The password must contain combination of character and numeral.", "Failed");
							System.out.println(i+"Pass");
							break;
						case 23:
							Assert.assertEquals(alert_msg, "The password length should between 6-15.", "Failed");
							System.out.println(i+"Pass");
							break;
						case 24:
							Assert.assertEquals(alert_msg, "The password length should between 6-15.", "Failed");
							System.out.println(i+"Pass");
							break;
						case 25:
							Assert.assertEquals(alert_msg, "Please Enter Confirm Password.", "Failed");
							System.out.println(i+"Pass");
							break;
						case 26:
							Assert.assertEquals(alert_msg, "Please Enter Your Name.", "Failed");
							System.out.println(i+"Pass");
							break;
						}
						
					} catch (Exception e) {}
				    
					}
	  wd.close();
		
		

	}
	//@Test
	public void positive_testing() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		   wd.findElement(By.id("user_fname")).sendKeys("sss");   
		   wd.findElement(By.id("user_lname")).sendKeys("hhh");
			wd.findElement(By.id("user_standard")).click();
			
			
			wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
			wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
			wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
			wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
			wd.findElement(By.id("user_relation")).click();
			wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
			wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
			wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
			wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
			wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
		   
			Thread.sleep(7000);
	         boolean  tt = wd.findElement(By.xpath("//*[@id='otp_text']")).isDisplayed();
	         System.out.println(tt);
	         if(tt)
	         {
	         System.out.println("OTP window Appeared ..test passed");
	         }
	         else
	         {
	         System.out.println("OTP window does not appeared ..test Failed");
	         }
	         wd.quit();
	}
	
	//@Test
	public void name_field_blank_test()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		wd.findElement(By.id("user_standard")).click();
		wd.findElement(By.xpath("//option[@value='Standard IX']")).click();    
		wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
		wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
		wd.findElement(By.id("user_relation")).click();
		wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
		wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
		wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
		wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
		wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
		String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
		System.out.println("Error message is = "+alert_msg);
	    System.out.println("Expected error message is = 'Please Enter Your Name.'");
		
	    wd.quit();
	}
	
	//@Test
	public void Without_selection_of_standards()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
     	wd.findElement(By.id("user_fname")).sendKeys("sss");   
	    wd.findElement(By.id("user_lname")).sendKeys("hhh");
		wd.findElement(By.id("user_standard")).click();   
		wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
		wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
		wd.findElement(By.id("user_relation")).click();
		wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
		wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
		wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
		wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
		wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
		String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
		System.out.println("Error message is = "+alert_msg);
	    System.out.println("Expected error  message is = 'Please Select Your Standard.'");
	    wd.quit();
	}
	
	//@Test
	public void Without_email_address()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		
		wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
		wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
		wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
		wd.findElement(By.id("user_relation")).click();
		wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
		wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
		wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
		wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
		wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
		String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
		System.out.println("Error message is = "+alert_msg);
	    System.out.println("Expected error  message is = 'Please Enter Your Email.'");
	    wd.quit();
	}
	//@Test
	public void Without_mobile_number_field()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		   wd.findElement(By.id("user_fname")).sendKeys("sss");   
		   wd.findElement(By.id("user_lname")).sendKeys("hhh");
			wd.findElement(By.id("user_standard")).click();
			
			
			wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
			wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
			wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
		
			wd.findElement(By.id("user_relation")).click();
			wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
			wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
			wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
			wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
			wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
			String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
			System.out.println("Error message is = "+alert_msg);
		    System.out.println("Expected error  message is = 'Please Enter Mobile Number.'");
		    wd.quit();
		
	}	
	//@Test
	public void Without_selection_of_reletion()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		   wd.findElement(By.id("user_fname")).sendKeys("sss");   
		   wd.findElement(By.id("user_lname")).sendKeys("hhh");
			wd.findElement(By.id("user_standard")).click();
		
			
			wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
			wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
			wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
			wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
			wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
			wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
			wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
			wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
		String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
		System.out.println("Error message is = "+alert_msg);
	    System.out.println("Expected error  message is = 'Please enter specific relation.");
	    wd.quit();
	}	
	//@Test
	public void Without_Password_field()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
        wd.findElement(By.id("user_fname")).sendKeys("sss");   
        wd.findElement(By.id("user_lname")).sendKeys("hhh");
     	wd.findElement(By.id("user_standard")).click();
		wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
		wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
		wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
		wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
		wd.findElement(By.id("user_relation")).click();
		wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
		//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
     	wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
		wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
		wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
		String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
		System.out.println("Error message is = "+alert_msg);
	    System.out.println("Expected error  message is = 'Please Enter Password.");
	    wd.quit();
	}
	//@Test
	public void Without_confirm_password_field()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
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
			
			wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
			wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click(); 
			String alert_msg = wd.findElement(By.xpath("//*[@class='input_alert_msg error']")).getText();
			System.out.println("Error message is = "+alert_msg);
		    System.out.println("Expected error  message is = 'Please Enter Confirm Password.");
		    wd.quit();
	}	
		
	//@Test
	public void without_selection_of_i_agree()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
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
		    wd.quit();

	}
	
	//@Test
	public void OTP_testing() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.html");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.xpath("//a/img[@alt='Sign Up']")).click();   //toggle Sign Up button
		
		   wd.findElement(By.id("user_fname")).sendKeys("sss");   
		   wd.findElement(By.id("user_lname")).sendKeys("hhh");
			wd.findElement(By.id("user_standard")).click();
			
			
			wd.findElement(By.xpath("//option[@value='Standard IX']")).click();     
			wd.findElement(By.xpath("//option[@value='Standard X']")).click();   
			wd.findElement(By.id("user_email")).sendKeys("jjj@gmail.com");
			wd.findElement(By.id("user_mobile_number")).sendKeys("9865327898");
			wd.findElement(By.id("user_relation")).click();
			wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Student']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Parent']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Teacher']")).click();
			//wd.findElement(By.xpath("//*[@id='user_relation']/option[@value='Others']")).click();
			wd.findElement(By.id("user_password")).sendKeys("Geneo@123");
			wd.findElement(By.id("user_confirm_password")).sendKeys("Geneo@123");
			wd.findElement(By.xpath("//form[@class='form-signin']/p/label[contains(text(),'I agree to the')]")).click();
			wd.findElement(By.xpath("//form/button[contains(text(),'SIGN UP')]")).click();
		   
			Thread.sleep(7000);
	         boolean  tt = wd.findElement(By.xpath("//*[@id='otp_text']")).isDisplayed();
	         System.out.println(tt);
	         if(tt)
	         {
	         System.out.println("OTP window Appeared ..OTP testing started");
	         wd.findElement(By.xpath("//button[@id='btn_Validate_OTP']")).click();  //OTP window  Done button
	         System.out.println("Done button clicked ");
	         
	         Thread.sleep(2000);
	         String sd = wd.findElement(By.xpath("//div[@class='modal-body model_alertbody']/p[contains(text(),'Please enter OTP')]")).getText(); //pop up  error message 
	         System.out.println("Error message for blank OTP = "+sd);
	         Thread.sleep(2000);
	         wd.findElement(By.xpath("//div[@class='modal-footer']/center/button")).click();  //  OK button of error message pop up
	         System.out.println("OK button clicked ");
	         Thread.sleep(250);
	         wd.findElement(By.xpath("//button[@id='btn_resend_otp']")).click();
	         System.out.println("Resend OTP button clicked");
	         Thread.sleep(1000);  // find exact time for reading text
	         String we= wd.findElement(By.xpath("//p[@id='successMsgOTP']")).getText();
	         System.out.println("Resent OTP Message displayed = "+we);
	         
	         }
	         else
	         {
	         System.out.println("OTP window does not appeared ..test Failed");
	         }
	         wd.quit();
		
	}	
}
