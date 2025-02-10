import java.util.Scanner;
class ProductNum
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number:"); // Enter 3 digit number

		int num = sc.nextInt();
		int pro = 1;  // For finding product it initially declare as 1 
		int dup = num;

        int rem = num%10;  // To seperate last digit
        pro = pro*rem;     // Product of pro and remainder store in pro
	    num = num/10;      // Eliminate last digit from number

		rem = num%10;
		pro = pro*rem;
		num = num/10;

		rem = num%10;
		pro = pro*rem;

		System.out.println(pro);
   }
}
