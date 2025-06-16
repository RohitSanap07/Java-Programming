import java.util.Scanner;
class PrimeInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        
		System.out.print("Enter start number: ");
		int start = sc.nextInt();

		System.out.print("Enter end number: ");
		int end = sc.nextInt();

	   
	    for (int i = start;i<=end ;i++)
	    {

              if (isPrime(i))
              {
				  System.out.println(i);
              }
	    }
	}

    public static boolean isPrime(int num)
	{
		int den = 2;

		for (;den<num ;den++ )
		{
			if (num%den==0)
			{
				return false;
			}
		}
		   return true;
	}
}
