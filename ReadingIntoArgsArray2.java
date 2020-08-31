import java.util.Scanner;

//  A quick way to get data into a program is by reading it into the String array that appears as an argument in the
// main method, i.e. public static void main(String[] args)
// Note: However all values including numbers are stored as strings and can be converted using methods of the String class
//
// To run the program type;
// 	 java ReadingIntoArgsArray2  12.5 34.6 89.0 .

public class ReadingIntoArgsArray2
{
	public static void main(String[] args)
	{	
		System.out.println("\n\n\nA demonstration of reading data from the command line into the String array args :\n");
		System.out.println("Enter a number of real numbers separated by spaces. End the line with a period (.)");
		System.out.println("Sample input: 12.5 34.6 89.0 end");

		double[] numbr = new double[100];

		int indx = -1;
		String wrd;
		double sum = 0.0;

		do{
			indx++;
			wrd = args[indx].trim();			// prints from the String arrays
			if (!(wrd.equals(".")) )
				numbr[indx] = Double.parseDouble(wrd);			
		} while (!(args[indx].equals(".")));

		for (int i=0; i<indx-1; i++)
		{	sum = sum + numbr[i];			
			System.out.println(numbr[i]);
		}
		double average = sum /(indx-1);

		System.out.println("The sum of the numbers is equal to "+sum);
		System.out.println("The average of the numbers is equal to "+average);
	}
}