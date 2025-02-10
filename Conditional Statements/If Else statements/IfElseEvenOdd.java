import java.util.Scanner;
class IfElseEvenOdd 
{
	public static void main(String[] args) 
	{
       
	  System.out.print("Enter a number: ");

	  int num = new Scanner(System.in).nextInt(); //Enter the number 
 
      if (num%2==0) // Checking number even with num%2==0
      {
		  System.out.println(num+" is a Even number");
      }
	  else // If number not even then print it is odd 
	  {
		  System.out.println(num+" is a Odd number");
	  }

	}
}
