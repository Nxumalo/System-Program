import java.util.*;
/**

<p>Author:  Fraser Nxumalo</p>
<p>Email:   3538264@myuwc.ac.za</p>
<p>Programming assignment 4.5</p>
<P>Last edited 09/12/21</p>

This class creates a stack of objects. It as a couple of methods which will be used to manipulate the objects. It also creates an object of type node which is a seperate class.
*/

public class Linkedstack <E> {
	
	
	
	private SNode top;							//creates new top of type SNodeInteger
	
/**
This is the constructor method for the class. It sets top to null
*/	
	public LinkedStack(){
		top=null;							//sets top to null
	
	}

	
/**
This method gets the lenght og th stack. It uses iteration for counting 
@return count which is the lenght of the stack
*/
	public int getHeight(){
	
		int count=0;							//sets count to 0
	
		SNode position = top;						//sets position to top
		
		while(position !=null){						//iterates through the stack
			count++;						//increment count
			position=position.getLink();				//sets new position
	
		}
		return count;							//returns count
	}
	
/**
This method checks to see if the stack is empty.
@return true if stack is indeed empty
@return false if stack is not empty
*/	
	public boolean isEmpty(){
		SNode exist=top;					//sets exit to top
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
	public void push(E addData){
	
		top=new SNode(addData, top);				//adds new object
	
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
	public E head(){
		E headd=(E)top.getData();					//sets headd
		System.out.println(headd);
		return headd;						//returns headd
	}
/**
This method displays the objects in the stack
*/
	public void display(){
		
		SNode focus=top;					//sets focus
		while(focus != null){	
			
			System.out.println(focus.getData());
			focus = focus.getLink();			//sets new focus
		}
	
	}
	

}
