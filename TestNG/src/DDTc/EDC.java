package DDTc;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class EDC {
	


	XSSFWorkbook WB;
	XSSFSheet WSO;	
	
		
	public EDC(String excelpath) //creating a parameterised constructor, so as to everytime to load the sheet
	{
		try //surrounding by try catch so that  incase there is some issue with the code then there is proper way to show it
			{
				File src1=new File(excelpath);
				FileInputStream fis= new FileInputStream(src1);
				WB=new XSSFWorkbook(fis);
				
			} 
		catch (Exception e) 
			{
				System.out.println(e.getMessage());//printing the execption if any
			}	
	}
	public String getData(int sheetno, int row, int col) //creating a parameterised method
		{
		
		WSO= WB.getSheetAt(sheetno);
		String data=WSO.getRow(row).getCell(col).getStringCellValue();
		return data;
		}
	
	public int getRowcount(int sheetIndex) //returning the no of rows
	{	
		int r=WB.getSheetAt(sheetIndex).getLastRowNum();
		r=r+1;
		return r ;
	}
	
	 
}