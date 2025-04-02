import java.util.Scanner;
class AddMethod
{

   public static void main(String [] args)
	{
		 
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
	    int num1 = sc.nextInt();

		System.out.print("Enter number 2: ");
		int num2 = sc.nextInt();

	  	System.out.println("Addition is: "+add(num1,num2));
		

		 }

      public static int add(int a,int b)
      {
          
        System.out.println("Addtion of numbers"); 
        
        int add = a + b;
		return add;

      	
      	
     }

    

   }


