import java.util.Scanner;
class BeautifulNum {

    public static void main(String[] args)
	{

     Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the number : ");
	 int input = sc.nextInt();

     System.out.println(beautiful(input)); 
	 
    }

    public static boolean beautiful(int num) 
	{
        // If the number is divisible by 3 or 5, return true
        if (num % 3 == 0 || num % 5 == 0) {
            return true;
    }

        // Check if the number contains digit 3 or 5
        while (num > 0) {
            int rem = num % 10; // Get last digit
            if (rem == 3 || rem == 5)
			{
            return true;
            }
            num /= 10; // Remove last digit
        }

        return false; // If none of the conditions match
    }
}
