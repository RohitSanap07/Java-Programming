import java.util.Scanner;
class SwitchCaseCalculator 
{
	public static void main(String[] args) 
	{  

		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println("-------WELCOME-------");
		System.out.println();

		System.out.print("Enter number 1: ");

		float num1 = sc.nextFloat();

        System.out.print("Enter number 2: ");

		float num2 = sc.nextFloat(); 

	   System.out.println("-----List of Operators-----");
	   System.out.println('+');
	   System.out.println('-');
	   System.out.println('*');
	   System.out.println('/');
	   System.out.println('%');

	   System.out.print("Enter your option: ");

	   char operator = sc.next().charAt(0); // Enter the operator

	   switch (operator)
	   {

	   case '+':
		   System.out.println("Answer is: "+(num1+num2)); // + operator perform addition
	    break;

	   case '-':
		   System.out.println("Answer is: "+(num1-num2)); // - operator perform subtraction
	   break;

	   case '*':
		   System.out.println("Answer is: "+(num1*num2)); // * operator perform multiplication
	   break;

	   case '/':
		   System.out.println("Answer is: "+(num1/num2)); // / operator perform division
	   break;

	   case '%':
		   System.out.println("Answer is: "+(num1%num2)); // % operator checks modulus after division
	   break;

       default:
		   System.out.println("Invalid operator"); // User entered another key than operator
	   break;

    }
  }
}
