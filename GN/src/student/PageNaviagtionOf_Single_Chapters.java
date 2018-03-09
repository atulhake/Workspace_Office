package student;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.browserfactory;

import com.geneo.pages.Login_page;
import com.geneo.pages.loginToTextPage;

public class PageNaviagtionOf_Single_Chapters {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver wd= browserfactory.StartBrowser("chrome", "http://35.187.242.22/Geneo_Live/student_login.aspx");
		Login_page login =new Login_page(wd);
		login.LoginToGeneo("etegatul@gmail.com", "Geneo@1234");
	     loginToTextPage textpage = new loginToTextPage(wd);
	     textpage.select_std_sub(8, "Mathamatics");

	     Thread.sleep(3000);
	     for(int t=0;t<18;t++)
	     {
	    	 wd.findElement(By.xpath(".//*[@id='ulPageNumber']/li[13]/a")).click();    //page navigation next button 
	    	 Thread.sleep(2000);
	    	 
	     }
	      System.out.println("=============================Page navigation completed=============================");
	     
		    	
		      // wd.findElement(By.xpath(".//*[@id='ulPageNumber']/li[13]/a")).click();    //page navigation back button
		        
		        
		       // WebElement Last_word=wd.findElement(By.xpath(".//*[@id='ulPageNumber']/li[14]/a[contains(text(),'Last')]"));
		        //String s=Last_word.getText();
		        //System.out.println(s);
		        
		        
		      //  wd.findElement(By.xpath(".//img[@alt='Previous']")).click();
		       // Thread.sleep(2000);
		      //  wd.findElement(By.xpath(".//img[@alt='Previous']")).click();
		        
		        
	
		
		        //-----  .//*[@class='col-lg-11 col-sm-11 left_space_index']/span[text()="1"]
		
		
		}
		

	}


