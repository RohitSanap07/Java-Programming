import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number: ");
		int num = sc.nextInt();

		System.out.println(buzz(num)?"Buzz number":"Not Buzz Number");
	 }
		public static boolean buzz(int num)
		{
			return ((num%7==0)||(num%10==7));
		}
	}

