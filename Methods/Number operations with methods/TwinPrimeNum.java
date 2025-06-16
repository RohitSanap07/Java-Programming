class TwinPrimeNum {
    
    public static void main(String[] args) {
        int n = 50; // Find twin primes up to this number

        System.out.println("Twin Primes up to " + n + ":");
        for (int i = 2; i <= n - 2; i++) {
            if (isPrime(i) && isPrime(i + 2)) {
                System.out.println("(" + i + ", " + (i + 2) + ")");
            }
        }
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
