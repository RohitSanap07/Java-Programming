class PatternProgram8 
{
	public static void main(String[] args) 
	{
       
        int n = 6; 

        for (int i = n; i >= 1; i--) 
			{ 
          

            for (int space = 0; space < n - i; space++)
			{
                System.out.print(" ");
            }
            
            for (int j = 0; j < (2 * i - 1); j++) 
			{
                System.out.print("*");
            }

            System.out.println();
        }
    }
}





          
