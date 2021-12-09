import java.util.Scanner;

public class GenerateTheAlphabet
{
	public void run()
	{
		oneWayOfGeneratingTheAlphabet();
		aSecondWayOfGeneratingTheAlphabet();
	}

	public void oneWayOfGeneratingTheAlphabet()
	{
		int k = 0;
		for (char ch = 'A'; ch <= 'Z'; ch++,k++)
			System.out.print(ch+" ");
		
		System.out.println("\n\n");
	}

	public void aSecondWayOfGeneratingTheAlphabet()
	{
		for (int i=0; i < 26; i++)
		{
			char ch = (char) ('A' + i);
			System.out.print(ch+" ");
		}
		System.out.println("\n\n");
	}
	
	public static void main(String[] args)
	{	GenerateTheAlphabet objct1 = new GenerateTheAlphabet();
		objct1.run();
	}
}
