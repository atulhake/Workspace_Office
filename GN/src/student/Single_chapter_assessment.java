package student;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Single_chapter_assessment {

	public static void main(String[] args) throws InterruptedException 
	
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
// 10th or 9th		
		//wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div/ul/li[1]/a")).click();  //9th standard
		
		//System.out.println("");
		//System.out.println("");
		//System.out.println("9th standard");
		
		wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/span/img")).click();  //subject dropdown
	    wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/ul/li[1]/a/b")).click(); //Maths 
		System.out.println("Mathamatics");
//maths or science		
//		wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/ul/li[2]/a/b")).click();  //science 
//		System.out.println("Science");
//science or english
	//	wd.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/div/ul/li[3]/a/b")).click();  //english
		
		
	  /*	//===============javascript for landing page check box button click event=========//
				WebElement e2 = wd.findElement(By.xpath("//LABEL[@for='remember_land']"));
				JavascriptExecutor d2 = (JavascriptExecutor)wd;  // It says = Down-casting or typecasting web-driver reference into javascript executor 
				d2.executeScript("arguments[0].click();", e2);
      */				
		

		//Thread.sleep(1000);
		//wd.findElement(By.xpath("html/body/div[2]/div[1]/div/div[4]/button")).click();  // Done button
		wd.findElement(By.xpath(".//button[contains(text(),'DONE')]")).click();    // this xpath works fine so dont use javascript for xpath.
//		//===============javascript for Done button click event=========//
//		WebElement e1 = wd.findElement(By.xpath("//BUTTON[@type='button'][text()='DONE']"));
//		JavascriptExecutor d1 = (JavascriptExecutor)wd;
//		d1.executeScript("arguments[0].click();", e1);
//		System.out.println("Cover page displayed");
		//============================cover page =================================//
		Thread.sleep(4000);
		wd.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[1]/div[1]/div[1]/div/a/img")).click(); // cover page click event
		System.out.println("index page displayed");
		
		//wd.findElement(By.xpath("//*[@id='index_table_rows']/div[12]/div[1]/span[2]")).click();
		
	
				
		        Thread.sleep(3000);
		     wd.findElement(By.xpath(".//*[@class='col-lg-11 col-sm-11 left_space_index']/span[text()='8']")).click();   // chapter 8 selection 
		        System.out.println("text page of book is open ...idiot study now :D!!!!!!");
		       for(int t=0;t<4;t++)
		       {
		    	   wd.findElement(By.xpath(".//*[@id='rightArrow']")).click();
		       }
		       System.out.println("Assessment tab displayed"); // add validation of this line
		       wd.findElement(By.xpath(".//*[@id='section44'][contains(text(),'Assessments')]")).click();  //click of assessment button
		       wd.findElement(By.xpath(".//*[@id='take_test_main']")).click(); // Take a test button
		       Thread.sleep(5000);
		       
		       java.util.List<WebElement> NO_of_options =wd.findElements(By.xpath(".//img[@class='assement_radio']"));
		       for (WebElement myValue1 : NO_of_options)                      // for loop for chapters click event from text page chapters index
			    {	
			        Thread.sleep(250);
			        myValue1.click();
			    }
//		       WebElement radiobutton1 =wd.findElement(By.xpath(".//*[@id='ulQuestionOptions']/div[1]/label/img"));   //option 1
//               radiobutton1.click();
//               Thread.sleep(1000);
//               WebElement radiobutton2 =wd.findElement(By.xpath(".//*[@id='ulQuestionOptions']/div[3]/label/img"));   //option 2 div[3]
//               radiobutton2.click();
//               Thread.sleep(1000);
//               WebElement radiobutton3 =wd.findElement(By.xpath(".//*[@id='ulQuestionOptions']/div[5]/label/img"));   //option 3 div[5]
//               radiobutton3.click();
//               Thread.sleep(1000);
//               WebElement radiobutton4 =wd.findElement(By.xpath(".//*[@id='ulQuestionOptions']/div[7]/label/img"));   //option 4 div[7]
//               radiobutton4.click();
               System.out.println("all option get selected atleast once");
               Thread.sleep(1000);
               
              java.util.List<WebElement> assessment_question =wd.findElements(By.xpath(".//li[contains(@class,'QueNav')]"));  // loop for numbers of question from a assessment
		       int no = assessment_question.size();
			    System.out.println("total numbers of questions in this assignemnt are = "+no);
			    for (WebElement myValue : assessment_question)
			    {
			    	myValue.click();
			    	Thread.sleep(250);
			    }
//            	   wd.findElement(By.xpath(" .//*[@id='olQuestionNumber']/li[@questionindex='1']")).click(); // Assessment bottom question 2 selection circle
//            	   //Thread.sleep(2000);
//            	   wd.findElement(By.xpath(" .//*[@id='olQuestionNumber']/li[@questionindex='2']")).click();
//            	   //Thread.sleep(2000);
//            	   wd.findElement(By.xpath(" .//*[@id='olQuestionNumber']/li[@questionindex='3']")).click();
//            	   //Thread.sleep(2000);
//            	   wd.findElement(By.xpath(" .//*[@id='olQuestionNumber']/li[@questionindex='4']")).click();
//            	  // Thread.sleep(2000);
//            	   wd.findElement(By.xpath(" .//*[@id='olQuestionNumber']/li[@questionindex='5']")).click();
//            	  // Thread.sleep(2000);
//            	   wd.findElement(By.xpath(" .//*[@id='olQuestionNumber']/li[@questionindex='6']")).click();
//            	   //Thread.sleep(2000);
//            	   wd.findElement(By.xpath(" .//*[@id='olQuestionNumber']/li[@questionindex='7']")).click();
//            	  // Thread.sleep(2000);
//            	   wd.findElement(By.xpath(" .//*[@id='olQuestionNumber']/li[@questionindex='8']")).click();
//            	   //Thread.sleep(2000);
//            	   wd.findElement(By.xpath(" .//*[@id='olQuestionNumber']/li[@questionindex='9']")).click();
//            	  // Thread.sleep(2000);
//            	 
               System.out.println("All questions navigation completed ");
               Thread.sleep(2000);
               wd.findElement(By.xpath("//div[@id='pause_btn']")).click();
               Thread.sleep(1000);
               System.out.println("pause button  clicked");
               wd.findElement(By.xpath("//div[@class='modal-body']/button")).click();
               System.out.println("OK button clicked");
               Thread.sleep(1000);
               wd.findElement(By.xpath("//div[@id='pause_btn']")).click(); 
               System.out.println("=====Mark as review test testing started========");
               wd.findElement(By.id("MarkReviewBtn")).click();
               System.out.println("mark as review button is clicked");
               Thread.sleep(2000);
               wd.findElement(By.xpath(" .//*[@id='olQuestionNumber']/li[@questionindex='3']")).click();  //question  selected
               System.out.println("=====Mark as review test testing completed========");
        	  // System.out.println("Write code for mark as review color verification");
               Thread.sleep(2000);
               wd.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
               Thread.sleep(2000);
               wd.findElement(By.xpath("//span[contains(text(),'YES')]")).click();
               Thread.sleep(2000);
              wd.findElement(By.xpath("//span[contains(text(),'Done')]")).click();
              
               System.out.println("good boy assessment of this chapter is completed");
               
               
               
               
//		       wd.findElement(By.xpath(".//*[@id='ulQuestionOptions']/div[3]/label/img")).click();   //option 2
//		       wd.findElement(By.xpath(".//*[@id='ulQuestionOptions']/div[5]/label/img")).click();   //option 3
//		       wd.findElement(By.xpath(".//*[@id='ulQuestionOptions']/div[7]/label/img")).click();   //option 4
//		       wd.findElement(By.xpath(" .//*[@id='olQuestionNumber']/li[@questionindex='2']")).click();  // Assessment bottom question 2 selection circle
//		       
		      
		       
		       
		      
		    
		        
		    
		
		      
		        
		       // WebElement Last_word=wd.findElement(By.xpath(".//*[@id='ulPageNumber']/li[14]/a[contains(text(),'Last')]"));
		        //String s=Last_word.getText();
		        //System.out.println(s);
		        
		        
		      //  wd.findElement(By.xpath(".//img[@alt='Previous']")).click();
		       // Thread.sleep(2000);
		      //  wd.findElement(By.xpath(".//img[@alt='Previous']")).click();
		        
		        
	
		
		        //-----  .//*[@class='col-lg-11 col-sm-11 left_space_index']/span[text()="1"]
		
		
		}
		

	}


