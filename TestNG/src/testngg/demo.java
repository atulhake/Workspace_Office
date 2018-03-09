package testngg;

import org.testng.annotations.Test;





public class demo 
{
    @Test(priority=1,description="hello")
	public void login()
	{
		System.out.println("login");

	}
    @Test(priority=3)
   	public void logout()
   	{
   		System.out.println("logout");

   	}
    @Test(priority=1)
   	public void signup()
   	{
   		System.out.println("signup");

   	}
	
	
	
	
	
}
