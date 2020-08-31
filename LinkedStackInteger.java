import java.util.*;
/**

<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>

This class creates a stack of objects. It as a couple of methods which will be used to manipulate the objects. It also creates an object of type node which is a seperate class.
*/

public class LinkedStackInteger {
	
	
	
	private SNodeInteger top;					//creates new top of type SNodeInteger
	
/**
This is the constructor method for the class. It sets top to null
*/	
	public LinkedStackInteger(){
		top=null;						//sets top to null
	
	}

	
/**
This method gets the lenght og th stack. It uses iteration for counting 
@return count which is the lenght of the stack
*/
	public int getHeight(){
	
		int count=0;						//sets count to 0
	
		SNodeInteger position = top;				//sets position to top
		
		while(position !=null){					//iterates through the stack
			count++;					//increment count
			position=position.getLink();			//sets new position
	
		}
		return count;						//returns count
	}
	
	
/**
This method checks to see if the stack is empty.
@return true if stack is indeed empty
@return false if stack is not empty
*/	
	public boolean isEmpty(){
		SNodeInteger exist=top;					//sets exit to top
		if(exist==null){
			System.out.println("Stack is empty");
			return true;					//if stack is empty, returns true
		}
		else{
			System.out.println("Stack not empty");
			return false;					//if stack is not empty, returns false
		}
	}
/**
This method adds objects to the stack
@param addData which is the object to be added
*/	
	public void push(Integer addData){
	
		top=new SNodeInteger(addData, top);			//adds new object
	
	}
	
/**
This method deletes objects from stack but deletes the object at head of stack
*/	
	public void pop(){
		if(top !=null){
			top=top.getLink();				//changes the stack head link
		}
		else{
			System.out.println("Calling from an empty list.");
			System.exit(0);
		}
	}
	
/**
This method return the object at the head of the stack
@return headd which is the head of the stack
*/
	public Integer head(){
		Integer headd=top.getData();				//sets headd
		System.out.println(headd);
		return headd;						//returns headd
	}
/**
This method displays the objects in the stack
*/
	public void display(){
		
		SNodeInteger focus=top;						//sets focus
		while(focus != null){	
			
			System.out.println(focus.getData());
			focus = focus.getLink();				//sets new focus
		}
	
	}
	

}
