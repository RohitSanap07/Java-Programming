import java.util.Scanner;
class RajaSoft 
{
	public static void main(String[] args) 
	{
     
       System.out.print("Enter the number: "); // Take number as input

	   int num = new Scanner(System.in).nextInt();

	   int pprime = 0; // Initially previous prime is 0
	   int nprime = 0; // Initially next prime is 0

       // (Initialization) i is num-1
	   // (Condition) i goes until less than equal to 2
	   // (Update) i decrement by 1
	   for (int i = num -1;i>=2 ;i-- )
	   {
	     boolean flag = true; // Assume number is prime with flag

       // (Initialization) j is 2
	   // (Condition) j is less than i
	   // (Update) j increment
	   for (int j = 2;j<i ;j++ )
	   {
		 if(i/j==0) // If i divide by j is 0
	     {
		 flag = false; // Flag is false
		 break; // Break the execution
	   }	    
	   }

	   if(flag)
	   {
       pprime = i; 
	   break;
	   }
}
      
	  // (Initialization) i is num+1
	  // (Condition) true
	  // (Update) i is increment by 1
      for (int i = num+1; ;i++ )
      {
	  boolean flag = true; // Flag consider as true

	  // (Initialization) j is 2
	  // (Condition) j is less than i
	  // (Update) j is increment by 1
	  for (int j = 2;j<i ;j++ )
	  {
		if (i%j==0) // If i divide by j is 0
	  {
		flag = false; // Flag is false
		break;
	  }
	  }

	  if (flag) 
	  {
		 nprime = i; 
		 break;
	  }
  }

      if (num-pprime<nprime-num) 
	  {
	  System.out.println(pprime+" "+num);
      }
	  else if (num-pprime>nprime-num)
	  { 
      System.out.println(num+" "+nprime);
	  }
	  else 
	  { 
	  System.out.print(pprime+" "+num+" "+nprime);
	  } 

}
}