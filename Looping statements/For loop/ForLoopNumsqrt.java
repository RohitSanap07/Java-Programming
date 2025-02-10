import java.util.Scanner;
class ForLoopNumSqrt 
{
	public static void main(String[] args) 
	{
		
        System.out.print("Enter a number:");

		int num = new Scanner(System.in).nextInt(); // Enter number as input

        int sqrt = 0; // Square root initially 0 
 
        // (Initialization) i is 1 
		// (Condition) i is less than half of input number
		// (Updation) i is increment
		for (int i =1 ;i<=(num/2) ;i++ ) 
		{

        // product of i and increment value of i is equals to entered number
		if ((i*i)==num) 

		{ 
		  sqrt =i;
		  System.out.println(i+" is a square root of "+num);
		}

		}

		if(sqrt==0)
		{
          System.out.println(num+" Don't have a perfect square root ");
        }
	}
}
