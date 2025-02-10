import java.util.Scanner;
class VowelCheck 
{
	public static void main(String[] args) 
	{ 

     Scanner sc = new Scanner (System.in);

	 System.out.print("Enter a Character: ");

	 char ch = sc.next().charAt(0);

	 String out = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?
		          (ch+ " is Vowel"):
		          (ch+ " is Consonants");

     System.out.println(out);
	}
}
