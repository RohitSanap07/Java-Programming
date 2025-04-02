class PatternProgram9
	{
    public static void main(String[] args)
		{
        int n = 5; // Number of rows for the triangle

        // Upper triangle (right-angled, facing right)
        for (int i = 1; i <= n; i++)
		{
            // Print spaces
        for (int j = i; j < n; j++) 
			{
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= i; j++) 
			{
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower triangle (inverted right-angled, facing right)
        for (int i = n - 1; i >= 1; i--) 
			{
            // Print spaces
            for (int j = i; j < n; j++)
			{
                System.out.print("  ");
            }
            // Print stars
            for (int j = 1; j <= i; j++)
			{
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
