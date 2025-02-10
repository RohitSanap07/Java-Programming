import java.util.Scanner;
class CharacterAtPosition 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a name: ");

		String name = sc.next();

		System.out.print("Enter position: ");

		int position = sc.nextInt();

        int len = name.length();

		String dup = name;

		String rev = "";

        if (position<=(len-1))
        {
			System.out.println(name.charAt(position));
        }
		else 
		{
			System.out.println("Enter the length in range ");
		}

		for (int i = (len-1);i>=0 ;i-- )
		
            rev += name.charAt(i);
		
	    System.out.println(rev);

		if (name.equals(rev))
		{
			System.out.println("Name is palindrome");
		}
		else 
			System.out.println("Name is not palindrome");
	}
}
