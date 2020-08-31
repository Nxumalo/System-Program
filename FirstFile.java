import java.util.*;
import java.io.*;

public class FirstFile{

	public static void main(String[] args){
		String fileName="out.txt";
		PrintWriter outputStream=null;
		
		try{

			outputStream=new PrintWriter(fileName);

		}catch(FileNotFoundException e){
			System.out.println("Error pening file. Program exiting.");
			System.exit(0);
		}
		
		char exit='n';
		System.out.println("Please enter something.");	
			
		while(exit!='y' || exit!='Y'){		
			Scanner input=new Scanner(System.in);
			System.out.println("Enter yes to exit or n to continue.");	
			exit=(input.nextLine()).charAt(0);
			System.out.println("Please enter something.");
			String temp=input.next();
			outputStream.println(temp);
			
		}
			outputStream.close();
		
		

		}	

}
