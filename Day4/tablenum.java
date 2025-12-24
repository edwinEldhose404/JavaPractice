import java.util.Scanner;

class tablenum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for (int i = 2 ; i<a;i++)
		{
			System.out.println((i*a)+" ");
		}
	}
}
