import java.util.Scanner;
class EvenOddCheck 
{
	public static void main(String[] args) 
	{
        System.out.print("Enter the number: ");
        int num1 = new Scanner(System.in).nextInt();
		boolean check = num1 % 2==0;

        System.out.println("The number is "+check);
	}
}
