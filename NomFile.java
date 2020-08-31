import java.util.*;
import java.io.*;

public class NomFile{


	public static void main(String[] args){
		String fileName="out.txt";
		PrintWriter outputStream=null;

		try{
			outputStream=new PrintWriter(fileName);
	
		}catch(FileNotFoundException e){
			System.out.println("Error opening file...");
			System.exit(0);

		}
		char now='y';
		String ans;
		while(now=='y' || now=='Y'){
			Scanner input=new Scanner(System.in);
			System.out.println("Enter a sentence: ");
			String temp=input.nextLine();
			outputStream.println(temp);
		
			System.out.println("Would you like to add more stuff? (y/n)");
			ans=input.nextLine();
			now=Character.toUpperCase(ans.charAt(0));
			
		}

		outputStream.close();
		}






}
