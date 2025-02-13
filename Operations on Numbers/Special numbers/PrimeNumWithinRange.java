import java.util.Scanner;
class PrimeNumWithinRange 
{
public static void main(String[] args) 
	{
		 System.out.print("Enter a number: ");

		 int start = new Scanner(System.in).nextInt();
          
		 int prime = 1;

		 for (int i = 1;i<=start;i++ )
		 {
			 if (i<2)
			 {
				 continue;
             }

			 boolean isPrime = true;

		   for (int j =2 ;j<i ;j++ )
		   {
			   if (i%j==0)
			   {
				   isPrime = false;
				   break;
			   }
		   }
		   
			   if (isPrime)
			   {
				   System.out.println(prime+" : "+i+"  ");
				   prime++;
			   }
		   
		   
		 }
		 
	}
}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
