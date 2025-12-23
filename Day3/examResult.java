import java.util.Scanner;

class examResult 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int marks = sc.nextInt();
		
		if (marks>40)
		{
			System.out.println("Passed with : ");
			if (marks>80)
			{
				System.out.println("A");
			}
			else
			{
				System.out.println("B");
			}
		}
		else
		{
			System.out.println("Failed");
		}
	}
}
