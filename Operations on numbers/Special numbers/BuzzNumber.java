import java.util.Scanner;
class BuzzNumber 
{
	public static void main(String[] args) 
	{  
		 
     System.out.print("Enter the number: ");

	 int num = new Scanner(System.in).nextInt();

	 String result = (num%7==0||num%10==7)?num+" is Buzz number":num+" is not Buzz number";

	 System.out.println(result);
	}
}
