import java.util.*;
import java.io.*;

public class TodoList{

	public static void main(String[] args){
		ArrayList<String> todo=new ArrayList<String>();
		
		Scanner temp=new Scanner(System.in);
		boolean done=false;

		while(!done){
			System.out.println("Enter items to add: ");
			String tem=temp.nextLine();
			todo.add(tem);
			System.out.println("Is the list full? ");
			tem=temp.nextLine();
			if(!tem.equalsIgnoreCase("no")){
				done=true;
	
			}
				



		}		
		int len=todo.size();
		for(int i=0;i<len;i++){
			System.out.println(todo.get(i));
	
		}
	}

}
