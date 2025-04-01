import java.util.Scanner;
class SeasonCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the name of month: "); //Enter month name as input

		String month = sc.next().toUpperCase(); // Converting that month name to uppercase

        String op = ((month.equals("OCT"))||(month.equals("NOV"))||
	                (month.equals("DEC"))||(month.equals("JAN"))? month+ " is Winter":
	                (month.equals("FEB"))||(month.equals("MAR"))||
	                (month.equals("APR"))||(month.equals("MAY"))? month+ " is Summer":
	                (month.equals("JUN"))||(month.equals("JUL"))||
	                (month.equals("AUG"))||(month.equals("SEP"))? month+ " is Monsoon":"INVALID MONTH" );

	    System.out.println(op); 
   }
}
