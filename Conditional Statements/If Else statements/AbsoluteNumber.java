import java.util.Scanner;
class AbsoluteNumber  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
     
	   System.out.print("Enter a number:");
	    int num = sc.nextInt();

		if (num>0)
		{
			System.out.println((+(num)));
		}
		else if (num<=0)
		{
           System.out.println((-(num)));
		}

		System.out.println("Thank You");
	}
}
