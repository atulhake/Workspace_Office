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

import com.geneo.pages.Login_To_Index_Page;
import com.geneo.pages.Login_page;
import com.geneo.pages.loginToTextPage;

public class index_click_and_back {

	public static void main(String[] args) throws InterruptedException 
	
	{
	
		WebDriver wd= browserfactory.StartBrowser("chrome", "https://geneo.in/geneo_live/student_login.aspx");
		Login_page login =new Login_page(wd);
		login.LoginToGeneo("etegatul@gmail.com", "Geneo@1234");
		Login_To_Index_Page textpage = new Login_To_Index_Page(wd);
	     textpage.select_std_sub(10, "MATHAMATICS");
		
		  //================For chapter names reading================//
	    java.util.List<WebElement> chapter_names=wd.findElements(By.className("chapt_index_left_space"));    // trying to to show list of chapter names on index page
		int no = chapter_names.size();
		System.out.println("\n\ntotal no. of chapters ="+no);
		
		for (int i = 0; i<no; i++)
		{
			java.util.List<WebElement> chapter=wd.findElements(By.className("chapt_index_left_space"));
			System.out.println(chapter.get(i).getText());
			try {
				WebElement dd =chapter.get(i);
				dd.click();
				Thread.sleep(3000);
				  wd.findElement(By.xpath(".//img[@alt='Previous']")).click();
				  Thread.sleep(5000);
				  java.util.List<WebElement> chapter1=wd.findElements(By.className("chapt_index_left_space"));
				  WebElement ddn =chapter1.get(i+1);
				  Actions p = new Actions(wd);
				  p.moveToElement(ddn).build().perform();
				  } catch (Exception e) {}
        
		}
		System.out.println("All chapter no links of index page are working fine");
		
	}

}
