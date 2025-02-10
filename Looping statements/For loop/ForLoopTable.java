import java.util.Scanner;
class ForLoopTable 
{
	public static void main(String[] args) 
	{
       
	   Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter a number: ");
		int num = sc.nextInt(); // Enter the number as input 

		System.out.print("Enter a range: ");
		int range = sc.nextInt(); // Enter the range

        // (Initialization) i is 1 
		// (Condition) i goes until range entered
		// (Updation) i is updating
		for (int i = 1;i<=range ;i++ )
		{
			System.out.println(num+" X "+i+" = "+(num*i)); // Entered number * i increment value 
		}
	}
}
