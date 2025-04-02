class Pattern8
{
	public static void main(String[] args) 
	{
		int star = 16;

		for (int i = 0;i<star ;i++ )
		{
			for (int j =0;j<star ;j++ )
			{
               if (i==star/2||
				   j==star/2||
				   i==0&&j>star/2||
				   j==star-1&&i>star/2||
				   i==star-1&&j<star/2||
				   j==0&&i<star/2||
				   i==j||
				   i+j==star-1)
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
