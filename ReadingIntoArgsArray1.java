import java.util.Scanner;

//  A quick way to get data into a program is by reading it into the String array that appears as an argument in the
// main method, i.e. public static void main(String[] args)
// Note: However all values including numbers are stored as strings and can be converted using methods of the String class
//
// To run the program type;
// 	 java ReadingIntoArgsArray1 The cow jumped over the moon and 10 plus 8 is 18 end

public class ReadingIntoArgsArray1
{
	public static void main(String[] args)
	{	
		System.out.println("\n\n\nA demonstration of reading data from the command line into the String array args :\n");
		System.out.println("Enter a line consisting of text and numbers, where the last word in the line is the word end");
		System.out.println("Sample input: The cow jumped over the moon and 10 plus 8 is 18 end");

		int indx = -1;
		do{
			indx++;
			System.out.println(args[indx]);			// prints from the String arrays
		} while (!(args[indx].equals("end")));
	}
}