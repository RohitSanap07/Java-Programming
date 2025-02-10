import java.util.Scanner;
class EmiCalculator 
{
	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);

	   System.out.println("EMI CALCULATOR");

	   System.out.print("Enter the Loan Amount: ");

	   float amt = sc.nextFloat(); // Amount as input 

	   System.out.print("Enter ROI: ");

	   float roi = sc.nextFloat(); // Rate of interest on amount

	   System.out.print("Enter Tenure(Months): ");

	   float month = sc.nextFloat(); // Number of months 

       float interest = (amt*roi); // Calculating interest 

	   float totalAmt = amt + interest; // Calculating total amount

	   float emi = totalAmt/month; // Calculating emi per month

       System.out.println("Total loan amount: "+totalAmt);
	   System.out.println("Total interest applied: "+interest);
	   System.out.println("EMI per month: "+emi);
	}
}
