import java.util.Scanner;
class  ArithmaticOperator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first no: ");
        int num1 = sc.nextInt();
		System.out.print("Enter second no: ");
		int num2 = sc.nextInt();
		int sum = num1 + num2 ;
        System.out.println("The sum of two no is: "+sum);
	}
}
