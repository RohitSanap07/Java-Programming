import java.util.Scanner;
class NeonNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		//int num = 9;
           
   
		int sqr = num*num;
		int sum = 0;

	for (int i = sqr ;i>0 ;i/=10 )
	{
		
		int rem = i%10;
		sum +=rem;
       
	}
	System.out.println(num==sum?num+" is neon number":num+" is not neon number");

	}
}
