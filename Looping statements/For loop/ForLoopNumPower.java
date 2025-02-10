import java.util.Scanner;
class ForLoopNumPower 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

	    System.out.print("Enter a number:");
		int num = sc.nextInt(); // Enter number as input

        System.out.print("Enter a power:");
		int pow =sc.nextInt() ; // Enter power to find of number

		int op = 1; // output initially 0
        
		// (Initialization) i is 1 at start
		// (Condition) i value less than equal to power 
		// (Updation) i is incrementing
		for (int i = 1;i<=pow;i++) 
		{
			op *=num; // power find with op = op*num
		}

		System.out.println(num+"^"+pow+"="+op );
	}
}
