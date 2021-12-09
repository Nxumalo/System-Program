import java.io.*;
import java.util.*;
/**

<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>

This class checks an algebra entered by user to see if the number of oppening brckets match the number of clossing brackests. If it does not match, it identifies the extra, unclosed or unopened brackets and tells the user where these brackets exist.
*/
public class MatchParenthesis {
	
	public String strng;						//sets new string strng
	public String temp;						//sets new string temp
	public char chr;						//sets new char chr


/**
This method takes in the user's input as a string. It converts the string input to a char type and stores it in a stack.
*/	
	public void input(){
	
		LinkedStack <Character> array=new LinkedStack<Character>();		//declared new Character stack

		Scanner input=new Scanner(System.in);
		System.out.println("Please provide your algebra: ");
		strng=input.next();							//sets strng
	
		for(int i=0;i<strng.length();i++){					//loops through string 
			temp=strng.substring(i,i+1);				//extracts the string one by one
			if(temp.equals("(") || temp.equals(")")){	
				chr=temp.charAt(0);				//stored the extracted as char
				array.push(chr);
			}
										//stores the char into stack
		}
		
		array.display();
		array.getHeight();
		System.out.println("");
	}
	
	public void compute(){
			
	
	}
	public static void main(String[] args){
			MatchParenthesis a=new MatchParenthesis();
			a.input();

	
	}





}
