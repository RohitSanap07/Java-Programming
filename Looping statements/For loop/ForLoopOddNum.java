class ForLoopOddNum 
{
	public static void main(String[] args) 
	{
        
		int num = 1;
        
		// Printing odd number of 1 to 100 
		// (Initialization) i is 100
		// (Condition) until i greater than 1
		// (Updation) i decrement with i--
   		for (int i = 100; i>=1; i-- )
		{
			if (i%2==1) // After dividing number by 2 if mod is 1 then odd
			{
				System.out.println((num++)+" : "+i);
			}
		}
	}
}
