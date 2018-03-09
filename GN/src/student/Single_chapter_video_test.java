package student;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Helper.browserfactory;

import com.geneo.pages.Login_page;
import com.geneo.pages.loginToTextPage;
import com.thoughtworks.selenium.webdriven.commands.GetElementIndex;
import com.thoughtworks.selenium.webdriven.commands.GetText;

public class Single_chapter_video_test {

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver wd= browserfactory.StartBrowser("chrome", "https://geneo.in/geneo_live/student_login.aspx");
		Login_page login =new Login_page(wd);
		login.LoginToGeneo("etegatul@gmail.com", "Geneo@123");
	     loginToTextPage textpage = new loginToTextPage(wd);
	     textpage.select_std_sub(8, "SCIENCE");
	     
		        Thread.sleep(4000);
		    // =========Single chapter all page video code is here============================//
			       for(int t=0;t<20;t++)
				     {
			    	 
				      
				       String String_video_count=wd.findElement(By.xpath(".//*[@id='section11']/span")).getText(); //video count reader
				       Thread.sleep(2000);
				       if(String_video_count.equals("")) //   got it difference between "" & null..remember it.
				       {
				    	   System.out.println("Video count of page =  0");
				       }
				       else
				       {
				    	   int video_count= Integer.parseInt(String_video_count);
					       System.out.println("Video count of page =  "+video_count);
					       Thread.sleep(6000);
//					        String String_video_count=wd.findElement(By.xpath(".//*[@id='section11']/span")).getText(); //video count reader
//					        int video_count= Integer.parseInt(String_video_count);
//						       System.out.println("Video count of page 1=  "+video_count);
						       wd.findElement(By.xpath(".//*[@id='section11']")).click();
						       List<WebElement> no_of_videos =wd.findElements(By.xpath(".//*[@id='mCSB_6_container']/figure[@class='OpenVideoLU ']"));
						       for (int i=0;i<no_of_videos.size();i++)                     
							    {	
						    	   
							        Thread.sleep(4000);
							        WebElement dd =no_of_videos.get(i);
							        //myValue1.click();   // to open a video
							        Actions action1 = new Actions(wd);
							       action1.moveToElement(dd).click().perform();
							       Thread.sleep(2000);
								        if(wd.findElement(By.xpath("//*[@id='vid']/button")).isDisplayed())   // for K class academy video
								        {
								        	
								        
								        	WebElement e2= wd.findElement(By.cssSelector(".vjs-big-play-button"));    // To click  play button    
								        	JavascriptExecutor d2 = (JavascriptExecutor)wd;
								    		d2.executeScript("arguments[0].click();", e2);
								        	Thread.sleep(2000);
								        	//==================title description start=========================//
								        	wd.findElement(By.xpath("//*[@id='myModal_vedio']/div/div/div[2]/div[1]/div[2]/i")).click();   // Arrow down
								        	String video_name=wd.findElement(By.xpath("//*[@id='myModal_vedio']/div/div/div[2]/div[2]/p")).getText();   
								        	System.out.println("video description is ="+video_name);
								        	wd.findElement(By.xpath("//*[@id='myModal_vedio']/div/div/div[2]/div[1]/div[1]/i")).click();    //Arow up 
								        	//==================title description end=========================//
								        	System.out.println("title test complete");
								        	
								        	//==================thumb buttons start=========================//
								        	wd.findElement(By.xpath(".//*[@id='imgContentRNo']")).click();
								        	Thread.sleep(1500);
								        	wd.findElement(By.xpath(".//*[@id='imgContentRYes']")).click();
								        	//==================thumb buttons ends=========================//
								        	System.out.println("thumb test complete");
								        	Thread.sleep(1500);
								        	//================== quality buttons starts=========================//
								        	wd.findElement(By.xpath("//ul[@class='vid_quality']/li[1]")).click();
								        	wd.findElement(By.xpath("//ul[@class='vid_quality']/li[2]")).click();
								        	wd.findElement(By.xpath("//ul[@class='vid_quality']/li[3]")).click();
								        	
								        	wd.findElement(By.xpath("//ul[@class='aud_quality']/li[1]")).click();
								        	wd.findElement(By.xpath("//ul[@class='aud_quality']/li[2]")).click();
								        	wd.findElement(By.xpath("//ul[@class='aud_quality']/li[3]")).click();
								        	//================== quality buttons ends=========================//
								        	System.out.println("quality buttons test complete");
								        	Thread.sleep(6000);
								        	//================== play /Pause buttons Starts=========================//
								        	wd.findElement(By.xpath("//*[@id='vid']/div[5]/button[1]")).click();  //play/pause video 
								           Thread.sleep(4000);
								        	wd.findElement(By.xpath("//*[@id='vid']/div[5]/button[1]")).click();// Pause/play video
								        	//================== play /Pause buttons ends=========================//
								        	System.out.println("play/pause button test complete");
								        	Thread.sleep(4000);
								        	wd.findElement(By.xpath("//*[@id='vid']/div[5]/button[2]")).click();  //Full screen k class 
								        	Thread.sleep(4000);
								        	wd.findElement(By.xpath("//*[@id='vid']/div[5]/button[2]")).click();   //minimize screen  k class//
								        	
								        	System.out.println("full screen/minimize screen test complete");
								         	Thread.sleep(5000);
								        	wd.findElement(By.xpath(".//*[@id='myModal_vedio']/div/div/button")).click(); //close video
								        	System.out.println("Video closed");
								            Thread.sleep(6000);
								        }
								        else // for khan academy video
								        	
								        {
								        	System.out.println("Its khan academy or avantvideo");
								        	Thread.sleep(2000);
								        	//==================video description start=========================//
								        	wd.findElement(By.xpath("//*[@id='myModal_vedio']/div/div/div[2]/div[1]/div[2]/i")).click();   // Arrow down
								        	String video_name=wd.findElement(By.xpath("//*[@id='myModal_vedio']/div/div/div[2]/div[2]/p")).getText();   
								        	System.out.println("video description is ="+video_name);
								        	wd.findElement(By.xpath("//*[@id='myModal_vedio']/div/div/div[2]/div[1]/div[1]/i")).click();    //Arow up 
								        	//==================video description end=========================//
								        	System.out.println("title test complete");
								        	//==================thumb buttons start=========================//
								        	wd.findElement(By.xpath(".//*[@id='imgContentRNo']")).click();
								        	Thread.sleep(1500);
								        	wd.findElement(By.xpath(".//*[@id='imgContentRYes']")).click();
								         	System.out.println("thumb test complete");
								        	//==================thumb buttons ends=========================//
								        	
								        	Thread.sleep(1500);
								        	//================== quality buttons starts=========================//
								        	wd.findElement(By.xpath("//ul[@class='vid_quality']/li[1]")).click();
								        	wd.findElement(By.xpath("//ul[@class='vid_quality']/li[2]")).click();
								        	wd.findElement(By.xpath("//ul[@class='vid_quality']/li[3]")).click();
								        	
								        	wd.findElement(By.xpath("//ul[@class='aud_quality']/li[1]")).click();
								        	wd.findElement(By.xpath("//ul[@class='aud_quality']/li[2]")).click();
								        	wd.findElement(By.xpath("//ul[@class='aud_quality']/li[3]")).click();
								        	//================== quality buttons ends=========================//
								        	System.out.println("quality buttons test complete");
								        	Thread.sleep(3000);
								        	wd.findElement(By.xpath("//*[@id='span_toggle_Screen']")).click();   // full screen khan academy video
								        	Thread.sleep(4000);
								        	wd.findElement(By.xpath("//*[@id='span_toggle_Screen']")).click();   // minimize screen khan academy video
								        	System.out.println("full screen/minimize screen test complete");
								        	
								        	 Thread.sleep(6000);
										        wd.findElement(By.xpath(".//*[@id='myModal_vedio']/div/div/button")).click(); //close video
										        System.out.println("Video closed");
										        Thread.sleep(6000);
								        }
						 }
					        
					        
					        System.out.println("====================single page video test complted=====================");
					    }
				       
				       Thread.sleep(4000);
				    	 wd.findElement(By.xpath(".//*[@id='ulPageNumber']/li[13]/a")).click();    //page navigation next button 
				    	 Thread.sleep(4000);
				    	 
				     }
		    System.out.println("====================single chapter video test complted=====================");
		}
	}


