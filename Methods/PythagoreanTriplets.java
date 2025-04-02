import java.util.Scanner;
class PythagoreanTriplets
{
   
   public static void main(String [] args)
   {

   	Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter num 1: ");
   	int a = sc.nextInt();

   	System.out.print("Enter num 2: ");
   	int b = sc.nextInt();

   	System.out.print("Enter num 3: ");
   	int c = sc.nextInt();

   	System.out.println(isPythagoras(a, b, c) ? 
   		                            a + ", " + b + ", " + c + " is a Pythagorean Triplet" : 
                                    a + ", " + b + ", " + c + " is Not a Pythagorean Triplet");

   }

   public static boolean  isPythagoras(int a,int b,int c)
   {

   	int max = (a>b)?((a>c)?a:c):((b>c)?b:c);

	if (max==a) {
		return (max*max)==(b*b)+(c*c);
	}
	else if (max==b) {
		return (max*max)==(a*a)+(c*c);
	}
	else if (max==c) {
		return (max*max)==(a*a)+(b*b);
	}
	else{
		return false;
	}
	
  }
}