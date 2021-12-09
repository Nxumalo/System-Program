import java.util.ArrayList;

/**

<p><b>Author:<b>  Fraser Nxumalo.<p>
<p><b>Email:<b>   3538264@myuwc.ac.za<p>
<p>Last modified: 09/12/2021<p>

This class implements the interface SLinkedListInteger which is abstract. It overides all its methods so it can create an Array list of data type Integer. In this list, new objects will be added and removed.

*/

public class LinkedListInteger	implements SLinkedListInteger {


	ArrayList <Integer> theList;					//=new ArrayList <Integer>();
/**
This is the constructor to te class. It takes in no arguments but creats a new list of type Integer.
*/		
	public LinkedListInteger(){
			theList=new ArrayList <Integer>();		//new declared list
	}
/**
This class is used to display objects within th class.
*/
	public void displayList(){
		for(Integer a: theList){				//iterates through the list
			System.out.println(a);				//prints objects within the list
	
		}
	
			

	}
/**
This class determines the lenght of the list
@return theList.size() which is the size of the list
*/								// displays the data on the list
	public int length(){						// returns the number of nodes on the list
		return theList.size();					//returns the size of the list
	}
/**
This method adds objects to the list but it adds these objects at the head of the list
@param itemToAdd which is the item the user wants to add
*/
	public void addANodeToStart(Integer itemToAdd){ 		// adds a node in front of the
		theList.add(itemToAdd);					//adds the object to the list
	}
/**
This method deletes objects from the list
*/									// first node
	public SNodeInteger deleteHeadNode(){				// deletes the first node on the list
			return null;
	}

/**
This method checks if a desired object exist in the list
@param dataItem which is the object being searched for
@return true if object exist
@return false if object does not exist
*/
	public boolean isOnList(Integer dataItem){
		 
		if(theList.contains(dataItem)){				//iterates the list for object at hand
			System.out.println("True");
			return true;					//returns true if object found
		}
		else{
			System.out.println("False");
			return false;					//returns false if object not found
		}
	
	
	}
/**
This is the main method of the class. It is used in this case as a tester. It creates a new object for the class and call desired variables
*/
	public static void main(String[] args){
			LinkedListInteger a= new LinkedListInteger();	//new class object
			a.addANodeToStart(6);				//adds objects to the list
			a.addANodeToStart(5);				//adds objects to the list
			a.addANodeToStart(4);				//adds objects to the list
			a.addANodeToStart(3);				//adds objects to the list
			a.addANodeToStart(2);				//adds objects to the list
			a.displayList();				//displays the items in the list
			a.isOnList(3);					//checks object for existance in the list
			a.isOnList(7);					//checks object for existance in the list
	
	
	}

}
