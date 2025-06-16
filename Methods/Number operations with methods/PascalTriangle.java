class PascalTriangle 
	{
    // Method to calculate factorial
    public static int fact(int num) 
		{

        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void main(String[] args) 
		{

        int n = 6; // Number of rows

        for (int i = 0; i < n; i++)
			{
            // Print spaces for alignment
            for (int space = 0; space < n - i - 1; space++) 
			{
                System.out.print("  ");
            }

            // Print Pascal's Triangle numbers
            for (int j = 0; j <= i; j++) 
			{
                System.out.print(fact(i) / (fact(j) * fact(i - j)) + "   ");
            }

            System.out.println(); // Move to next line
        }
    }
}
