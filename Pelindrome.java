import java.util.*;
import java.io.*;

public class Pelindrome{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String ignore;
		char ans='y';

		while(ans=='y' || ans=='Y'){
			System.out.println("Enter line for test >>> ");
			String sentence=input.nextLine();
			//System.out.println("");
			if(pelindromeTest(sentence)){
				System.out.println("The above is indeed a pelindrome.");

			}
			else{
				System.out.println("The above is not a pelindrome.");
			}
			//System.out.println("");
			System.out.println("Would you like to enter another sentence (y/n)");
			ans=input.nextLine().charAt(0);
			//ignore=input.nextLine();
		}
	}
	public static boolean pelindromeTest(String a){

		String letters="";
		char aChar;

		for(int i=0;i<a.length();i++){
			aChar=Character.toUpperCase(a.charAt(i));
			if((int) aChar>='A' && (int) aChar<='Z'){
				letters=letters+aChar;
			}
		}
		if(letters.length()<=1){
			return true;
		}
		else{

			String temp=letters.substring(1,letters.length()-1);
			return(letters.charAt(0)==letters.charAt(letters.length()-1) && pelindromeTest(temp));
			}
		}

	

}
