class loops2 
{
	public static void main(String[] args) 
	{
		int in = 1234;
		int fin = 0;
		int multi = 1000;
		int div = 10;
		int temp = 0;
		
		for (int i=1;i<=4;i++)
		{
			temp = in%div;
			fin += temp*multi;
			if (in>=10)
			{
				in = (in-temp)/10;
			}
			multi /= 10;
			
		}
		System.out.println(fin);
	}
}
