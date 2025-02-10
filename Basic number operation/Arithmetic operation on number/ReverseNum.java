import java.util.Scanner;
class ReverseNum 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:"); //Enter 3 digit number 

		int num = sc.nextInt(); 
		int dup = num;
		int rev = 0;

		int rem = num%10;  // by doing % 10 last digit is separeted from 3 digits 
		rev = rev*10+rem;  // logic for reversing
		num = num/10;      // With doing / 10 last digit remove from 3 digit

		rem = num%10;      // again last place digit comes as remainder by doing % 10
		rev = rev*10+rem;  // same logic used to reverse 
		num = num/10;      // last digit removed again

		rem = num%10;      // again last place digit comes as remainder by doing % 10
		rev = rev*10+rem;  // same logic used to reverse 

		System.out.println(rev);
   }
}
