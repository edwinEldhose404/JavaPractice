import java.util.Scanner;

class capgemImportant3 
{
	public static void main(String[] args) 
	{
		//Leap Year

		//Any year is input by the user. Write a program to determine whether the year is a
		//Leap year or not

		//Leap Years are any year that can be evenly divided by 4.
		//A year that is evenly divisible by 100 is a leap
		//year only if it is also evenly divisible by 400.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year : ");
		
		int year = sc.nextInt();
		
		if (year%4 == 0)
		{
			if (year%100==0)
			{
				if (year%400==0)
				{
					System.out.println("Leap year");
				}
				else
				{
					System.out.println("Not a leap year");
				}
			}
			else
			{
				System.out.println("Leap year");
			}
		}
		else
		{
			System.out.println("Not a leap year");
		}
		
	}
}
