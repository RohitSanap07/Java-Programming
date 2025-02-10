import java.util.Scanner;
class CharPalindrom
{
	public static void main(String[] args) 
	{

	   System.out.print("Enter your name : ");

       String name= new Scanner(System.in).next().toUpperCase(); //Enter the name

	   System.out.print("Enter the num : ");

	   int num = new Scanner(System.in).nextInt(); // 

	   String dup = name; 

	   String rev ="";

	   int len = name.length(); // Finding length of name 

		if (num<=(len-1))
		{
			System.out.print("Character at "+num+ " is : "+name.charAt(num)); // To find character at a entered place
			
		}

		else 

		{
			System.out.println("Enter the Num in the range of name ");
		}

	    for ( int i = (len-1); i>=0 ; i-- ) 
             
		    // (initialization)i = character lenght-1;(condition)length less than equal to 0 i.e i>=0
			// (Updation)length is decrement by one at each iteration i.e i-- 

	    {
		    rev += name.charAt(i); // In rev reverse letter is added which store in i 
		}

	         System.out.print(" reverse name : "+ rev +"  original name :" + dup);

	    if (dup.equals(rev)) // Checking original name and reverse name is same or not
		 {
			 System.out.print("\n Name is a palindrome."); // Name = Reverse then name is palindrome
		 }

	    else
		 {
			System.out.print("\n Name is not palindrome."); // Name != Reverse then name is not palindrome
		 }
	
            System.out.println("\n THANK YOU");
	}
}
