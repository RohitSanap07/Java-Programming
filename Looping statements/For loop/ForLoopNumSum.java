import java.util.Scanner;
class ForLoopNumSum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
         
		System.out.print("Enter a number:");

		int num = sc.nextInt(); // Enter number as input

		int dup = num;

		int sum =0; // Number sum initially is 0

		while (num>0) // Number until greater than 0
		{
             int rem = num%10; // To fetch last digit of number
			 sum += rem; // Sum store addition of sum and remainder 
			 num /= 10; // Last digit is remove from number

        }
		
          System.out.println(sum);
		  System.out.println(dup);

	}
}
