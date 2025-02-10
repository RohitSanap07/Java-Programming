import java.util.Scanner;
class CurrencyConverter
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 

		System.out.println();
		System.out.println("*** WELCOME ***");
		System.out.println();
		System.out.print("ENTER THE CURRENCY(INR): ");
		 
		float inr = sc.nextFloat(); // Taking input in indian currency
		System.out.println();

		System.out.println("** LIST OF CURRENCY **");
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println("5. KWD");

		System.out.print("Enter the currency: ");

		String curr = sc.next().toUpperCase(); // Enter in which need to convert indian currency

		float con = 0;

		if(curr.equals("USD"))
        {
			con = inr/86.56f; // Conversion in USD
			System.out.println(inr+" INR = "+con+" in USD");

        }

		else if(curr.equals("EUR"))
        {
			con = inr/90.27f; // Conversion in EUR
			System.out.println(inr+" INR = "+con+" in EUR");

        }
		else if(curr.equals("KWD"))
        {
			con = inr/280.85f; // Conversion in KWD
			System.out.println(inr+" INR = "+con+" in KWD");

        }
		else if(curr.equals("PKR"))
        {
			con = inr/0.31f; // Conversion in PKR
			System.out.println(inr+" INR = "+con+" in PKR");

        }
		else if(curr.equals("GBP"))
        {
			con = inr/107.66f; // Conversion in GBP
			System.out.println(inr+" INR = "+con+" in GBP");

        }
      
	   else 
        {
			System.out.println("INVALID CURRENCY"); // If incorrect input given

        }
    }
}
