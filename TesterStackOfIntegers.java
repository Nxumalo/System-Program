import java.io.*;
/**
<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>

This class tests the LinkedStackInteger class. It add objects and tests the class's methods   
*/

public class TesterStackOfIntegers{
	
	public static void main(String[] args){
		LinkedStackInteger a=new LinkedStackInteger ();			//creates new object


	
		a.push(1);  							//adds object
       		a.push(2);  							//adds object
        	a.push(67);							//adds object
		
        	System.out.println ("List has " + a.getHeight () + " entries.");
        	a.display ();							//displays stack
		System.out.print("The Data contained by the head is: ");
		a.head();							//displays head
		System.out.println ("Start of list:");
        	a.pop();							//deletes head
		a.display ();							//displays stack
		System.out.println ("End of list.");
        	a.pop();							//deletes head
        	System.out.println ("Start of list:");
       		a.display ();							//displays stack
		a.pop();							//deletes head
        	System.out.println ("End of list.");
		a.pop();							//deletes head
	}
	
}
