import java.util.Scanner;

class divNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int fin = 0;
		
		for (int i = a ; i>=b;i-=b)
		{
			System.out.println(i);
			fin++;
		}
		System.out.println("---"+fin+"---");
	}
}

