import java.util.Scanner;
class FinanceCalc 
{
	public static void main(String[] args) 
	{
     Scanner sc = new Scanner(System.in);]

	 System.out.print("Enter the Subtotal: "); 

	 float subTotal =sc.nextFloat(); // Enter amount

	 System.out.print("Enter the Gratuity rate: ");

     float tipRate =sc.nextFloat(); // Rate of tip 

	 float tipAmount = (subTotal*tipRate)/100; // Calculating tip amount
	 float totalAmount  = subTotal + tipAmount; // Calculating total amount

     System.out.println(totalAmount);
		
	}
}
