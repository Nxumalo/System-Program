import java.util.*;
import java.io.*;

public class Bins{


	public static void main(String[] args){
		String fileName="numbers.dat";
		ObjectInputStream inputStream=null;
		try{
			inputStream=new ObjectInputStream(new FileInputStream(fileName));
	
			int binf=inputStream.readInt();
			
			while(binf>=1){
				System.out.println(binf);
				binf=inputStream.readInt();
			}
			inputStream.close();
		}catch(FileNotFoundException e){
			System.out.println("Error opening file");		
			System.exit(0);
		}catch(IOException e){
			System.out.println("Well.....me no not");		
			System.exit(0);
		}
			

	}

}
