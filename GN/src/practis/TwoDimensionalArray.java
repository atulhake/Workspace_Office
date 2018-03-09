package practis;

public class TwoDimensionalArray {

	public static void main(String[] args) 
	{
		Object obj[][] = new Object[2][2];
		
		obj [0][0]=12.5;
		obj [0][1]="atul";
		obj [1][0]='A';
		obj [1][1]="hake";
		System.out.println(obj.length);
		System.out.println(obj[0].length);
		for(int row=0;row<obj.length;row++)
		{
			for(int col =0;col<obj[0].length;col++)
			{
				System.out.println(obj[row][col]);
			}
				
		}
	}

}
