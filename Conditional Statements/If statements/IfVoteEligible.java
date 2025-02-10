import java.util.Scanner;
class IfVoteEligible 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
          
        System.out.print("Enter your age:");

		int age = sc.nextInt(); // Enter your age as input

        if (age>=18) // Age is greater than 18 
        {
			System.out.println("You are Eligible for voting!!");
        }

        if (age<18) // Age is less than 18
        {
			System.out.println("You not are Eligible for voting!!");
        }

        System.out.println("Thank You...!");
	}
}
