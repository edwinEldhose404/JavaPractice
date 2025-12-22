
import java.util.Scanner;

class ScannerIntro 
{
	public static void main(String[] args) 
	{
		//Steps
		//import java.util.Scanner
		Scanner scanner = new Scanner(System.in);
		
		//In-built methods of scanner
		//nextByte(),nextShort(),nextInt()...,next()[for just one word]
		//nextLine()[for a line of words],next().charAt(*index)
		//Don't use the last three in conjunction as it causes problems with input
		
		//Take inut for below line as "123 Cherry Drive"
		int input = scanner.nextInt();
		System.out.println(input);
		scanner.nextLine();//Dummy line
		//Without this line, the below line will automativally return 
		//" Cherry Drive" without asking for input
		
		String input2 = scanner.nextLine();
		System.out.println(input2);
		
		//To prevent resource leaks which are caused by classes:
		scanner.close();
	}
}
