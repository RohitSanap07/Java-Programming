import java.util.Scanner;
class ForLoopGreaterNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
         
		System.out.print("Enter a number:");

		int num = sc.nextInt();

		int dup = num;

		int sum =0;

		for (;num>0;num /= 10)
		{

            int rem = num%10;

			if (rem%2==0)
			sum += rem;
		}
			System.out.println(dup);

		System.out.println(sum);

   }
}
