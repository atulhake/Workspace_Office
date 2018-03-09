package student;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.browserfactory;

import com.geneo.pages.Login_page;
import com.geneo.pages.loginToTextPage;

public class PageNaviagtionOf_All_Chapters {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver wd= browserfactory.StartBrowser("chrome", "http://35.187.242.22/Geneo_Live/student_login.aspx");
		Login_page login =new Login_page(wd);
		login.LoginToGeneo("etegatul@gmail.com", "Geneo@1234");
	     loginToTextPage textpage = new loginToTextPage(wd);
	     textpage.select_std_sub(8, "Mathamatics");
	     
	     wd.findElement(By.xpath("//*[@id='drpchapters']")).click();  //text page chapter index
	     
	     Thread.sleep(3000);
	     for(int t=0;t<18;t++)
	     {
	    	 wd.findElement(By.xpath(".//*[@id='ulPageNumber']/li[13]/a")).click();    //page navigation next button 
	    	 Thread.sleep(2000);
	    	 
	     }
	      System.out.println("=============================Page navigation completed=============================");
	     
	     
		    // ========================
		    		  wd.findElement(By.xpath("//*[@id='drpchapters']")).click();  //text page chapter index
			    //wd.findElement(By.xpath(".//*[@id='drpchapters'][contains(text(),'Science')]")).click();
			   java.util.List<WebElement> chapter_list =wd.findElements(By.xpath(".//*[@class='LoadChpater']"));
			    int no = chapter_list.size();
			    System.out.println("total numbers of chapters = "+no);
			    System.out.println("");
		        System.out.println("");
			    for (WebElement myValue1 : chapter_list)                      // for loop for chapters click event from text page chapters index
			    {
			       
			        Thread.sleep(3000);
			        myValue1.click();
			        Thread.sleep(2000);
			        
//			        wd.findElement(By.xpath(".//a[contains(text(),'First')]")).click();  //first button of text page
//			       System.out.println("First button get clicked succesfully");
			     
						  
						   System.out.println("good boy page navigation  testing  of this chapter is completed");
						   System.out.println("");
						    System.out.println("");
					         Thread.sleep(500);
					         wd.findElement(By.xpath("//*[@id='drpchapters']")).click();
					 
			        
			    }
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


