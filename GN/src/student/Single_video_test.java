package student;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.thoughtworks.selenium.webdriven.commands.GetText;

public class Single_video_test {

	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://geneo.in/geneo_live/student_login.aspx");
		wd.manage().window().maximize();
		System.out.println("window Maximized");
		wd.findElement(By.id("login_input_Uname")).sendKeys("etegatul@gmail.com");
		wd.findElement(By.id("login_input_Pwd")).sendKeys("Geneo@123");
		wd.findElement(By.xpath("/html/body/div[2]/div/div/form/input")).click();
		System.out.println("successful Logged in");
		//Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(wd,10);
		try {
			WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("update_flag_login")));
			if(element1.isDisplayed()){
				
				   wd.findElement(By.id("update_flag_login")).click();  
				   System.out.println("killed all other sessions");
			   }
		} catch (Exception e){}
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//img[@class='landing_user']")));
		wd.findElement(By.xpath(".//img[@class='landing_user']")).click();   // menu option
		
		 Wait<WebDriver> wait1 = new FluentWait<WebDriver>(wd)
			       .withTimeout(30, TimeUnit.SECONDS)
			       .pollingEvery(200, TimeUnit.SECONDS)
			       .ignoring(NoSuchElementException.class);
			  wait1.until(new Function<WebDriver, WebElement>() 
				{
				     public WebElement apply(WebDriver wd) 
				     {
				    	 return wd.findElement(By.xpath(".//a[contains(text(),'Geneo')]"));
				     }
				});
			   wd.findElement(By.xpath(".//a[contains(text(),'Geneo')]")).click(); //GENEO OPTION OF MENU BAR
			   wait1.until(new Function<WebDriver, WebElement>() 
						{
						     public WebElement apply(WebDriver wd) 
						     {
						    	 return wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/button"));
						     }
						});
		wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/button")).click(); 
		Thread.sleep(1000);
		int std = 10;
        switch (std) {
        case 10:  
        	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/ul/li[2]/a")).click(); //10th Standard
           
  	     	System.out.println("\n\n10th standard");
        	      break;
        case 9:  
           	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/ul/li[1]/a")).click();  //9th standard
    		
    		System.out.println("\n\n9th standard");
    		      break;
        			}
	
	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/span/span")).click();  //subject dropdown
	//Thread.sleep(3000);
	
	  String subject = "MATHAMATICS";
        switch (subject) {
            case "SCIENCE": 
            	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/ul/li[2]/a/b")).click();  //science 
            	System.out.println("Science");
            	
                     break;
            case "MATHAMATICS":  
            	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/ul/li[1]/a/b")).click(); //Maths 
        		System.out.println("Mathamatics");
                     break;
                     
            case "ENGLISH":  
            	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/ul/li[3]/a/b")).click(); //English 
        		System.out.println("English");
                     break;
        				}
		//wd.findElement(By.xpath("html/body/div[2]/div[1]/div/div[4]/button")).click();  // Done button
		//wd.findElement(By.xpath("//BUTTON[@type='button'][text()='DONE']")).click();
		//===============javascript for Done button click event=========//
		WebElement e1 = wd.findElement(By.xpath("//BUTTON[@type='button'][text()='DONE']"));
		JavascriptExecutor d1 = (JavascriptExecutor)wd;
		d1.executeScript("arguments[0].click();", e1);
		//============================cover page =================================//
		Thread.sleep(8000);
		wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div[1]/div[1]/div/a/img")).click(); // cover page click event
		Thread.sleep(5000);
		//wd.findElement(By.xpath("//*[@id='index_table_rows']/div[12]/div[1]/span[2]")).click();
		
	
				
		        Thread.sleep(5000);
		     wd.findElement(By.xpath(".//*[@class='col-lg-11 col-sm-11 left_space_index']/span[text()='4']")).click();   // chapter 12 selection 
		        System.out.println("text page of book is open ...idiot study now :D!!!!!!");
		     
		        Thread.sleep(6000);
		        String String_video_count=wd.findElement(By.xpath(".//*[@id='section11']/span")).getText(); //video count reader
		        int video_count= Integer.parseInt(String_video_count);
			       System.out.println("Video count of page 1=  "+video_count);
			       wd.findElement(By.xpath(".//*[@id='section11']")).click();
			       java.util.List<WebElement> no_of_videos =wd.findElements(By.xpath(".//*[@id='mCSB_6_container']/figure[@class='OpenVideoLU ']"));
			       for (int i=1;i<=no_of_videos.size();i++)                     
				    {	
				        Thread.sleep(250);
				        WebElement yy =wd.findElement(By.xpath("//*[@id='mCSB_6_container']/figure['i']/img[2][contains(text='asset/img/resolve_logo.png')]"));
			        	String name_of_video= yy.getAttribute("src");
			        	
			        	if (name_of_video=="https://geneo.in/Geneo_Live/asset/img/resolve_logo.png")
			        	{
			        		System.out.println("\n\nThis is  k class video");
			        		
			        	}else if(name_of_video=="https://geneo.in/Geneo_Live/asset/img/ScienceVideoBrang.png")
			        	{
			        		System.out.println("\n\nThis is  science class video");
			        		
			        	}else if (name_of_video=="https://geneo.in/Geneo_Live/asset/img/avanti.png")
			        	{
			        		System.out.println("\n\nThis is  avanti video");
			        		
			        	}else if(name_of_video=="https://geneo.in/Geneo_Live/asset/img/Khan.png")
			        	{
			        		System.out.println("\n\nThis is khan academy video");
			        	}
			        	WebElement dd3 =no_of_videos.get(i);
			        	dd3.click();  // to open a video
				        
				        Thread.sleep(4000);
					        if(wd.findElement(By.xpath("//*[@id='vid']/button")).isDisplayed())   // for K class academy video
					        {

					        
					        	
					        	WebElement e2= wd.findElement(By.cssSelector(".vjs-big-play-button"));    
					        	JavascriptExecutor d2 = (JavascriptExecutor)wd;
					    		d2.executeScript("arguments[0].click();", e2);   // To click  play button    
					        	Thread.sleep(500);
					        	//==================vodeo title=========================//
					        	
					        	
					        	//==================vodeo title=========================//
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
					        	Thread.sleep(3000);
					        	//================== play /Pause buttons Starts=========================//
					        	wd.findElement(By.xpath("//*[@id='vid']/div[5]/button[1]")).click();  //play video 
					           Thread.sleep(4000);
					        	wd.findElement(By.xpath("//*[@id='vid']/div[5]/button[1]")).click();// Pause video
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
					        	
					        	Thread.sleep(2000);
					        	System.out.println("Its khan academy or avanti video");
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
		        
		        System.out.println("video's tested ");
		      
		    
		    // =========Single chapter all page video code is here============================//
//			       for(int t=0;t<15;t++)
//				     {
//			    	 
//				      
//				       String String_video_count=wd.findElement(By.xpath(".//*[@id='section11']/span")).getText(); //video count reader
//				       if(String_video_count.equals("")) //   got it difference between "" & null..remember it.
//				       {
//				    	   System.out.println("Video count of page =  0");
//				       }
//				       else
//				       {
//				    	   int video_count= Integer.parseInt(String_video_count);
//					       System.out.println("Video count of page 1=  "+video_count);
//					       
//					       }
//				       
//			    	 
//				    	 wd.findElement(By.xpath(".//*[@id='ulPageNumber']/li[13]/a")).click();    //page navigation next button 
//				    	 Thread.sleep(4000);
//				    	 
//				     }
//		    
//		    
		    
		    

		        
	
	
		
		
		}
		

	}


