import java.util.Scanner;

class alphaToNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		num += 64;
		
		char x = (char) num;
		
		System.out.println(x);
		
	}
}
