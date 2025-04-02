import java.util.Scanner;
class Method1
{
	public static void main(String []args)
  {
	
	System.out.println(isKrishnamurti(145));

  }

  	 public static boolean isKrishnamurti (int num)//145
	  {

		int sum =0;

		for (int i=num;i!=0 ;i/=10 )
		{
			int last = i%10;
			sum = sum + factorial(last);
		}
		return num == sum;
	  }
  
   public static int factorial (int digit)
	  {

	   int fact = 1;

	   for (int i= digit;i>0 ;i-- )
	   {
		   fact = fact*i;
	   }

	     return fact;
	  }
}