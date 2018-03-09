package Com.GeneoStudent.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Com.GeneoStudent.Pages.HomePage;
import Com.GeneoStudent.Base.TestBase;

public class LoginPage 
  {
   WebDriver wd;
   By username = By.id("login_input_Uname");
   By Password = By.id("login_input_Pwd");
   By loginbutton = By.xpath("/html/body/div[2]/div/div/form/input");
   By KillAllSession = By.id("update_flag_login");
   By coverpage_title = By.xpath("/html/head/title[contains(text(),'Geneo Student Cover Page')]");
   By LandingPage_title = By.xpath("/html/head/title[contains(text(),'Student Landing page')]");
   
 public LoginPage(WebDriver wd)
    {
	    this.wd = wd;
    }
     public String validateLoginPageTitle()
     {
		return wd.getTitle();
	 }
     public  HomePage LoginToGeneo(String UId,String pass) throws InterruptedException
     {
    wd.findElement(username).sendKeys(UId);
   	   wd.findElement(Password).sendKeys(pass);
   	   wd.findElement(loginbutton).click();
   	  try {
		  if(wd.findElement(KillAllSession).isDisplayed())
		  	    {
			   wd.findElement(KillAllSession).click();  
			   System.out.println("killed all other sessions");
		  		}
   	  		} catch (Exception e){}
      	return new HomePage(wd);
     }
     
     
  }
     
     
     
     
