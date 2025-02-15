class TechNumber
{
	public static void main(String[] args) 
	{
		 int num = 2025, len = 0, div = 1;

		 for (int i = num;i>0 ;i/=10 )
		 
			 len++;

			 if (len%2==0)
			 {
				 for (int j =1 ;j<=(len/2) ;j++ )
				 {
					 div *=10;
                   }
					 int sum = (num/div)+(num%div);
					 int sqr = sum*sum;
					 System.out.println(sqr==num?num+ " is Tech number":num+" is not Tech number");
				 
			 }
				 else 
				 {
					System.out.println(num+" is not a Tech number");
				 }
			 }
		 }
	

