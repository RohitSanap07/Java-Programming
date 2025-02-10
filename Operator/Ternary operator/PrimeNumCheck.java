import java.util.Scanner;
class PrimeNumCheck 
{
	public static void main(String[] args) 
	{

	   Scanner sc = new Scanner(System.in);

       System.out.println("Enter a Number: ");
       int num = sc.nextInt();

       System.out.println((num==2||num==3||num==5)?(num+" is a prime"): // Number is prime 
                         ((num%2==0||num%3==0||num%4==0)?               // Check mod is 0 or not 
		                 (num+" is not a prime"):(num+ "is a prime")));
	}
}
