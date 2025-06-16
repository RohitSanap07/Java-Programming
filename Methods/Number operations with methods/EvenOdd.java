import java.util.Scanner;
class EvenOdd 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number : ");
		int input = new Scanner(System.in).nextInt();

		if ((input/2)*2==input)
		{
			System.out.println(input+" is Even number");

			return;
		}
		System.out.println(input+" is Odd number");
	}
}
