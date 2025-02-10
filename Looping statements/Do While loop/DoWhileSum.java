class  
{
	public static void main(String[] args) 
	{

        int sum = 0; // Sum is 0 initially
		int	num = 1; // Num starts from 1

        do {
            sum += num; // Num is adding in sum
            num++; // Num updating 
        } while (num <= 10); // Number goes upto less than equal to 10

        System.out.println("Sum of first 10 natural numbers: " + sum);
  
	}
}
