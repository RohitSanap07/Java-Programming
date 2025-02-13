// Print the Fibonacci series 0,1,1,2,3,5,8,13
import java.util.Scanner;
class NumSeries6
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number range to print: ");

		int range = new Scanner (System.in).nextInt();

		System.out.print("Printing first"+range+"number from series");

		int num1 =0;
		int num2=1;
		 System.out.println(num1+"  "+num2+"  ");
		 for (int i =2;i<range ;i++ )
		 {
			 int n = num1 + num2;

			 System.out.print(n+"  ");
			 num1 = num2;
			 num2 = n;
		 }
	}
}
