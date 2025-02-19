import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{    
		System.out.print("Enter the number: ");
		 String srt = new Scanner(System.in).next();
		 
		 if (srt.contains("0") && srt.charAt(0) !='0')
		 {
			 System.out.println(srt+" is Duck number");
		 }
		 else 
		{
			System.out.println(srt+" is not Duck number");
		}
	}
}