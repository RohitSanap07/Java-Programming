import java.util.Scanner;
class SpyNumber
	{
    public static void main(String[] args) 
		{
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = sc.nextInt();

		int dup = num;

        int sum = 0, product = 1, rem;

        while (num > 0) {
            rem = num % 10;
            sum += rem;
            product *= rem;
            num /= 10;
        }

        if (sum == product) {

            System.out.println(dup+" is a Spy Number.");
        } 
		 
		else {
            System.out.println(dup+ " is not a Spy Number.");
        }
    }
}
