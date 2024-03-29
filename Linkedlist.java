import java.util.ArrayList;
/**

<p>Author:  Fraser Nxumalo</p>
<p>Email:   3538264@myuwc.ac.za</p>
<p>Programming assignment 4.5</p>
<P>Last edited 09/12/21</p>

This class implements the interface SLinkedList which is abstract. It overides all its methods so it can create an Array list of any data type . In this list, new objects will be added and removed.

*/



public  class Linkedlist <E> implements SLinkedList <E>{


	ArrayList <E> theList;				//=new ArrayList <Integer>();
/**
This is the constructor to te class. It takes in no arguments but creats test new list of type Integer.
*/		
		
	public LinkedList(){
			theList=new ArrayList <E>();			//new declared list
	}
/**
This class is used to display objects within th class.
*/
	public void displayList(){
		for(E test: theList){					//iterates through the list
			System.out.println(test);				//prints objects within the list
	
		}
	
			

	}
/**
This class determines the lenght of the list
@return theList.size() which is the size of the list
*/								// displays the data on the list
	public int length(){						// returns the number of nodes on the list
		return theList.size();
	}
/**
This method adds objects to the list but it adds these objects at the head of the list
@param itemToAdd which is the item the user wants to add
*/
	public void addANodeToStart(E itemToAdd){ 		// adds test node in front of the
		theList.add(itemToAdd);
	}
/**
This method deletes objects from the list
*/									// first node
	public SNode deleteHeadNode(){				// deletes the first node on the list
			return null;
	}

/**
This method checks if test desired object exist in the list
@param dataItem which is the object being searched for
@return true if object exist
@return false if object does not exist
*/
	public boolean isOnList(E dataItem){
		 
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
This is the main method of the class. It is used in this case as test tester. It creates test new object for the class and call desired variables
*/
	public static void main(String[] args){
			LinkedList<String> test= new LinkedList<String>();			//new class object
			test.addANodeToStart("6");				//adds objects to the list
			test.addANodeToStart("5");				//adds objects to the list
			test.addANodeToStart("4");				//adds objects to the list
			test.addANodeToStart("3");				//adds objects to the list
			test.addANodeToStart("2");				//adds objects to the list
			test.displayList();				//displays the items in the list
			test.isOnList("3");					//checks object for existance in the list
			test.isOnList("7");					//checks object for existance in the list
	;
	
	
	}

}
