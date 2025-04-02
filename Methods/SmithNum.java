class SmithNum 
{
    public static void main(String[] args)
    {
        int num = 666;

        // Sum of digits of the number
        int sum1 = sum(num);

        // Sum of digits of prime factors
        int sum2 = sumOfPrimeFactorsDigits(num);

        System.out.println((!isPrime(num) && sum1 == sum2)?num+" is smith number":num+" is not smith number"); 
        
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num)
    {
        if (num < 2) 

        return false;

        for (int i = 2; i<= num; i++) 
        {

        if (num % i == 0)
            return false;
        }

        return true;
    }

    // Function to calculate sum of digits of a number
    public static int sum(int num) 
    {
        int sum = 0;

        while (num > 0) 
        {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Function to calculate sum of digits of prime factors
    public static int sumOfPrimeFactorsDigits(int n)
     {
        int sum = 0;
        int factor = 2;
        
        while (n > 1) 
        {
            while (n % factor == 0) 
            {
                sum += sum(factor);  // Sum of digits of the prime factor
                n /= factor;
            }
            factor++;
        }
        return sum;
    }
}
