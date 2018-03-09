package Com.GeneoStudent.Testcases;



import java.io.File;
import java.io.IOException;

import javax.naming.spi.DirStateFactory.Result;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.GeneoStudent.Base.TestBase;
import Com.GeneoStudent.Pages.HomePage;
import Com.GeneoStudent.Pages.LoginPage;
import Com.GeneoStudent.Util.TestUtil;


public class LoginPageTest extends TestBase 
{
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest()	
	{
		super();
	}
	
	//@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage = new LoginPage(wd);
		
	}
	
	
	
	//@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title =loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Geneo Student Login", "Login page title mismatched");
	}
	//@Test(priority=2)
	public void LoginTest() throws Exception
	{
		homepage = loginpage.LoginToGeneo(prop.getProperty("username"), prop.getProperty("password"));
        Thread.sleep(2000);
		String title = homepage.verifyHomePageTitle();
		
		Assert.assertEquals(title, "Geneo Student Cover Page","does not match");
	    
	}
	@Test(priority=3)
	public void LoginNegativeTest() throws Exception
	{
		Object atul[][] = TestUtil.getTestData("Sheet1");
		System.out.println(atul[0][0]);
	}
	
	
	//@AfterMethod
	public void teardown(ITestResult result)
	{
		TestUtil testutil = new TestUtil();
		testutil.ScreenShotOfFailedMenthod(result);
		
	//wd.quit();	
	}
	
	
}
