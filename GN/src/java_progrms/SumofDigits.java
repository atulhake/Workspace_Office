package java_progrms;

public class SumofDigits {

	public static void main(String[] args) 
	{
	 int  sum=0,x=523;
	 int num;
	
	while(x>0)
	      {
		     int j=x%10;
		sum=sum+j;
		x=x/10;
			}
		 
		 System.out.println(sum);
	 
	 
		 
	
	 
	 
	}

}
