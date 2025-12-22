import java.util.Scanner;

class AccountStatus 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Balance:");
		int balance = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Flagged? (true/false)");
		boolean flagged = scan.nextBoolean();
		scan.nextLine();
		
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
