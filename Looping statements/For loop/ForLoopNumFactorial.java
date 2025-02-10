import java.util.Scanner;
class ForLoopNumFactorial 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number: ");

		int num = new Scanner(System.in).nextInt(); // Enter number as input

		int fact =1; // Factorial initially 1 

        // (Initialization) i is equal to num
		// (Condition) i goes until greater than equal to 1
		// (Update) the i is decrement in each iteration
		for (int i = num ;i>=1 ;i--)
		
			fact *= i; // To print factorial product of factorial and i
		
		System.out.println("Factorial of number: "+fact);
	}
}
