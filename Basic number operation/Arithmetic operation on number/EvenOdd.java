import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number: "); 

		int num = new Scanner(System.in).nextInt();

		System.out.println(num%2==0);              // Logic 1 

		System.out.println((num/2)==(num/2.0f));   // Logic 2

		System.out.println(((num/2)*2==num));      // Logic 3

		// Output is in boolean value
		
	}
}
