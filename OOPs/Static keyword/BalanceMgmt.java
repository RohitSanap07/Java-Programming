import java.util.Scanner;
class BalanceMgmt 
{
	static double balance;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Amount to credit ");
		double credit1=sc.nextDouble();

		System.out.print("Amount to debit ");
		double debit1=sc.nextDouble();

        credit(credit1);
		debit(debit1);
	}


	public static void debit(double amt)
	{
		if (amt>0 && balance-amt>1000)
		{
			balance -= amt;
			System.out.println("Amount Debited");
			System.out.println("Debited : "+amt);
			System.out.println("Current balance is : "+balance);
		}
		else {
			System.out.println("Invalid currency");
		}
	}

    public static void credit(double amt)
	{
		if (amt>0)
		{
			balance += amt;
			System.out.println("Amount Credited");
			System.out.println("Credited : "+amt);
			System.out.println("Current balance is : "+balance);
		}
		else {
			System.out.println("Invalid currency");
		}
	}


}
