class NumberPattern1
	{
    public static void main(String[] args) 
	{
        int n = 5; 
        int num = 1;

        for (int i = 1; i <= n; i++) 
		{
            int temp = num + i - 1; 

            for (int j = 0; j < i; j++) 
		{
                System.out.print(temp-- + " ");
            }

            num += i;
            System.out.println();
        }
    }
}
