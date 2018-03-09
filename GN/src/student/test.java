package student;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class test {
	
	public static void main(String[] args) throws IOException 
	
	{
		
		/*int u=9;
		if(u==10)
		{
			System.out.println("pass");
		}
		System.out.println("fail");*/
		
		//String url = "http:// www.geeksforgeeks.org/";
		 
        // Validate an url
		String url = "https://exploriments.com/";
		
		URL u = new URL ( url);
		HttpURLConnection huc =  ( HttpURLConnection )  u.openConnection (); 
		huc.setRequestMethod ("GET");  //OR  huc.setRequestMethod ("HEAD"); 
		huc.connect () ; 
		int code = huc.getResponseCode() ;
		System.out.println(code);
	}
	
	public static boolean urlValidator(String url)
    {
        /*validating url*/
        try {
            new URL(url).toURI();
            return true;
        }
        catch (URISyntaxException exception) {
            return false;
        }
 
        catch (MalformedURLException exception) {
            return false;
        }
    }

}
