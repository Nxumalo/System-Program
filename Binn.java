import java.util.*;
import java.io.*;

public class Binn{
	
	public static void main(String[] args){

		String fileName="numbers.dat";
		ObjectOutputStream outputStream=null;	
	
		try{
			outputStream=new ObjectOutputStream(new FileOutputStream(fileName));



		
		
		Scanner input=new Scanner(System.in);	
		System.out.println("Enter the numbers>>>>> ");	
		int tem=input.nextInt();
		//outputStream.writeInt(tem);

		do{

	 	
			System.out.println("Keep entering>>>>> ");
			tem=input.nextInt();
			outputStream.writeInt(tem);
		
		}while(tem>=1);

		outputStream.close();
	
		}catch(FileNotFoundException e){
			System.out.println("Error opening file");
			System.exit(0);

		}catch(IOException e){
			System.out.println("Well I tried");
			System.exit(0);
		}

	}

}
