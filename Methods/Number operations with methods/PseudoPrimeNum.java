import java.util.Scanner;
class PseudoPrimeNum {

  public static void main(String[] args) 
	  
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Enter base: ");
        int a = sc.nextInt();
    

        System.out.println(isFermatPseudoPrime(n, a)?n + " is a Fermat Pseudo-Prime for base " + a:n + " is not a Fermat Pseudo-Prime for base " + a) ;
           
}

    public static boolean isFermatPseudoPrime(int n, int a)
	{
        if (n < 2 || isPrime(n)) return false; // Ignore prime numbers

        return Math.pow(a, n - 1) % n == 1;
    }

    public static boolean isPrime(int n) 
	{
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) 
		{
            if (n % i == 0) return false;
        }
        return true;
    }

}
