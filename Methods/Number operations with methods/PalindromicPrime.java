import java.util.Scanner;
class PalindromicPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");

		int input = sc.nextInt();

		int rev = reverse(input);

		if (input==rev && isPrime(input))
		{
			System.out.print("Number is Palindromic prime");
		}
		else 
		{
			System.out.print("Number is not palindromic prime");
		}
		
	}

    public static int reverse (int num)
	{
		int rev = 0;

		while (num!=0)
		{
			rev = rev * 10 + (num%10);
			num /=10;

		}
		return rev;
	}

	public static boolean isPrime(int num)
	{
		

		int den = 2;

		for (;den<num ;den++ )
		{
			if (num%den==0)
			{
				break;
			}
		}

		return num==den;

	}


}
