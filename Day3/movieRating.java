import java.util.Scanner;

class movieRating 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Rating 1[Poor]-4[Excellent] : ");
		int option = sc.nextInt();
		
		switch (option)
		{
		case 1:
			System.out.println("Poor");
			break;
		case 2:
			System.out.println("Average");
			break;
		case 3:
			System.out.println("Good");
			break;
		case 4:
			System.out.println("Excellent");
			break;
		default:
			System.out.println("Enter valid input");
		}
	}
}
