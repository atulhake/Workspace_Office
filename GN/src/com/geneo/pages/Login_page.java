package com.geneo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page 
{
   WebDriver wd;
   By username = By.id("login_input_Uname");
   By Password = By.id("login_input_Pwd");
   By loginbutton = By.xpath("/html/body/div[2]/div/div/form/input");
   By KillAllSession = By.id("update_flag_login");
   By coverpage_title = By.xpath("/html/head/title[contains(text(),'Geneo Student Cover Page')]");
   By LandingPage_title = By.xpath("/html/head/title[contains(text(),'Student Landing page')]");
   
 public Login_page(WebDriver wd)
    {
	    this.wd = wd;
    }
      
       public void LoginToGeneo(String UId,String pass) throws InterruptedException
       {
    	   wd.findElement(username).sendKeys(UId);
    	   wd.findElement(Password).sendKeys(pass);
    	   wd.findElement(loginbutton).click();
    	   Thread.sleep(2000);   //Student Landing page
    	   if(wd.findElement(KillAllSession).isDisplayed());
    	   {
    		   wd.findElement(KillAllSession).click();  
    		   System.out.println("killed all other sessions");
    	   }
    	   if(wd.getTitle().equals("Student Landing page")||wd.getTitle().equals("Geneo Student Cover Page"))
	  	   {
	  		   System.out.println("successful Logged in");
	  	   }
    	   Thread.sleep(5000);
    	   
    	  
       }
}
