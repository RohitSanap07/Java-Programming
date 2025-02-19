import java.util.Scanner;
class AutomorphicNumber 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: "); 

		int num = sc.nextInt(); // number taken as input 

		int len =0; // Finding length of number

		int div=1; // To generate divisor div initially take as 1

		for (int i =num;i>0 ;i/=10 ) // Loop fetches last digit of number 
		
 		     len++; // length is calculating as it incrementing

			 for (int i = 1;i<=len ;i++ ) // This loop goes upto the length of digit

			 div *= 10; // divisor generate as div = div * 10

			 if (num ==(num*num)%div) // Original number and last digits are same then true
			 
			 System.out.println(num+" is Automorphic number");

			 else  // If not true then not automorphic

			 System.out.println(num+" is not Automorphic number");
  	}
}
