class ForLoopEvenNum 
{
	public static void main(String[] args) 
	{	
           
		int num = 1; // Number starts with 1

        // (initialization) i starts with 1
		// (Condition) i goes upto less than equal to 100
		// (Update) i increment
		for (int i = 1; i<=100 ; i++) 
		{

		if (i%2==0) // Condition to check even number 
		{
		   System.out.println((num++)+":"+i);
		}

		}
	}
}
