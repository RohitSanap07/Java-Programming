import java.util.Scanner;
class EvenCheck 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
		int num1 = sc.nextInt();

		System.out.print("Enter number 2: ");
		int num2 = sc.nextInt();

         String result = (num1%2==0 && num2%2==0)?"Both Even":
		((num1%2==1 && num2%2==1)?"Both Odd":
	    (num1%2==0)?"num1 is Even and num2 is odd":"num2 is Even and num1 is odd");

		System.out.println(result);
	}
}
