class Pattern5
{
	public static void main(String[] args) 
	{
		int star = 12;

		for (int i = 0;i<star ;i++ )
		{
			for (int j =0;j<star ;j++ )
			{
               if (i==0||j==0||i==star-1||j==star-1||i==j||i+j==star-1)
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