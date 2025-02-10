import java.util.Scanner;
class  CharacterReverse
{
	public static void main(String[] args) 
	{  
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the name: ");
		String name =sc.next();

		int len = name.length();

		String rev = "";

		for (int i =(len-1);i>=0 ;i-- )
		{
			rev = rev+name.charAt(i);
		}


		System.out.println(rev);
	}
}
