import java.util.*;
import java.lang.*;
public class factorial
{
	public static void main (String[]args)
	{
		Scanner k = new Scanner(System.in);
		System.out.println("Enter the number of ur choice");
		int numbr = k.nextInt();
		for (int i = 0; i <= numbr; i++)
		{
			int result = (int)(Math.pow(numbr, i) - 1);
			System.out.println("result is:" + result);
		}
	}
}
