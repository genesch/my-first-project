import java.util.Scanner;

public class HelloWorld
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = in.nextLine();
		System.out.println("Hello " + name + "!");
	}
}