import java.util.Scanner;
class NumberOfYears 
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Min: ");

		long min = sc.nextLong(); // Enter the minutes as input

        long minInYear = (365*24*60); // Calculating minutes in a year

		long year = min / minInYear; // Year calculate with division of entered minutes and minutes in a year

		long minLeft = min % minInYear; // Min remaining is getting with min % minYear

		long days = minLeft / (60*24); // Remaining minutes converting in days 

		System.out.println(min+" Minutes is approximately : "+year+" years and "+days+" Days");
	
	}
}
