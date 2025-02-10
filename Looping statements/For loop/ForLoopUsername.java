import java.util.Scanner;
class ForLoopUsername

{
	public static void main(String[] args) 

		throws InterruptedException 
	{
       
	   Scanner sc = new Scanner(System.in);
	
	   System.out.println("Enter your name: ");
 
       // Take input as name and convert to uppercase
	   String un = sc.next().toUpperCase(); 

	   int len = un.length(); // Find length of character

	   for (int i = 0;i<len ;i++ )
	   {
		   System.out.println(un.charAt(i));

		   Thread.sleep(1000); // Time take to print two letters 
	   }
	}
}
