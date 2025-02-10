import java.util.Scanner;
class IfElseLeapYear 
{
	public static void main(String[] args) 
	{
	   System.out.print("Enter the year: ");

	   int year = new Scanner(System.in).nextInt(); // Enter the year as input 

	   if (year%4==0 && year%100 != 0 || year%400==0) 

	// If year is divisible by 4 and not divisible by 100 or year divisible by 400 then leap year

	   {
           System.out.println(year+" is a Leap year");
	   }
	   else
	   {
			System.out.println(year+" is not a Leap year");
	   }

	}
}
