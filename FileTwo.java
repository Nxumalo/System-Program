import java.io.*;
import java.util.*;

public class FileTwo{

	public static String fileName="out.txt";
	public static Scanner inputStream=null;

	public static void main(String[] args){
		try{
			inputStream=new Scanner(new File(fileName));
		}catch(FileNotFoundException e){
			System.out.println("Error opening file....program exiting");
			System.exit(0);
		}

		while(inputStream.hasNextLine()){
			String temp=inputStream.nextLine();
			System.out.println(temp);
		}
		inputStream.close();
	}


}
