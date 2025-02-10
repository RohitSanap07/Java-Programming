import java.util.Scanner;
class UpperCheck 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner (System.in);

	  System.out.print("Enter a character: ");

	  char ch = sc.next().charAt(0); // Enter the alphabet as input 

	  String out = (ch>='A' && ch<='Z')?
	               (ch+" is a Uppercase alphabet"):
	               (ch+" is not Uppercase alphabet");

	  System.out.println(out);

	}
}
