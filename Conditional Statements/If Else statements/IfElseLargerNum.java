import java.util.Scanner;
class IfElseLargerNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter num 1: ");
		int num1 = sc.nextInt(); // Enter first number 

		System.out.print("Enter num 2: ");
		int num2 = sc.nextInt(); // Enter second number 

		if (num1>num2) // First number is greater than second then execute
		{
		   System.out.println("Num 1 is greater");
		}

		else if (num2>num1) // Second number is greater than first number
		{
           System.out.println("Num 2 is greater");
		}

		else // If both are not greater than each other then they are same
		{
			System.out.println("Both numbers are equal");
		}
	}
}
