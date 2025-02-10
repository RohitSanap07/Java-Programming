import java.util.Scanner;
class IfPosNegNum
{
	public static void main (String [] args)
  {
		Scanner sc = new Scanner (System.in);

        System.out.print("Enter the number:");

		int num = sc.nextInt(); // Enter number as input 

		if (num>0) // If number is greater than zero then it is positive
		{
			System.out.println(num+" is Positive number");
		
		}

         if (num<0) // If number is less than zero then it is negative
         {
			 System.out.println(num+" is Negative number");
         }

		 System.out.println("Thank You");
		}
}