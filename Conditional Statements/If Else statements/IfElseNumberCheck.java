import java.util.Scanner;
class IfElseNumberCheck 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number:");

		int num = new Scanner(System.in).nextInt(); // Enter a number 

		if (num>=1) // Entered number is less than 1
		{
			System.out.println(num+" is positive number");
		}
		else if (num<0) // Entered number is greater than 1
		{
			System.out.println(num+" is negative number");
		}
		else // Otherwise it is zero
		{
			System.out.println(num+" is zero");
		}

        System.out.println("THANK YOU!");
	}
}
