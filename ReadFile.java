import java.util.*;
import java.io.*;

public class ReadFile{

	
	public static void main(String[] args){
		Scanner inputStream=null;
		String fileName="out.txt";
		
		try{
			inputStream=new Scanner(new File(fileName));
		}catch(FileNotFoundException e){
			System.out.println("Error opening file.");
			System.exit(0);
	
		}
		System.out.println("Now we opening");
		int i=0;
		System.out.print("Date \t Quantity \t Name \n");
		while(inputStream.hasNextLine()){
			String temp=inputStream.nextLine();
			String arr[]=temp.split(",");
			i++;
			
			for(int k=0;k<arr.length;k++){
				System.out.print(arr[k]+"\t");
			}
			System.out.println("");
		}
		inputStream.close();
	}









}
