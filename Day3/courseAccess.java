import java.util.Scanner;

class CourseAccess 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter true or false");
		
		System.out.println("Paid fees?");
		boolean fees = scan.nextBoolean();
		
		System.out.println("Scholarship?");
		boolean scholar = scan.nextBoolean();
		
		System.out.println("Active course?");
		boolean active = scan.nextBoolean();
		
		if (fees && active)
		{
			System.out.println("Allowed");
		}
		else if(scholar && active)
		{
			System.out.println("Allowed(Scholarship)");
		}
		else
		{
			System.out.println("No access");
		}
	}
}
