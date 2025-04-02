class Pattern7
{
	public static void main(String[] args) 
	{
		int star = 16;

		for (int i = 0;i<star ;i++ )
		{
			for (int j =0;j<star ;j++ )
			{
               if (i==j||i+j==star-1||i==star/2||j==star/2)
               {
				   System.out.print("*"+" ");
               }
			   else
				   System.out.print(" "+" ");
             }
			 System.out.println();
		}
			
			
		
	}
}
