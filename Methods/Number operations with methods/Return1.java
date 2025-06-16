import java.util.Scanner;
class Return1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");

		int inp = sc.nextInt();
		System.out.println(isStrong(inp));
	}
        public static boolean isStrong(int num)
	{
		int sum = 0;

		for (int i = num;i!=0 ;i/=10 )
		{
			int last = i%10;
			sum = sum + factorial(last);
		}
		return num == sum;
	}

	public static int factorial(int digit)
	{
		int fact = 1;

		for (int i =digit ;i>0 ;i-- )
		{
			fact *= i;

		}
		return fact;
		
	}

}
