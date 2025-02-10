import java.util.Scanner;
class MinMaxDigitNum 
{
	public static void main(String[] args) 
	{   
		System.out.print("Enter a number: ");

		int num = new Scanner(System.in).nextInt(); // Taking input from user 

        int max = 0; // Initially max value is 0

		int min = 9; // Initially min value is 9

        // (Initialization) i equals to num
		// (Condition) i goes until it less than 0
		// (Update) Remove last digit from number 
		for (int i = num;i>0 ; i/=10) 
		{
			int digit = i%10; // To fetch last digit

			if(max<digit) // If digit value is max then execute
			{
			max = digit; // Stores max value in digit
			}

			if (min>digit) // If digit value is min then execute
			{
			min = digit; // Stores min value in digit
			}
			
		}

		    System.out.println("The greater number in "+num+" is : " +max);
		    System.out.println("The smaller number in "+num+" is : " +min);
	}
}
