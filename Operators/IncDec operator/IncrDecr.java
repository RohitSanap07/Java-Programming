import java.util.Scanner;
class IncrDecr 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a Number: ");
        int num = new Scanner(System.in).nextInt(); 
        int a = ++num; 
	    int b = ++num; 
	    int c = ++num; 
	    int d = num++; 
	    int e = ++num; 
	    int f = ++num; 

	    System.out.println("Number after increment: "+a); 
		System.out.println("Number after increment: "+b);
		System.out.println("Number after increment: "+c);
		System.out.println("Number after Decrement: "+d);
		System.out.println("Number after increment: "+e);
		System.out.println("Number after increment: "+f);
	}
}
