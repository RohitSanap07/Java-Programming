import java.util.Scanner;
class LowerCheck 
{
	public static void main(String[] args) 
	{
      Scanner sc = new Scanner (System.in);

	  System.out.print("Enter a character:");

	  char ch = sc.next().charAt(0);

	  String out = (ch>='a' && ch<='z')?(ch+" is a Lowercase alphabet"):
	  (ch+" is not Lowercase alphabet");

	  System.out.println(out);
	}
}
