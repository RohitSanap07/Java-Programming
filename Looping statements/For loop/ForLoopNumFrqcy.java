class ForLoopNumFrqcy
{
	public static void main(String[] args) 
	{
		Long num = 3456765432345l;

        System.out.println(num);

      	for (int i = 0;i<=9 ;i++ )
		{

		int cnt = 0; 

		}

		for (Long j = num;j>0 ;j/=10 )
		{ 
                
		Long rem = j%10;

		if (i==rem)

		{

		cnt ++;

		}
		}

		if (cnt != 0)
		System.out.println(i+" : "+cnt);

		{
		}
		}
	}
}
