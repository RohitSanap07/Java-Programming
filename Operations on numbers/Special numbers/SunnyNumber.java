import java.util.Scanner;
class SunnyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        double sqrt = Math.sqrt(num + 1);

        if (sqrt == (int) sqrt) {

            System.out.println(num + " is a Sunny Number.");

           }
	    
		else {
            System.out.println(num + " is not a Sunny Number.");
        }
    }
}
