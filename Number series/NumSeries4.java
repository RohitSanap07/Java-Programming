// Print the series 79,108,139,176,217,260
class NumSeries4 
{
	public static void main(String[] args) 
	{
		int start = 79;

		 for (int i =128;i<=50 ;i++ )
		 {
			 boolean flag = true;
			 for (int j =2 ;j<i ; j++)
			 {
				 if (i%j==0)
				 {
					 flag = false;
					 break;
				
				}
			 }
			 if (flag)
			 {
				 System.out.print(start+" ");
				 start +=i;
			 }
		 }

	}
}
