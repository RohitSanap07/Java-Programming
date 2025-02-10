import java.util.Scanner;
class DivCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");

		int num = sc.nextInt(); // Enter number to check divisible by 2 and 5 or not
		 
	    String result = (num%2==0 && num%5==0)?("Hii Two Hii Five"):
		                ((num%2==0)?("Hii Two"):((num%5==0)?("Hii Five"):("Blank"))); 

		System.out.print(result);
	}
}
