package DDTc;

public class SampleRead 
{

	public static void main(String[] args) 
	{
		EDC ex= new EDC("D:\\Learnings\\QuestTCDataSheetAuto.xlsx");
		String a =ex.getData(0, 0, 1);
		System.out.println(a);
		
	}
}