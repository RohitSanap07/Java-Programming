import java.util.Scanner;
class IfElseDivCheck
{
	public static void main(String[] args) 
	{

        System.out.print("Enter a number to check divisibility:");

        int num = new Scanner(System.in).nextInt(); // Enter number as input

		if (num%5==0 && num%11==0) // Checking number divisible by 5 and 11 or not

		{

			System.out.println("Number is Divisible by 5 and 11");

		}

		else 

		System.out.println("Number is not divisible by 5 and 11");
	}
}
