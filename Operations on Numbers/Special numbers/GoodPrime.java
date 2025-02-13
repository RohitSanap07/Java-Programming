import java.util.Scanner;
class GoodPrime 
{
	public static void main(String[] args) 
	{
		 System.out.print("Enter a number: ");

		 int start = new Scanner(System.in).nextInt();
          
		 int prime = 0;

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

		 System.out.println(i);

				 
			   
		   

		     if (isPrime)
		     {
			 boolean isPrime1 = true;
				 
				 for (int m= i;m>0 ;m/=10 )
				 {
					 int rem = m%10;
					 if (rem<2)
					 {
						 isPrime1 = false;
						 break;
					 }
					 for (int k =2;k<rem ;k++ )
					 {
						 if (rem%k==0)
						 {
							 isPrime1=false;
							 break;
						 }
					 }
				 }
				 if (isPrime1)
				 {
					 
					 prime++;
				 }
		     }

			  }
		 }

			  System.out.print("Count of good prime number: "+prime);
			  
					 }
				 }
			  

		 
		 
	

