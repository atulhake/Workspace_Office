package student;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
	@Test
	public void first() throws InterruptedException, Exception	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		//wd.manage().window().maximize();
		System.out.println("window Maximized");
		 By username = By.id("login_input_Uname");
		   By Password = By.id("login_input_Pwd");
		   By loginbutton = By.xpath("/html/body/div[2]/div/div/form/input");
		   By KillAllSession = By.id("update_flag_login");
		   
	//===============================================================================	   
		 	 File src=new File("C:\\Users\\iets\\Desktop\\userEnrolledAfter_launch_oFailed.xlsx");
	    	 
	    	   FileInputStream fis=new FileInputStream(src);
	    	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	    	    XSSFSheet sh1= wb.getSheetAt(0);
	    	    int rowcount= sh1.getLastRowNum();
	    	    int count= rowcount;
	    	    System.out.println("total row no is ="+count);
	    	    DataFormatter df = new DataFormatter();
	    	    XSSFRow row;
	    	    XSSFCell cell;
	    	    String emailID; 
	    	    XSSFRow row1;
	    	    XSSFCell cell1;
	    	    String Pass;
	    			for(int i=1;i<=22;i++)
					{
	    				System.out.println(i);
						wd.get("https://geneo.in/geneo_live/student_login.aspx");
						try {
							
							row = sh1.getRow(i);
							cell = row.getCell(1);
							emailID = df.formatCellValue(cell);
						    row1 = sh1.getRow(i);
							cell1 = row1.getCell(2);
						    Pass = df.formatCellValue(cell1);
							
							 wd.findElement(username).sendKeys(emailID);
							 wd.findElement(Password).sendKeys(Pass);
							 wd.findElement(loginbutton).click();
							 Thread.sleep(1500);
							   try {
									  if(wd.findElement(KillAllSession).isDisplayed()){
										
										   wd.findElement(KillAllSession).click();  
										   System.out.println("killed all other sessions");
									   }
								} catch (Exception e){}
							   Thread.sleep(3000);
							 if(wd.getTitle().equals("Geneo Student Cover Page") || wd.getTitle().equals("Student Landing page"))
							   {
								   System.out.println("logged in successfully");
							sh1.getRow(i).createCell(11).setCellValue("pass");
							   }
							   else
							   {
								   System.out.println("login failed");
							sh1.getRow(i).createCell(11).setCellValue("Failed");
							   }
							 FileOutputStream fout = new FileOutputStream(src);
							 
							wb.write(fout); 
							fout.flush();
						} catch (Exception e) {}
					    
						}
	    			}
	
	
	
	
	
	}