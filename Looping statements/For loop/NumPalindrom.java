import java.util.Scanner;
class NumPalindrom
{
	public static void main(String[] args) 
	{
		
	   System.out.print("Enter a number : ");

       int num = new Scanner(System.in).nextInt(); // Enter the number 

	   int dup = num; // Number stores in dup variable 

	   int rev = 0; // Initially reverse number is 0 
	  
	  // (Initialization) Loop start with number 
	  // (Condition) iterate until number is less than 0
	  // (Updation) after every iteration number divide by 10 so last digit is removing from number
	   
       for ( int i = num; i>0 ; i /=10 )  
	   {
			
	      rev =(rev*10 )+i %10; // Condition to reverse number
				
	   }

	   System.out.print(" reverse num : "+ rev +"  original num :" + dup);

	   if (dup == rev)
		 {
			 System.out.print("\n Number is a palindrome number");
		 }
		 else
		   {
			System.out.print("\n Number is not palindrome number");
		   }
	

		System.out.println("\n THANK YOU");
	}
}
