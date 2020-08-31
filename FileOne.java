import java.io.*;
import java.util.*;


public class FileOne{

	

	public static void main(String[] args){
		
		String fileName="out.txt";
		Scanner inputStream=null;
	
		try{
	
			inputStream=new Scanner(new File(fileName));
		}catch(FileNotFoundException e){
			System.out.println("Error opening file. Program exiting.");
			System.exit(0);
		}

		while(inputStream.hasNextLine()){
			System.out.println(inputStream.nextLine());


		}

		inputStream.close();


	}


}
