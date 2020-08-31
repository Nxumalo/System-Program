/**

<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 31/08/2020<p>

This class tests the LinkedStackInteger class. It add objects and tests the class's methods   
*/

public class TesterStack{
	
	public static void main(String[] args){
		LinkedStack <Character> test=new LinkedStack <Character> ();			//creates new object


	
		test.push('1');  							//adds object
       		test.push('2');  							//adds object
        	test.push('3');							//adds object
		
        	System.out.println ("List has " + test.getHeight () + " entries.");
        	test.display ();							//displays stack
		System.out.print("The Data contained by the head is: ");
		test.head();							//displays head
		System.out.println ("Start of list:");
        	test.pop();							//deletes head
		test.display ();							//displays stack
		System.out.println ("End of list.");
        	test.pop();							//deletes head
        	System.out.println ("Start of list:");
       		test.display ();							//displays stack
		test.pop();							//deletes head
        	System.out.println ("End of list.");
		test.pop();							//deletes head
	}
	
}
