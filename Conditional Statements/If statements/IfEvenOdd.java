import java.util.Scanner;
class IfEvenOdd 
{
	public static void main(String[] args) 
	{
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter the number:"); 

	     int num = sc.nextInt(); // Enter number as input

		 if (num%2==0) // Condition for checking number is even
		 {
			 System.out.println(num+" is Even number");
		 }

		 if (num%2!=0) // Condition for checking number is odd
		 {
			 System.out.println(num+" is Odd number");
		 } 

		System.out.println("Thank You");
	}
}
