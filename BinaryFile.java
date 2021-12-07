import java.util.*;
import java.io.*;

public class BinaryFile{
	public static void main(String[] args){
		String fileName="numbers.dat";
	
		try{
			ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream(fileName));
			Scanner input=new Scanner(System.in);
			System.out.println("Please enter positive numbers: ");
			System.out.println("Enter a negative number when done.");
			int temp=input.nextInt();
		
			while(temp>=0){
				outputStream.writeInt(temp);
				System.out.println("Keep entering: ");
				temp=input.nextInt();
			}
			outputStream.close();
	
	
		}catch(FileNotFoundException e){
			System.out.println("Error opening file");
			System.exit(0);
		}catch(IOException e){
			System.out.println("Unaccounted error occured");
			System.exit(0);
	
		}
		
	}

}
