class NumToWord 
{
	public static void main(String[] args) 
	{
		int num = 123;

		int rem = num%10;
		String str = "";

       while(num>0)

		   switch (rem)
		   {
		   case 1: str += "one";
		   break;

		   case 2: str += "two";
           break;

		   case 3: str += "three";
		   break;

		   case 4: str += "four";
           break;

		   case 5: str += "five";
		   break;

		   case 6: str += "six";
           break;

		   case 7: str += "seven";
           break;

           case 8: str += "eight";
           break;

		   case 9: str += "nine";
           break;
           
		   case 0: str += "zero";
           break;

		   }
        
		num++;

       
		   System.out.print(num);
       
		
        

	}
}
