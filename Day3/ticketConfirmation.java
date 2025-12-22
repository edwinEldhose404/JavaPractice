import java.util.Scanner;

class ticketConfirmation 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1 for AvailableSeats, 2 for RAC and 3 for Cancel");
		int ticket = scan.nextInt();
		
		switch (ticket)
		{
		case 1:
			System.out.println("Ticket booked");
			break;
		case 2:
			System.out.println("Waitlist");
			break;
		case 3:
			System.out.println("Cancelled");
			break;
		default:
			System.out.println("Enter valid input");
		}
	}
}
