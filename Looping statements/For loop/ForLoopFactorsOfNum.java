import java.util.Scanner;
class ForLoopFactorsOfNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number:");
		
		int num = sc.nextInt(); // Enter number as input

		int cnt = 0; // cnt initially 0

        // (Initialization) i starts from 1
		// (Condition) i goes upto less than equal to number 
		// (Updation) i is incrementing
		for (int i = 1 ; i<=num ; i++) 
        
		// When i is in loop and if i goes upto value of number and i value is incrementing
		// num is dividing by i and if it is divisible then that are factors of number
		if (num%i==0) 
		{
			cnt++;
			System.out.println(i+" ");
		}
	
        System.out.println();
	    System.out.println("COUNT : "+cnt);

  }
}