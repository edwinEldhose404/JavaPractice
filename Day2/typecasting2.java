import java.util.Scanner;

class Typecasting2 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		//Take byte input as int
		int x = (int)(scanner.nextByte());
		System.out.println(x);
		
		//Int as float
		float y = scanner.nextInt();
		System.out.println(y);
		
		//Float as int
		int z = (int)(scanner.nextFloat());
		System.out.println(z);
		
	}
}
