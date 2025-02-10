import java.util.Scanner;
class IfNumDivision 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number:");

        int num = sc.nextInt(); // Enter number as input

        if (num%5==0) // If after division of 5 mod is zero then divisible by 5
        {
			System.out.println(num+" is divisible by 5");
        }

		if (num%5 !=0) // If after division of 5 mod is not zero then not divisible by 5
        {
			System.out.println(num+" is not divisible by 5");
        }

		System.out.println("Thank You...!");
	}
}
