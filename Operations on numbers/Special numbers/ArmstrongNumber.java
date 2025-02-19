import java.util.Scanner;
class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");

		int num = new Scanner(System.in).nextInt(); 

		int lent = 0, sum =0;

		int dup = num;
		for (int i = num;i>0 ;i/=10 )
		{
			lent++;
		}
		while (num>0)
		{
			int rem = num%10;
			int pow =1;
			for (int i =1;i<=lent ;i++ )
			{
				pow *=rem;
				sum+=pow;
				num/=10;
			}

			System.out.print(dup==sum?dup+ " is Armstrong number ":dup+ " is not Armstrong number");

		}
	}
}
