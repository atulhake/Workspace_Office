	package DDTc;
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
	
	public class Wordpress 
	{
	WebDriver driver; //creating a global variable, so that its accesible in other methods as well (for eg.line 30)
		@Test(dataProvider="WP_data")  // this will take data from dataprovider which we created, which menas this TC is dpeendant on data taken from data provider
		public void LoginWordpress(String usrname,String paSSword) throws Exception //(parameterised method )
		{

			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://phptravels.org/clientarea.php");
			driver.findElement(By.xpath(".//*[@id='inputEmail']")).sendKeys(usrname);//passing parameters
			driver.findElement(By.xpath(".//*[@id='inputPassword']")).sendKeys(paSSword);//passing parameter
			driver.findElement(By.xpath(".//*[@id='login']")).click();
			Thread.sleep(5000);
			System.out.println(driver.getTitle()); 
			
			String actmsg=driver.findElement(By.cssSelector(".header-lined>h1")).getText();
			System.out.println(actmsg);
			Assert.assertTrue(actmsg.contains("Welcome"));//if the actual msg will contain 'Welcome it will execte next statment
			System.out.println("Logged in SUCESSFULLy");
		}
		/*
		@AfterMethod
		public void Teardown()
		{
			driver.quit();
		}		*/
		
		@DataProvider(name="WP_data") //puting an annotation with name as 'WP_data's
		public Object[][] passdata() //creating an array named 'passsdata' with return as 'Object'
		{	
			Object [][] Udata=new Object[2][2]; // Create object array with 2 rows and 2 column 
			
			Udata[0][0]="Selenium1@gmail.com";
			Udata[0][1]="Password1";
			 
			Udata[1][0]="rajan@xoriant.com";
			Udata[1][1]="password123#";
			 
			return Udata;// return arrayobject to testscript
		}
	}