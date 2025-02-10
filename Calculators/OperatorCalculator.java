import java.util.Scanner;
class OperatorCalculator 
{
	public static void main(String[] args) 
	{
     Scanner sc = new Scanner(System.in);

	 System.out.print("Enter a number1: ");
     float num1 = sc.nextFloat(); // Enter number 1 as input

	 System.out.print("Enter a number2: ");
     float num2 = sc.nextFloat(); // Enter number 2 as input

     System.out.print("Enter a operator: ");
	 char op = sc.next().charAt(0); // Enter operator to do arithmetic operation

	 float opt = 0; // Initially value is zero

	    opt = ( (op=='+') ? num1+num2: 
		        (op=='-') ? num1-num2:
                (op=='/') ? num1/num2:
		        (op=='%') ? num1-num2:
		        (op=='*') ? num1-num2:0.00001f );  
	    
	 String output = num1+" "+op +" "+num2+ " = " +opt;

	  if(!(opt == 0.00001f))
	  {
		  System.out.println(output);
	  }

	}
}
