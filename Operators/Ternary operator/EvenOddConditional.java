import java.util.Scanner;
class EvenOddConditional 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");

		int num = sc.nextInt();

		String check = num/2==0? "Even":"odd";  // If number divide by 2 then Even else odd 

		System.out.println("Num" +num+" is "+check);
	}
}
