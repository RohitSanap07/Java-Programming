import java.util.Scanner;
class EmirpNumber 
{
	public static void main(String[] args) 
	{
		
	   System.out.print("Enter a number: ");
       int num = new Scanner(System.in).nextInt(); 

	   int dup = num;

	   int cnt = 0 , rev =0 , revcnt = 0;
	   
	   for (int i = 2;num>i ;i++ )
	   {
		   if (num%i==0)
		   {
			   cnt++;
		   }
	      
	   }

	   System.out.println((cnt==0)?num+" is prime":num+" is not prime");

       for ( ;num>0 ;num/=10 )
       {
	       int rem = num%10;
	       rev = rev*10+rem;
       }
   

      for (int j =2 ;rev>j ;j++ )
      {
	   if (rev%j==0)
	   {
          revcnt++;
	   }
  }

	   System.out.println((revcnt==0)?rev+" is prime":+rev+" is not prime");
   

       if (cnt==revcnt)
       {
	   System.out.println("Numbers are Emirp");
       }

       else {
	   System.out.println("Numbers are not Emirp");
       }

   }

}