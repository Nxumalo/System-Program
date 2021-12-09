import java.util.*;
import java.io.*;

public class FileThree{

	public static void main(String[] args){
	
		ArrayList<String> todo=new ArrayList<String>();
	
		Scanner input=new Scanner(System.in);
		String temp;
		System.out.println("Enter thy wishes");
		temp=input.nextLine();
		todo.add(temp);

		for(int i=0;i>todo.size();i++){
			System.out.println(todo.get(i));
		}

	}
}
