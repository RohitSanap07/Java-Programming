class CoprimeNum
{
	public static void main(String []args)
   {

   	System.out.println(isCoprime(19,12));

   }

   public static int hcf(int n1 ,int n2)
   {

   	int min = n1<n2?n1:n2;

    while(true)
    {
    	if (n1%min==0 && n2%min==0)
    	{ 
    		System.out.println(min);
    		return min;
    	}
          min--;
    }



   }

   public static boolean isCoprime(int n1,int n2)
   {

   	  return hcf(n1,n2)==1;
   	}




}
