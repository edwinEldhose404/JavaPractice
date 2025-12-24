class loopsIntro 
{
	public static void main(String[] args) 
	{
		//Looping statements
		
		//initialization -> starting value & ending value
		//condition -> (>,>=,<,<=)
		//updation -> increment/decrement
		
		//do while
		
		boolean isFlag = true;
		int iter = 5;
		
		do
		{
			System.out.println("Hi this is a test");
			iter -=1;
			
			//Exit after iter becomes 2
			if (iter == 2)
			{
				isFlag = false;
				//System.exit(0);
			}
		}
		while (isFlag);
		
		while (true)
		{
			System.out.println("This is a while loop");
			System.exit(0);//this ends the program completely
		}
		
		//Infinite for loop
		//for( ; ; )
		//{
			//System.out.println("This is a infinte for loop");
		//}
	}
}
