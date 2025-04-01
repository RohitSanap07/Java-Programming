import java.util.Scanner;
class PercentageCheck
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);

	  System.out.print("Enter the marks out of 600: ");

	  float input = sc.nextFloat(); // Enter marks as input

	  float percentage = (input/600f)*100f; // Condition to calculate percentage

	  String result = (percentage>35f)?"PASS":"FAIL"; // Determine result pass or fail

	  System.out.print(result);

      // System.out.print((percentage>35f)?("PASS"):("Fail") );

	  }
}
