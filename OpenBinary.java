import java.util.*;
import java.io.*;

public class OpenBinary{

	
	public static void main(String[] args){
		String fileName="numbers.dat";
		
		try{
			ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(fileName));
		
			int temp=inputStream.readInt();
			while(temp>=0){
				System.out.println(temp);
				temp=inputStream.readInt();

			}
			inputStream.close();

		}catch(FileNotFoundException e){
			System.out.println("Error opening file.");
			System.exit(0);
	
		}catch(IOException e){
			System.out.println("Unaccounted error occured.");
			System.exit(0);
	
		}


	}












}
