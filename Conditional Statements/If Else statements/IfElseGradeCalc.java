import java.util.Scanner;
class IfElseGradeCalc 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter your marks: ");

		int marks = new Scanner(System.in).nextInt(); // Enter the number 
        
		if (marks>100) // If user entered invalid marks execute this 
		{
          System.out.println("Enter valid marks(out of 100)");
		}

        else if (marks>=80 && marks<=100)
        {
          System.out.println("You got A grade");
        }

		else if (marks>=60 && marks<80)
        {
          System.out.println("You got B grade");
        }

		else if (marks>=45 && marks<60)
        {
          System.out.println("You got C grade");
        }

		else if (marks>=35 && marks<45)
        {
          System.out.println("You got D grade");
        }
		       
	    else
        {
          System.out.println("You are fail"); // If marks less than 35 then print fail
        }

	}
}
