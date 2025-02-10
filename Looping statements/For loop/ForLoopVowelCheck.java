import java.util.Scanner;
class ForLoopVowelCheck 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter name: ");

		String name = new Scanner(System.in).next(); // Take name as input

        int len = name.length(); // Find out length of name 

        // (Initialization) i is 0 
		// (Condition) Loop goes until i reaches length -1
		// (Updation) i increment 

		for ( int i = 0 ; i<=len-1 ; i++ ) 
		{
			
		char ch = name.charAt(i); // Character store at ch with alphabet
		
		// If character fetches is a,e,i,o,u then vowel print
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')  
		{
            System.out.println(name.charAt(i)+" "); 
		}

	}
  }
}
