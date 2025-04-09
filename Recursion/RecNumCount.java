class RecNumCount 
{
	public static void main(String[] args) 
	{
		System.out.print(count(123904,0));
	}

	public static int count(int num,int cnt)
	{
		if (num==0)
		{
			return cnt;
		}

		return count(num/10,++cnt);

	  //return num==0?cnt:count(num/10,++cnt);
	}
}
