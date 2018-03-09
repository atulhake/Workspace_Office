package student;

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
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Login_read_write_from_excel {

	public static void main(String[] args) throws InterruptedException, Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		
		//wd.manage().window().maximize();
		System.out.println("window Maximized");
		 By username = By.id("login_input_Uname");
		   By Password = By.id("login_input_Pwd");
		   By loginbutton = By.xpath("/html/body/div[2]/div/div/form/input");
		   By KillAllSession = By.id("update_flag_login");
		   
	//===============================================================================	   
		 	// File src=new File("C:\\Users\\iets\\Desktop\\userEnrolledAfter_launch.xlsx");
		 	 
	    	 File src =  new File("C:\\Users\\iets\\Desktop\\userEnrolledAfter_launch.xlsx");
	    	   FileInputStream fis=new FileInputStream(src);
	    	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	    	    XSSFSheet sh1= wb.getSheetAt(0);
	    	    int rowcount= sh1.getLastRowNum();
	    	    int count= rowcount+1;
	    	    System.out.println("total row no is ="+count);
	    			for(int i=297;i<=350;i++)
					{
	    				try {
							System.out.println(i);
							wd.get("https://geneo.in/geneo_live/student_login.aspx");
							
							DataFormatter df = new DataFormatter();
							XSSFRow row = sh1.getRow(i);
							XSSFCell cell = row.getCell(1);
							String emailID = df.formatCellValue(cell);
							XSSFRow row1 = sh1.getRow(i);
							XSSFCell cell1 = row1.getCell(2);
							String Pass = df.formatCellValue(cell1);
								
							
							 wd.findElement(username).sendKeys(emailID);
							 wd.findElement(Password).sendKeys(Pass);
							 wd.findElement(loginbutton).click();
							 Thread.sleep(1000);
							   try {
									  if(wd.findElement(KillAllSession).isDisplayed()){
										
										   wd.findElement(KillAllSession).click();  
										   System.out.println("killed all other sessions");
									   }
								} catch (Exception e){}
								   Thread.sleep(2000);
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
								
						
						} catch (Exception e) {} 
	    				
	    				}
					    
					
				}
	    			
	    	
	}


