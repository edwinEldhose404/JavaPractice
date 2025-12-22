class AccountStatus 
{
	public static void main(String[] args) 
	{
		double balance = 40000;
		boolean flagged = false;
		
		if (balance>=10000 && flagged == false)
		{
			System.out.println("Active");
		} else if (balance<10000)
		{
			System.out.println("Low Balance");
		} else 
		{
			System.out.println("Flagged");
		}
		
		flagged = true;
		if (balance>=10000 && flagged == false)
		{
			System.out.println("Active");
		} else if (balance<10000)
		{
			System.out.println("Low Balance");
		} else 
		{
			System.out.println("Flagged");
		}
	}
}
