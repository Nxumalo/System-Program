import java.util.Scanner;

public class Example
{
	// Manipulating one dimensional arrays
	int[] array1 = {10, 20, 30, 40, 50, 60};
	int[] array2 = {100, 200, 300, 400, 500, 600}; 
	int[] array3 = new int[6];
	int[] array4 = new int[6];
	
	public void run()
	{
		int n = array1.length;
		for (int i=0; i < n; i++)
		{	array3[i] = array1[i] + array2[i];
			array4[i] = array1[n-i-1] + array2[i];
		}
		System.out.print("Array1 : ");
		for (int i=0; i < n; i++)
			System.out.print(array1[i]+"\t");
		System.out.println("\n\n");

		System.out.print("Array2 : ");
		for (int i=0; i < n; i++)
			System.out.print(array2[i]+"\t");
		System.out.println("\n\n");

		System.out.print("Array3 : ");
		for (int i=0; i < n; i++)
			System.out.print(array3[i]+"\t");
		System.out.println("\n");

		System.out.print("Array4 : ");
		for (int i=0; i < n; i++)
			System.out.print(array4[i]+"\t");
		System.out.println("\n");	
	}

	public static void main(String[] args)
	{

		Example1b objct1 = new Example1b();
		objct1.run();
	}
}	
