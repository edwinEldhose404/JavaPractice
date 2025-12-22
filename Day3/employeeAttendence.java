class employeeAttendence 
{
	public static void main(String[] args) 
	{
		int hours = 9;
		boolean marked = false;
		
		if (hours>8)
		{
			System.out.println("Present");
		} else if (hours>4)
		{
			System.out.println("Half Day");
		} else
		{
			System.out.println("Absent");
		}
			
		hours = 8;
		if (hours>8)
		{
			System.out.println("Present");
		} else if (hours>4)
		{
			System.out.println("Half Day");
		} else
		{
			System.out.println("Absent");
		}
		
		hours = 2;
		if (hours>8)
		{
			System.out.println("Present");
		} else if (hours>4)
		{
			System.out.println("Half Day");
		} else
		{
			System.out.println("Absent");
		}
		
		
	}
}
