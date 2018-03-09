package student;

import static org.testng.Assert.assertEquals;

import java.awt.List;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.geneo.pages.Login_page;
import com.geneo.pages.loginToTextPage;
import com.google.common.base.Verify;

import Helper.browserfactory;

public class verify_geneo_login {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver wd= browserfactory.StartBrowser("chrome", "http://35.187.242.22/Geneo_Live/student_login.aspx");
		Login_page login =new Login_page(wd);
		login.LoginToGeneo("etegatul@gmail.com", "Geneo@1234");
	     loginToTextPage textpage = new loginToTextPage(wd);
	     textpage.select_std_sub(8, "SCIENCE");
	     
		
		
	
//		  //================For chapter names reading================//
//	    java.util.List<WebElement> chapter_names=wd.findElements(By.className("chapt_index_left_space"));    // trying to to show list of chapter names on index page
//		int no = chapter_names.size();
//		System.out.println("\n\ntotal no. of chapters ="+no);
//		
//		for (int i = 0; i<no; i++)
//		{
//			System.out.println(chapter_names.get(i).getText());
//			try {
//					WebElement dd =chapter_names.get(i+1);
//					Actions p = new Actions(wd);
//					p.moveToElement(dd).build().perform();
//				} catch (Exception e) {}
//        }
//		//===========================scroll down script=====================//
//				WebElement element = wd.findElement(By.xpath("//*[@id='index_table_rows']/div[16]/div[1]/span[1]"));
//				JavascriptExecutor scroll = (JavascriptExecutor) wd;
//				scroll.executeScript("arguments[0].scrollIntoView(true);",element);
//				Thread.sleep(3000);
//	    //================For chapter names reading from 6 to last ================//
//			    java.util.List<WebElement> chapter=wd.findElements(By.className("chapt_index_left_space"));    // trying to to show list of chapter names on index page
//				int number = chapter.size();
//		        for (int i = 6; i<number; i++)
//				{
//		        	System.out.println(chapter_names.get(i).getText());
//				}	
//		        Thread.sleep(5000);
//		     wd.findElement(By.xpath(".//*[@class='col-lg-11 col-sm-11 left_space_index']/span[text()='9']")).click();   // chapter selection 
		        
		      //  wd.findElement(By.xpath(".//img[@alt='Previous']")).click();
		       // Thread.sleep(2000);
		      //  wd.findElement(By.xpath(".//img[@alt='Previous']")).click();
		        
		        
	
		
		        //-----  .//*[@class='col-lg-11 col-sm-11 left_space_index']/span[text()="1"]
		
		
		}
		

	}


