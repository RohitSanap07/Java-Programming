import java.util.Scanner;
class ForLoopFactorial 
{
	public static void main(String[] args) 
	{
          
		  Scanner sc = new Scanner(System.in);
          
		  System.out.print("Enter a number: ");

          int num = sc.nextInt(); // Enter number as input

		  int dup = num;

          int sum =0; // Sum is initially 0
		  

		  while(num>0) // Loop goes until 0
		  {

		  int rem = num%10; // Fetch last digit

		  int fact = 1; // Factorial intially 1

		  if (rem%2==1) // Number is odd
				 
          // (Initialization) i is equals to rem 
		  // (Condition) i o=goes upto greater than equal to 1
		  // (Update) i is decrement
		  for (int i = rem;i>=1 ;i--) 
		  {
			 fact *=i; // Factors are factor * i
		  }

             sum+=fact; // sum is equal to sum + factor
					
             num/=10; // Remove last digit
		  }
	
        System.out.println(dup);
		System.out.println(sum);
		
	}
}
