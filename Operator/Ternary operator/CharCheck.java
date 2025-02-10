import java.util.Scanner;
class CharCheck
{
	public static void main(String[] args) 
	{

      Scanner sc = new Scanner(System.in);

	  System.out.print("Enter a character: "); a
      char ch = sc.next().charAt(0);
   
      String out = ((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))?
                   ((ch>='a' && ch<='z')?(ch +" is a LowerCase Alphabet"):(ch+" is a UpperCase alphabet")):
                   ((ch>='0' && ch<='9')?(ch+" is a Digit"):(ch+ " is a Special character"));

      System.out.println(out);
  }
}

"