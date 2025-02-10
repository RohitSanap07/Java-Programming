import java.util.Scanner;
class ForLoopFactorPrime 
{
	public static void main(String[] args) 
	{
     
	  System.out.print("Enter a number: ");

      int num = new Scanner(System.in).nextInt(); // Take number as input

	  int cnt =0; // cnt initially 0
      
	  // (Initialization) i is starts from 1
	  // (Condition) i goes upto less than num
	  // (Update) i is increment
	  for(int i = 1;i<num;i++)

	  if(num%i==0)
           
	  cnt++;

	  System.out.println(cnt==0?num+" is a prime":num+ " is not prime");
	
      System.out.print("Factors for number is :"+cnt);
  
  
  }
}
